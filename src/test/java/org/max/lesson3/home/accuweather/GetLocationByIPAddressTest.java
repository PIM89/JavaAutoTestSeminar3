package org.max.lesson3.home.accuweather;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.lesson3.home.accuweather.location.Country;
import org.max.lesson3.home.accuweather.location.IPAddressRequest;

import static io.restassured.RestAssured.given;

public class GetLocationByIPAddressTest extends AccuweatherAbstractTest {
    /*IP Address Search
    Returns information about a specific location, by IP Address.
    */
    @Test
    void getCountryIdTest() {
        Country country = given()
                .queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl() + "/locations/v1/cities/ipaddress")
                .then()
                .statusCode(200)
                .extract()
                .body().as(IPAddressRequest.class).country;

        Assertions.assertEquals("RU", country.getId());
    }


}
