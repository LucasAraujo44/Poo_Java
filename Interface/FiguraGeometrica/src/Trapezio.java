public class Trapezio implements FiguraGeometrica {
    private double altura, B, b;

    public Trapezio(double altura, double B, double b) {
        this.altura = altura;// altura do trapezio
        this.B = B;// base maior
        this.b = b;// base menor
    } 
    public static void main(String[] args) throws Exception {
        Trapezio a = new Trapezio(2,3,4); //
        System.out.println(a.calcArea());  // double calcArea()
    }
    public double calcArea(){
        return (B + b) * altura / 2;// calculo para area do trapezio
    }
}
