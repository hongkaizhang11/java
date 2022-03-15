from appsuper import *

class Rect6(AppSuper):
    def __init__(self):
        super().__init__()
        self.rect0 = Rect(50, 60, 200, 80)
        self.rect1 = Rect(100, 20, 100, 140)

    def handleEvent(self, event):
        if event.type == KEYDOWN:
            if event.key in self.arrowKeys:
                v = self.arrowKeys[event.key]
                self.rect1.move_ip(v)


    def paint(self):
        self.screen.fill(self.GRAY)
        clip = self.rect0.clip(self.rect1)
        union = self.rect0.union(self.rect1)
        pygame.draw.rect(self.screen, self.YELLOW, union, 0)
        pygame.draw.rect(self.screen, self.GREEN, clip, 0)
        pygame.draw.rect(self.screen, self.BLUE, self.rect0, 1)
        pygame.draw.rect(self.screen, self.RED, self.rect1, 4)
        pygame.display.update()
        
if __name__ == '__main__':
    Rect6().mainloop()