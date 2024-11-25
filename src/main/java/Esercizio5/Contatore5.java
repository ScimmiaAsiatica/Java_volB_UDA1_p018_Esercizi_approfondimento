/* Gonzaga Edward   4INF.D     25/11/2024

Funzionamento: Definisci una classe Contatore che permetta di incrementare e decrementare una variabile di una
singola unità.

*/

package Esercizio5;

//Creo la classe "Contatore" che permette di incrementare o decrementare l'attributo "conteggio"
public class Contatore5 {
    
    //Dichiaro l'attributo "conteggio" che ha visibilità privata ed è di tipo int
    private int conteggio; 
    
    //Creo il metodo "setConteggio" che assegna un valore all'attributo "conteggio"
    public void setConteggio (int Parametro_conteggio) {
        
        //Assegno all'attributo "conteggio" il valore di "Parametro_conteggio"
        this.conteggio = Parametro_conteggio; 
        
    }
    
    //Creo il metodo "Incremento" che incrementa l'attributo "conteggio" di una unità 
    public void Incremento (){
        
        //Incremento "conteggio" di una unità
        conteggio++;
        
    }
    
    //Creo il metodo "Decremento" che decrementa l'attributo "conteggio" di una unità
    public void Decremento (){
        
        //Decremento "conteggio" di una unità
        conteggio--; 
        
    }
    
    //Creo il metodo "getConteggio" per consentire alle altre classi di accedere al valore dell'attributo "conteggio"
    public int getConteggio () {
        
        //Ritorna il valore dell'attributo "conteggio"
        return conteggio;
        
    }
    
    
}
