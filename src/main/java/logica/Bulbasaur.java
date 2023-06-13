package logica;

public class Bulbasaur extends Pokemon implements IPlanta {

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con arañazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con mordisco");

    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con drenaje");

    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque paralizar");

    }

}
