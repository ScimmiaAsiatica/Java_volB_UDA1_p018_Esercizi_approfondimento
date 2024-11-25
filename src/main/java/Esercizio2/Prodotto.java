/* Gonzaga Edward   4INF.D     25/11/2024

Funzionamento: Crea una classe Prodotto con due metodi costruttori che inizializzino lo stato dell’oggetto, 
dotato dei seguenti attributi:
 – string proprietario
 – string nomeNegozio

*/

package Esercizio2;

//Creo la classe "Prodotto" che inizializza lo stato dell'oggetto con 2 metodi
public class Prodotto {
    
    //Dichiaro l'attributo "proprietario" che ha visibilità privata ed è di tipo string
    private String proprietario;
    
    //Dichiaro l'attributo "nomeNegozio" che ha visibilità privata ed è di tipo string
    private String nomeNegozio;
    
    //Creo il costruttore di default in cui inizializzo l'attributo "proprietario"
    public Prodotto () {
        
        //Assegno il valore di "Alberto" all'attributo "proprietario"
        proprietario = "Alberto";
        
    }
    
    //Creo il costruttore di default con parametro "Parametro_nomeNegozio"
    public Prodotto (String Parametro_nomeNegozio) {
        
        //Assegno il valore di "Parametro_nomeNegozio" all'attributo nomeNegozio
        this.nomeNegozio = Parametro_nomeNegozio;   
        
    } 
    
}
