package com.marlabs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.marlabs.dto.Question;
import com.marlabs.service.QuestionService;

@Controller
public class QuestionController {

	@Autowired
	QuestionService questionService;
	
	Question question;

	@RequestMapping("/welcome")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
	
	 @RequestMapping(value = "/getQuestion", method = RequestMethod.GET) 
	 public ModelAndView getQuestion() 
	 { 		 	 
		 Question question = questionService.generateQuestion();		 
		 return new ModelAndView("receiveAnswer", "question", question); 
	 }
	
	 @RequestMapping(value = "/submitAnswer", method = RequestMethod.POST) 
	 public ModelAndView submitAnswer(Question question) 
	 { 		 	 
		  question = questionService.submitAnswer(question);		
		
		 return new ModelAndView("receiveAnswer", "question", question); 
	 }
	
	 
	


}
