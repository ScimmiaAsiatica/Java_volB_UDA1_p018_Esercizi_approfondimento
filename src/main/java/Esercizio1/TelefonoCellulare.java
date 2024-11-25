/*Gonzaga Edward   4INF.D     25/11/2024

Funzionamento: Definisci la classe TelefonoCellulare dandone la rappresentazione sia sintetica sia completa

*/

package Esercizio1;

//Creo la classe "TelefonoCellulare" che, attraverso i metodi "get", fa accedere ai valori degli attributi "prefisso" e "numero"
public class TelefonoCellulare {

    //Dichiaro e inizializzo l'attributo "prefisso" che ha visibilità privata ed è di tipo intero
    private int prefisso = 39;
    
    //Dichiaro e inizializzo l'attributo "numero" che ha visibilità privata ed è di tipo intero
    private int numero = 1234335669;
    
    //Creo il metodo get per permettere l'accesso alle altre classi al valore dell'attributo "prefisso"
    public int getPrefisso (){
        
        //Il metodo get ritorna il valore di "prefisso"
        return prefisso;
        
    }
    
    //Creo il metodo get per permettere l'accesso alle altre classi al valore dell'attributo "numero"
    public int getNumero () {
        
        //Il metodo get ritorna il valore di "numero"
        return numero;
        
    }
}
