package org.transport;
import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	private void transportForm() {
		System.out.println("TRANSPORT BY ROAD");
		}
		public static void main(String[] args) {
			Transport a=new Transport();
			a.transportForm();
			Road b=new Road();
			b.bike();
			b.bus();
			b.car();
			b.cycle();
			Air c=new Air();
			c.aeroPlane();
			c.heliCopter();
			Water d=new Water();
			d.boat();
			d.ship();
			
		}

}
