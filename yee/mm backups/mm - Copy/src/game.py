import tileGrid
import levelStorer

class Game:
    def __init__(self, parent):
        self.parent = parent

    def onEvent(self, event):
        ...

    def start(self):
        ...

    def stop(self):
        ...

    def loadGame(self):
        ...

    def saveGame(self):
        ...