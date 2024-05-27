package com.integration.docker_jenkins_integration_sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController 
{
  @RequestMapping("/test")
  public String test()
  {
	  return "Test is completed";
  }
}
