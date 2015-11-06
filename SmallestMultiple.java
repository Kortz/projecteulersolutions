package projecteuler;

public class SmallestMultiple {
    
    public static void main(String[] args) {     
        int number = 0;
        int maxDivider = 20;
        boolean found = false;
        int numberOfEvenNumbers = 0;
        while(numberOfEvenNumbers != maxDivider){
            number += 1;
            //Check if number is divisble without remainder with i as the max divider
            for(int i = 1; i <= maxDivider; i++){
                if(number % i == 0 && number % maxDivider == 0){
                    numberOfEvenNumbers += 1;
                }
                else{
                    i = maxDivider + 1;
                    numberOfEvenNumbers = 0;
                }
                
            }
        }
        System.out.println("Number: " + number + " is evenly divisible by numbers ranging from 1 to " + maxDivider);
    }
}

//Optimize with primes