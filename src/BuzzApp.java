public class BuzzApp {
    /*Write a program that prints the numbers from 1 to 100 and for multiples of ‘3’ print “Fizz” instead of the number and for the multiples of ‘5’ print “Buzz”.*/
    public static void main(String args[]){
        FizzBuzz(100);
    }
    public static void FizzBuzz(int value){
        for (int i = 1; i <= value; i++) {
           var a = i % 3 == 0 ? "Fizz" : (i % 5 == 0 ? "Buzz" : i);
           System.out.println(a);
        }
    }

}
