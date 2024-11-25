/* Gonzaga Edward   4INF.D     25/11/2024

Funzionamento: Definisci una classe Studente per rappresentare oggetti studente con il cognome, il nome, il codice
fiscale, il numero di matricola e con opportuni metodi d’istanza tra cui un metodo del tipo String
toString() per la sua descrizione.

*/

package Esercizio4;

//Creo la classe "Studente" che permette di assegnare alle altre classi il valore degli attributi e di ritornare il valore 
public class Studente {
    
    //Dichiaro l'attributo "cognome" che ha visibilità privata ed è di tipo string
    private String cognome;
        
    //Dichiaro l'attributo "nome" che ha visibilità privata ed è di tipo string
    private String nome;
    
    //Dichiaro l'attributo "CodiceFiscale" che ha visibilità privata ed è di tipo char
    private char CodiceFiscale;
    
    //Dichiaro l'attributo "NumeroMatricola" che ha visibilità privata ed è di tipo int
    private int NumeroMatricola;
    
    //Creo il metodo "setCognome" per assegnare all'attributo "cognome" un valore
    public void setCognome (String Parametro_cognome) {
        
        //Assegno all'attributo "cognome" il valore di "Parametro_cognome"
        this.cognome = Parametro_cognome; 
        
    }
    
    //Creo il metodo "setNome" per assegnare all'attributo "nome" un valore
    public void setNome (String Parametro_nome) {
        
        //Assegno all'attributo "nome" il valore di "Parametro_nome"
        this.nome = Parametro_nome; 
        
    }
    
    //Creo il metodo "setCodiceFiscale" per assegnare all'attributo "CodiceFiscale" un valore
    public void setCodiceFiscale (char Parametro_codicefiscale) {
        
        //Assegno all'attributo "CodiceFiscale" il valore di "Parametro_codicefiscale"
        this.CodiceFiscale = Parametro_codicefiscale; 
        
    }
    
    //Creo il metodo "setNumeroMatricola" per assegnare all'attributo "NumeroMatricola" un valore
    public void setNumeroMatricola (int Parametro_numeromatricola) {
        
        //Assegno all'attributo "NumeroMatricola" il valore di "Parametro_numeromatricola"
        this.NumeroMatricola = Parametro_numeromatricola; 
        
    }
    
    //Creo il metodo "getCognome" per consentire alle altre classi di accedere al valore dell'attributo "cognome"
    public String getCognome () {
        
        //Ritorno il valore dell'attributo "cognome"
        return cognome;
        
    }
    
    //Creo il metodo "getNome" per consentire alle altre classi di accedere al valore dell'attributo "nome"
    public String getNome () {
        
        //Ritorno il valore dell'attributo "nome"
        return nome;
        
    }
    
    //Creo il metodo "getCodiceFiscale" per consentire alle altre classi di accedere al valore dell'attributo "CodiceFiscale"
    public char getCodiceFiscale (){
        
        //Ritorno il valore dell'attributo "CodiceFiscale"
        return CodiceFiscale;
        
    }
    
    //Creo il metodo "getNumeroMatricola" per consentire alle altre classi di accedere al valore dell'attributo "NumeroMatricola"
    public int getNumeroMatricola (){
        
        //Ritorno il valore dell'attributo "NumeroMatricola"
        return NumeroMatricola;
        
    }
    
    //Creo il metodo "toString" per stampare i vari valori nell'output
    public String toString (){
        
        //Ritorno la stampa per l'output
        return "Studente{Cognome='" + cognome + "', Nome='" + nome + "', Codice Fiscale=" + CodiceFiscale + ", Numero di Matricola=" + NumeroMatricola + '}';
        
    }
    
    
}
