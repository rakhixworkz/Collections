package com.xworkz.Collection.List;
import java.util.List;
import java.util.ArrayList;

public class AList {

	public static void main(String[] args) {
		List arrayList= new ArrayList();
		System.out.println("Before adding" +arrayList.isEmpty());
		arrayList.add("xworkz");
		arrayList.add(1);
		arrayList.add(true);
		arrayList.add(23.6);
		arrayList.add('a');
		Object object=arrayList.get(4);
		boolean contains=arrayList.contains(22);
		System.out.println(object);
		
	}

}
