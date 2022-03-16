import logging

class MyLogger:
    def __init__(self):
        # self.LOG_FORMAT = "%(asctime)s %(levelname)8s - %(message)s"
        self.logFilepath = r"C:\Users\Hongkai Z\workspace\yee\mm\thelog.log"
        # logging.basicConfig(filename=self.logFilepath, level=logging.ERROR, format=self.LOG_FORMAT)
        self.logger = logging.getLogger("Mars Mission")

    def log(self, level=logging.INFO, msg=None):
        self.logger.log(level, msg)

if __name__ == '__main__':
    logger = MyLogger()
    logger.log(level=logging.FATAL, msg="hey")
