package com.example.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/")
class TestController {
@Get
fun sayHello():String{
	return "Hello, Micronaut!"
}
}