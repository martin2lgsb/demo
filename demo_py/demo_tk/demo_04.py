from tkinter import *

root = Tk()
root.title("fxck")

# f1
f1 = Frame(root)
Label(f1, text="f1f1f1", foreground="red").pack(side=LEFT, padx=5, pady=10)
e1 = StringVar()
Entry(f1, width=60, textvariable=e1).pack(side=LEFT)
e1.set("e1e1e1")

def fxck_clicked():
    print(e1.get())

btn = Button(root, text="fxck me", command=fxck_clicked)

f1.pack()
btn.pack(fill=X)

root.mainloop()