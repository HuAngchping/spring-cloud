package spring.cloud.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.cloud.demo.feign.FeignClientService;

@RestController
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudFeignApplication {

	@Autowired
	FeignClientService feignClientService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return feignClientService.getSay();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignApplication.class, args);
	}
}
