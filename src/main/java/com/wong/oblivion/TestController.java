package com.wong.oblivion;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wong on 18/7/4.
 */
@Controller
public class TestController {

    @RequestMapping(value = "/world", method = RequestMethod.GET)
    @ResponseBody
     public String test(HttpServletResponse httpServletResponse, HttpServletRequest request) {
        CglibProxy cglibProxy = new CglibProxy();
        CglibImpl proxy = (CglibImpl)cglibProxy.getProxy(CglibImpl.class);
        proxy.play();
        System.out.println("************");
        return "hello,spring mvc";
    }
}
