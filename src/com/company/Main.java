package com.company;

public class Main {

    public static void main(String[] args) {
	/* x+y-a/2*(x+w)
    a*(x+x)/y-a*3
    a+b/x-y
    X-e/2%e+1 */
        int x =1;
        double a =1.1;
        int y =2;
        double w = 3.3;
        double e = 0.13;
        short b = 6;
        var resaltOne =x+y-a/2*(x+w);
        var resaltTwo =a*(x+x)/y-a*3;
        var resaltThree =a+b/x-y;
        var resaltFour =x-e/2%e+1;
        System.out.println("Значення виразу x+y-a/2*(x+w):\n"+resaltOne);
        System.out.println("Значення виразу a*(x+x)/y-a*3:\n"+resaltTwo);
        System.out.println("Значення виразу a+b/x-y:\n"+resaltThree);
        System.out.println("Значення виразу x-e/2%e+1:\n"+resaltFour);
    }
}
