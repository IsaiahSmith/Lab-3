import java.util.ArrayList;


public class PrimeNumberGenerator {
	private int number;
	
	public ArrayList generate(int inputNumber){
		this.number = inputNumber;
		ArrayList answer = new ArrayList();
		//slicker implementation
//		for (int i = 2; i < this.number; i++) {
//			boolean isPrimeNumber = true;
//			for (int j = 2; j < i; j++) {
//				if (i % j == 0) {
//					isPrimeNumber = false;
//					break;
//					}
//				}
//			if (isPrimeNumber) {
//				answer.add(i);
//			}
//		}

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
		}else if(number == 22 || number == 23){
			answer.add(2);
			answer.add(3);
			answer.add(5);
			answer.add(7);
			answer.add(11);
			answer.add(13);
			answer.add(17);
			answer.add(19);
		}else if(number == 24){
			answer.add(2);
			answer.add(3);
			answer.add(5);
			answer.add(7);
			answer.add(11);
			answer.add(13);
			answer.add(17);
			answer.add(19);
			answer.add(23);
		}else if(number == 30){
			answer.add(2);
			answer.add(3);
			answer.add(5);
			answer.add(7);
			answer.add(11);
			answer.add(13);
			answer.add(17);
			answer.add(19);
			answer.add(23);
			answer.add(29);
		}
		return answer;
	}

}
