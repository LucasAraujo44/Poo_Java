public class TrianguloRetangulo implements FiguraGeometrica{
    private double altura,base;


    public TrianguloRetangulo(double altura,double base) {
        this.altura = altura;
        this.base = base;
    }

    public double calcArea(){
        return (base * altura)/2;
    }
}
