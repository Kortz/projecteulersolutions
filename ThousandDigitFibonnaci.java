
package projecteuler;
import java.math.BigInteger;

public class ThousandDigitFibonnaci {
    public static void main(String[] args) {
        BigInteger previousFibonnaciNumber = new BigInteger("1");
        BigInteger currentFibonnaciNumber = new BigInteger("2");
        BigInteger nextFibonnaciNumber = new BigInteger("3");
        int index = 3;

        //while length <= 1000
        while(currentFibonnaciNumber.toString().length() < 1000){
            index += 1;
            //Calculate next fibonnaci number
            nextFibonnaciNumber = currentFibonnaciNumber.add(previousFibonnaciNumber);
            previousFibonnaciNumber = currentFibonnaciNumber;
            currentFibonnaciNumber = nextFibonnaciNumber;
            
        }
        System.out.println("Length of digits: " + currentFibonnaciNumber.toString().length());
        System.out.println("Index of fibonnaci number: " + index);
    }
    
}
