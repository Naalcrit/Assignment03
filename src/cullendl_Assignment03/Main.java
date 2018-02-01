package cullendl_Assignment03;
/**
 * Daniel Cullen and Ian Schwettman
 * This project checks a big integer for prime-ness
 * Code was based off of Proffessor Nicholson's.
 */
import java.lang.reflect.Array;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		
		//BigInteger bi = BigInteger.valueOf(alpha);
		//bi = new BigInteger("123");
		
		//change to array and a loop
		
		//PrimeChecker first = new PrimeChecker();
		//	System.out.println("hi");
		
	
		
		TestCase testCases[] = { //creates an array with numbers in it to check for prime
				new TestCase("3", true),
				new TestCase("1", false),
				new TestCase("7", true),
				new TestCase("100000000000", false)
				
		};
		int testsPassed = 0, testsFailed =0, testNumber=0;
		
		//PrimeChecker primeChecker = new PrimeChecker(new BigInteger("0"));
		
		for (TestCase tc : testCases){
			testNumber++;
			boolean result = PrimeChecker.IsPrime(new BigInteger(tc.test));
			if (result == tc.expectedResult){
				testsPassed++;
			}else{
				testsFailed++;
				System.out.println("Test " + testNumber + " failed (" + tc.test + ") .");
			}
		}
		if (testsPassed == testCases.length) {
			System.out.println("All tests passed.");
		} else{
			System.out.println(testCases.length - testNumber + " tests failed.");
		}
		System.out.println("");
		

	}
	
	// allows for TestCase to have a number string and an assumed result.

	private static class TestCase {
		public TestCase(String test, boolean expectedResult) {this.test = test; this.expectedResult=expectedResult;};
		public String test;
		public boolean expectedResult;
	}

}
