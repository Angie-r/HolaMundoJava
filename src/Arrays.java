import java.sql.SQLOutput;

public class Arrays {
    public static void main(String[] args) {
        //Cuantas versiones de android existen
        /*/Un arreglo puede ser funcional cuando se tiene un dato especifico
        por ejemplo los dias de la semana, es dato no cambiara.  */
        String[] androidVersiones = new String[17];
        String days[] = new String[7];

        //int i =  7;
        //char c = "W";

        //System.out.println((i >= 6)&& (c == 'W'));

        String[][] ciudades = new String[4][2]; //4*2 = 8 elementos o espacios

        int [][][] numeros = new int[2][2][2];
        int [][][][] numeros4 = new int[2][2][2][2];

        androidVersiones[0] = "Apple Pie";
        androidVersiones[1] = "Bannana Bread";
        androidVersiones[2] = "Cupcake";
        androidVersiones[3] = "Donut";

        for (int i = 0; i <= androidVersiones.length-1; i++) {
            System.out.println(androidVersiones[i]);

        }

        for (String androidVersion : androidVersiones) {
            System.out.println(androidVersion);
        }
        /*System.out.println(androidVersiones[0]);
        System.out.println(androidVersiones[1]);
        System.out.println(androidVersiones[2]);
        System.out.println(androidVersiones[3]);*/

        System.out.println();
        System.out.println();

        ciudades[0][0] = "Colombia";
        ciudades[0][1] = "Medillin";
        ciudades[1][0] = "Colombia";
        ciudades[1][1] = "Bogota";
        ciudades[2][0] = "Mexico";
        ciudades[2][1] = "Guadalajara";
        ciudades[3][0] = "Guatemala";
        ciudades[3][1] = "Guatemala";

        for (int i = 0; i < ciudades.length ; i++) {
            for (int j = 0; j < ciudades[i].length; j++) {
                System.out.println(ciudades[i][j]);
            }
            for (String[] pair :ciudades) {
                for (String name:pair) {
                    System.out.println(name);

                }

            }
        }
        /*System.out.println(ciudades[0][0]);
        System.out.println(ciudades[0][1]);
        System.out.println(ciudades[1][0]);
        System.out.println(ciudades[1][1]);
        System.out.println(ciudades[2][0]);
        System.out.println(ciudades[2][1]);
        System.out.println(ciudades[3][0]);
        System.out.println(ciudades[3][1]);*/

        System.out.println();

        String[][][][] animales = new String[2][3][2][2];
        animales[1][0][0][1] = "Mono";
        //System.out.println(animales[1][0][0][1]);

        for (int i = 0; i <=1 ; i++) {
            for (int j = 0; j <=0 ; j++) {
                for (int k = 0; k <=0 ; k++) {
                    for (int l = 0; l <=1 ; l++) {
                        System.out.println(animales[i][j][k][l]);

                    }

                }

            }

        }


    }



}
