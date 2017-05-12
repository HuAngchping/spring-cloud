package spring.cloud.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import spring.cloud.demo.controllers.domain.SystemRoleCategoryDomain;
import spring.cloud.demo.service.SystemRoleCategoryService;

/**
 * Created by huang on 25/02/2017.
 */
@Controller
public class SystemRoleCategoryController {

  private Logger logger = LoggerFactory.getLogger(SystemRoleCategoryController.class);

  @Autowired
  RestTemplate restTemplate;

  @Autowired
  SystemRoleCategoryService systemRoleCategoryService;

  @RequestMapping(value = "/say_hello", method = RequestMethod.POST)
  @ResponseBody
  public String sayHello(@RequestBody SystemRoleCategoryDomain roleCategoryDomain) {
    logger.info("controller info");
    systemRoleCategoryService.saveRoleCategory(roleCategoryDomain);
    return "Hello, " + roleCategoryDomain.getName();
  }

  @RequestMapping(value = "/call", method = RequestMethod.GET)
  @ResponseBody
  public String call() {
    return "";
  }

}
