public class CuentaBancaria {
    // Atributes
    private String numeroCuenta;
    private String nombreTitular;
    private Double saldo;
    private Double monto;

    // Constructors
    public CuentaBancaria(String numeroCuenta, String nombreTitular) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
    }

    public CuentaBancaria(String numeroCuenta, String nombreTitular, Double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    // Getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double monto) {
        if (monto >= 0) {
            saldo += monto;
        } else {
            System.out.println("El numero debe ser positivo");
        }

    }

    public void retirar(Double monto) {

        if (monto >= 0 && monto<saldo) {
            saldo -= monto;
        } else {
            System.out.println("Debe tener saldo suficiente");
        }
    }
}
