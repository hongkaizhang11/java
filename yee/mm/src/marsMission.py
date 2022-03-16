"""
the start
"""
import pygame
import mainFrame

class MarsMission:
    """
    The one and only window\n
    that's it
    """
    def __init__(self):
        self.size = 900, 525
        self.win = pygame.display.set_mode(self.size, pygame.RESIZABLE)
        self.mainframe = mainFrame.MainFrame(self)
        self.clock = pygame.time.Clock()
        self.fps = 30
        self.init()

    def init(self):
        running = True
        while running:
            self.clock.tick(self.fps)
            for event in pygame.event.get():
                self.mainframe.onEvent(event)
                if event.type==pygame.QUIT:
                    running = False
            self.mainframe.update()
        pygame.quit()

if __name__ == '__main__':
    MarsMission()