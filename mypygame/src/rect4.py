from ssl import OPENSSL_VERSION
from rect import *

def handleEvent(event):
    if event.type == KEYDOWN:
        if event.key == K_l:
            self.rect.left = 0
        if event.key == K_r:
            self.rect.right = width
        if event.key == K_c:
            self.rect.centerx = width//2
        if event.key == K_t:
            self.rect.top = 0
        if event.key == K_m:
            self.rect.centery = height//2
        if event.key == K_b:
            self.rect.bottom = height

if __name__ == '__main__':
    mainloop()