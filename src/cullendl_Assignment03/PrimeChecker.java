package cullendl_Assignment03;
import java.math.BigInteger;
/**
 * A class to determine prime-ness
 * @author schwetim
 *
 */
public class PrimeChecker 
{
	/**
	 * The method that actually runs the calculations to determine prime-ness
	 * @author schwetim
	 * @param number The number whose prime-ness is being determined.
	 * @return True or False based on whether or not the number is prime.
	 */
	public static boolean IsPrime(BigInteger number)
	{
		if (number.equals(2)) {return true;} // Two is always prime
		if (number.equals(1) || !number.mod(new BigInteger("2")).equals(BigInteger.ZERO)) {return false;}		// One is not prime, and nothing that is divisible by two is either.
		for (BigInteger x = BigInteger.valueOf(3); x.compareTo(number.divide(BigInteger.valueOf(2))) <= 0; )	// Counting up by twos starting at three since anything divisible by 2 is prime.
		{
			if (number.mod(x).equals(0))		// Checking whether the given number is prime
			{
				return false;		// False == not prime
			} 
			x= x.add(BigInteger.valueOf(2));
		}
		return true;		// True == prime
	}
}