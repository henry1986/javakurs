package com.abc.helloworld;

public class TimeWayData {
	private double s1;
	private double s2;
	private double time;

	public TimeWayData(double s1New) {
		super();
		this.s1 = s1New;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public void setS2(double s2) {
		this.s2 = s2;
	}

	public void setS1(double oma) {
		this.s1 = oma;
	}

	@Override
	public String toString() {
		return "TimeWayData [s1=" + s1 + ", s2=" + s2 + ", time=" + time + "]";
	}
}
