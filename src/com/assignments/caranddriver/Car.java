package com.assignments.caranddriver;

public class Car {
	private int gas;
	private int status;
	
//	EMPTY CONSTRUCTOR
	public Car() {
		this(10,10);
	}
	
//	FULL CONSTRUCTOR
	public Car(int gas, int status) {
		this.gas = gas;
		this.status = status;
	}

	//	GETTERS AND SETTERS

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}
