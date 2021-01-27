import java.lang.Math;
 
public class Punto {
    private double x, y;
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    
    public double radioPolar() {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    public double anguloPolar() {
      return Math.atan(y/x);
       }

    public double distanciaEuclidiana(Punto otro) {
        double dx = this.x- this.x();
        double dy = this.y - this.y();
        return Math.sqrt(dx * dx + dy * dy);
        
    }
}