package com.flightreservation;


import com.flightreservation.entity.User;
import com.flightreservation.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void crateUserTest() {
        User user = new User();
        user.setEmail("torikraju@gmailc.com");
        user.setFirstName("torikul");
        user.setLastName("alam");
        user.setPassword("123456");
        Boolean result = userService.save(user);
        assertThat(result).isTrue();
    }

}
