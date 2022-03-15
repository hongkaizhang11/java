from appsuper import *

class Rect3(AppSuper):
    def __init__(self):
        super().__init__()
        self.rect = Rect(50, 60, 200, 80)

    def handleEvent(self, event):
        if event.type == KEYDOWN:
            if event.key == K_l:
                self.rect.left = 0
            if event.key == K_r:
                self.rect.right = self.width
            if event.key == K_c:
                self.rect.centerx = self.width//2
            if event.key == K_t:
                self.rect.top = 0
            if event.key == K_m:
                self.rect.centery = self.height//2
            if event.key == K_b:
                self.rect.bottom = self.height

    def paint(self):
        self.screen.fill(self.bg)
        pygame.draw.rect(self.screen, self.BLUE, self.rect)
        pygame.display.update()
        
if __name__ == '__main__':
    Rect3().mainloop()