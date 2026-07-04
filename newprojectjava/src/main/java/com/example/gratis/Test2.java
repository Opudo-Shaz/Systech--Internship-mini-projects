package com.example.gratis;

public class Test2 {

    static int count = 0;
    int i = 0;

    public void changeCount() {
        while(i<5) {
            i++;
            count++;
        
        }
    }


    public static void main(String[] args) {
/*         int x;

        if (Math.random() > 0.5)
            x = 5;

        System.out.println(x);
    } */
   Test2 t1 = new Test2();
   Test2 t2 = new Test2();
    t1.changeCount();
    t2.changeCount();
    System.out.println(t1.count + " " + t2.count);


    }
   

}
