package com.devglan.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.devglan.model.Booking;

public interface BookingRepository extends CrudRepository<Booking, Long> {
	
	List<Booking> findByCreatedBy(Long userId);

}
