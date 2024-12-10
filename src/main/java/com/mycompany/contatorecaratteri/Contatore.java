package com.mycompany.contatorecaratteri;

//Importo la classe "Scanner" per permettere l'interazione con l'utente
import java.util.Scanner;

//Creo la classe "Contatore" che richiede una stringa all'utente e conta i caratteri della stringa
public class Contatore {
    
    //Dichiaro e inizializzo l'attributo "lunghezza" che ha: visibilità privata, è di tipo intero ed ha valore 0
    private int lunghezza = 0;
    
    //Dichiaro l'attributo "stringa" che ha visibilità privata ed è di tipo string
    private String stringa;
    
    //Creo il metodo "InputStringa" che chiede all'utente una stringa 
    public void InputStringa () {
        
        //Istanzio l'oggetto "Input" che appartiene alla classe "Scanner" 
        Scanner Input = new Scanner (System.in);
        
        //Mostro un messaggio in output
        System.out.println("Inserisci una stringa: ");
        
        //Assegno all'attributo "stringa" la stringa inserita dall'utente
        stringa = Input.nextLine();
        
    }
    
    //Creo il metodo "Contatore" che, tramite un ciclo, conta i caratteri della stringa inserita dall'utente
    public void Contatore () {
        
        //Creo il ciclo che permette di contare i caratteri della stringa inserita dall'utente
        for(int i = 0; i < stringa.length(); i = i + 1){
            
            //Incremento di 1 l'attributo "lunghezza"
            lunghezza = lunghezza + 1;
            
        }
        
    }
    
    //Creo il metodo "Output" che mostra quanti caratteri contiene la stringa inserita dall'utente
    public void Output () {
        
        //Mostro una riga vuota per una migliore visualizzazione 
        System.out.println("");
        
        //Mostro il messaggio che contiene il valore dell'attributo "lunghezza"
        System.out.println("La stringa inserita contiene " + lunghezza + " caratteri");
        
    }
    
}
