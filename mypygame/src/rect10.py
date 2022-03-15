from appsuper import *

class Rect10(AppSuper):
    def __init__(self):
        super().__init__()
        self.rect = Rect(50, 60, 200, 80)
        self.rects = randomRects(50)

    def handleEvent(self, event):
        pass

    def paint(self):
        self.screen.fill(self.GRAY)
        pygame.draw.rect(self.screen, self.YELLOW, self.rect, 1)
        for rect in self.rects:
            if self.rect.collidepoint(rect.x, rect.y):
                pygame.draw.rect(self.screen, self.RED, rect, 1, 0)
            else:
                pygame.draw.rect(self.screen, self.BLUE, rect, 1, 0)
        pygame.display.update()
        
if __name__ == '__main__':
    Rect10().mainloop()