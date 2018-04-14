package com.devlan.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.devglan.model.Booking;
import com.devglan.model.UserDetails;
import com.devglan.repository.BookingRepository;
import com.devglan.repository.UserRepository;

public class CreateUser {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BookingRepository bookingRepository;
	
	@Test
	public void testCreateUsers() {
		Booking booking = new Booking();
		booking.setBookingAmount("1250");
		booking.setCreatedBy(1L);
		booking.setDropAddress("Chennai");
		booking.setPickupAddress("Bangalore");
		bookingRepository.save(booking);
		
		UserDetails details = new UserDetails();
		details.setEmail("abc@test.com");
		details.setFirstName("Abc");
		details.setLastName("Test");
		details.setPassword("password");
		userRepository.save(details);
	}

}
