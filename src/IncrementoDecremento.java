public class IncrementoDecremento {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); //4

        lives--; //Decremento
        System.out.println(lives); //3

        lives++; //Incremento
        System.out.println(lives);

        //Prefija
        //Gana un regalo por ganar una vida
        //int gift = 100 + lives++; //postfijo - solo llama la variable con el dato sin aumentar
        int gitf = 100 + ++lives; //prefijo
        System.out.println(gitf);





    }
}
