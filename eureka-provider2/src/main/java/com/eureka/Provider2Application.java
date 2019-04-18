package com.eureka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Provider2Application {

	public static void main(String[] args) {
		SpringApplication.run(Provider2Application.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/hi")
	public String home(@RequestParam String name) {

        /*Map<String, String> testMap = new HashMap<>();
        testMap.put("a", "11111");
        testMap.put("b", "22222");
        testMap.put("c", "33333");

        return testMap;*/
		return "hi " + name + ",i am from port:" + port;

	}
}
