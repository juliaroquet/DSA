public class Quadrat extends Figura
{
    private double l1;
    public Quadrat (double l1)
    {
        this.l1=l1;

    }
    public double calcularArea ()
    {
        return this.l1 * this.l1;
    }

}
