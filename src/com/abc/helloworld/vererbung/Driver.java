package com.abc.helloworld.vererbung;

public class Driver {

	public void drive(Car car) {
		car.gurtAnlegen();
		car.gasGeben();
	}

	public static void main() {
		Driver driver = new Driver();
		
		
		
		Car car = new BMW();
		
		
		
		driver.drive(car);

	}
}
