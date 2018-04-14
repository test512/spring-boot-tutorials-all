package com.devglan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devglan.exception.UserNotFoundException;
import com.devglan.model.Booking;
import com.devglan.model.UserDetails;
import com.devglan.repository.BookingRepository;
import com.devglan.repository.UserRepository;

@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BookingRepository bookingRepository;

	public List<Booking> findUserBookings(String emailId) {
		UserDetails userdetails = userRepository.findByEmail(emailId);
		
		if(userdetails == null)
			throw new UserNotFoundException("User having "+emailId+" not present.");
		
		List<Booking> bookings = bookingRepository.findByCreatedBy(userdetails.getId());
		return bookings;
	}
}
