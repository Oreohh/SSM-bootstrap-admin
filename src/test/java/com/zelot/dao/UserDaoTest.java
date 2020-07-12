package com.zelot.dao;


import com.zelot.ModelDo.Device;
import com.zelot.ModelDo.User;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring.xml"})
public class UserDaoTest {
    @Autowired
    UserDao userDao;

    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void selectTest() throws IOException{

        List<User> users = userDao.selectAll();
        for(User user:users) {
            String str = mapper.writeValueAsString(user);
            System.out.println(str);
        }
    }
}

