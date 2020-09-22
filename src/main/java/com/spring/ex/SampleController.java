package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("sample")
public class SampleController {
	@RequestMapping("/input")
	public ModelAndView input() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("sample/input");
		
		return mav;
	}
	
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("sample/list");
		
		return mav;
	}
}
