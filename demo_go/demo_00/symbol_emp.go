package main

import "fmt"

type Rect struct {
	width float64
	height float64
}

func (r Rect) size() float64 {
	return r.width * r.height
}

func main() {
	var r = &Rect{100, 100}
	fmt.Println(*r)

	var s = Rect{100, 100}
	fmt.Println(s.size())

	var a = "123"
	var b = &a
	fmt.Println(a)
	fmt.Println(b)
	fmt.Println(*b)
}