package com.ccchen;

import com.ccchen.dao.userDao;
import com.ccchen.pojo.user;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringChenApplicationTests {
    @Autowired
    private userDao uuser;
    @Test
    void testGetById() {
        user uu = uuser.getById(1);
        System.out.print(uu);
    }

}
