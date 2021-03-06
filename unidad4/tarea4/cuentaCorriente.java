//Actividad 4: Todas las cuentas corrientes con las que vamos a trabajar pertenecen al mismo banco.
//Añadir un atributo que almacene el nombre del banco (que es único) en la clase CuentaCorriente.
//Diseñar un método que permita modificar el nombre del banco (al que pertenecen todas las cuentas corrientes).

package unidad4.tarea4;

class cuentaCorriente {

    //Atributos de la clase cuentaCorriente.
    String nombreBanco = "Santander";
    private long saldo;
    private long limite;
    public String nombre;
    String DNI;

    public cuentaCorriente(String nombreCliente, String dni, String banco) {
        this.nombre = nombreCliente;
        this.DNI = dni;
        this.saldo = 0;
        this.limite = -50;
        this.nombreBanco = banco;
    }

    public cuentaCorriente(int saldoBanco) {
        this.saldo = saldoBanco;
        this.limite = 0;
    }

    public cuentaCorriente(int saldoBanco, int limite, String DNI) {
        this.saldo = saldoBanco;
        this.limite = limite;
        this.DNI = DNI;
    }

    public boolean sacarDinero(int cantidad) {
        boolean puedeSacar = true;
        this.saldo += cantidad;
        if (saldo > 50) {
            System.out.println("No puede sacar dinero");
            puedeSacar = false;
        } else {
            System.out.println("Puedes sacar dinero");
        }
        this.saldo = 0;
        return puedeSacar;
    }

    public void ingresarDinero(int ingresar) {
        this.saldo += ingresar;
    }

    public long getSaldo() {
        return saldo;
    }

    public long getLimite() {
        return limite;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void informacion() {
        System.out.println("El nombre del banco al que pertenece es: " + nombreBanco);
        System.out.println("El saldo es: " + getSaldo());
        System.out.println("El limite es: " + getLimite());
        System.out.println("El nombre es: " + getNombre());
        System.out.println("El DNI es: " + getDNI());
    }
}
