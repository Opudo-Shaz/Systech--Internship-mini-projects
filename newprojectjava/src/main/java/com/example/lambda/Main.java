package com.example.lambda;

public class Main {
    public static void main(String[] args) {
        Export pdf =  new PdfExport();
        Export ppt = new PptExport();

        ppt.export(null);
        pdf.export(null);

        Calculator calc = (a, b) -> a + b;
        System.out.println(calc.add(3, 4)); 

        Greeting msg = (name, times) ->{ 
            for(int i = 0; i< times;i++){
            System.out.println("Hello!  " + name);
         }
        };
         msg.sayHello("Sharon", 3);

    }


 
        
}
    

