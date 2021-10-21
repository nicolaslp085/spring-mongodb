package com.jpgarcia.arquitectura.springMongoDB;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class HttpRequestTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testSaludoPorDefecto() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:8080/api/hola",
                String.class)).contains("Hola Mundo!");
    }


}
