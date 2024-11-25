/* Gonzaga Edward   4INF.D     25/11/2024

Funzionamento: Definsci una classe Cerchio che permetta di calcolare l'area e il perimetro di un cerchio
con centro di coordinate Xc e Yc.

*/

package Esercizio9;

//Creo la classe "Cerchio" che permette di calcolare il perimetro e il raggio di un cerchio
public class Cerchio {
    
    //Dichiaro l'attributo "raggio" che ha visibilità privata ed è di tipo double
    private double raggio; 
    
    //Dichiaro l'attributo "x" che ha visibilità privata ed è di tipo int
    private int x;
    
    //Dichiaro l'attributo "y" che ha visibilità privata ed è di tipo int
    private int y;
    
    //Dichiaro l'attributo "area" che ha visibilità privata ed è di tipo double
    private double area;
    
    //Dichiaro l'attributo "perimetro" che ha visibilità privata ed è di tipo double
    private double perimetro;
    
    //Creo il metodo "setRaggio" che assegna un valore all'attributo "raggio"
    public void setRaggio (double Parametro_raggio){
        
        //Assegno all'attributo "raggio" il valore di "Parametro_raggio"
        this.raggio = Parametro_raggio;
        
    }
    
    //Creo il metodo "setX" che assegna un valore all'attributo "x"
    public void setX (int Parametro_x){
        
        //Assegno all'attributo "x" il valore di "Parametro_x"
        this.x = Parametro_x;
        
    }
    
    //Creo il metodo "setY" che assegna un valore all'attributo "y"
    public void setY (int Parametro_y){
        
        //Assegno all'attributo "y" il valore di "Parametro_y"
        this.y = Parametro_y;
        
    }
    
    //Creo il metodo "getRaggio" per consentire alle altre classi di accedere al valore dell'attributo "raggio"
    public double getRaggio (){
        
        //Ritorna il valore dell'attributo "raggio"
        return raggio;
        
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
    
    //Creo il metodo "Perimetro" che calcola il perimetro del cerchio
    public void perimetro (){
        
        //Assegno il valore della formula a "perimetro"
        perimetro = (2 * Math.PI * raggio);
        
    }
    
    //Creo il metodo "Area" che calcola il area del cerchio
    public void area (){
        
        //Assegno il valore della formula a "area"
        area = Math.PI * (raggio * raggio); 
        
    }
    
    //Creo il metodo "getPerimetro" per consentire alle altre classi di accedere al valore dell'attributo "perimetro"
    public double getPerimetro (){
        
        //Ritorna il valore dell'attributo "perimetro"
        return perimetro;
        
    }
    
    //Creo il metodo "getArea" per consentire alle altre classi di accedere al valore dell'attributo "area"
    public double getArea (){
        
        //Ritorna il valore dell'attributo "area"
        return area;
        
    }
}
