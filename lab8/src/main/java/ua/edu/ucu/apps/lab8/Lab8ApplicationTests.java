package ua.edu.ucu.apps.lab8;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootTest(exclude = {DataSourceAutoConfiguration.class})
class Lab8ApplicationTests {

    @Test
    void contextLoads() {
    }

}