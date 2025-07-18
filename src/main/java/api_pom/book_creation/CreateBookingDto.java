package api_pom.book_creation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateBookingDto {
    private final String firstname;

    private final String lastname;
    private final int totalprice;
    private final boolean depositpaid;
    private final BookingDates bookingdates;
    private final String additionalneeds;

    private CreateBookingDto(BookingBuilder builder) {
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.totalprice = builder.totalprice;
        this.depositpaid = builder.depositpaid;
        this.bookingdates = builder.bookingdates;
        this.additionalneeds = builder.additionalneeds;
    }

    @JsonProperty("firstname")
    public String getFirstName() {
        return firstname;
    }
    @JsonProperty("lastname")
    public String getLastName() {
        return lastname;
    }
    @JsonProperty("totalprice")
    public int getTotalPrice() {
        return totalprice;
    }
    @JsonProperty("depositpaid")
    public boolean isDepositPaid() {
        return depositpaid;
    }
    @JsonProperty("bookingdates")
    public BookingDates getBookingDates() {
        return bookingdates;
    }
    @JsonProperty("additionalneeds")
    public String getAdditionalNeeds() {
        return additionalneeds;
    }
    public static class BookingBuilder {
        private String firstname;
        private String lastname;
        private int totalprice;
        private boolean depositpaid;
        private BookingDates bookingdates;
        private String additionalneeds;

        public BookingBuilder firstName(String firstname) {
            this.firstname = firstname;
            return this;
        }
        public BookingBuilder lastName(String lastname) {
            this.lastname = lastname;
            return this;
        }
        public BookingBuilder totalPrice(int totalprice) {
            this.totalprice = totalprice;
            return this;
        }
        public BookingBuilder depositPaid(boolean depositpaid) {
            this.depositpaid = depositpaid;
            return this;
        }
        public BookingBuilder bookingDates(BookingDates bookingdates) {
            this.bookingdates = bookingdates;
            return this;
        }
        public BookingBuilder additionalNeeds(String additionalneeds) {
            this.additionalneeds = additionalneeds;
            return this;
        }
        public CreateBookingDto build() {
            return new CreateBookingDto(this);
        }
    }
}
