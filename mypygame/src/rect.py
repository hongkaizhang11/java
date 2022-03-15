import pygame
from pygame.locals import *

width = 500
height = 200
SIZE = width, height
RED = (255, 0, 0)
GRAY = (150, 150, 150)
BLUE = (0,0,255)
YELLOW = (255, 255, 0)
GREEN = (0, 255, 0)

pygame.init()
screen = pygame.display.set_mode(SIZE)
clock = pygame.time.Clock()
rect1 = Rect(50, 60, 200, 80)
fps = 30
pts = ("topleft", "topright", "bottomleft", "bottomright",'midtop','midright','midbottom','midleft','center')

def handleEvent(_):
    pass

def update():
    screen.fill(GRAY)
    pygame.draw.rect(screen, RED, rect1, 4)
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