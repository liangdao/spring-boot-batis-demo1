package com.zzq.mapper;

import com.zzq.bean.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
    List<Guest> selectList();
}
