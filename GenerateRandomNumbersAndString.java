import java.util.Random;
//import org.apache.commons.lang3.RandomStringUtils;
public class GenerateRandomNumbersAndString {

	public static void main(String[] args) {
		
		Random random=new Random();
		
		int intNum = random.nextInt(10);
		System.out.println("random number is  "+intNum);
		
		double doubleNum = random.nextDouble();
		System.out.println("random double number is  "+doubleNum);
		
		double randomDouble = Math.random();
		
		System.out.println("random double number using math is "+randomDouble);
		
		/*
		 * String randNum1 = RandomStringUtils.randomNumeric(5);
		 * System.out.println("random string number is  "+randNum1);
		 * 
		 * String randNum2 = RandomStringUtils.randomAlphabetic(10);
		 * System.out.println("random string alphabetic is  "+randNum2);
		 */
	}

}
