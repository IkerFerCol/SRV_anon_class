class Persona {
    // ...
}
interface Objeto {

}

class Alumne extends Persona {
    // ...
}



public class Main {

    static void imprimirJerarquiaDeClasses(Class<?> c) {
        System.out.print(c.getName() + (c.getSuperclass() != null ? "  >  " : "\n"));
        if (c.getSuperclass() == null) return;
        imprimirJerarquiaDeClasses(c.getSuperclass());
    }

    public static void main(String[] args) {

        Alumne alumno = new Alumne(){};
        Objeto inter = new Objeto(){};


        imprimirJerarquiaDeClasses(alumno.getClass());
        imprimirJerarquiaDeClasses(inter.getClass());

    }
}