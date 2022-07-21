public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            // archivo enviado
            fileSended++;
            System.out.println("Archivo enviado ");
        }else {
            System.out.println("No fue enviado el archivo");

        }
    }
}
