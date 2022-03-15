from appsuper import *

class Rect5(AppSuper):
    arrowKeys =  {K_LEFT:(-5,0),K_RIGHT:(5,0), K_UP:(0,-5), K_DOWN:(0,5)}
    def __init__(self):
        super().__init__()
        self.rect = Rect(50, 60, 200, 80)
        self.rect1 = self.rect.copy()

    def handleEvent(self, event):
        if event.type == KEYDOWN:
            if event.key in self.arrowKeys:
                v = self.arrowKeys[event.key]
                self.rect.inflate_ip(v)


    def paint(self):
        self.screen.fill(self.bg)
        pygame.draw.rect(self.screen, self.BLUE, self.rect, 4)
        pygame.draw.rect(self.screen, self.RED, self.rect1, 1)
        pygame.display.update()
        
if __name__ == '__main__':
    Rect5().mainloop()