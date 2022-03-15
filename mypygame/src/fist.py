import pygame
from appsuper import *

pygame.init()
WIDTH, HEIGHT = 900, 500
SIZE = (WIDTH, HEIGHT)
win = pygame.display.set_mode(SIZE)
fps = 30
clock = pygame.time.Clock()
count = 0
moving = False
RED = (255, 0, 0)

img1, rect1 = loadImage("fist.png", 0.05)
# rect1 = pygame.Rect(rect.left + 35, rect.top + 15, rect.width - 55, rect.height - 50)
v = [2, 2]

img2, rect2 = loadImage("chimp.png", 0.5)
# rect1 = pygame.Rect(rect.left + 35, rect.top + 15, rect.width - 55, rect.height - 50)


sound = loadSound("yunque.mp3")
sound.play()

def handleEvent(event):
    global moving
    if event.type == pygame.MOUSEBUTTONDOWN:
        if rect1.collidepoint(event.pos):
            moving = True
    elif event.type == pygame.MOUSEBUTTONUP:
        moving = False
    elif event.type == pygame.MOUSEMOTION and moving:
        rect1.move_ip(event.rel)

def update():
    win.fill("black")
    win.blit(img1, rect1) # Block Image Transfer
    win.blit(img2, rect2) # Block Image Transfer
    pygame.draw.rect(win, RED, rect1, 1)
    pygame.draw.rect(win, RED, rect2, 1)
    # rect1.move_ip(v)
    pygame.display.update()

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