package com.iiht.training.employee.proxy;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.iiht.training.employee.dto.SkillsDto;


public interface SkillsServiceProxy {


	// Add a correct configuration for feign client
	public List<SkillsDto> skillsByEmployeeId(@PathVariable("employeeId") Integer id);

	
}
