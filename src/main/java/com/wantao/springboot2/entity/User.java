package com.wantao.springboot2.entity;/*
 *author:wantao
 *createTime:18-7-14 23:09
 *description:
 */

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer age;
}
