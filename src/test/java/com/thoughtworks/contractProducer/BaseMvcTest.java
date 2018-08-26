package com.thoughtworks.contractProducer;

import com.thoughtworks.contractProducer.controller.UserController;
import com.thoughtworks.contractProducer.model.User;
import com.thoughtworks.contractProducer.service.UserService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public abstract class BaseMvcTest {

    @Mock
    private UserService userService;
    @Before
    public void setupController() {
        RestAssuredMockMvc.standaloneSetup(new UserController(userService));
    }

    @Before
    public void setUpUserControllerData() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L,"张三","test1","test1"));
        users.add(new User(2L,"李四","test2","test2"));
        given(userService.getAll()).willReturn(users);
    }


}
