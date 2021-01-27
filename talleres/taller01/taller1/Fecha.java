public class Fecha {
    int dia, mes, anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int dia() {
        return this.dia;
    }

    public int mes() {
        return this.mes;
    }

    public int anio() {
        return this.anio;
    }



    public int comparar(Fecha otra) {
      int c = 0;
        if (this.anio < otra.anio){
            return -1;}

        if (this.anio > otra.anio){
            return 1;}

        if (this.mes < otra.mes){
            return -1;
            }
        if (this.mes > otra.mes){
            return 1;
            }

        if (this.dia < otra.dia){
            return -1;
            }
        if (this.dia > otra.dia){
            return 1;
            }
            else{
              return 0;
            }
 
    }

    public String toString() {
        return this.dia+" "+this.mes+" "+this.anio;
    }
}