import pygame
import tileGrid

class MarsMission:
    def __init__(self):
        self.size = 900, 500
        self.win = pygame.display.set_mode(self.size)
        self.painter = tileGrid.TileGrid(self)
        self.init()

    def handle(self, event):
        self.painter.paint()
    
    def init(self):
        running = True
        while running:
            for event in pygame.event.get():
                self.handle(event)
                if event.type==pygame.QUIT:
                    running = False
        pygame.quit()

if __name__ == '__main__':
    MarsMission()