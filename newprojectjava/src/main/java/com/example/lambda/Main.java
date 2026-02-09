package com.example.lambda;

public class Main {
    public static void main(String[] args) {
      Export pdf = new PdfExport();
      Export ppt = new PptExport();

      ppt.export(null);
      pdf.export(null);
 
        
    }
    
}
