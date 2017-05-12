package spring.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaServerApplication {

//	@Bean
//	@Autowired
//	public EurekaInstanceConfigBean eurekaInstanceConfigBean(InetUtils inetUtils) {
//		EurekaInstanceConfigBean config = new EurekaInstanceConfigBean(inetUtils);
//		AmazonInfo info = AmazonInfo.Builder.newBuilder().autoBuild("eureka");
//		config.setHostname(info.get(AmazonInfo.MetaDataKey.publicHostname));
//		config.setIpAddress(info.get(AmazonInfo.MetaDataKey.publicIpv4));
//		config.setNonSecurePort(8761);
//		config.setDataCenterInfo(info);
//		return config;
//	}

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaServerApplication.class, args);
	}
}
