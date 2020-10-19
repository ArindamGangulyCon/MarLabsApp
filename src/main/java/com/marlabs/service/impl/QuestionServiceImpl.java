package com.marlabs.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.marlabs.dto.Question;
import com.marlabs.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {
	

	@Override
	public Question generateQuestion() {			
			
		Question question = new Question();
		 int[] numArrs;
			int min = 2;
			int max =5;			
			
		 Random rand = new Random(); 
		 int numCount = min + rand.nextInt(max);
		 	numArrs = new int[numCount];
		 System.out.println("Count "+numCount);
		 
		 for(int i=0; i<numCount; i++) {
			 numArrs[i] = min + rand.nextInt(9);			
		 }
		 question.setNumArr(numArrs);		 
		 int totalNumber = Arrays.stream(question.getNumArr()).sum(); 
		 
		 question.setTotalSum(totalNumber);  		 
		 question.setQues("Please sum the numbers "+ IntStream.of(numArrs).boxed().collect(Collectors.toList()));
		 
		 System.out.println(question.toString());		
		return question;		
	}



	@Override
	public Question submitAnswer(Question question) {
		
		
		 int ansNumber = question.getSumNumber();
		 int totalNumber = question.getTotalSum();
		 
		  Integer ansNumberInt = new Integer(ansNumber); 
		  Integer totalNumberInt = new Integer(totalNumber); 	
		 
		 System.out.println(ansNumber  + "---"  +totalNumber  );
		 
		 
		 
		 if(ansNumberInt.equals(totalNumberInt)) {
			 System.out.println(" true");
			 question.setMsg(" Yes ! you are correct !!");
			 question.setAnsType(true);
		 }else {
			 question.setMsg(" Sorry ! your sum value is not correct - try again !!");
			 question.setAnsType(false);
		 } 
		 
		 System.out.println("submitAnswer .."+question.toString());
		 return question;
	}





}