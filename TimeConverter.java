/* 7. Define Time class with hour and minute as data member. Also define addition method 
to add two-time objects. */

import java.util.*;

public class TimeConverter{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		Time1 t1 = new Time1(4,34,23);
		Time1 t2 = new Time1(5,23,60);
		t1.addtime(t2);
		System.out.println(t1.hours + " " +t1.minute + " "+ t1.second);
	}

}

class Time1{
	int hours;
	int minute;
	int second;

	public Time1(int hours,int minute,int second){
	this.hours = hours;
	this.minute = minute;
	this.second = second;
		
	}
	void addtime(Time1 t){

		this.second +=second;
		if(second>60){
			this.minute ++;
			this.second -= 60;
		}
		this.minute += minute;
		if(minute>60){
			this.hours++;
			this.minute -= 60;
		}
		this.hours += hours;
	}

}