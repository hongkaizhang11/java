from appsuper import *

class Rect11(AppSuper):
    def __init__(self):
        super().__init__()
        self.rect = Rect(50, 60, 200, 80)
        self.rects = randomRects(50)

    def handleEvent(self, event):
        pass

    def paint(self):
        self.screen.fill(self.GRAY)
        intersects = []
        for i in range(len(self.rects)):
            r0 = self.rects[i]
            for j in range(i+1, len(self.rects)):
                r1 = self.rects[j]
                if(r0.colliderect(r1)):
                    intersects.append(r0)
                    intersects.append(r1)
                    break
        for i, r in enumerate(self.rects):
            color = self.RED if r in intersects else self.YELLOW
            pygame.draw.rect(self.screen, color, r)
            drawText(str(i), r.topleft)

        pygame.display.update()
        
if __name__ == '__main__':
    Rect11().mainloop()