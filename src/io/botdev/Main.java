package io.botdev;

public class Main {

    public static void main(String[] args) {

        String[] fruits = {"banana", "apple", "pear", "peach", "grape"};
        int countDown = 10;


        //a while loop
        //while countDown is greater than or equal to 0, this loop will run
        //keep in mind that you HAVE to make sure that you have a way to break out of the loop
        while(countDown >= 0){
            System.out.println("This is a countdown: " + countDown);
            countDown --;
        }


        System.out.println("");


        //a for loop
        //notice how we have created a new int called i to keep track of where we are in this loop
        //this loop will go for the length of our array, fruits
        //the i++ will make i increase every time the loop is run until i is equal to fruits.length
        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }


        System.out.println();


        //a foreach loop
        //this does exactly the same thing that the loop above did
        //it's just an easier way of iterating through a collection
        for (String fruit : fruits) {
            System.out.println(fruit);
        }




    }
}
