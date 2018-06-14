package org.syntinel.service;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
}
