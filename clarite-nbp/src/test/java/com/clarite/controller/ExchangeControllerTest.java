package com.clarite.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ExchangeControllerTest {
	@Autowired
    private MockMvc mockMvc;
	
	 @Test
	 public void getGoldPriceTest() throws Exception {
		mockMvc.perform(get("/gold"))
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("cena")))
		.andExpect(content().string(containsString("data")));
	  }
	 
	 @Test
	 public void getCurrencyPriceTest() throws Exception {
		mockMvc.perform(get("/currency"))
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("code")))
		.andExpect(content().string(containsString("mid")))
		.andExpect(content().string(containsString("currency")));
	  }
}
