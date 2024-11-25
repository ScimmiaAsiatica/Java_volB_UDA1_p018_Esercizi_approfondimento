/* Gonzaga Edward   4INF.D     25/11/2024

Funzionamento: Definisci una classe Auto per rappresentare oggetti automobile con il nome della marca, il nome
del modello, la targa e l’anno di immatricolazione e con opportuni metodi d’istanza tra cui un
metodo del tipo String toString() per la sua descrizione.

*/

package Esercizio3;

//Creo la classe "Auto" che permette di assegnare alle altre classi il valore degli attributi e di ritornare il valore 
public class Auto {
    
    //Dichiaro l'attributo "marca" che ha visibilità privata ed è di tipo string
    private String marca;
        
    //Dichiaro l'attributo "modello" che ha visibilità privata ed è di tipo string
    private String modello;
    
    //Dichiaro l'attributo "targa" che ha visibilità privata ed è di tipo char
    private char targa;
    
    //Dichiaro l'attributo "AnnoImmatricolazione" che ha visibilità privata ed è di tipo int
    private int AnnoImmatricolazione;
    
    //Creo il metodo "setMarca" per assegnare all'attributo "marca" un valore
    public void setMarca (String Parametro_marca) {
        
        //Assegno all'attributo "marca" il valore di "Parametro_marca"
        this.marca = Parametro_marca; 
        
    }
    
    //Creo il metodo "setModello" per assegnare all'attributo "modello" un valore
    public void setModello (String Parametro_modello) {
        
        //Assegno all'attributo "modello" il valore di "Parametro_modello"
        this.modello = Parametro_modello; 
        
    }
    
    //Creo il metodo "setTarga" per assegnare all'attributo "targa" un valore
    public void setTarga (char Parametro_targa) {
        
        //Assegno all'attributo "targa" il valore di "Parametro_targa"
        this.targa = Parametro_targa; 
        
    }
    
    //Creo il metodo "setAnnoImmatricolazione" per assegnare all'attributo "AnnoImmatricolazione" un valore
    public void setAnnoImmatricolazione (int Parametro_anno) {
        
        //Assegno all'attributo "AnnoImmatricolazione" il valore di "Parametro_anno"
        this.AnnoImmatricolazione = Parametro_anno; 
        
    }
    
    //Creo il metodo "getMarca" per consentire alle altre classi di accedere al valore dell'attributo "marca"
    public String getMarca () {
        
        //Ritorno il valore dell'attributo "marca"
        return marca;
        
    }
    
    //Creo il metodo "getModello" per consentire alle altre classi di accedere al valore dell'attributo "modello"
    public String getModello () {
        
        //Ritorno il valore dell'attributo "modello"
        return modello;
        
    }
    
    //Creo il metodo "getTarga" per consentire alle altre classi di accedere al valore dell'attributo "targa"
    public char getTarga (){
        
        //Ritorno il valore dell'attributo "targa"
        return targa;
        
    }
    
    //Creo il metodo "getAnnoImmatricolazione" per consentire alle altre classi di accedere al valore dell'attributo "AnnoImmatricolazione"
    public int getAnnoImmatricolazione (){
        
        //Ritorno il valore dell'attributo "AnnoImmatricolazione"
        return AnnoImmatricolazione;
        
    }
    
    //Creo il metodo "toString" per stampare i vari valori nell'output
    public String toString (){
        
        //Ritorno la stampa per l'output
        return "Auto{Marca='" + marca + "', Modello='" + modello + "', Targa=" + targa + ", Anno di immatricolazione=" + AnnoImmatricolazione + '}';
        
    }
    
}
