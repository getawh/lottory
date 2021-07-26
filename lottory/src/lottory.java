import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class lottory {
    public static void main(String[] args) {
        ArrayList <Integer> ticketNumbers= new ArrayList<>();
        ArrayList <Integer> storeNumbers= new ArrayList<>();
        ArrayList <String> storeName= new ArrayList<>();

        boolean flag = true;
        int x;
        lottory Lottory = new lottory();
        Scanner input =new Scanner(System.in);
        while(flag){
            System.out.println("PLEASE CHOOSE FROM BELLOW OPTIONS : \n0. BUY LOTTERY TICKET\n1. REVEAL LUCKY LOTTERY \n-1. EXIT");
            x = input.nextInt();

            switch (x){
                case 0:
                {
                    System.out.println("PLEASE ENTER YOUR NAME : ");
                    String name = input.next();
                    int number = Lottory.ticketGenerator();
                    ticketNumbers.add(number);
                    storeNumbers.add(number);
                    storeName.add(name);
                    System.out.println("DEAR "+name.toUpperCase()+" YOUR LOTTERY NUMBER IS "+number+ " \nPLEASE KEEP IT SAFE!");
                    break;
                }
                case 1:
                {
                    if (ticketNumbers.size()==0) {
                        System.out.println("NO LOTTERY TICKET HAS BOUGHT!");
                        break;
                    }
                    System.out.println("ARE YOU SURE OU WANT DRAW THE LOTTERY? \nENTER 1 TO CONFIRM\nENTER 0 TO CANCEL ");
                    int y = input.nextInt();
                    if(y == 0)break;
                    Collections.shuffle(ticketNumbers);
                    System.out.println("THE WINNER IS "+storeName.get(storeNumbers.indexOf(ticketNumbers.get(0))).toUpperCase()+"\nTICKET NUMBER : "+ticketNumbers.get(0));
                    System.out.println("THANK YOU FOR USING OUR SERVICE!");
                    flag = false;
                    break;
                }
                case -1:
                {
                    flag = false;
                    break;
                }
        }
        }


    }





     int ticketGenerator(){

        int ticketNo = (int)(Math.random()*100000);
        ticketNo = ticketNo+ 1000000;
        return ticketNo;
    }



}
