package org.company;

public class CompanyInfo {
	private void companyName() {
		System.out.println("greensTechnology");
	}

	private void companyId() {
		System.out.println("6458");
	}
	private void companyAddress() {
		System.out.println("32,perumbakkam,chennai");	
	}

	public static void main(String[] args) {
		CompanyInfo a = new CompanyInfo();
		a.companyName();
		a.companyId();
		a.companyAddress();
	}

}
