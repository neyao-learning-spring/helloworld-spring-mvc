package org.oursight.learning.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by neyao@github.com on 2016/2/28.
 */

@Controller
public class HellowWorldController {
    String message = "This is neyao's helloworld of spring mvc";

    @RequestMapping("hello")
    public ModelAndView showMessage(@RequestParam(value="name", required = false, defaultValue = "Helloooooooooooooo") String name) {
        System.out.println("in controller show message");
        ModelAndView mv = new ModelAndView("helloworld");
        mv.addObject("message",message);
        mv.addObject("name",name);
        return mv;
    }
}
