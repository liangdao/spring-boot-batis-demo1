package com.zzq.controller;

import com.zzq.bean.Guest;
import com.zzq.serveice.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname GuestController
 * @Description TODO
 * @Date 2020/3/23 10:12 PM
 * @Created by zzq
 */
@RestController
public class GuestController {

    @Autowired
    private GuestService service;

    @RequestMapping("/index")
    public List<Guest> selectList(){
        List<Guest> list = service.selectList();
        return list;
    }
}
