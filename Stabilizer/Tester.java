package com.xworkz.Collection.Stabilizer;

import com.xworkz.Collection.Stabilizer.dto.Stabilizer;
import com.xworkz.Collection.Stabilizer.service.StabilizerServiceImpl;

public class Tester {

	public static void main(String[] args) {
		Stabilizer s1=new Stabilizer("vguard", 800, 1234);
		Stabilizer s2=new Stabilizer("sony", 1000, 12345);
		Stabilizer s3=new Stabilizer("mi", 900, 3456);
		Stabilizer s4=new Stabilizer("lg", 700, 2345);
		StabilizerServiceImpl stabilizerServiceImpl=new StabilizerServiceImpl();
		stabilizerServiceImpl.validateSave(s1);
		stabilizerServiceImpl.validateSave(s2);
		stabilizerServiceImpl.validateSave(s3);
		stabilizerServiceImpl.validateSave(s4);
		stabilizerServiceImpl.display();
		stabilizerServiceImpl.remove(s4);
		stabilizerServiceImpl.display();
		
	}

}
