package com.ms.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

	@GetMapping("/orderfallback")
	public Mono<String> orderServiceFallback(){
		return Mono.just("order service is down");
	}
	@GetMapping("/paymentfallback")
	public Mono<String> paymentServiceFallback(){
		return Mono.just("payment service is down");
	}
}
