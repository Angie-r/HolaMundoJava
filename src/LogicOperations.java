public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        //operadores de asignacion
        //System.out.println("a y b son iguales? "+ (a==b));
        //System.out.println("a y b son diferentes? "+ (a!=b));

        //operadores relacionales
        //System.out.println("a es mayor a b? "+ (a > b));
        //System.out.println("a es menor a b? "+ (a<b));
        //System.out.println("a es mayor o igual a b "+ (a>=b));
        //System.out.println("a es menor o igual a b "+ (a<=b));

        if (a == b){
            System.out.println("a y b son iguales");
        }else if ((a != b) && (a < b)){
            System.out.println("a y b son diferentes ");
        } else if (a > b) {
            System.out.println("a es mayor a b ");
        } else if (a < b) {
            System.out.println("a es menor a b ");
        } else if (a >= b) {
            System.out.println("a es mayor o igual a b ");
        } else if (a<=b) {
            System.out.println("a es menor o igual a b ");
        }
    }
}
