package dataTypes;

public class Main {


            public static void main(String[] args) {
                byte myByte = 1;
                
                short myShort = 2;
                
                int myInt = 2;
                
                long longTotal = 50000L + 10L *(myByte + myShort + myInt);
                
                short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));
                System.out.println("Long Total = " + longTotal);
                System.out.println("short Total = " + shortTotal);

            }
}