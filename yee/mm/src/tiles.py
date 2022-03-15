import pygame


class Tile:
    def __init__(self, parent, x=0, y=0, data=None):
        self.parent = parent
        self.win = self.parent.win
        self.x = x
        self.y = y
        self.TILE_WIDTH = 32
        self.data = data
        self.tile = data['tile']

    def paintTile(self, tile, tileGridX, tileGridY):
        if tile == 0:
            return
        x = tileGridX * self.TILE_WIDTH
        y = tileGridY * self.TILE_WIDTH
        filepath = f"src/resources/{self.getInfo()}"
        img = pygame.image.load(filepath)
        rect = pygame.Rect(x, y, self.TILE_WIDTH, self.TILE_WIDTH)
        self.win.blit(img, (x, y)) # Block Image Transfer
        pygame.draw.rect(self.win, 0, rect, -1)
        pygame.display.update()

    def getInfo(self):
        info = (
            None,
            "GROUND.png"
        )
        return info[self.tile]