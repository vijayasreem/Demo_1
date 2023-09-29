package com.sales.demo.controller;

import com.sales.demo.model.Accommodation;
import com.sales.demo.service.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/accommodations")
public class AccommodationController {

    private final AccommodationService accommodationService;

    @Autowired
    public AccommodationController(AccommodationService accommodationService) {
        this.accommodationService = accommodationService;
    }

    @GetMapping("/search")
    public List<Accommodation> searchAccommodations(@RequestParam String location, @RequestParam Date checkInDate,
                                                    @RequestParam Date checkOutDate, @RequestParam String preferences) {
        return accommodationService.searchAccommodations(location, checkInDate, checkOutDate, preferences);
    }

    @GetMapping("/promotions")
    public List<Accommodation> getPromotions() {
        return accommodationService.getPromotions();
    }

    @GetMapping("/upcoming-bookings")
    public List<Accommodation> getUpcomingBookings(@RequestParam Date currentDate) {
        return accommodationService.getUpcomingBookings(currentDate);
    }

    @PostMapping("/{accommodationId}/booking")
    public void confirmBooking(@PathVariable Long accommodationId) {
        accommodationService.confirmBooking(accommodationId);
    }

    @PostMapping("/{accommodationId}/booking/cancel")
    public void cancelBooking(@PathVariable Long accommodationId) {
        accommodationService.cancelBooking(accommodationId);
    }

    @PostMapping("/{accommodationId}/booking/reject")
    public void rejectBooking(@PathVariable Long accommodationId) {
        accommodationService.rejectBooking(accommodationId);
    }

    @PostMapping("/{accommodationId}/review")
    public void writeReview(@PathVariable Long accommodationId, @RequestParam String review, @RequestParam int rating) {
        accommodationService.writeReview(accommodationId, review, rating);
    }

    @GetMapping("/{accommodationId}/booking-status")
    public boolean getBookingStatus(@PathVariable Long accommodationId) {
        return accommodationService.getBookingStatus(accommodationId);
    }
}