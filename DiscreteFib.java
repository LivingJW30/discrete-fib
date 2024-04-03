/*This program is designed to list the fibonacci sequence up to the 40th term.
 * It will print out all the numbers of the sequence and also find if they are divisible
 * by 5, 7, or 11. From this we can see a pattern and generate a concrete formula to
 * determine what fibonacci numbers are divisible by 5, 7, or 11 no matter how large the 
 * numbers get. Mathematical induction can be used to prove our statement and formulas as well.
 */

/*
 * Equations to determine divisibilty of Fibonacci Numbers:
 * 
 * Fib Divisibilty by 5 eq: Every (5*i) [where i >= 1] Fibonacci number is divisible by 5 
 * Fib Divisibilty by 7 eq: Every (8*i) [where i >= 1] Fibonacci number is divisible by 7
 * Fib Divisibilty by 11 eq: Every (10*i) [where i >= 1] FIbonacci number is divisible by 11
 */

public class DiscreteFib{
    public static void main(String[] args){

        int n = 40;
        int cur_num;

        //for loop to print the return of our fibonacci function
        for (int i=0;i<n;i++){
            cur_num = fib(i);
            System.out.print("Fib num(" + (i+1) + ") = " + cur_num);
            div(cur_num);
        }
    }

    //function to print fibonacci sequence up to n
    public static int fib(int n){
        if (n<2){
            return 1;
        }

        return fib(n-1)+fib(n-2);
    }

    //function to determine if a fib num is divisible by 5,7, or 11
    public static void div(int num){
        if (num%5 == 0){
            System.out.print(" div 5 = " + (num/5));
        }

        if (num%7 == 0){
            System.out.print(" div 7 = " + (num/7));
        }

        if (num%11 == 0){
            System.out.print(" div 11 = " + (num/11));
        }
        if ((num%5 != 0) && (num%7 != 0) && (num%11 != 0)){
            System.out.print(" div 5 = " + (num/5)+" R "+(num%5) +" div 7 = " + (num/7)+" R "+(num%7) + " div 11 = " + (num/11)+" R "+(num%11));
        }

        System.out.println("");
    }
}