from tkinter import *

root = Tk()
root.title('top')
for relief in [RAISED, SUNKEN, FLAT, RIDGE, SOLID]:
    f = Frame(root, borderwidth=2, relief=relief)
    Label(f, text=relief, width=10).pack(side=LEFT)
    f.pack(side=LEFT, padx=5, pady=5)
root.mainloop()