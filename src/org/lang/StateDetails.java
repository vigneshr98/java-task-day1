package org.lang;

public class StateDetails {

	public void northIndia() {
		System.out.println("state No 1");
		}
		public void southIndia() {
		System.out.println("state No 2");
		}
		public static void main(String[] args) {
		LanguageInfo s=new LanguageInfo();
		       s.tamilLanguage();
		       s.englishLanguage();
		       s.hindiLanguage();
		StateDetails c=new StateDetails();
		       c.northIndia();
		       c.southIndia();	
		}

}
