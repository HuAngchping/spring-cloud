package spring.cloud.demo.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by huang on 09/05/2017.
 */
@FeignClient("eureka-service")
public interface FeignClientService {

  @RequestMapping(value = "/eureka_service/say", method = RequestMethod.GET)
  public String getSay();



}
