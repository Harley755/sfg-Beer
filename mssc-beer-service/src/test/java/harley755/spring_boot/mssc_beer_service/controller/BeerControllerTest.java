package harley755.spring_boot.mssc_beer_service.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(BeerController.class)
public class BeerControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void testShow() throws Exception {
        mockMvc.perform(get("/api/v1/beer/" + UUID.randomUUID().toString())
            .accept(MediaType.APPLICATION_JSON))
           .andExpect(status().isOk());
    }

    @Test
    void testCreate() {

    }

    @Test
    void testUpdate() {

    }
}
