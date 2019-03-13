package com.baizhi.controller;

import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("findAll.do")
    public ModelAndView findAll(String name){
        Admin admin=adminService.login(name);
        if (admin==null){
            return new ModelAndView("/login.jsp");
        }else {
            return new ModelAndView("/index.jsp");
        }

    }
}
