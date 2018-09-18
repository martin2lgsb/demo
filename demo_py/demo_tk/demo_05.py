from tkinter import *

root = Tk()
root.title("fxck")

foo = IntVar()
for text, v in [
    ('red', 1),
    ('green', 2),
    ('black', 3),
    ('blue', 4),
    ('yellow', 5)
]:
    r = Radiobutton(root, text=text, value=v, variable=foo)
    r.pack(anchor=W)
foo.set(2)
root.mainloop()