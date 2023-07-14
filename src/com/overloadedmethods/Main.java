package com.overloadedmethods;

public class Main {

    public static void main(String[] args) {


        int x = add(1,2);
        System.out.println(x);

        int y = add(3,5,2);
        System.out.println(y);

        int z = add(3,2,5,7);
        System.out.println(z);

    }

    static int add(int x, int y){
        System.out.println("This is 'add' method #1");
        return x+y;
    }

    static int add(int x, int y, int z){
        System.out.println("This is 'add' method #2");
        return x+y+z;
    }

    static int add (int w, int x, int y, int z){
        System.out.println("This is 'add' method #3");
        return w+x+y+z;
    }


}