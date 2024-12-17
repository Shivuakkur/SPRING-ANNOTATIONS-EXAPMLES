package com.shivu.beans;

import org.springframework.stereotype.Repository;

@Repository("mysqlDAO")
public class MySqlReportDAO implements ReportDAO {

	@Override
	public void getData() {
		System.out.println("getting data from mysql db...");
		
	}

}
