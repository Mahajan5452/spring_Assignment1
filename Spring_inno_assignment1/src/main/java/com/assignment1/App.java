package com.assignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class App {

	@Autowired
	private Buttton buttton;

	public void test() {
		buttton.DoublePress();
		buttton.singlePress();
		buttton.Slide();
	}
	
}
