package api_pom.book_creation;

import java.util.List;

public class CreateBookDto {
    private final String firstname;
    private final String lastname;
    private final int totalprice;
    private final boolean depositpaid;
    private final BookingDates bookingdates;
    private final String additionalneeds;

    private CreateBookDto(BookingBuilder builder) {
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.totalprice = builder.totalprice;
        this.depositpaid = builder.depositpaid;
        this.bookingdates = builder.bookingdates;
        this.additionalneeds = builder.additionalneeds;
    }
    public static class BookingBuilder {
        private String firstname;
        private String lastname;
        private int totalprice;
        private boolean depositpaid;
        private BookingDates bookingdates;
        private String additionalneeds;

        public BookingBuilder firstName(String firstName) {
            this.firstname = firstName;
            return this;
        }
        public BookingBuilder lastName(String lastName) {
            this.lastname = lastName;
            return this;
        }
        public BookingBuilder totalPrice(int totalPrice) {
            this.totalprice = totalPrice;
            return this;
        }
        public BookingBuilder bookingDates(Boolean depositPaid) {
            this.depositpaid = depositPaid;
            return this;
        }
        public BookingBuilder bookingDates(BookingDates bookingDates) {
            this.bookingdates = bookingDates;
            return this;
        }
        public BookingBuilder additionalNeeds(String additionalNeeds) {
            this.additionalneeds = additionalNeeds;
            return this;
        }
        public CreateBookDto build() {
            return new CreateBookDto(this);
        }
    }
}
