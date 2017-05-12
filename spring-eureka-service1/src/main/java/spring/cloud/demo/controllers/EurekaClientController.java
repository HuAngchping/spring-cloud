package spring.cloud.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;

/**
 * Created by huang on 03/05/2017.
 */
@Controller
public class EurekaClientController {

  @RequestMapping(value = "/say", method = RequestMethod.GET)
  @ResponseBody
  public String sayHello() {
    return "Service 3! ";
  }
}
