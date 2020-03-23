package com.zzq.serveice;

import com.zzq.bean.Guest;
import com.zzq.mapper.GuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname GuestService
 * @Description TODO
 * @Date 2020/3/23 10:11 PM
 * @Created by zzq
 */
@Service
public class GuestService {

    @Autowired
    private GuestMapper mapper;

    public List<Guest> selectList(){
        return mapper.selectAll();
    }

}
