import java.util.ArrayList;


public class PrimeFactorization {
	private int number;

	public PrimeFactorization(int i) {
		this.number = i;
	}
	
	public ArrayList factorize(){
		ArrayList list = new ArrayList();
		if(this.number == 2){
			list.add(2);
		}else if(this.number == 3){
			list.add(3);
		}
		return list;
	}
	
}
