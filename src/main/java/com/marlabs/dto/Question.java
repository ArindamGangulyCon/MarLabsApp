package com.marlabs.dto;

import java.util.Arrays;


public class Question {

	
	public String ques;	
	public int[] numArr ;
	public int sumNumber;
	public int totalSum;
	public String msg;
	public boolean ansType=false;
	
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public int[] getNumArr() {
		return numArr;
	}
	public void setNumArr(int[] numArr) {
		this.numArr = numArr;
	}
	public int getSumNumber() {
		return sumNumber;
	}
	public void setSumNumber(int sumNumber) {
		this.sumNumber = sumNumber;
	}
	public int getTotalSum() {
		return totalSum;
	}
	public void setTotalSum(int totalSum) {
		this.totalSum = totalSum;
	}
	
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	public boolean isAnsType() {
		return ansType;
	}
	public void setAnsType(boolean ansType) {
		this.ansType = ansType;
	}
	@Override
	public String toString() {
		return "Question [ques=" + ques + ", numArr=" + Arrays.toString(numArr) + ", sumNumber=" + sumNumber
				+ ", totalSum=" + totalSum + ", msg=" + msg + ", ansType=" + ansType + "]";
	}
	
	


	
	
	
	
	
	 
	
	
	
	
	
	

}
