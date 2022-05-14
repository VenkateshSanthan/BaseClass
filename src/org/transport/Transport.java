package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {

	public void TransportFrom() {
		System.out.println("CHENNAI TO MADURAI TRANSPORT FROM 470kms");
	}
	public static void main(String[] args) {
		Transport d = new Transport();
		d.TransportFrom();
		
		Road d1 = new Road();
		d1.bike();
		d1.cycle();
		d1.car();
		d1.bus();
		
		Air d2 = new Air();
		d2.aeroPlane();
		d2.helicopter();
		
		Water d3 = new Water();
		d3.boat();
		d3.ship();
		
	}
}
