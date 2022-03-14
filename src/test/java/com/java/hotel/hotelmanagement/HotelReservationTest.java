/**
 *Test File
 *@author Suraj Chaudhary
 *@Date 14-Mar-2022
 */
package com.java.hotel.hotelmanagement;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Purpose :To check whether hotel added or not
 * @Param :using assert for true or false
 * @Function :test function to check one feature
 * @Return :boolean o/p true/false
 */
public class HotelReservationTest {
	@Test
	public void givenHotelDetails_WhenValuesEnteredAreCorrect_ShouldReturnTrue() {

		HotelReservationSystem hotelReservationService = new HotelReservationSystem();
		Hotel isValidHotel1 = hotelReservationService.addHotel("Lakewood", 3, 110, 90);
		Hotel hotelLakewood = new Hotel("Lakewood", 3, 110, 90);
		Assert.assertSame(hotelLakewood.getHotelName(), isValidHotel1.getHotelName());

	}

}
