package com.heima.dao;

import com.heima.pojo.User;
import com.heima.utils.DataSourceUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;


public class LoginDao {


    public User queryUserByUserNameAndPassword(String username, String password) {
        String sql = "select * from user where name=? and password=?";
        DataSource dataSource = DataSourceUtils.getDataSource();
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        try {
            return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), username, password);
        } catch (DataAccessException e) {
            return null;
        }

    }
}
