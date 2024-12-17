package com.shivu.beans;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("oracleDAO")
@Primary
public class OracleReportDAO implements ReportDAO {

	@Override
	public void getData() {
		System.out.println("getting data from Oracle db.... ");
		
	}

}
