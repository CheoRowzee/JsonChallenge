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
		public ModelAndView submit(@RequestParam("ref") int ref, @RequestParam("date") String date, @RequestParam("currency") String currency, @RequestParam("amount") String amount) {
		ArrayList<Input> input = new ArrayList<Input>();
		
		((Input) input).setRef(ref);
		input.add(date);
		input.add(currency);
		input.add(amount);
		
		return new ModelAndView("submit", "json", input);
	}

}
