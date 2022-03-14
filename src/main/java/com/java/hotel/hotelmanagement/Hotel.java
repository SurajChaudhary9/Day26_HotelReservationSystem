/**
 *@PROBLEM_STATEMENT : UC1
 *Ability to add hotel for regular customer & regular rates.
 *@author Suraj Chaudhary
 *@Date 13-Mar-2022
 */
package com.java.hotel.hotelmanagement;

public class Hotel {
	String hotelName;
	double weekdayRegularCustomerCost;
	double weekendRegularCustomerCost;

	// default constructor
	public Hotel() {

	}

	/**
	 * @return the hotelName
	 */
	public String getHotelName() {
		return hotelName;
	}

	/**
	 * @param hotelName the hotelName to set
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	/**
	 * @return the weekdayRegularCustomerCost
	 */
	public double getWeekdayRegularCustomerCost() {
		return weekdayRegularCustomerCost;
	}

	/**
	 * @param weekdayRegularCustomerCost the weekdayRegularCustomerCost to set
	 */
	public void setWeekdayRegularCustomerCost(double weekdayRegularCustomerCost) {
		this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
	}

	/**
	 * @return the weekendRegularCustomerCost
	 */
	public double getWeekendRegularCustomerCost() {
		return weekendRegularCustomerCost;
	}

	/**
	 * @param weekendRegularCustomerCost the weekendRegularCustomerCost to set
	 */
	public void setWeekendRegularCustomerCost(double weekendRegularCustomerCost) {
		this.weekendRegularCustomerCost = weekendRegularCustomerCost;
	}

	/**
	 * @Purpose :To add hotel name & weekly other rates
	 * @Param :parameterized constructor to assigning values to data members
	 * @Function :constructor
	 * @Return :giving hotel info
	 */
	public Hotel(String hotelName, double weekdayRegularCustomerCost, double weekendRegularCustomerCost) {
		super();
		this.hotelName = hotelName;
		this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
		this.weekendRegularCustomerCost = weekendRegularCustomerCost;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", rating=" + rating + ", weekdayRegularCustomerCost="
				+ weekdayRegularCustomerCost + ", weekendRegularCustomerCost=" + weekendRegularCustomerCost + "]";
	}

}
