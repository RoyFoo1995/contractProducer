package com.thoughtworks.contractProducer;

import com.thoughtworks.contractProducer.controller.UserController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public abstract class BaseMvcTest {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(UserController.class);
    }

}
