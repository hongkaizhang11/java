import pygame

WIDTH, HEIGHT = 900, 500
SIZE = (WIDTH, HEIGHT)
win = pygame.display.set_mode(SIZE)
fps = 10
clock = pygame.time.Clock()
count = 0
RED = (255, 0, 0)

img = pygame.image.load("src/resources/chimp.png")
img = pygame.transform.scale(img, (250, 300))
img = pygame.transform.rotate(img, 45)
rect = img.get_rect()

def handleEvent(event):
    pass

def update():
    global count
    count += 1
    print(count)
    win.blit(img, rect) # Block Image Transfer
    pygame.draw.rect(win, RED, rect, 1)
    pygame.display.update()

def mainloop():
    global count
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