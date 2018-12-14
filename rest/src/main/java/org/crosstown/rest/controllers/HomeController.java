package org.crosstown.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author developer
 * @date 2018-12-13
 * @time 20:54
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index () {
        return "index";
    }
}
