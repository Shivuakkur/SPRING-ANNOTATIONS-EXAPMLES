package in.shivu.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
public class vtuService {
	
	
	private vtuFee vtuFeee;
	
	@Autowired
	public vtuService(@Qualifier("xyz") vtuFee vtuFeee) {
		
		this.vtuFeee = vtuFeee;
		System.out.println("constructor called.....");
	}


	
//	
//	@Autowired
//	public void setVtuFeee(vtuFee vtuFeee) {
//		this.vtuFeee = vtuFeee;
//		System.out.println("setters are called..");
//	}



	public void collectingFees() {
		vtuFeee.collectFees();
		System.out.println("fees are collected...");
	}

	

}
