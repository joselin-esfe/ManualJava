// Clase principal que contiene el método main para ejecutar el programa
public class EjercicioVehiculos {
    public static void main(String[] args) {

        // Aplicando Polimorfismo
        Vehiculo miAuto = new Automovil("Toyota", "Corolla", 4);
        Vehiculo miBarco = new Barco("Yamaha", "242X", "Motor fuera de borda");
        Vehiculo miAvion = new Avion("Boeing", "747", 13000);

        System.out.println("--- DEMOSTRACIÓN DE POLIMORFISMO Y SOBRESCRITURA ---\n");

        // Todos usan desplazarse() completamente en minúsculas
        System.out.print("[" + miAuto.getMarca() + "]: ");
        miAuto.desplazarse();

        System.out.print("[" + miBarco.getMarca() + "]: ");
        miBarco.desplazarse();

        System.out.print("[" + miAvion.getMarca() + "]: ");
        miAvion.desplazarse();
    }
}

// ==========================================
// CLASE PRINCIPAL (Superclase Padre)
// ==========================================
class Vehiculo {
    private String marca;
    private String modelo;

    // Constructor de la clase padre
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método corregido con 'z' minúscula
    public void desplazarse() {
        System.out.println("El vehículo se está moviendo de forma general.");
    }

    // Getters necesarios para mostrar la marca en el main
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
}

// ==========================================
// CLASES DERIVADAS (Clases Hijas)
// ==========================================

// 1. Clase Automóvil
class Automovil extends Vehiculo {
    private int cantidadPuertas;

    public Automovil(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void desplazarse() {
        System.out.println("El automóvil avanza por la carretera rodando sobre sus 4 llantas.");
    }
}

// 2. Clase Barco
class Barco extends Vehiculo {
    private String tipoPropulsion;

    public Barco(String marca, String modelo, String tipoPropulsion) {
        super(marca, modelo);
        this.tipoPropulsion = tipoPropulsion;
    }

    @Override
    public void desplazarse() {
        System.out.println("El barco navega por el agua flotando y siendo impulsado por sus hélices.");
    }
}

// 3. Clase Avión
class Avion extends Vehiculo {
    private double altitudMaxima;

    public Avion(String marca, String modelo, double altitudMaxima) {
        super(marca, modelo);
        this.altitudMaxima = altitudMaxima;
    }

    @Override
    public void desplazarse() {
        System.out.println("El avión vuela por los aires cruzando las nubes gracias a sus turbinas.");
    }
}