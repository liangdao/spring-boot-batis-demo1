package com.zzq.mapper;

import com.zzq.bean.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname GuestMapper
 * @Description TODO
 * @Date 2020/3/23 10:03 PM
 * @Created by zzq
 */
@Mapper
@Repository
public interface GuestMapper {

    @Select("SELECT * FROM guest")
    List<Guest> selectList();
}
