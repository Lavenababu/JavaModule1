/*
Five Bikers Compete in a race such that they drive at
a constant speed which may or may not be the same as
the other. To qualify the race, the speed of a racer must
be more than the average speed of all 5 racers. Write a
Java program to take as input the speed of each racer
and print back the speed of qualifying racers
 */

public class Bikers {
    public static void main(String[] args) {
        float b1=20,b2=35,b3=25,b4=40,b5=30,average;
        average = (b1+b2+b3+b4+b5)/5;
        System.out.println("Average =  "+average);
        if(b1>average)
            System.out.println("B1 Qualified");
        if(b2>average)
            System.out.println("B2 Qualified");
        if(b3>average)
            System.out.println("B3 Qualified");
        if(b4>average)
            System.out.println("B4 Qualified");
        if(b5>average)
            System.out.println("B5 Qualified");
    }
}
