package com.xworkz.Collection.Stabilizer.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.Collection.Stabilizer.dto.Stabilizer;

public class StabilizerDaoImpl {
	List stabilizer=new ArrayList();
	public void saveStabilizer(Stabilizer dto) {
		stabilizer.add(dto);
		System.out.println("Object added successfully");
	}
	public void display() {
		Iterator iterator=stabilizer.iterator();
		while(iterator.hasNext()) {
			Stabilizer s=(Stabilizer)iterator.next();
			System.out.println(s.getBrand());
			System.out.println(s.getPrice());
			System.out.println(s.getSerialNumber());
		}
	}
	public Object getBrand() {
		// TODO Auto-generated method stub
		return null;
	}
}
