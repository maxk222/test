package com.example.teachdemo.Controller;

import com.example.teachdemo.Entity.User;
import com.example.teachdemo.Service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestBootController {

    private final Logger logger = LoggerFactory.getLogger(TestBootController.class);

    @Autowired
    private TestService testService;

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<User> getAllUser() {
        List<User> allUser = testService.getAllUser();
        return allUser;
    }

}
