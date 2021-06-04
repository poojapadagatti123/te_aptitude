package com.technoelevate.aptitude;

public class GetQuestion {

	Question[] questions=new Question[20];
	int [] answer =new int[20];
	
	void createQuestion() {
		   questions[0]=new Question("Which of the following option leads to the portability and security of Java?","Bytecode is executed by JVM","The applet makes the Java code secure and portable","Use of exception handling","Dynamic binding between objects");
		   questions[1]=new Question("Which of the following is not a Java features?","Dynamic","Architecture Neutral","Use of pointers","Object-oriented");
		   questions[2]=new Question("The \\u0021 article referred to as a","Unicode escape sequence","Octal escape","Hexadecimal","Line feed");
		   questions[3]=new Question("_____ is used to find and fix bugs in the Java programs.","JVM","JRE","JDK","JDB");
		   questions[4]=new Question("What is the return type of the hashCode() method in the Object class?","Object","int","void","long");
		   questions[5]=new Question("Which of the following is a valid long literal?","ABH8097", "L990023","904423","0xnf029L");
		   questions[6]=new Question("What does the expression float a = 35 / 0 return?", "0", "Not a Number", "Infinity","Run time exception");
		   questions[7]=new Question(" Evaluate the following Java expression, if x=3, y=5, and z=10:++z + y - y + z + x++", "24", "23", "20", "25");
	       questions[8]=new Question("Which of the following for loop declaration is not valid?", "for ( int i = 99; i >= 0; i / 9 )", "for ( int i = 7; i <= 77; i += 7 )", "for ( int i = 20; i >= 2; - -i )", "for ( int i = 2; i <= 20; i = 2* i )");
		   questions[9]=new Question("In which process, a local variable has the same name as one of the instance variables?", "Serialization", "Variable Shadowing", "Abstraction", "Multi-threading");
		   questions[10]=new Question(" Which of the following is true about the anonymous inner class?","It has only methods","Objects can't be created","It has a fixed class name","It has no class name");
	       questions[11]=new Question("Which package contains the Random class?","java.util package","java.lang package","java.awt package","java.io package");
		   questions[12]=new Question(" An interface with no fields or methods is known as a ______.","Runnable Interface","Marker Interface","Abstract Interface","CharSequence Interface");
		   questions[13]=new Question("Which option is false about the final keyword?","A final method cannot be overridden in its subclasses.","A final class cannot be extended.","A final class cannot extend other classes.","A final method can be inherited.");
		   questions[14]=new Question(" Which of the following is a marker interface?", "Runnable interface" ,"Remote interface", "Readable interface"," Result interface");
		   questions[15]=new Question(" Which of the following is a reserved keyword in Java?",  "object", "strictfp", "main",  "system");
		   questions[16]=new Question("	 Which keyword is used for accessing the features of a package?", "package", "import"," extends", "export");
		   questions[17]=new Question(" What do you mean by chained exceptions in Java?", " Exceptions occurred by the VirtualMachineError"," An exception caused by other exceptions",   "Exceptions occur in chains with discarding the debugging information",   "None of the above");
		   questions[18]=new Question(" In which memory a String is stored, when we create a string using new operator?"," Stack","String memory", "Heap memory",  " Random storage space");	   
		   questions[19]=new Question(" In java, jar stands for_____.","Java Archive Runner","Java Application Resource","Java Application Runner", " None of the above");		   
//		   questions[20]=new Question( " Which of the given methods are of Object class?", " notify(), wait( long msecs ), and synchronized()","wait( long msecs ), interrupt(), and notifyAll()",  "notify(), notifyAll(), and wait()"," sleep( long msecs ), wait(), and notify()");
	
	
	
	}
	
	
	void createAnswer() {
		   answer[0]=1;
		   answer[1]=2;
		   answer[2]=1;
		   answer[3]=4;
		   answer[4]=2;
		   answer[5]=4;
		   answer[6]=2;
		   answer[7]=1;
		   answer[8]=1;
		   answer[9]=2;
		   answer[10]=4;
		   answer[11]=2;
		   answer[12]=1;
		   answer[13]=3;
		   answer[14]=2;
		   answer[15]=2;
		   answer[16]=2;
		   answer[17]=2;
		   answer[18]=3;
		   answer[19]=4;
//		   answer[20]=3;	
			
	
	}
	
	Question[] getQuestion() {
		createQuestion();
		return questions;
	}
	
	int[] getAnswer() {
		createAnswer();
		return answer;
	}
	
	
	
}
