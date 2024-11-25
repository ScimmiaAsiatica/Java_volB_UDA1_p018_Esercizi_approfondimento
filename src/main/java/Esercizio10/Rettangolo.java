/* Gonzaga Edward   4INF.D     25/11/2024

Funzionamento: Definisci una classe Rettangolo che permetta di calcolare l’area e il perimetro di un rettangolo posizionato 
nel piano cartesiano del quale si conoscono le 4 coordinate cartesiane dei quattro punti che lo individuano.

*/

package Esercizio10;

//Creo la classe "Rettangolo" che permette di calcolare l'area e il perimetro di un rettangolo di quale si conoscono le coordinate dei 4 vertici
public class Rettangolo {
    
    
    //Dichiaro le coordinate dei vertici come attributi privati di tipo double
    private double x1, y1; 
    private double x2, y2; 
    private double x3, y3; 
    private double x4, y4; 

    //Dichiaro gli attributi "area" e "perimetro" con visibilità privata di tipo double
    private double area;
    private double perimetro;

    //Creo il metodo "setVertici" per assegnare i valori delle coordinate dei vertici
    public void setVertici(double p_x1, double p_y1, double p_x2, double p_y2, double p_x3, double p_y3, double p_x4, double p_y4) {
        this.x1 = p_x1;
        this.y1 = p_y1;
        this.x2 = p_x2;
        this.y2 = p_y2;
        this.x3 = p_x3;
        this.y3 = p_y3;
        this.x4 = p_x4;
        this.y4 = p_y4;
    }

    //Creo il metodo "Distanza" per calcolare la distanza tra due punti
    private double Distanza(double x1, double y1, double x2, double y2) {
        
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    //Creo il metodo "calcolaPerimetro" che calcola il perimetro del rettangolo
    public void calcolaPerimetro() {
        
        //Assegno all'attributo "base" il valore della base attraverso il calcolo della distanza tra i due vertici
        double base = Distanza(x1, y1, x2, y2); 
        
        //Assegno all'attributo "altezza" il valore dell'altezza attraverso il calcolo della distanza tra i due vertici
        double altezza = Distanza(x1, y1, x4, y4); 
        
        //Assegno all'attributo "perimetro" il valore della formula che calcola il perimetro
        perimetro = 2 * (base + altezza); 
    }

    //Creo il metodo "calcolaArea" che calcola l'area del rettangolo
    public void calcolaArea() {
        
        //Assegno all'attributo "base" il valore della base attraverso il calcolo della distanza tra i due vertici
        double base = Distanza(x1, y1, x2, y2); 
        
        //Assegno all'attributo "altezza" il valore dell'altezza attraverso il calcolo della distanza tra i due vertici
        double altezza = Distanza(x1, y1, x4, y4); 
        
        //Assegno all'attributo "area" il valore della formula che calcola l'area
        area = base * altezza; 
    }

    //Creo il metodo "getPerimetro" per ottenere il valore del perimetro
    public double getPerimetro() {
        
        //Ritorna il valore dell'attributo "perimetro"
        return perimetro;
    }

    //Creo il metodo "getArea" per ottenere il valore dell'area
    public double getArea() {
        
        //Ritorna il valore dell'attributo "area"
        return area;
    }

}


