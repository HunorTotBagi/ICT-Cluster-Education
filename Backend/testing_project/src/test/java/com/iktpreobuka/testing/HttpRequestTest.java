package com.iktpreobuka.testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {
	
	@LocalServerPort
	private int port;
	
	@Autowired
	protected TestRestTemplate testRestTemplate;

	@Test
	public void checkHelloWorldMethod() {
		assertThat(testRestTemplate.getForObject("http://localhost:" + port + "/greetings", String.class)).contains("Hello World!");
	}
}
