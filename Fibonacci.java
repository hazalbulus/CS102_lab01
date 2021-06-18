/**
 * Lab01 part c, a program to efficiently compute & display
 * the first 40 Fibonacci numbers by making use of the fact that the first 
 * two Fibonacci numbers are 0 and 1, and each subsequent number is the sum of the previous two
 * 
 * @author Hazal Buluş
 * @version 1.0 17.06.2021
 * 
 */
public class Fibonacci {
    public static void main(String[] args) {
        //Constants
        final int FIRST_NUM = 0;
        final int SECOND_NUM = 1;
        final int FIBO_NUM = 40;

        //Variables
        int nextFibonacci;

        IntBag fibonacci = new IntBag();

        //Initialize the first two values
        fibonacci.addToEnd( FIRST_NUM);
        fibonacci.addToEnd(SECOND_NUM);

        //Program Code
        for(int i = 2; fibonacci.size() <= FIBO_NUM; i++){
            nextFibonacci = fibonacci.bag[i-2] + fibonacci.bag[i-1];
            fibonacci.addToEnd(nextFibonacci);
        }
        System.out.println(fibonacci);        
    }
}
