package org.college;

public class College {
	private void collegeName() {
		   System.out.println("SCT");
		}
		private void collegeCode() {
		   System.out.println("6225");
		}
		private void collegeRank() {
		   System.out.println("10th");
		}
		public static void main(String[] args) {
		   Student a=new Student();
			a.studentName();
			a.studentId();
			a.sudentDepartment();
		   College b=new College();
			b.collegeName();
			b.collegeCode();
			b.collegeRank();
		   Hostel c=new Hostel();
			c.hostelName();
		   Dept d=new Dept();
			d.departmentName();
		}

}
