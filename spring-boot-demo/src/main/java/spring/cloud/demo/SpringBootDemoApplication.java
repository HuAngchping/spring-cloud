package spring.cloud.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import spring.cloud.demo.filter.SpringBootDemoFilter;
import spring.cloud.demo.listener.SpringBootDemoListener;

@RefreshScope
@RestController
@SpringBootApplication
@ServletComponentScan(basePackageClasses = {SpringBootDemoListener.class, SpringBootDemoFilter.class})
public class SpringBootDemoApplication {

  @Value("${user.role}")
  String value;

  @Value("${user.role.mysql}")
  String username;

  @Value("${test.value}")
  String test;

  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String getValue() {
    return value + ", " + username + ", profile: " + test;
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringBootDemoApplication.class, args);
  }
}
