/**
 *@PROBLEM_STATEMENT : UC1
 *@author Suraj Chaudhary
 *@Date 14-Mar-2022
 */
package com.java.hotel.hotelmanagement;

import java.util.ArrayList;

public class HotelReservationSystem {
	ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	Hotel hotel;

	/**
	 * @Purpose :To add hotel name & weekly other rates
	 * @Param :setters to initiate values
	 * @Function :setter and getters
	 * @Return :giving hotel info
	 */
	public Hotel addHotel(String hotelName, double weekdayRateRegular, double weekendRateRegular) {

		hotel = new Hotel();
		hotel.setHotelName(hotelName);
		hotel.setWeekdayRegularCustomerCost(weekdayRateRegular);
		hotel.setWeekendRegularCustomerCost(weekendRateRegular);
		hotelList.add(hotel);
		return hotel;
	}
}
