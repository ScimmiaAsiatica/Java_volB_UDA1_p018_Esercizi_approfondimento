/* Gonzaga Edward   4INF.D     25/11/2024

Funzionamento: Definisci una classe Contatore modulo N che permetta di incrementare e decrementare una variabile
di una singola unità fino al raggiungimento del valore N:successivamente il conteggio riparte da 0

 */
package Esercizio6;

//Creo la classe "Contatore6" che incrementa o decrementa (di una singola unità) "contatore" fino al valore di "Numero" 
public class Contatore6 {

    //Dichiaro l'attributo "contatore" che ha visibilità privata ed è di tipo int
    private int contatore;
    
    //Dichiaro l'attributo "Numero" che ha visibilità privata ed è di tipo int 
    private int Numero;

    //Creo il metodo "setNumero" che assegna un valore all'attributo "Numero"
    public void setNumero(int Parametro_numero) {
        
        //Assegno all'attributo "Numero" il valore di "Parametro_numero" 
        this.Numero = Parametro_numero;

    }
    
    //Creo il metodo "setContatore" che assegna un valore all'attributo "contatore"
    public void setContatore(int Parametro_contatore) {
        
        //Assegno all'attributo "contatore" il valore di "Parametro_contatore" 
        this.contatore = Parametro_contatore; 
        
    }
    
    //Creo il metodo "getNumero" per consentire alle altre classi di accedere al valore dell'attributo "Numero"
    public int getNumero (){
        
        //Ritorna il valore dell'attributo "Numero"
        return Numero; 
        
    }
    
    //Creo il metodo "getContatore" per consentire alle altre classi di accedere al valore dell'attributo "contatore"
    public int getContatore (){
        
        //Ritorna il valore dell'attributo "contatore"
        return contatore;
        
    }

    //Creo il metodo "Incremento_Decremento" che incrementa o decrementa "contatore" fino ad arrivare al valore di "Numero" 
    public void Incremento_Decremento() {
        
        //Creo la condizione; se "contatore" è minore di "Numero", "contatore" viene incrementato 
        if (contatore < Numero) {
            
            //Creo il loop che continua finchè "contatore" è uguale a "Numero"
            do {
                
                //L'attributo "contatore" viene incrementato
                contatore++;
                
            }while (contatore != Numero);
            
            //L'attributo "contatore" viene azzerato quando "Numero" è uguale 
            contatore = 0;
        
        //Se "contatore" è maggiore di "Numero", "contatore" viene decrementato 
        }else {
            
            //Creo il loop che continua finchè "contatore" è uguale a "Numero"
            do {
                
                //L'attributo "contatore" viene decrementato
                contatore--;
                
            } while (contatore != Numero);
            
            //L'attributo "contatore" viene azzerato quando "Numero" è uguale
            contatore = 0;
        }

    }

}
