package com.js.test.dao;

import com.js.test.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MenuDao {
    @Select("select * from sys_menu where menu_id = #{id}")
    public Menu getByMenuId(Integer id);

    public List<Menu> getUser() ;
}
