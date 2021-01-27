public class Main {

    public static void main(String[] args) {
        Contador c = new Contador("test");
        for (int i = 0; i < 10; ++i)
            c.incrementar();
       
        System.out.println(c);

        System.out.println();

        Punto p = new Punto(-1, 1);
       
        System.out.printf("Punto: {%f, %f}\n", p.x(), p.y());
       
        System.out.println("Radio Polar: " + p.radioPolar());
        
        System.out.println("Angulo Polar: " + Math.toDegrees(p.anguloPolar()));
     
        System.out.println("Angulo Polar: " + p.distanciaEuclidiana(new Punto(1, 1)));

        System.out.println();

        Fecha f1 = new Fecha(1, 8, 2017);
        Fecha f2 = new Fecha(2, 5, 2016);
        System.out.println(f1);
        System.out.println(f2);
        
        System.out.println(f1.comparar(f2));
    }

}