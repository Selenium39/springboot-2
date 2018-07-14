package com.wantao.springboot2.responsitory;/*
 *author:wantao
 *createTime:18-7-14 23:35
 *description:
 */

import com.wantao.springboot2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserResponsitory extends JpaRepository<User,Integer> {
    //自定义方法
    //通过年龄查询
    public List<User> findByAge(Integer age);//方法的格式不能乱起
}
