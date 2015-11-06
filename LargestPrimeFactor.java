package projecteuler;
import java.math.BigInteger;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        //Declarations
        BigInteger number = new BigInteger("600851475143");
        BigInteger prime = new BigInteger("0").nextProbablePrime();
        
        //Calculation loop
        do{
            //If the remainder of number % prime is 0 then 
            if( number.remainder(prime).compareTo(new BigInteger("0")) == 0){
                number = number.divide(prime);
            }
            //Incremenet prime
            else{
                prime = prime.nextProbablePrime();
            }
        }while(number.compareTo(new BigInteger("1")) >= 1 ); //While number is larger or equal to 1
        System.out.println("Highest prime number: " + prime.toString());
    }   
}
