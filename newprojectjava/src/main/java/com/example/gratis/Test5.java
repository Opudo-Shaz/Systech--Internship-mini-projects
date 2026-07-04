package com.example.gratis;
public class Test5 {
    public static void main(String[] args) {
      String result = "true";
      switch (result) {
        case "true":
            System.out.println("True");
            break;
        default:
            System.out.println("False");
            break;
      }  
      System.out.println("Done");
    
     
    int num = 5;
    do {
        System.out.println(num);
        num--;
    } while (num == 0);
}
}

