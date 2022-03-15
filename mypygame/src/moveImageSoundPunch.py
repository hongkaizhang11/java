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
xSpeed = 6
ySpeed = 5
pygame.init()
img = pygame.image.load("src/resources/chimp.png")
img = pygame.transform.scale(img, (250,300))
# rect = img.get_rect()
snd=pygame.mixer.Sound("src/resources/yunque.mp3")
snd.play()
punchSnd = pygame.mixer.Sound("src/resources/punch.wav")

def handleEvent(event):
    if event.type == pygame.MOUSEBUTTONDOWN:
        punchSnd.play()

def update():
    global x, y, xSpeed, ySpeed
    x += xSpeed
    y += ySpeed
    win.fill((0, 0, 0))
    rect = pygame.Rect(x,y, img.get_rect().width, img.get_rect().height)
    if rect.left < 0 or rect.right > WIDTH:
        xSpeed = -xSpeed
    if rect.top < 0 or rect.bottom > HEIGHT:
        ySpeed = -ySpeed
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