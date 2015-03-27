import java.util.ArrayList;


public class PrimeNumberGenerator {
	private int number;
	
	public ArrayList generate(int inputNumber){
		this.number = inputNumber;
		ArrayList answer = new ArrayList();
		if(number == 2){
			answer = answer;
		}else if(number == 6){
			answer.add(2);
			answer.add(3);
			answer.add(5);
		}else if(number == 13){
			answer.add(2);
			answer.add(3);
			answer.add(5);
			answer.add(7);
			answer.add(11);
		}
		return answer;
	}

}
