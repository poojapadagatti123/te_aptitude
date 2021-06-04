package com.technoelevate.aptitude;

import java.util.Scanner;

public class ValidateQuestion {
	GetQuestion getQuestion =new GetQuestion();	
	Scanner sc=new Scanner(System.in);
	int [] userAnswer =new int[20];	
	
	
	void displayQuestion(){
	Question[]  questions=getQuestion.getQuestion();	
	int k=1;
	for(int i=0;i<questions.length;i++) {
		System.out.println(k+". "+questions[i].question);
		System.out.println(1+" "+questions[i].option1);
		System.out.println(2+" "+questions[i].option2);
		System.out.println(3+" "+questions[i].option3);
		System.out.println(4+" "+questions[i].option4);
		System.out.println("--------------------------");
		System.out.println("1.enter one for answer                              2.Enter two for skip the question");

		int choice =sc.nextInt();
		userAnswer [i] =getInput(choice);
		k++;
	}
	}

	
	private int getInput(int choice) {
		int answer=0;
		switch(choice) {
		case 1:
			System.out.println("Enter the Answer");
		   answer=sc.nextInt();
		    break;
		case 2:
			answer=0;
		}
		return answer;
		
			}

	void result() {
	
		int[] answer=getQuestion.getAnswer();
		int count=0;int attempt=0;
		for(int i=0;i<answer.length;i++) {
		   if(answer[i]==userAnswer[i]) {
			   count++;
			   attempt++;
		   }
		   else if(userAnswer[i]!=0) {
			   attempt++;
		   }
		}
		percentageCalculation(count,attempt);
}


	private void percentageCalculation(int count, int attempt) {
		double d=((double)count)/20;
		  double percantage=d*100;
		  System.out.println("Attempted question:"+attempt+"    "+"Correct Answers:"+count+"    "+"Percentage:"+percantage);
		  if(percantage>=0 && percantage<35) {
			  System.out.println("Your performance is bad");
			  }
		  else if(percantage>=35 && percantage<50) {
			  System.out.println("Your performance is poor");
			  }
		  else if(percantage>=50 && percantage<70) {
			  System.out.println("Your performance is good");
			  }
		  else if(percantage>=70 && percantage<85) {
			  System.out.println("Your performance is very good");
			  }
		  else if(percantage>=85 && percantage<=100) {
			  System.out.println("Your performance is Excelent");
			  }
		  if(percantage>=60) {
			  System.out.println("Congragulation your eligible for next round");
		  }
		  else {
			  System.out.println("You are not eligible, thank you for participate");
		  }	
		
		
	}
	
}

