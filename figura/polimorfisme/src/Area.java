public class Area {

    public abstract static class Figura
    {
       public abstract double calcularArea ();//Hace referencias a lassubclases
    }

    //Calculamos el area total de todas nuestra figuras
        public static void calcularArea (Figura[] v)
        {
        double total = 0;
            for (Figura figura : v) {

                total += figura.calcularArea(); // Llamamos el calcular area de cada figura
            }


        // System.out.println("El area total es " + total ());


    }
}

