
package com.js.test;


import com.js.test.dao.MenuDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class HelloWorldApplicationTest {
    @Autowired MenuDao menuDao;

    @Test
    void contextLoads() {
        List<Menu> menu = menuDao.getUser();
        System.out.println(menu);

    }

}
