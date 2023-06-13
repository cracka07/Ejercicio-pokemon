package logica;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu, y estoy atacando con placaje");

    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu, y estoy atacando con arañazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu, y estoy atacando con mordisco");

    }

    @Override
    public void atacarImpacttrueno() {
        System.out.println("Hola soy Pikachu, y estoy atacando con impactrueno");

    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu, y estoy atacando con puño trueno");

    }

}
