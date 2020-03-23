package com.zzq.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;

/**
 * @Classname Guest
 * @Description TODO
 * @Date 2020/3/23 10:01 PM
 * @Created by zzq
 */

@Repository
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guest {
    @Column
    private long id;
    private String name;
    private String job;
}
