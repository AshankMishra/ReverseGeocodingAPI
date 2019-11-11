package com.mmi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mmi.Service.CommonService;

@Controller
public class CommonController {
	@Autowired
	CommonService commonService;

	@RequestMapping(value = "/RevGeoCoding")

	public String indexPage() {

		return "RevGeoCoding";
	}

	String addr = "";

	@RequestMapping(value = "/latLong")
	@ResponseBody
	public String getlatlong(@RequestParam("lat") String lat, @RequestParam("lng") String lng) {
		try {
			addr = commonService.getAddress(lat, lng);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return addr;
//		ModelAndView mv = new ModelAndView();
//		
//		return mv;
	}
}
