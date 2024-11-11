package com.psl.training;

class Bank {
	protected float rateOfInterest;

	public float getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

}

class SBI extends Bank {
	public void setRateOfInterest(float rateOfInterest) {
		System.out.println("SBI RateOfInterest:"+rateOfInterest);
	}
}

class IDFC extends Bank {
	public void setRateOfInterest(float rateOfInterest) {
		System.out.println("IDFC RateOfInterest:"+rateOfInterest);
	}
}

class ICICI extends Bank {
	public void setRateOfInterest(float rateOfInterest) {
		System.out.println("ICICI RateOfInterest:"+rateOfInterest);
	}
}

class HDFC extends Bank {
	public void setRateOfInterest(float rateOfInterest) {
		System.out.println("HDFC RateOfInterest:"+rateOfInterest);
	}
}
public class RuntimePolymorphism {

	public static void main(String[] args) {
		
		//Upcasting
		Bank bank=new SBI();
		bank.setRateOfInterest(3.8F);
		
		SBI sbi=new SBI();
		sbi.setRateOfInterest(4F);
		IDFC idfc=new IDFC();
		idfc.setRateOfInterest(1.5F);
		ICICI icici=new ICICI();
		icici.setRateOfInterest(5);
		HDFC hdfc=new HDFC();
		hdfc.setRateOfInterest(3.5F);
		
	}

}
