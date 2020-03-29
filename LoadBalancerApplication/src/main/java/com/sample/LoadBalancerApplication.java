package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sample.config.Config;

@SpringBootApplication
@RestController
@RibbonClient(name = "app",configuration = Config.class)
public class LoadBalancerApplication {
	
	@Autowired
    RestTemplate restTemplate;

	@LoadBalanced
    @Bean
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
	
	@GetMapping("/getData")
    public String serverLocation() {
        return this.restTemplate.getForObject(
          "http://ping-server/getData", String.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(LoadBalancerApplication.class, args);
	}

}
