import tkinter as tk
import tkinter.messagebox as msgbox

def btn1_clicked():
    msgbox.showinfo("info", "showinfo test.")
def btn2_clicked():
    msgbox.showwarning("warning", "showwarning test.")
def btn3_clicked():
    msgbox.showerror("error", "showerror test.")
def btn4_clicked():
    msgbox.askquestion("question", "askquestion test.")
def btn5_clicked():
    msgbox.askyesno("yesno", "askyesno test.")
def btn6_clicked():
    msgbox.askokcancel("okcancel", "askcancel test.")
def btn7_clicked():
    msgbox.askretrycancel("retry", "askretrycancel test.")

root=tk.Tk()
root.title("Msgbox test")
btn1 = tk.Button(root, text="showinfo", command=btn1_clicked)
btn1.pack(fill=tk.X)
btn2 = tk.Button(root, text="showwarning", command=btn2_clicked)
btn2.pack(fill=tk.X)
btn3 = tk.Button(root, text="showerror", command=btn3_clicked)
btn3.pack(fill=tk.X)
btn4 = tk.Button(root, text="showaskquestion", command=btn4_clicked)
btn4.pack(fill=tk.X)
btn5 = tk.Button(root, text="askyesno", command=btn5_clicked)
btn5.pack(fill=tk.X)
btn6 = tk.Button(root, text="showokcancel", command=btn6_clicked)
btn6.pack(fill=tk.X)
btn7 = tk.Button(root, text="showretrycancel", command=btn7_clicked)
btn7.pack(fill=tk.X)
root.mainloop()