import java.sql.SQLOutput;
import java.util.regex.Matcher;

public class Funciones {
    public static void main(String[] args) {
        double y = 3;

        //Area de un circulo
        double area = areaCirculo(y);
        System.out.println(area);

        //Area de una esfera
        double esfera = areaEsfera(y);
        System.out.println(esfera);

        //Volumen de una esfera
        double volumen = volumenEsfera(y);
        System.out.println(volumen);

        System.out.println("valor moneda a dolar: " + converToDolar(100,"MXN"));

    }
    public static double areaCirculo(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double areaEsfera(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double volumenEsfera(double r){
        return 4/3 * Math.PI * Math.pow(r,3);
    }
    /**
     * Descripcion: Funcion que especificando su moneda convierte una cantidad de dinero a dolares
     * @param cantidad cantidad de dinero
     * @param  moneda tipo de moneda: Solo MXN y Q
     * @return cantidad devuelve la cantidad actualizada en dolares.
     * */
    public static double converToDolar(double cantidad, String moneda){
        //Q MXN
        switch (moneda){
            case "MXN":
                cantidad = cantidad * 0.052;
                break;
            case "Q":
                cantidad = cantidad * 7.82;
                break;

        }

        return cantidad;


    }
}
