from asyncio.windows_events import NULL
from appsuper import *

class Rect8(AppSuper):
    def __init__(self):
        super().__init__()
        self.rect = Rect(50, 60, 200, 80)
        self.moving = False
        self.v = [10, 10]

    def handleEvent(self, event):
        pass

    def paint(self):
        self.screen.fill(self.GRAY)
        pygame.draw.rect(self.screen, self.BLUE, self.rect)
        self.rect.move_ip(self.v)
        if self.rect.left < 0 or self.rect.right > self.width:
            self.v[0] *= -1
        if self.rect.top < 0 or self.rect.bottom > self.height:
            self.v[1] *= -1
        pygame.display.update()
        
if __name__ == '__main__':
    Rect8().mainloop()