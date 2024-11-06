package ejerciciosjavaanexo1.PrincipiosPOOEJER.Polimorfismo;

public class Test {
    public static void main(String[] args) {
        Vehiculo [] v = new Vehiculo[4];

        v[0] = new Vehiculo("123ABC", "Audi", "A4");
        v[1] = new VehiculoTurismo("456DEF", "Toyota", "C7", 4);
        v[2] = new VehiculoDeportivo("789GHI", "Chevrolet","A3", 500);
        v[3] = new VehiculoFurgoneta("101JKL", "Ford", "F150", 2000);

        for (Vehiculo Vehiculos : v) {
            System.out.println(Vehiculos.mostrarDatos());
            System.out.println("");
        }

    }
}
