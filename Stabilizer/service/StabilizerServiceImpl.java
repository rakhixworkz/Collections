package com.xworkz.Collection.Stabilizer.service;

import com.xworkz.Collection.Stabilizer.dao.StabilizerDaoImpl;
import com.xworkz.Collection.Stabilizer.dto.*;

import java.util.Iterator;

import com.xworkz.Collection.Stabilizer.Exception.InvalidBrand;
import com.xworkz.Collection.Stabilizer.Exception.InvalidPrice;
import com.xworkz.Collection.Stabilizer.Exception.InvalidSerialNumber;
import com.xworkz.Collection.Stabilizer.dao.StabilizerDaoImpl;
import com.xworkz.Collection.Stabilizer.dto.Stabilizer;
import com.xworkz.Collection.Stabilizer.service.*;

public class StabilizerServiceImpl implements StabilizerService{
	boolean status=true;
	private Object stabilizer;
	public void validateSave(Stabilizer dto) {
		try {
			if(dto.getBrand().length()<2&&dto.getBrand()==null){
				this.status=false;
				throw new InvalidBrand("Invalid brand");
			}
		}catch(InvalidBrand e)
		{
			System.out.println(e);
		}
	}

	@Override
	public void display() {
		
		Iterator iterator=Stabilizer.iterator();
		while(iterator.hasNext()) {
			Stabilizer s=(Stabilizer)iterator.next();
			System.out.println(s.getBrand());
			System.out.println(s.getPrice());
			System.out.println(s.getSerialNumber());
			
		}
	}

	@Override
	public void remove(Stabilizer dto) {
		boolean remove=Stabilizer.remove(dto);
		if(remove) {
			System.out.println("Removed successfully");
		}
	}

	public void updatePriceByserialNumber(int newPrice, int serialNumber) {

		for (Object object :stabilizer) {
			Stabilizer s=(Stabilizer)object;
			if(s.getSerialNumber()==serialNumber) {
				s.setPrice(newPrice);
			}
			
		}
		
	}

	

}
