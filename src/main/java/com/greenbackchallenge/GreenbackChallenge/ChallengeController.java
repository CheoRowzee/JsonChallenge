package com.greenbackchallenge.GreenbackChallenge;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChallengeController {
	
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
//	@RequestMapping("/submit")
//	public ModelAndView submit(@RequestParam("id") int id, @RequestParam("date") String date, @RequestParam("type") String type, @RequestParam("total") String total) {
//		return new ModelAndView("submit");
//	}

}
