package main

import (
	"fmt"
	"net/http"
	"log"
)

func main() {
	http.HandleFunc("/hello", handleHello)
	fmt.Println("serving start...")
	log.Fatal(http.ListenAndServe("localhost:7777", nil))
}

func handleHello(w http.ResponseWriter, req *http.Request)  {
	log.Println("serving", req.URL)
	fmt.Fprint(w, "fuck, go!")
}

