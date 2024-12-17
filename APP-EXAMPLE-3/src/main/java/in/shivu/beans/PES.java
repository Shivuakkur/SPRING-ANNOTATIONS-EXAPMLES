package in.shivu.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("xyz")
//@Primary
public class PES implements vtuFee{

	@Override
	public void collectFees() {
		// TODO Auto-generated method stub
		System.out.println("fees are collected by PES.....");
		
	}

}
