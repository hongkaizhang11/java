import pygame

size = 900, 500
win = pygame.display.set_mode(size)

running = True
while running:
    for event in pygame.event.get():
        if event.type==pygame.QUIT:
            running = False

pygame.quit()