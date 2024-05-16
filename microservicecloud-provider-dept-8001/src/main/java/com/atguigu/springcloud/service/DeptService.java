package com.atguigu.springcloud.service;


import com.atguigu.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DeptService
{
  public boolean add(Dept dept);
  public Dept get(Long id);
  public List<Dept> list();
}
 
 

