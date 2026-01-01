package com.example.sample_java_assignment_app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
class SpringbootSampleAppApplicationTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testLoginEndpoint() throws Exception {
		mockMvc.perform(get("/login"))
				.andExpect(status().isOk())
				.andExpect(content().string("Please input your credentials for login..."));
	}

	@Test
	void testRegisterEndpoint() throws Exception {
		mockMvc.perform(get("/register"))
				.andExpect(status().isOk())
				.andExpect(content().string("Please follow registration process..."));
	}

	@Test
	void mainMethodRunsWithoutException() {
		SpringbootSampleAppApplication.main(new String[] {});
	}



}
