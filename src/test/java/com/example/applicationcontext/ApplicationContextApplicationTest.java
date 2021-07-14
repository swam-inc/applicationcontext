package com.example.applicationcontext;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApplicationContextApplicationTest {
    private ApplicationContextApplication applicationContextApplication;
    private final Config config = new Config();

    @BeforeEach
    public void setup(){
        applicationContextApplication = new ApplicationContextApplication();
    }
    @Test
    void test1() {
        config.test();
    }
}