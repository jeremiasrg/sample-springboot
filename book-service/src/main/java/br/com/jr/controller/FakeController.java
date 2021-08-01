package br.com.jr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("book-service")
public class FakeController {
	
	private Logger logger = LoggerFactory.getLogger(FakeController.class);
	
	@GetMapping("/fake")
	@Retry(name = "my-config-3", fallbackMethod = "errorMethod")
	public String fake() {
		logger.info("one more attempt.");
		var response = new RestTemplate().getForEntity("http://erroraddress.com:8080/foo-bar", String.class);
		
//		return "fake!!!";
		return response.getBody();
	}
	
	@GetMapping("/fake2")
	@CircuitBreaker(name = "default",  fallbackMethod = "errorMethod")
	public String fake2() {
		logger.info("one more attempt.");
		var response = new RestTemplate().getForEntity("http://erroraddress.com:8080/foo-bar", String.class);
		
//		return "fake!!!";
		return response.getBody();
	}

	@GetMapping("/fake3")
	@RateLimiter(name = "my-config-name")
	public String fake3() {
		logger.info("one more attempt.");
		
		return "fake!!!";
	}
	
	@GetMapping("/fake4")
	@Bulkhead(name = "my-bulkhed-config-name")
	public String fake4() {
		logger.info("one more attempt.");
		
		return "fake!!!";
	}
	
	public String errorMethod(Exception ex) {
		return "fallbackMethod called";
		
	}

}
