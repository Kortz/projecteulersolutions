/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author Hampus
 */
public class LargestPalindromeProduct {
    public static void main(String[] args) {
        int largestPalindrome = 0;
        //Loop through all possible triple digit numbers for x
        for(int x = 100; x < 1000; x++){
            //Loop through all possible triple digit numbers for y
            for(int y = 100; y < 1000; y++){
                String product = "" + x * y;
                String reversedProduct = "";

                //Reverse product
                for(int i = 1; i <= product.length(); i++){
                    reversedProduct += product.charAt(product.length()-i);
                }

                //Check if product is a valid palindrome
                if(product.equals(reversedProduct)){
                    //If product is larger than previous largest palindrome replace it
                    if(Integer.parseInt(product) > largestPalindrome){
                        largestPalindrome = Integer.parseInt(product);
                    }
                }
            }
        }
        System.out.println("Largest palindrome found: " + largestPalindrome);
    }
}
