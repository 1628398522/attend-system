package com.tsl.attendsystem.service.impl;


import com.tsl.attendsystem.service.AttendService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AttendServiceImplTest {

    @Autowired
    private AttendService attendService;

    @Test
    public void findAllBySign() {
        System.out.println(attendService.findAllBySign(1));
    }
}