import java.util.ArrayList;
import java.util.Random;

public class OddNumber {
    /*Write a programm that executes 100 times a random int and at the
 end print the number of even results and the number of odd results; Announce the result!Random int executed 100 times.
Results:50 even(head), 50 odd(tail).Even Win!*/
    public static void main(String args[]){
        ramdonOddEven();
    }

    public static void ramdonOddEven(){
        Random n = new Random();
        int x;
        ArrayList <Integer> odd = new ArrayList<>();
        ArrayList <Integer> even = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            x = n.nextInt(1000);
            boolean b = x % 2 == 0 ? odd.add(x) : even.add(x);
        }

        System.out.println("Odd : ");
        for(int i : odd) {
            System.out.println(i);
        }

        System.out.println("Even : ");
        for(int i : even) {
            System.out.println(i);
        }


        System.out.println(even.size() >= 50 ? ("\n\nResults : \nEven:" + even.size() + "\nOdd : " + odd.size() + "\nEven Win!") : ("Results : \nEven:" + even.size() + "\nOdd : " + odd.size() + "\nOdd Win!"));
    }
}
