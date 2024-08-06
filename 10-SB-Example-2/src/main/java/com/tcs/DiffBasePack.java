package com.tcs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class DiffBasePack {
	
	public DiffBasePack() {
		 System.out.println("Different Base Package Constuctor...");
	}

}
// have to configure like below code in main class
//@ComponentScan(basePackages = {"com.example.demo","com.tcs"})