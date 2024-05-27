public class Cercle extends Figura
{
    private double r;
    public Cercle (double r)
    {
        this.r=r;

    }
    public  double calcularArea ()
    {
        return Math.PI*Math.pow(r, 2);  //metodo para calcular el area del circulo
    }
}
