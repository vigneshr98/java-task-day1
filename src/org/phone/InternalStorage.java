package org.phone;

public class InternalStorage {
	private void processorName() {
		System.out.println("intel Core i5");
		}
		private void ramsize() {
		System.out.println("4GB");
			}
		public static void main(String[] args) {

		InternalStorage m=new InternalStorage();
						
			m.ramsize();
			m.processorName();

		ExternalStorage B=new ExternalStorage();
			B.size();
			}

}
