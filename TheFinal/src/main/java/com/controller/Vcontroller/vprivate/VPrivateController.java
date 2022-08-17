package com.controller.Vcontroller.vprivate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vprivate/")
public class VPrivateController {
	private static final Logger logger = LoggerFactory.getLogger(VPrivateController.class);
	
	@RequestMapping("main")
	public String main() {
		
		return "vprivate/main";
	}
}
