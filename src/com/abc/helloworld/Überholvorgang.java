package com.abc.helloworld;

public class Überholvorgang {

	public static TimeWayData getTime(double l1, double l2, double v1, double v2){
		// a nice formular, that calculates that shit
		double s1 = 5d;
		double s2 = 6d;
		TimeWayData timeWayData = new TimeWayData(s2);
//		timeWayData.setTime(34d);
//		timeWayData.setS2(s2);
//		timeWayData.setS1(s1);
		return timeWayData;
	}
	
	public static void main(String[] args){
		TimeWayData timeWayData1 = getTime(5d, 6d, 7d, 8d);
		System.out.println(timeWayData1);
	}
}
