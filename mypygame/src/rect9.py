from appsuper import *

class Rect9(AppSuper):
    def __init__(self):
        super().__init__()
        self.rect = Rect(50, 60, 200, 80)
        self.points = randomPoints(50)

    def handleEvent(self, event):
        pass

    def paint(self):
        self.screen.fill(self.GRAY)
        pygame.draw.rect(self.screen, self.BLUE, self.rect, 1)
        for pos in self.points:
            if self.rect.collidepoint(pos):
                pygame.draw.circle(self.screen, self.RED, pos, 4, 0)
            else:
                pygame.draw.circle(self.screen, self.BLUE, pos, 4, 0)
        pygame.display.update()
        
if __name__ == '__main__':
    Rect9().mainloop()