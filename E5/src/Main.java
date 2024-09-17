public class Main {

    class HolaMonAngles extends HolaMon {
        private String frase;
        @Override
        public void setFrase() {
            frase = "Hello World";
        }
    }

    abstract class HolaMon {
        private String frase;

        public abstract void setFrase();

        public void saludar(){
            setFrase();
            System.out.println(frase);
        }
    }

    public void ferSalutacio() {

    }

    public static void main(String... args) {
        Main myApp = new Main();
        myApp.ferSalutacio();
    }
}