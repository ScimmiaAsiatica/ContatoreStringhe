package com.mycompany.contatorecaratteri;

public class LunghezzaStringa {

    public static void main(String[] args) {
        
        //Istanzio l'oggetto "Lunghezza" che appartiene alla classe "Contatore"
        Contatore Lunghezza = new Contatore ();
        
        //Richiamo il metodo "InputStringa" attraverso l'oggetto "Lunghezza"
        Lunghezza.InputStringa();
        
        //Richiamo il metodo "Contatore" attraverso l'oggetto "Lunghezza"
        Lunghezza.Contatore();
        
        //Richiamo il metodo "Output" attraverso l'oggetto "Lunghezza"
        Lunghezza.Output();
    }
}
