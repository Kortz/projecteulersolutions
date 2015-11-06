package projecteuler;

public class SumOfSquares {
    public static void main(String[] args) {
        int sumOfSquares = 0;
        int squareOfSums = 0;
        int sumOfLimit = 0;
        int roof = 20;
        
        for(int i = 1; i <= roof; i++){
            sumOfSquares += i*i;
        }
        
        for(int i = 1; i <= roof; i++){
            sumOfLimit += i;
        }
        
        squareOfSums = sumOfLimit * sumOfLimit;
        
        
        System.out.println("Sum of squares: "+sumOfSquares);
        System.out.println("Square of sum: "+squareOfSums);
        System.out.println("Difference: " + (squareOfSums - sumOfSquares));
    }
    
}
