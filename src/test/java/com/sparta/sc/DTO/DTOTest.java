package com.sparta.sc.DTO;

import com.sparta.sc.Injector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.sparta.sc.ConnectionManager.*;

public class DTOTest {

    WeatherDTO response;

    @BeforeEach
    void setup() {
        response = Injector.injectDTO(getConnection("London"));
    }

    @Test
    @DisplayName("Response Gives Status Code 200")
    void ifResponseGivesStatusCode200() {
        System.out.println(response.getCod());
        Assertions.assertTrue(response.getCod() == 200);
    }

}
