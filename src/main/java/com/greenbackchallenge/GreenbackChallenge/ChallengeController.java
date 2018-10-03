package com.greenbackchallenge.GreenbackChallenge;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.greenbackchallenge.GreenbackChallenge.entity.Input;

@Controller
public class ChallengeController {
	
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

		@RequestMapping("/submit")
		public ModelAndView submit(@RequestParam("ref") String ref, @RequestParam("date") String date, @RequestParam("currency") String currency, @RequestParam("amount") String amount) {
		Input input = new Input();
		//List<Input> input = new ArrayList<Input>();
		
		input.setRef(ref);
		input.setDate(date);
		input.setCurrency(currency);
		input.setAmount(amount);
		
		return new ModelAndView("submit", "json", input);
	}

}
