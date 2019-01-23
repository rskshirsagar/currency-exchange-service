package com.example.microservice.currencyexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.instrument.web.ServerSampler;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;


@SpringBootApplication
@EnableDiscoveryClient
@ServerSampler
public class CurrencyExchangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() {
		
		return Sampler.ALWAYS_SAMPLE;
	}
}

