from ctypes import Union
import pygame
import tiles 

class TileGrid:
    def __init__(self, parent):
        self.parent = parent
        self.win = self.parent.win
        self.CLONE_X = 5
        self.CLONE_Y = 4
        self.tileGrid = [[0,0,0,1],[0,0,0,1],[0,0,0,1],[0,0,0,1]]

    def generateNewGrid(self, l, w):
        import numpy
        

    def setupGrid(self):
        pass
        