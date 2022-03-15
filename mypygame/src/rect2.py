import pygame
from pygame.locals import *

SIZE = 500, 200
RED = (255, 0, 0)
GRAY = (150, 150, 150)
BLUE = (0,0,255)

pygame.init()
screen = pygame.display.set_mode(SIZE)
clock = pygame.time.Clock()
rect1 = Rect(50, 60, 200, 80)
fps = 30
pts = ("topleft","topright","bottomleft","bottomright",'midtop','midright','midbottom','midleft','center')

def handleEvent(event):
    pass

def update():
    screen.fill(GRAY)
    pygame.draw.rect(screen, RED, rect1, 4)
    for p in pts:
        pos = eval('rect1.' + p)
        font = pygame.font.SysFont('Minecraft', 25)
        screen.blit(font.render(p, True, BLUE), pos)
        pygame.draw.circle(screen, BLUE, pos, 5)
    pygame.display.flip()
    # pygame.display.update()

def mainloop():
    running = True
    while running:
        clock.tick(fps) # FPS: frame per second
        for event in pygame.event.get():
            if event.type==pygame.QUIT:
                running = False
            handleEvent(event)
        update()
    pygame.quit()

if __name__ == '__main__':
    mainloop()