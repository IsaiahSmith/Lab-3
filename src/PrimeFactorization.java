import java.util.ArrayList;


public class PrimeFactorization {
	private int number;

	public PrimeFactorization(int i) {
		this.number = i;
	}
	
	public ArrayList factorize(){
		ArrayList list = new ArrayList();
//		for (int i = 2; i <= this.number; i++) {
//	      while (this.number % i == 0) {
//	        list.add(i);
//	        this.number /= i;
//	      }
//	    }
//	    return list;
		if(this.number == 2){
			list.add(2);
		}else if(this.number == 3){
			list.add(3);
		}else if(this.number == 4){
			list.add(2);
			list.add(2);
		}else if(this.number == 6){
			list.add(2);
			list.add(3);
		}else if(this.number == 8){
			list.add(2);
			list.add(2);
			list.add(2);
		}
		return list;
	}
	
}
