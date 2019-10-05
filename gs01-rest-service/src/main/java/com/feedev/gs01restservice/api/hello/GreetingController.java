package com.feedev.gs01restservice.api.hello;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String TEMPLATE = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/greeting")
	public Greenting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		String greeting = String.format(TEMPLATE, name);
		log.info("{}", greeting);
		return new Greenting(counter.incrementAndGet(), greeting);
	}
	
}
