package com.bishe2.bishe2.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 视图跳转
 */
@Controller
@RequestMapping("/adminView")
public class AdminViewController {
    @RequestMapping("/index")
    public String index() {
        return "/admin/adminIndex";
    }
}
