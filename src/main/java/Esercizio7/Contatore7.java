/* Gonzaga Edward   4INF.D     25/11/2024

Funzionamento: Definisci una classe Contatore moduloNche permetta di incrementare e decrementare una variabile
di un passo P fino al raggiungimento del valore N: successivamente il conteggio riparte da 0.

 */
package Esercizio7;

//Creo la classe "Contatore6" che incrementa o decrementa di P "contatore" fino al valore di "P" 
public class Contatore7 {

    //Dichiaro l'attributo "contatore" che ha visibilità privata ed è di tipo int
    private int contatore;

    //Dichiaro l'attributo "P" che ha visibilità privata ed è di tipo int 
    private int P;

    //Creo il metodo "setP" che assegna un valore all'attributo "P"
    public void setP(int Parametro_p) {

        //Assegno all'attributo "P" il valore di "Parametro_p" 
        this.P = Parametro_p;

    }

    //Creo il metodo "setContatore" che assegna un valore all'attributo "contatore"
    public void setContatore(int Parametro_contatore) {

        //Assegno all'attributo "contatore" il valore di "Parametro_contatore" 
        this.contatore = Parametro_contatore;

    }

    //Creo il metodo "getP" per consentire alle altre classi di accedere al valore dell'attributo "P"
    public int getP() {

        //Ritorna il valore dell'attributo "P"
        return P;

    }

    //Creo il metodo "getContatore" per consentire alle altre classi di accedere al valore dell'attributo "contatore"
    public int getContatore() {

        //Ritorna il valore dell'attributo "contatore"
        return contatore;

    }

    //Creo il metodo "Incremento_Decremento" che incrementa o decrementa di P "contatore" fino ad arrivare al valore di "P"  
    public void Incremento_Decremento() {

        //Creo la condizione; se "contatore" è minore di "P", "contatore" viene incrementato di P 
        if (contatore < P) {

            //Creo il loop che continua finchè "contatore" o è uguale o è minore del valore di "P"
            do {

                //L'attributo "contatore" viene incrementato
                contatore = contatore + P;

            } while (contatore != P || contatore < P);

            //L'attributo "contatore" viene azzerato quando "P" o è uguale o è minore
            contatore = 0;

            //Se "contatore" è maggiore di "P", "contatore" viene decrementato di P  
        } else {

            //Creo il loop che continua finchè "contatore" o è uguale o maggiore di "P" 
            do {

                //L'attributo "contatore" viene decrementato di P
                contatore--;

            } while (contatore != P || contatore > P);

            //L'attributo "contatore" viene azzerato quando "P" o è uguale o è maggiore di P
            contatore = 0;
        }

    }
    
}