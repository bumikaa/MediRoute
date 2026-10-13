package randomized;
import java.math.BigInteger;
public class MillerRabin { public static boolean isPrime(long n){if(n<2)return false;return BigInteger.valueOf(n).isProbablePrime(20);} }
