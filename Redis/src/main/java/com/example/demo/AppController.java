package com.example.demo;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class AppController {
	
	@GetMapping("/add/{key}/{value}")
	@Cacheable(value = "users", key = "#key")
	public String getId(@PathVariable("key") String key, @PathVariable("value") String value)
	{
		System.out.println("Key : " + key + " value : " + value);
		return value;
	}
	
	@GetMapping("/update/{key}/{value}")
	@CachePut(value = "users", key = "#key")
	public String update(@PathVariable("key") String key, @PathVariable("value") String value)
	{
		System.out.println("Key : " + key + " value : " + value);
		return value;
	}
	
	@GetMapping("/delete/{key}")
	@CacheEvict(value="users", key = "#key")
	public void delete(@PathVariable("key") String key)
	{
		System.out.println("Key : " + key );
	}
}
