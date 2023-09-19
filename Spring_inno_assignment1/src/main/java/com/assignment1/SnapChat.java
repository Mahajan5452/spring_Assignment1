package com.assignment1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SnapChat implements Buttton{

	@Override
	public void singlePress() {
		System.out.println("Opened Chat via Single press ");
		
	}

	@Override
	public void DoublePress() {
		System.out.println("Opened Camera via Double press ");
		
	}

	@Override
	public void Slide() {
		System.out.println("Opened Location via Swipe ");
		
	}
     
}
