package tests;

import api_pom.book_creation.BookingResponseDto;
import api_pom.book_creation.CreateBookingResponseDto;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.junit5.AllureJunit5;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import requests_dto.CreateNewBookRequest;


@ExtendWith(AllureJunit5.class)
@Feature("Booking API")
class CreateNewBookingTest {

    CreateNewBookRequest createNewBookRequest;
    CreateBookingResponseDto createBookingResponseDto;
    BookingResponseDto bookingResponseDto;
    Response response;
    @BeforeEach
    public void setUp() {
        createNewBookRequest = new CreateNewBookRequest();
        bookingResponseDto = new BookingResponseDto();

    }
    @Test
    @Description("Testing if depositpaid is true in response")
    void createNewBookingWithPaidDeposit() {
        response = createNewBookRequest.createNewBookingResponse();
        createBookingResponseDto = createNewBookRequest.createNewBookingMappedDto(response);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertTrue(createBookingResponseDto.getBooking().isDepositPaid(), "Deposit is paid");
    }
}
