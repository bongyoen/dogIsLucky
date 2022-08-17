package com.controller.Vcontroller.vbusiness;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/vbusiness/")
public class VBusinessController {
	private static final Logger logger = LoggerFactory.getLogger(VBusinessController.class);
	
	@RequestMapping("main")
//	@ResponseBody
	public String main(/* @RequestParam(name="p", defaultValue="1") */) {
		return "vbusiness/main";
	}
}
