package com.qa.simsel1test;

import com.qa.simsel1.Classwithmethods;

public class Runner extends Classwithmethods {

	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.startbrowser("https://github.com/", "Chrome");
		runner.navigatebrowser();
		runner.launchbrowser();
		runner.close();
		runner.launchbrowser();
		runner.quit();
	}

}
