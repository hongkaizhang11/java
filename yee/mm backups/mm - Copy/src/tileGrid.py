import math
import pygame
import random

class TileGrid:
    def __init__(self, parent):
        self.parent = parent
        self.win = parent.win
        self.movements = {"up": False, "left": False,
                          "down": False, "right": False}
        self.GridWidth = 20
        self.GridHeight = 20

        self.updateWinSize(self.parent.size)

        self.cameraX = 0
        self.cameraY = 0
        self.speedX = 0
        self.speedY = 0
        self.editorX = 0
        self.editorY = 0
        self.editorTile = 1

        self.generateNewGrid()
        # self.editor = Editor(self)

    def handleEvent(self, event):
        if event.type == pygame.MOUSEBUTTONDOWN:
            # self.editor.place()
            self.placeTile()
        if event.type == pygame.KEYDOWN:
            self.handleKey(event.key, True)
        if event.type == pygame.KEYUP:
            self.handleKey(event.key, False)
        if event.type == pygame.WINDOWRESIZED:
            self.updateWinSize((event.x, event.y))

    def handleKey(self, key, keydown):
        if key == pygame.K_w:
            self.movements['up'] = keydown
        if key == pygame.K_a:
            self.movements['left'] = keydown
        if key == pygame.K_s:
            self.movements['down'] = keydown
        if key == pygame.K_d:
            self.movements['right'] = keydown

    def updateWinSize(self, size):
        self.winWidth, self.winHeight = size
        self.cloneX, self.cloneY = 16, 16
        winRat = self.winWidth / self.winHeight
        if winRat > 1:
            self.TILE_WIDTH = self.winWidth / (self.cloneX - 1)
            self.cloneY = math.ceil(self.winHeight / self.TILE_WIDTH) + 1
        else:
            self.TILE_WIDTH = self.winHeight / (self.cloneY - 2)
            self.cloneX = math.ceil(self.winWidth / self.TILE_WIDTH)

    def onFrame(self):
        self.movePlayer()
        self.win.fill((125, 125, 125))
        offX = math.floor(self.cameraX)
        offY = math.floor(self.cameraY)
        for x in range(self.cloneX):
            for y in range(self.cloneY):
                tile = self.getTileFromGrid(x + offX, y + offY)
                self.textureTile(tile, x, y)
        mousex, mousey = pygame.mouse.get_pos()
        mousex /= self.TILE_WIDTH
        mousey /= self.TILE_WIDTH
        mousey = self.winHeight - mousey
        self.textureTile(self.editorTile, mousex, mousey)
        pygame.display.update()

    def movePlayer(self):
        up = 1 if self.movements['up'] else 0
        left = 1 if self.movements['left'] else 0
        down = 1 if self.movements['down'] else 0
        right = 1 if self.movements['right'] else 0
        axisX = right - left
        axisY = up - down
        self.speedX += (0.48 * axisX - self.speedX) / 3
        self.speedY += (0.48 * axisY - self.speedY) / 3
        self.cameraX += self.speedX
        self.cameraY += self.speedY
        self.limitCamera()

    def limitCamera(self):
        if self.cameraX < 0:
            self.cameraX = 0
        if self.cameraX > self.GridWidth - self.winWidth / self.TILE_WIDTH:
            self.cameraX = self.GridWidth - self.winWidth / self.TILE_WIDTH
        if self.cameraY < 0:
            self.cameraY = 0
        if self.cameraY > self.GridHeight - self.winHeight / self.TILE_WIDTH + 1:
            self.cameraY = self.GridHeight - self.winHeight / self.TILE_WIDTH + 1

    def generateNewGrid(self):
        self.tileGrid = []
        # wall, boxedColumn = [1, 1],[1, 1]
        # for _ in range(self.GridHeight-1):
        #     wall.append(1)
        #     boxedColumn.insert(1, 2)
        # self.tileGrid.append(wall)
        # for _ in range(self.GridWidth-2):
        #     self.tileGrid.append(boxedColumn)
        # self.tileGrid.append(wall)
        for _ in range(self.GridWidth):
            column = []
            for _ in range(self.GridHeight):
                column.append(random.randint(0, 5))
                column.append(0)
            self.tileGrid.append(column)

    def setupGrid(self):
        ...

    def getTileGrid(self):
        returnGrid = []
        for column in self.tileGrid:
            returnColumn = []
            for tile in column:
                tileId = tile.getTile()
                returnColumn.append(tileId)
            returnGrid.append(returnColumn)
        return returnGrid

    def getTileFromGrid(self, x, y):
        x = x % self.GridWidth
        y = y % self.GridHeight
        return self.tileGrid[x][y]

    def textureTile(self, tile, x, y):
        tileName = self.getInfo(tile)
        if tileName is None or tile is None:
            return
        tilex, tiley = self.getTilePos(x, y)
        imgSize = self.TILE_WIDTH, self.TILE_WIDTH
        filepath = f"src/resources/{tileName}"
        img = pygame.image.load(filepath)
        img = pygame.transform.scale(img, imgSize)
        self.win.blit(img, (tilex, tiley))

    def texture(self, imgUrl=None, x=0, y=0, size=None):
        img = pygame.image.load(imgUrl)
        img = pygame.transform.scale(img, size)
        self.win.blit(img, (x, y))


    def getInfo(self, tile):
        info = (
            None,
            "GROUND.png",
            "housing_0.png",
            "solar_panel_0.png",
            "drill_0.png",
            "RTG_0.png",
            "metal_refinery_0.png"
        )
        return info[tile % len(info)]

    def getTilePos(self, x, y):
        newX = x - self.cameraX % 1
        newX *= self.TILE_WIDTH
        newY = y + 1 - self.cameraY % 1
        newY *= -self.TILE_WIDTH
        newY += self.winHeight
        return newX, newY

    def placeTile(self):
        mousex, mousey = pygame.mouse.get_pos()
        self.getEditorAtPos(mousex, mousey)
        self.tileGrid[self.editorX][self.editorY] = self.editorTile

    def getEditorAtPos(self, x, y):
        self.editorX = math.floor(x / self.TILE_WIDTH + self.cameraX)
        self.editorY = math.floor((self.winHeight - y) / self.TILE_WIDTH + self.cameraY)
        self.editorTile = 3