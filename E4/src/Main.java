import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


interface Alerta {
    String getMissatge();

    default int getMinuts() {
        return 0;
    }

    int getSegons();
}

class Temporitzador {
    List<Thread> threadList = new ArrayList<>();

    Temporitzador programar(Alerta alerta) {
        threadList.add(Thread.ofVirtual().start(() -> {
            try {
                Thread.sleep(alerta.getSegons() * 1000);
            } catch (Exception _) {
            }
            System.out.println("¡ALERTA! " + alerta.getMissatge());
        }));

        return this;
    }

    public void esperarQueAcabenLesAlertes() throws InterruptedException {
        for (Thread thread : threadList) thread.join();
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Temporitzador temporitzador = new Temporitzador();

        while (true) {
            System.out.println("Pon el mensaje de alerta, o deja en blanco para finalizar el programa.");
            String mens = scanner.nextLine();
            if (mens.isEmpty()) {
                break;
            }

            System.out.println("Introduce el tiempo en segundos para la alerta:");
            int seg;
            try {
                seg = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Tiempo no válido.");
                break;

            }

            new Temporitzador()
                    .programar(new Alerta() {
                        @Override
                        public String getMissatge() {
                            return mens;
                        }

                        @Override
                        public int getSegons() {
                            return seg;
                        }
                    })
                    .esperarQueAcabenLesAlertes();
        }

    }
}