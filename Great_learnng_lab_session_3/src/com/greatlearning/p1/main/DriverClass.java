package com.greatlearning.p1.main;

import com.greatlearning.p1.service.BalancingBrackets;

public class DriverClass {

	public static void main(String[] args) {

		BalancingBrackets BalBrackets = new BalancingBrackets();
		String bracketExpression = "([[{}]])";

		Boolean result;

		result = BalBrackets.checkingBracketsBalanced(bracketExpression);

		if (result)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered String do not contain Balanced Brackets");

	}

}
