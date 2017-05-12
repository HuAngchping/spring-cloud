package spring.cloud.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.cloud.demo.controllers.domain.SystemRoleCategoryDomain;
import spring.cloud.demo.controllers.domain.UserLoginDomain;
import spring.cloud.demo.service.SystemRoleCategoryService;

/**
 * Created by huang on 25/02/2017.
 */
@Controller
public class SystemRoleCategoryController {

  private Logger logger = LoggerFactory.getLogger(SystemRoleCategoryController.class);

  @Autowired
  SystemRoleCategoryService systemRoleCategoryService;

  @RequestMapping(value = "/hello", method = RequestMethod.POST)
  @ResponseBody
  public String sayHello(@RequestBody SystemRoleCategoryDomain roleCategoryDomain) {
    logger.info("controller info");
    systemRoleCategoryService.saveRoleCategory(roleCategoryDomain);
    System.out.printf("aaaa");
    return "hello";
  }

  @GetMapping(value = "/")
  public String index(Model model) {
    System.out.println("aaaa");
    model.addAttribute("user", new UserLoginDomain());
    return "index";
  }

  @PostMapping(value = "/login")
  public String login(@ModelAttribute UserLoginDomain user, Model model) {
    System.out.println(user.getUsername());
    System.out.println(user.getPassword());
    model.addAttribute("user", user);
    model.addAttribute("strs", new String[] {"a","b","c"});
    return "success";
  }
}
