
package com.sales.demo.repository;

import com.sales.demo.model.Accommodation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface AccommodationRepository extends JpaRepository<Accommodation, Long> {

    List<Accommodation> findByLocation(String location);

    List<Accommodation> findByCheckInDateGreaterThanEqualAndCheckOutDateLessThanEqual(Date checkInDate, Date checkOutDate);

    @Query("SELECT a FROM Accommodation a WHERE a.location = :location " +
            "AND a.checkInDate >= :checkInDate AND a.checkOutDate <= :checkOutDate " +
            "AND a.preferences = :preferences")
    List<Accommodation> searchAccommodations(String location, Date checkInDate, Date checkOutDate, String preferences);

    @Modifying
    @Query("UPDATE Accommodation SET bookingStatus = false WHERE id = :accommodationId")
    void cancelBooking(Long accommodationId);

    @Modifying
    @Query("UPDATE Accommodation SET review = :review, rating = :rating WHERE id = :accommodationId")
    void writeReview(Long accommodationId, String review, int rating);

    @Query("SELECT a.bookingStatus FROM Accommodation a WHERE a.id = :accommodationId")
    boolean getBookingStatus(Long accommodationId);

    @Query("SELECT a FROM Accommodation a WHERE a.promotion = true")
    List<Accommodation> getPromotions();

    @Query("SELECT a FROM Accommodation a WHERE a.checkInDate >= :currentDate")
    List<Accommodation> getUpcomingBookings(Date currentDate);

    @Modifying
    @Query("UPDATE Accommodation SET bookingStatus = true WHERE id = :accommodationId")
    void confirmBooking(Long accommodationId);

    @Modifying
    @Query("UPDATE Accommodation SET bookingStatus = false WHERE id = :accommodationId")
    void rejectBooking(Long accommodationId);
}
