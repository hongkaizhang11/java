import pygame

WIDTH, HEIGHT = 900, 500
SIZE = (WIDTH, HEIGHT)
win = pygame.display.set_mode(SIZE)
fps = 2
clock = pygame.time.Clock()
count = 0

def handleEvent(event):
    global count
    # count += 1
    print(f"Count: {count}")

def mainloop():
    global count
    running = True
    while running:
        clock.tick(fps) # FPS: frame per second
        for event in pygame.event.get():
            if event.type==pygame.QUIT:
                running = False
            handleEvent(event)
        count += 1
        print(count)
    pygame.quit()

if __name__ == '__main__':
    mainloop()