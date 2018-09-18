from tkinter import *
import turtle

tk = Tk()
tk.title("fxck")

canvas = Canvas(tk, height=250, width = 250)
canvas.pack()

tk.mainloop()

# turtle
t=turtle.Pen()
for x in range(1,5):
    t.forward(50)
    t.left(90)

