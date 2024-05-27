public class Triangle extends Figura
{
    private double  altura;
    private double base;
    public Triangle (double altura,double base)
    {
        this.altura=altura;
        this.base=base;

    }
    public double calcularArea ()
    {
        return (this.altura*this.base)/2 ;
    }
}
