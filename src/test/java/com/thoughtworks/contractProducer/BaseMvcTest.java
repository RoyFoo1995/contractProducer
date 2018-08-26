package com.thoughtworks.contractProducer;

import com.github.database.rider.core.api.configuration.DBUnit;
import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.spring.api.DBRider;
import com.thoughtworks.contractProducer.controller.UserController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ContractProducerApplication.class,webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@RunWith(SpringRunner.class)
@DBRider
@DBUnit(caseSensitiveTableNames = true)
@DataSet("simple_users.yml")
@ActiveProfiles("test")
public abstract class BaseMvcTest {

    @Autowired
    private UserController userController;

    @Before
    public void setupController() {
        RestAssuredMockMvc.standaloneSetup(userController);
    }

}