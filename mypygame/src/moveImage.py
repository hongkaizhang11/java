import pygame

WIDTH, HEIGHT = 900, 500
SIZE = (WIDTH, HEIGHT)
win = pygame.display.set_mode(SIZE)
fps = 30
clock = pygame.time.Clock()
count = 0
RED = (255, 0, 0)
x = 0
y = 0

img = pygame.image.load("src/resources/chimp.png")
img = pygame.transform.scale(img, (250,300))
# rect = img.get_rect()

def handleEvent(event):
    pass

def update():
    global x, y
    x += 1
    y += 1
    win.fill((0, 0, 0))
    rect = pygame.Rect(x,y, img.get_rect().width, img.get_rect().height)
    win.blit(img, (x, y)) # Block Image Transfer
    pygame.draw.rect(win, RED, rect, 1)
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