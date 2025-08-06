public class App {
    public static void main(String[] args) throws Exception {
        var cuenta1 = new CuentaBancaria("448839", "Maria Rojas", 1000.0);
        System.out.println(cuenta1);

        var coche1 = new Coche("ferrari", "833hh", 2003);
        System.out.println(coche1);
        coche1.estado();



        

    }
}
