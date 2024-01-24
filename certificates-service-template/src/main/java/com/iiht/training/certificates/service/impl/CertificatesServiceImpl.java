package com.iiht.training.certificates.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.certificates.dto.CertificatesDto;
import com.iiht.training.certificates.repository.CertificatesRepository;
import com.iiht.training.certificates.service.CertificatesService;

@Service
public class CertificatesServiceImpl implements CertificatesService {

	@Autowired
	private CertificatesRepository repository;

	@Override
	public CertificatesDto generateCertificate(CertificatesDto certificatesDto) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public List<CertificatesDto> findCertificatesByEmployeeId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CertificatesDto> findCertificatesBySkillName(String skillName) {
		// TODO Auto-generated method stub
		return null;
	}

}
