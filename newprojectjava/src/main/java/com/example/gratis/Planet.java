package com.example.gratis;

public abstract class Planet {
    protected void resolve(){
        System.out.println("Planet");
    }
     abstract void rotate();


    class Earth extends Planet {
       public void resolve(){};

       public void rotate(){
           System.out.println("Earth");
       }
    
    }
    
}
