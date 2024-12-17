package com.shivu.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service



public class ReportService {
	
	public ReportDAO getDao() {
		return dao;
	}
//	@Autowired
//	public void setDao(ReportDAO dao) {
//		this.dao = dao;
//		System.out.println("setter method....");
//	}

//	@Qualifier("mysqlDAO")
	private ReportDAO dao;
//	@Autowired
	public ReportService(ReportDAO dao) {
		super();
		this.dao = dao;
		System.out.println("constructor executed...");
	}	
	
//	public ReportService() {
//	
//		System.out.println("ZERO parameteraized constructor executed...");
//	}

	public void generateReport() {
		dao.getData();
		System.out.println("report generated....");
	}

}
