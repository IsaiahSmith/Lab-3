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
		}
		return list;
	}
	
}
