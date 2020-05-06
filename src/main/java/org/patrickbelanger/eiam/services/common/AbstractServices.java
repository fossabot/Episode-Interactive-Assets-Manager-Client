package org.patrickbelanger.eiam.services.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class AbstractServices {

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    public int create(String sql, Object[] objects) {
	return jdbcTemplate.update(sql, objects);
    }
    
    public void delete() {
	
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public Object read(String sql, Object[] objects, Class<?> clazz) {
	return jdbcTemplate.queryForObject(sql, objects, new BeanPropertyRowMapper(clazz));
    }
    
    public void update() {
	
    }
    
}
