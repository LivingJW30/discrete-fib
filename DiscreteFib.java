public class DiscreteFib{
    public static void main(String[] args){

        int n = 40;

        //for loop to print the return of our fibonacci function
        for (int i=0;i<n;i++){
            System.out.println(fib(i));

            //do some code here to determine divisibility pattern
        }
    }

    //function to print fibonacci sequence up to n
    public static int fib(int n){
        if (n<2){
            return 1;
        }

        return fib(n-1)+fib(n-2);
    }
}