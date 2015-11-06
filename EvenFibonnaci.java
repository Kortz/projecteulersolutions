package projecteuler;

public class EvenFibonnaci {
    public static void main(String[] args) {
        int limit = 4000000;
        int previousValue = 1;
        int currentValue = 2;
        int newValue = previousValue + currentValue;
        int sum = previousValue + currentValue + newValue;
        
        while(newValue <= limit){
            //Calculate fibonnaci value
            newValue = previousValue + currentValue;
            previousValue = currentValue;
            currentValue = newValue; 
            
            //If fibonnaci value is even
            if(newValue % 2 == 0) sum += newValue;
        }
        System.out.println("Sum of even values: " + sum);
    }
}
