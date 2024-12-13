package com.BManager.B_Manager.repo;

import com.BManager.B_Manager.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    // Custom queries can go here if needed
}
