from appsuper import *

class Rect7(AppSuper):
    def __init__(self):
        super().__init__()
        self.rect = Rect(50, 60, 200, 80)
        self.moving = False

    def handleEvent(self, event):
        if event.type == MOUSEBUTTONDOWN:
            if self.rect.collidepoint(event.pos):
                self.moving = True
        elif event.type == MOUSEBUTTONUP:
            self.moving = False
        elif event.type == MOUSEMOTION and self.moving:
            self.rect.move_ip(event.rel)

    def paint(self):
        self.screen.fill(self.GRAY)
        pygame.draw.rect(self.screen, self.BLUE, self.rect)
        pygame.display.update()
        
if __name__ == '__main__':
    Rect7().mainloop()