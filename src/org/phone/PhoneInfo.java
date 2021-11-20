package org.phone;

public class PhoneInfo {

	private void phoneName() {
		System.out.println("motorola e5 plus");

		}
		private void phoneImeiNo() {
			System.out.println("36124789");

		}
		private void camera() {
			System.out.println("12mb");

		}
		private void storage() {
			System.out.println("150 gb");

		}
		private void osName() {
			System.out.println("windows 10");

		}
		
		public static void main(String[] args) {
			PhoneInfo a=new PhoneInfo();
				a.phoneName();
			       a.phoneImeiNo();
			       a.camera();
			       a.storage();
			       a.osName();
			
		}

}
