public class OperacionesMatematicas {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        // Devuelve numero entero hacia arriba
        System.out.println(Math.ceil(x));
        // Devuelve numero entero sin redondear
        System.out.println(Math.floor(x));
        // Devuelve numero elevado a otro
        System.out.println(Math.pow(x,y));
        // Devuelve el numero mayor
        System.out.println(Math.max(x,y));
        // Devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y));
        // Area del circulo pi * r2
        System.out.println(Math.PI * Math.pow(y,2));

        // Area de una espera 4pi * r2
        System.out.println((Math.PI*4) * Math.pow(y,2));

        //volumen de una esfera 4/3PI * R3
        System.out.println((4/3)*(int)Math.PI * (int)Math.pow(y,3));





    }
}
