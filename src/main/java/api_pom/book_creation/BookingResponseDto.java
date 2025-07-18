package api_pom.book_creation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookingResponseDto {
    @JsonProperty("firstname")
    private String firstname;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("totalprice")
    private int totalprice;
    @JsonProperty("depositpaid")
    private boolean depositpaid;
    @JsonProperty("bookingdates")
    private BookingDates bookingdates;
    @JsonProperty("additionalneeds")
    private String additionalneeds;

    public BookingResponseDto() {

    }
    public String getFirstName() {
        return firstname;
    }
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }
    public String getLastName() {
        return lastname;
    }
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }
    public int getTotalPrice() {
        return totalprice;
    }
    public void setTotalPrice(int totalprice) {
        this.totalprice = totalprice;
    }
    public boolean isDepositPaid() {
        return depositpaid;
    }
    public void setDepositPaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }
    public BookingDates getBookingDates() {
        return bookingdates;
    }
    public void setBookingDates(BookingDates bookingdates) {
        this.bookingdates = bookingdates;
    }
    public String getAdditionalNeeds() {
        return additionalneeds;
    }
    public void setAdditionalNeeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }
}
