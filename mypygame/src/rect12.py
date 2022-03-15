from appsuper import *

class Rect12(AppSuper):
    def __init__(self):
        super().__init__()
        self.rect0 = Rect(50, 60, 200, 80)
        self.rect1 = Rect(10, 10, 20, 20)
        self.rects = randomRects(50)
        self.sound = loadSound('punch.wav')

    def handleEvent(self, event):
        if event.type == KEYDOWN:
            if event.key in self.arrowKeys:
                v = self.arrowKeys[event.key]
                self.rect1.move_ip(v)
                if self.rect1.colliderect(self.rect0):
                    self.sound.play()

    def paint(self):
        self.screen.fill(self.GRAY)
        pygame.draw.rect(self.screen, self.GREEN, self.rect0, 1)
        pygame.draw.rect(self.screen, self.RED, self.rect1, 1)

        pygame.display.update()
        
if __name__ == '__main__':
    Rect12().mainloop()