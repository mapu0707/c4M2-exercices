public class Coche {
    // Atributes
    private String marca;
    private String modelo;
    private Integer añoFabricacion;
    private Double velocidadActual = 0.0;
    private Boolean motorEncendido = false;

    // Constructors
    public Coche(String marca, String modelo, Integer añoFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
    }

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAñoFabricacion() {
        return añoFabricacion;
    }

    public Double getVelocidadActual() {
        return velocidadActual;
    }

    public Boolean isMotorEncendido() { 
            return motorEncendido; 
    }

    public void encenderMotor(Boolean motorEncendido) {
        if (motorEncendido == false) {
            motorEncendido = true; 
            System.out.println("Motor Encendido");
        }else{
            System.out.println("El motor ya esta encendido");
        }
    }

    public void apagarMotor(Boolean motorEncendido) {
        if (motorEncendido == true && velocidadActual == 0) {
            motorEncendido = false; 
            System.out.println("Motor apagado");

        }else{
            System.out.println("El motor ya esta apagado");
        }
    }

    public void acelerar(Double velocidadActual){
        Double incremento = 0.0;
        if (motorEncendido = true && incremento >= 0) {
            this.velocidadActual += incremento;
            System.out.println("Acelerando coche");
        }else{
            System.out.println("No es posible acelerar");
        }

    }

    public void frenar(Double velocidadActual){
        Double decremento = 0.0;
        if (motorEncendido = true && decremento >= 0) {
            this.velocidadActual -= decremento;
            System.out.println("Frenando coche");
        }else{
            System.out.println("No es posible frenar"); 
        }
    }

    public String toString() {
        return String.format("Marca=%s, Modelo=%s, Año=%s", marca, modelo, añoFabricacion);
    }

    public void estado(){
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(añoFabricacion);
        System.out.println(velocidadActual);
        System.out.println(motorEncendido);
    }
    
        
}
