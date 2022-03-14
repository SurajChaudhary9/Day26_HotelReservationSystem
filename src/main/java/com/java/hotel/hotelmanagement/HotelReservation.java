/**
 *@PROBLEM_STATEMENT : UC1
 *Ability to add hotel for regular customer & regular rates.
 *@author Suraj Chaudhary
 *@Date 14-Mar-2022
 */
package com.java.hotel.hotelmanagement;

public class HotelReservation {
	/**
	 * @Purpose :To call for all operations in main method
	 * @Param :sop and added values display
	 * @Function : added values display
	 * @Return :giving hotel info
	 */

	public static void main(String[] args) {
		System.out.println("Welcome to hotel reservation system");
		HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
		hotelReservationSystem.addHotel("Lakebridge", 100, 90);
	}

}
