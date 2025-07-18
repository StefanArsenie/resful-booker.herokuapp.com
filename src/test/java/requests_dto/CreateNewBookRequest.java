package requests_dto;

import api_pom.book_creation.BookingDates;
import api_pom.book_creation.CreateBookingDto;
import api_pom.book_creation.CreateBookingResponseDto;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import requests.Requests;
import responses.Responses;
import utils.Constants;
import utils.UrlResources;

public class CreateNewBookRequest {
    private final Requests requests = new Requests();
    private final Responses responses = new Responses();

    public Response createNewBookingResponse() {
        RequestSpecification spec = requests.buildRequest(UrlResources.AUTHORIZATION.getUrl());
        BookingDates bookingDates = new BookingDates(Constants.CHECK_IN, Constants.CHECK_OUT);
        CreateBookingDto addBooking = new CreateBookingDto.BookingBuilder()
                .firstName(Constants.FIRST_NAME)
                .lastName(Constants.LAST_NAME)
                .totalPrice(Constants.TOTAL_PRICE)
                .depositPaid(Constants.DEPOSIT_PAID)
                .bookingDates(bookingDates)
                .additionalNeeds(Constants.ADDITIONAL_NEEDS)
                .build();
        return responses.post(spec, "/booking", addBooking);
    }
    public CreateBookingResponseDto createNewBookingMappedDto(Response response) {
        return response.as(CreateBookingResponseDto.class);
    }
}
