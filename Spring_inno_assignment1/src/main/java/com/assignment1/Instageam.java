package com.assignment1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Instageam implements Buttton{

	@Override
	public void singlePress() {
		System.out.println(" instrageam Opened Chat via Single press ");
		
	}

	@Override
	public void DoublePress() {
		System.out.println(" instragram Opened Camera via Double press ");
		
	}

	@Override
	public void Slide() {
		System.out.println("instagram  Opened Location via Swipe ");
		
	}
     
}
