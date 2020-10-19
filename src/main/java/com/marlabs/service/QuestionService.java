package com.marlabs.service;

import java.util.List;


import com.marlabs.dto.Question;



public interface QuestionService {

	Question generateQuestion();

	Question submitAnswer(Question question);
	


}