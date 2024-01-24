package com.iiht.training.employee.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.iiht.training.employee.dto.CertificatesDto;


public interface CertificateServiceProxy {

	// Add a correct configuration for feign client
	public List<CertificatesDto> getCertificatesByEmployeeId(@PathVariable Integer employeeId);
}
