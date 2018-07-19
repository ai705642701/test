package com.test.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by caochengwu on 2018/6/29.
 */

@Controller
public class TestController {
    @RequestMapping("ccw1")
    public String test(){

        return "test";
    }
}
