public class Main {

    abstract class HolaMon {
        private String frase;

        public abstract void setFrase();

        public void saludar(){
            setFrase();
            System.out.println(frase);
        }
    }

    class HolaMonAngles extends HolaMon {
        String frase;
        public void setFrase(){
            frase = "Hello World";
        }
        public void saludar(){
            setFrase();
            System.out.println(frase);
        }
    }

    class HolaMonFrances extends HolaMon {
        String frase;
        public void setFrase(){
            frase = "Salut tout le monde";
        }
        public void saludar(){
            setFrase();
            System.out.println(frase);
        }
    }

    class HolaMonEspanol extends HolaMon {
        String frase;
        public void setFrase(){
            frase = "Hola Mundo";
        }
        public void saludar(){
            setFrase();
            System.out.println(frase);
        }
    }

    public void ferSalutacio() {
        HolaMon holaMonAngles = new HolaMonAngles(){};
        holaMonAngles.saludar();

        HolaMon holaMonFrances = new HolaMonFrances(){};
        holaMonFrances.saludar();

        HolaMon holaMonEspanol = new HolaMonEspanol(){};
        holaMonEspanol.saludar();
    }

    public static void main(String... args) {
        Main myApp = new Main();
        myApp.ferSalutacio();
    }
}