package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheller;

public class Vehicle {
	private void vehicleNecessery() {
		System.out.println("total quantity 10");
		}
	public static void main(String[] args) {
		Vehicle a=new Vehicle();
		FourWheeler b=new FourWheeler();
		ThreeWheeler c=new ThreeWheeler();
		TwoWheller d=new TwoWheller();
			a.vehicleNecessery();
			b.bus();
			b.car();
			b.lorry();
			c.auto();
			d.bike();
			d.cycle();
	}

}
