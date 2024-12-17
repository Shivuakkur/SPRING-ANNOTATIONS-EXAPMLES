package in.shivu.beans;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("myDAO")
//@Primary
public class RVCE implements vtuFee{

	@Override
	public void collectFees() {
		// TODO Auto-generated method stub
		System.out.println("fees collected by RVCE... ");
		
	}

}
