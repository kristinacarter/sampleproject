package com.example.demo;

import org.springframework.boot.*; 
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
@RequestMapping(method=RequestMethod.GET, value= "/demo")
public String reverse(@RequestParam(value="sentence", defaultValue="hello there") String sentence) {
	  return new StringBuilder(sentence).reverse().toString();
}}