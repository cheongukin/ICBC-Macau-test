package com.company;

import java.util.Scanner;

class fruitPrice {
    static int apple = 8;
    static int strawberry = 13;
    static int mango = 20;
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner fruitWeight = new Scanner(System.in);

        System.out.println("Please enter the number of apples(Jin 1/2Kilogram)");
        int appleWeight = fruitWeight.nextInt();
        while(appleWeight < 0){
            System.out.println("Wrong input!Please re-enter!");
            appleWeight = fruitWeight.nextInt();

        }

        System.out.println("Please enter the number of strawberry(Jin 1/2Kilogram)");
        int strawberryWeight = fruitWeight.nextInt();
        while(strawberryWeight < 0) {
            System.out.println("Wrong input!Please re-enter!");
            strawberryWeight = fruitWeight.nextInt();

        }

        System.out.println("Please enter the number of mango(Jin 1/2Kilogram)");
        int mangoWeight = fruitWeight.nextInt();
        while(mangoWeight < 0) {
            System.out.println("Wrong input!Please re-enter!");
            mangoWeight = fruitWeight.nextInt();
        }


        double totalPrice;
        totalPrice = calcPrice(appleWeight,strawberryWeight,mangoWeight);
        System.out.println("The total price of fruits is " + totalPrice);

        verifyResult();
    }

    public static double calcPrice(int appleWeight, int strawberryWeight, int mangoWeight) {

        double totalPrice;
        Scanner obj = new Scanner(System.in);

        System.out.println("Are strawberries on sale?(y/n)");
        String onSale = obj.next();
        if(onSale.equals("y"))
            totalPrice = appleWeight * fruitPrice.apple + strawberryWeight * fruitPrice.strawberry * 0.8 + mangoWeight * fruitPrice.mango;
        else
            totalPrice = appleWeight*fruitPrice.apple + strawberryWeight*fruitPrice.strawberry + mangoWeight*fruitPrice.mango;

        System.out.println("Whether or not minus 10 for every 100(y/n)");
        String fullMinus = obj.next();
        if(fullMinus.equals("y")){
            double temp = totalPrice / 100;
            for(;temp >= 1;temp--){
                totalPrice -= 10;
            }
        }

        return  totalPrice;
    }

    public static void verifyResult(){

        int tempApple = 10;
        int tempStrawberry = 10;
        int tempMango = 10;
        double tempPrice = 354;// strawberry on sale and full minus
        double result = calcPrice(tempApple,tempStrawberry,tempMango);
        if(result == tempPrice){
            System.out.println("Verification passed.");
        }
        else
            System.out.println("Verification failed.");
    }

}
