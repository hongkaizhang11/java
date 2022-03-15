from appsuper import *

class Demo(AppSuper):
    def __init__(self):
        super().__init__()
        AppSuper.snd=pygame.mixer.Sound("src/resources/yunque.mp3")
        AppSuper.snd.play()


if __name__ == '__main__':
    Demo().eventHandler()