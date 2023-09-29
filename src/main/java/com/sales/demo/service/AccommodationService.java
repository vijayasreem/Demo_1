package com.sales.demo.service;

import com.sales.demo.model.Accommodation;
import com.sales.demo.repository.AccommodationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AccommodationService {

    private final AccommodationRepository accommodationRepository;

    @Autowired
    public AccommodationService(AccommodationRepository accommodationRepository) {
        this.accommodationRepository = accommodationRepository;
    }

    public List<Accommodation> findByLocation(String location) {
        return accommodationRepository.findByLocation(location);
    }

    public List<Accommodation> findByCheckInDateAndCheckOutDate(Date checkInDate, Date checkOutDate) {
        return accommodationRepository.findByCheckInDateGreaterThanEqualAndCheckOutDateLessThanEqual(checkInDate, checkOutDate);
    }

    public List<Accommodation> searchAccommodations(String location, Date checkInDate, Date checkOutDate, String preferences) {
        return accommodationRepository.searchAccommodations(location, checkInDate, checkOutDate, preferences);
    }

    public void cancelBooking(Long accommodationId) {
        accommodationRepository.cancelBooking(accommodationId);
    }

    public void writeReview(Long accommodationId, String review, int rating) {
        accommodationRepository.writeReview(accommodationId, review, rating);
    }

    public boolean getBookingStatus(Long accommodationId) {
        return accommodationRepository.getBookingStatus(accommodationId);
    }

    public List<Accommodation> getPromotions() {
        return accommodationRepository.getPromotions();
    }

    public List<Accommodation> getUpcomingBookings(Date currentDate) {
        return accommodationRepository.getUpcomingBookings(currentDate);
    }

    public void confirmBooking(Long accommodationId) {
        accommodationRepository.confirmBooking(accommodationId);
    }

    public void rejectBooking(Long accommodationId) {
        accommodationRepository.rejectBooking(accommodationId);
    }
}