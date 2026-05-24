
public class Actividad11 {
    public static void main(String[] args) {
        // Creamos una instancia de cada clase derivada para verificar que heredan todo
        Futbolista messi = new Futbolista(1, "Lionel", "Messi", 38, 10, "Delantero");
        Entrenador scaloni = new Entrenador(2, "Lionel", "Scaloni", 48, "AFA-777");
        Masajista juan = new Masajista(3, "Juan", "Pérez", 50, "Lic. Fisioterapia", 12);

        System.out.println("--- Probando herencia y métodos comunes ---");
        messi.Concentrarse();
        scaloni.Viajar();

        System.out.println("\n--- Probando métodos específicos de cada clase ---");
        messi.jugarPartido();
        scaloni.dirigirEntrenamiento();
        juan.darMasaje();
    }
}



class SeleccionFutbol {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void Concentrarse() {
        System.out.println(nombre + " " + apellidos + " se encuentra concentrado con el equipo.");
    }

    public void Viajar() {
        System.out.println(nombre + " " + apellidos + " está viajando con la delegación.");
    }
}



class Futbolista extends SeleccionFutbol {
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad); // Envía los datos comunes al constructor padre
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println(nombre + " está jugando el partido con el dorsal " + dorsal);
    }

    public void entrenar() {
        System.out.println(nombre + " está entrenando en la cancha.");
    }
}

class Entrenador extends SeleccionFutbol {
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println(nombre + " está dando indicaciones en el partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println(nombre + " está dirigiendo la sesión táctica.");
    }
}

class Masajista extends SeleccionFutbol {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println(nombre + " está atendiendo a un jugador lesionado.");
    }
}