package com.masai;

public class TooShortAttendanceException extends Exception{
  public TooShortAttendanceException(String msg){
	  super(msg);
  }
}
