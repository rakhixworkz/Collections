package com.xworkz.Collection.Stabilizer.service;

import com.xworkz.Collection.Stabilizer.dao.StabilizerDaoImpl;
import com.xworkz.Collection.Stabilizer.dto.Stabilizer;

public interface StabilizerService {
	public void validateSave(Stabilizer dto);
	public void display();
	public void remove(Stabilizer dto);
	public void updatePriceByserialNumber(int newPrice,int serialNumber);
	
	

}
