//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Creamos una clase figura sera comun en cada subclase

public abstract class Figura
{
    public abstract double calcularArea (); // Declaramos el metodo para calcular el área

    //Buscamos sumar el area de todas nuestras figuras
    public static double suma(Figura[] figuras)
    {
        double total = 0;
        for (Figura figura : figuras)
        {
            total+=figura.calcularArea();
        }
        return total;
    }

    //Mostramos el area de las  figuras

    public static void print(Figura[] figuras)
    {
        for (Figura figura : figuras)
        {
            System.out.println(figura.calcularArea());
        }
    }
    //Ordensmos las figuras por area
    public static void sort(Figura[] figuras)
    {
        java.util.Arrays.sort(figuras, new java.util.Comparator<Figura>()
        {
            public int compare (Figura f1, Figura f2)

            {
                return Double.compare(f1.calcularArea(), f2.calcularArea());
            }
        });
    }

    public static void main(String[] args) {
        Figura[] v = new Figura[4];

        v[0] = new Rectangle(5,3);
        v[1] = new Cercle(5);
        v[2] = new Quadrat(5);
        v[3] = new Cercle(120);

        double res = suma(v);

        System.out.println("suma: "+res);

        System.out.println("Antes de ordenar:");
        print(v);
        sort(v);

        System.out.println("Ordenado: ");
        print(v);

    }


}