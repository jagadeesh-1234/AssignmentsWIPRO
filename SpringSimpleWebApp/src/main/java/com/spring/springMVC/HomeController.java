package com.spring.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView HomePageMethod() {
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	};
	

    @RequestMapping("/home")
    public ModelAndView homePageMethod() {
        return new ModelAndView("home");
    }
    
    @RequestMapping("/index")
    public ModelAndView indexMethod() {
        return new ModelAndView("index");
    }
    
}
