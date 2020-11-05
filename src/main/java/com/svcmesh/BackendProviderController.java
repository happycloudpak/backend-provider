package com.svcmesh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class BackendProviderController {
  @GetMapping("/provider/{message}")
  public String echo(@PathVariable String message) {
	  return "RESPONSE: " + message;
  }
  
  @GetMapping("/circuit/{status}")
  public String circuit(@PathVariable String status) {
	  String msg = "";
	  if("open".equalsIgnoreCase(status)) {
		  msg = "Circuit break is opened";
		  try {
			  Thread.sleep(2000);
			  
		  } catch(Exception e) {
			  e.printStackTrace();
		  }
	  } else {
		  msg = "Circuit break is closed";
		  
	  }
	  System.out.println(msg);
	  return msg;
	    
  }
}
