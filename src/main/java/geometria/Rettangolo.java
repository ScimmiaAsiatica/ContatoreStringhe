package geometria;

import java.util.Scanner;

public class Rettangolo {
    
    private float base;
    
    private float altezza;
    
    public void InputBase (){
        
        Scanner Input = new Scanner (System.in);
        
        System.out.println("Inserisci la lunghezza della base del rettangolo: ");
        
        base = Input.nextFloat();
        
    }
}
