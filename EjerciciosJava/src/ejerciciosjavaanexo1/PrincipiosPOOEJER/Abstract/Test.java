package ejerciciosjavaanexo1.PrincipiosPOOEJER.Abstract;

public class Test {
    public static void main(String[] args) {
        Planta planta = new Planta();
        AnimalCarnivoro animalCarnivoro = new AnimalCarnivoro();

        planta.alimentarse();
        animalCarnivoro.alimentarse();
        
    }
}