package com.example.strings2;

public class Main {
    public static void main(String[] args) {
        int x = 100;
        int a = x++; // x = 100, a = 100
        int b = ++x; //b=102
        int c = x++;//c=102, x=103
        int d = (a<b) ? (a<c) ? a : (b<c) ? b : c : x;
        System.out.println(d);

        int ii = 0;
        int jj = 7;
        for(ii=0; ii<jj-1; ii= ii+2) {
            System.out.println(ii);
        }
    }
    
}
