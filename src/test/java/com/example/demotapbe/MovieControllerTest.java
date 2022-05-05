package com.example.demotapbe;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MovieController.class)
class MovieControllerTest {

  @Autowired
  MockMvc mockMvc;

  @Test
  void films() throws Exception {
    mockMvc.perform(get("/films")).andExpect(status().isOk())
            .andExpect(jsonPath("$[0].title").value("A New Hope2"))
            .andExpect(jsonPath("$[0].director").value("George Lucas"))
    ;
  }
}
