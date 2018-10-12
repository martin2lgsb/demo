package main

import "fmt"

func main() {
	s := make([]string, 3)
	fmt.Println(s)

	s[0] = "a"
	s[1] = "b"
	s[2] = "c"
	fmt.Println(s)

	s = append(s, "d")
	fmt.Println(s)
	fmt.Println(len(s))

	c := make([]string, len(s))
	copy(c, s)
	fmt.Println(c)
}
