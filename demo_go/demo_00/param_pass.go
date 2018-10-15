package main

import "fmt"

type CircleParam struct {
	radius int64
}

func testCircle() CircleParam {
	c := CircleParam{radius: 5}
	a := &c
	fmt.Println(&a)
	return c
}

func changeRadius(c CircleParam) CircleParam {
	c.radius = 10
	fmt.Println(c)
	return c
}

func main() {
	// Parameter Pass
	c := testCircle()
	a := &c
	b := &c
	fmt.Println(&a)
	fmt.Println(&b)
	e := changeRadius(*b)
	fmt.Println(b)
	fmt.Println(e)
}