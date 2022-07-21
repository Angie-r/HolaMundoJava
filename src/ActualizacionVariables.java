public class ActualizacionVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono Q200
        int bono = 200;
        salary = salary + bono;

        //pension: Q50 se descuenta
        int pension = 50;
        salary = salary - pension;
        System.out.println(salary);

        //horas extras Q30 c/u
        //cupon de comida Q45
        int horaExtra = 2;
        int valorHoraExtra = 30;
        int cupon = 45;
        salary = salary + (horaExtra * valorHoraExtra) - cupon;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String nombreEmpleado = "Angela Romero";
        nombreEmpleado = nombreEmpleado + " Silva";
        System.out.println("Tu nombre es: " + nombreEmpleado);


    }
}
