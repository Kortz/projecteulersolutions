package projecteuler;

import java.math.BigInteger;

public class LargePrime {
    public static void main(String[] args) {
        BigInteger prime = new BigInteger("2");
        int index = 1;
        int roof = 100001;
        
        while(index < roof){
            prime = prime.nextProbablePrime();
            index++;
        }
        System.out.println("Index: " + index);
        System.out.println("Prime at index: " + prime.toString());
    }
}
