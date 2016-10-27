package com.learn.day8;

public class PreferredCustomer extends Customer {
	
	private String ssnNumber;
	
	public PreferredCustomer() {
		super(); // Constructor call
		System.out.println("This is PreferredCustomer Constructor");
	}

	@Override
	public PreferredCustomer validateAddress(String city, String zipCode) {
		super.validateAddress(city, zipCode);
		System.out.println("Complicated Logic for PreferredCustomer Address Validation");
		return null;
	}
	
	/* You cannot override a final method from Parent
	public void searsLogic() {
		System.out.println("test");
	}*/
	
	/**
	 * @return the ssnNumber
	 */
	public String getSsnNumber() {
		return ssnNumber;
	}

	/**
	 * @param ssnNumber the ssnNumber to set
	 */
	public void setSsnNumber(String ssnNumber) {
		this.ssnNumber = ssnNumber;
	}
	
	

}
