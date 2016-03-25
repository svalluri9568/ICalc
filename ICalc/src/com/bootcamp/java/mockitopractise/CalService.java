package com.bootcamp.java.mockitopractise;

public class CalService {

	ICalculator calc;

	public int addTwoNumbers(int x, int y) {

		return calc.add(x, y);

	}

	public ICalculator getCal() {
		return calc;
	}

	public void setCal(ICalculator calc) {
		this.calc = calc;
	}


}
