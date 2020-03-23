package com.zzq.mapper;

import com.zzq.bean.Guest;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Classname GuestMapper
 * @Description TODO
 * @Date 2020/3/23 10:03 PM
 * @Created by zzq
 */
@Repository
public interface GuestMapper extends Mapper<Guest> {
}
