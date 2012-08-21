package com.invito.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {


		
        @RequestMapping("/welcome.do")
        public ModelAndView printWelcome() {
                    ModelAndView modelAndView = new ModelAndView();
                    modelAndView.addObject("message", "Spring 3 MVC Hello World");
                    modelAndView.setViewName("welcome");
                    return modelAndView;
        }
	

}
