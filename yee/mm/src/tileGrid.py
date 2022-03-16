import math
import random
import pygame

class TileGrid:
    def __init__(self, parent):
        self.parent = parent
        self.win = parent.win

        self.updateWinSize(self.parent.size)

        self.GridWidth = 50
        self.GridHeight = 50

        self.cameraX = 0
        self.cameraY = 0
        self.speedX = 0
        self.speedY = 0

        self.generateNewGrid()

    def handleEvent(self, event):
        # if event.type == pygame.MOUSEMOTION:
        #     self.cameraX, self.cameraY = event.pos
        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_a:
                self.speedX -= 0.1
            if event.key == pygame.K_d:
                self.speedX += 0.1
            if event.key == pygame.K_s:
                self.speedY -= 0.1
            if event.key == pygame.K_w:
                self.speedY += 0.1
        if event.type == pygame.WINDOWRESIZED:
            self.updateWinSize((event.x, event.y))

    def updateWinSize(self, size):
        self.winWidth, self.winHeight = size
        self.cloneX, self.cloneY = 16, 16
        winRat = self.winWidth / self.winHeight
        if winRat > 1:
            self.TILE_WIDTH = self.winWidth // (self.cloneX - 1) + 1
            self.cloneY = self.winHeight // self.TILE_WIDTH + 2
        else:
            self.TILE_WIDTH = self.winHeight // (self.cloneY - 2) + 1
            self.cloneX = self.winWidth // self.TILE_WIDTH + 1

    def onFrame(self):
        self.cameraX += self.speedX
        self.cameraY += self.speedY
        self.win.fill((0, 0, 0))
        offX = math.floor(self.cameraX)
        offY = math.floor(self.cameraY)
        for x in range(self.cloneX):
            for y in range(self.cloneY):
                tile = self.getTileFromGrid(x + offX, y + offY)
                self.textureTile(tile, x, y)
        pygame.display.update()

    def generateNewGrid(self):
        self.tileGrid = []
        for _ in range(self.GridWidth):
            column = [1]
            for _ in range(self.GridHeight-1):
                column.append(random.randint(0, 6))
            self.tileGrid.append(column)

    def setupGrid(self):
        pass

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

        # x, y = x, y + 1
