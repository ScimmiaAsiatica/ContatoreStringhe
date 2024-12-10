package geometria;

import java.util.Scanner;

public class Quadrato {
    
    private float lato;
    
    private float area; 
    
    private float perimetro;
    
    public void InputLato (){
        
        Scanner Input = new Scanner (System.in);
        
        System.out.println("Inserisci la lunghezza del lato del quadrato: ");
        
        lato = Input.nextFloat();
        
    }
    
    public void CalcoloArea () {
        
        area = lato * lato;
        
    }
    
    public void CalcoloPerimetro (){
        
        perimetro = lato * 4;
        
    }
    
    public void Output (){
        
        System.out.println("");
        
        System.out.println("Caratteristiche quadrato | Lato: " + lato + " | Perimetro: " + perimetro + " | Area: " + area);
        
    }
    
}
