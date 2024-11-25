/* Gonzaga Edward   4INF.D     25/11/2024

Funzionamento: Definisci una classe Rombo che permetta di calcolare l’area e il perimetro di un rombo posizionato
nel piano cartesiano del quale si conoscono le 4 coordinate cartesiane dei quattro punti che lo individuano.

*/
package Esercizio11;

//Creo la classe "Rombo" che permette di calcolare l'area e il perimetro di un rombo di quale si conoscono le coordinate dei 4 vertici
public class Rombo {
    
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

    //Creo il metodo "calcolaPerimetro" che calcola il perimetro del rombo
    public void calcolaPerimetro() {
        
        //Assegno all'attributo "lato" il valore del lato attraverso il calcolo della distanza tra i due vertici
        double lato = Distanza(x1, y1, x2, y2); 
        
        //Assegno all'attributo "perimetro" il valore della formula che calcola il perimetro
        perimetro = 4 * lato; 
    }

    //Creo il metodo "calcolaArea" che calcola l'area del rombo
    public void calcolaArea() {
        
        //Assegno all'attributo "DiagonaleMaggiore" il valore della diagonale maggiore attraverso il calcolo della distanza tra i due vertici
        double DiagonaleMaggiore = Distanza(x1, y1, x3, y3);
        
        //Assegno all'attributo "DiagonaleMinore" il valore della diagonale minore attraverso il calcolo della distanza tra i due vertici
        double DiagonaleMinore = Distanza(x1, y1, x3, y3);
        
        //Assegno all'attributo "area" il valore della formula che calcola l'area
        area = (DiagonaleMaggiore * DiagonaleMinore) / 2;
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
