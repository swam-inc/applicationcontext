package com.example.applicationcontext;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ApplicationContextApplication.class})
class ConfigTest {
    private Config config = new Config();

    @Test
    public void test(){
        config.test();
    }

}