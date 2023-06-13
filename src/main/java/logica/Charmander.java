package logica;

public class Charmander extends Pokemon implements IFuego {

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander, y estoy atacando con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Charmander, y estoy atacando con arañazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander, y estoy atacando con mordisco");

    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander, y estoy atacando con puño de fuego");

    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Hola soy Charmander, y estoy atacando con lanza llamas");

    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander, y estoy atacando con ascuas");

    }

}
