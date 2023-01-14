package com.masai;

public interface Stack {
	  void push(int element) throws OverflowException;
	  int pop() throws UnderflowException;
	  int peek() throws UnderflowException;
	  static String displayStackElements(int stack[]){
	    //write code to convert the stack elements to comma separate String sequence from index 0 to top
	StringBuilder sb = new StringBuilder();
	for(int i = 0;i<stack.length;i++) {
		if(stack[i]!=0) {
		sb.append(stack[i]+", ");
	}
		}
	return sb.toString();
	
	  }
}
