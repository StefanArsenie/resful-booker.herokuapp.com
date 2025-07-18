package api_pom.book_creation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateBookingResponseDto {
    @JsonProperty("bookingid")
    private long bookingid;
    private BookingResponseDto booking;
    public CreateBookingResponseDto() {}

    public long getBookingid() {
        return bookingid;
    }
    public BookingResponseDto getBooking() {
        return booking;
    }
    public void setBookingid(long bookingid) {
        this.bookingid = bookingid;
    }
    public void setBooking(BookingResponseDto booking) {
        this.booking = booking;
    }
}
