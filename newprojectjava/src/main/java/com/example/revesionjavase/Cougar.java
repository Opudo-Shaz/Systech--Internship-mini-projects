package com.example.revesionjavase;
 
public class Cougar extends Puma {
 public static void main(String[] args) {

        Puma puma = new Cougar();

        System.out.println(puma.getTailLength());
        System.out.println(puma.getHeadLength());

        }
@Override
        public int getHeadLength() {return 2;}

        public static class InnerCougar {
        
            
        }
}    


