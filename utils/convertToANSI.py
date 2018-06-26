import os;
import sys;
from Npp import notepad

filePathSrc="C:\\server\\encode"

for root, dirs, files in os.walk(filePathSrc):
    for fn in files:
        if fn[-4:] == '.yml':
            notepad.open(root + "\\" + fn)
            notepad.runMenuCommand("Encoding", "Convert to ANSI")
            notepad.save()
            notepad.close()