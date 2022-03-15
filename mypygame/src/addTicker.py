import pygame

size = 900, 500
win = pygame.display.set_mode(size)
clock = pygame.time.Clock()
fps = 30
count = 0
pygame.init()

def handleEvent(event):
    print(event)

running = True
while running:
    clock.tick(fps) # FPS: frame per second
    for event in pygame.event.get():
        if event.type==pygame.QUIT:
            running = False
        handleEvent(event)
    count += 1
    # print(count)

pygame.quit()