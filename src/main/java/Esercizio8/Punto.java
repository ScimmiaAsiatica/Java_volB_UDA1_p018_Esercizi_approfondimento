/* Gonzaga Edward   4INF.D     25/11/2024

Funzionamento: Definisci una classe Punto che permetta di individuare un punto nel piano cartesiano, calcolando la
sua distanza dall’origine.

 */

package Esercizio8;

//Creo la classe "Punto" che individua un punto nel piano cartesiano, calcolando la sua distanza dall'origine
public class Punto {
    
    //Dichiaro l'attributo "x" che ha visibilità privata ed è di tipo int
    private int x;
    
    //Dichiaro l'attributo "y" che ha visibilità privata ed è di tipo int
    private int y; 
    
    //Dichiaro l'attributo "OrigineX" che ha visibilità privata ed è di tipo int
    private int OrigineX = 0;
    
    //Dichiaro l'attributo "OrigineY" che ha visibilità privata ed è di tipo int
    private int OrigineY = 0;
    
    //Dichiaro l'attributo "Distanza" che ha visibilità privata ed è di tipo double
    private double Distanza;
    
    //Creo il metodo "setX" che assegna un valore all'attributo "x"
    public void setX (int Parametro_x){
        
        this.x = Parametro_x;
        
    }
    
    //Creo il metodo "setY" che assegna un valore all'attributo "y"
    public void setY (int Parametro_y){
        
        //Assegno all'attributo "y" il valore di "Parametro_y"
        this.y = Parametro_y;
        
    }
    
    //Creo il metodo "getX" per consentire alle altre classi di accedere al valore dell'attributo "x"
    public int getX (){
        
        //Ritorna il valore dell'attributo "x"
        return x;
        
    }
    
    //Creo il metodo "getY" per consentire alle altre classi di accedere al valore dell'attributo "y"
    public int getY (){
        
        //Ritorna il valore dell'attributo "y"
        return y;
        
    }
    
    //Creo il metodo "getOrigineX" per consentire alle altre classi di accedere al valore dell'attributo "OrigineX"
    public int getOrigineX (){
        
        //Ritorna il valore dell'attributo "OrigineX"
        return OrigineX;
        
    }
    
    //Creo il metodo "getOrigineY" per consentire alle altre classi di accedere al valore dell'attributo "OrigineY"
    public int getOrigineY (){
        
        //Ritorna il valore dell'attributo "OrigineY"
        return OrigineY;
        
    }
    
    //Creo il metodo "CalcoloDistanza" che permette di calcolare la distanza del punto partendo dall'origine 
    public void CalcoloDistanza (){
        
        //Assegno il valore della formula all'attributo "Distanza"
        Distanza = Math.sqrt((x*x) + (y*y));
        
    }
}
