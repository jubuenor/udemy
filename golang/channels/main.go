package main

import (
	"fmt"
	"net/http"
	"time"
)

func main() {
	links := []string{
		"http://google.com",
		"http://facebook.com",
		"http://stackoverflow.com",
		"http://golang.org",
		"http://amazon.com",
	}

	c := make(chan string) // create a channel
	for _, link := range links {
		go checkLink(link, c)
	}
	for l := range c { // infinite loop. Wait for a value to be sent to the channel and assign it to l. <-c is a blocking call
		// fmt.Println(<-c) // receive a value from the channel
		// time.Sleep(5 * time.Second)
		// go checkLink(l, c) // call the function again
		go func(link string) { // function literal (anonymous function)
			time.Sleep(5 * time.Second)
			checkLink(link, c)
		}(l)
	}
}

func checkLink(link string, c chan string) { // channel as an argument
	_, err := http.Get(link)
	if err != nil {
		fmt.Println(link, "might be down!")
		c <- link // send a value to the channel
		return
	}

	fmt.Println(link, "is up!")
	c <- link // send a value to the channel
}
