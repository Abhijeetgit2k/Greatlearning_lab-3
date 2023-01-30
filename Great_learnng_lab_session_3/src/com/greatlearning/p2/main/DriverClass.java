package com.greatlearning.p2.main;

import com.greatlearning.p2.service.FindSumPair;
import com.greatlearning.p2.service.Node;

public class DriverClass {

	public static void main(String[] args) {

		Node root = null;

		FindSumPair findSP = new FindSumPair();
		root = findSP.insert(root, 40);
		root = findSP.insert(root, 20);
		root = findSP.insert(root, 60);
		root = findSP.insert(root, 10);
		root = findSP.insert(root, 30);
		root = findSP.insert(root, 50);
		root = findSP.insert(root, 70);

		int sum = 50;

		findSP.findpairWithGivenSum(root, sum);
	}
}
