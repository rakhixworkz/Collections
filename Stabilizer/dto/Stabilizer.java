package com.xworkz.Collection.Stabilizer.dto;

import java.util.Iterator;

public class Stabilizer {
	private String brand;
	private int price;
	private int serialNumber;
	public Stabilizer(String brand, int price, int serialNumber) {
		super();
		this.brand = brand;
		this.price = price;
		this.serialNumber = serialNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public static Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	public static boolean remove(Stabilizer dto) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
