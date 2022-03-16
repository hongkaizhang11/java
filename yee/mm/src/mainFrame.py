import tileGrid
import marsMission

class MainFrame:
    """
    the thing that does all the handling
    for now it's also the game class
    """

    def __init__(self, parent):
        self.parent = parent
        self.win = self.parent.win
        self.size = self.parent.size
        self.tileGrid = tileGrid.TileGrid(self)

    def onEvent(self, event):
        self.tileGrid.handleEvent(event)

    def update(self):
        self.tileGrid.onFrame()


if __name__ == '__main__':
    marsMission.MarsMission()
