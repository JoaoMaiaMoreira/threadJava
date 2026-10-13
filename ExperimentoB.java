public class ExperimentoB {
    private static final int NUM_THREADS = 5;

    static class Tarefa implements Runnable {
        private final int id;

        public Tarefa(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            try {
                Thread.sleep((NUM_THREADS - id) * 500L);
                System.out.println("Thread " + id + ": executando após a espera.");
                System.out.println("Thread com ID " + id + " .. encerrando.");
            } catch (InterruptedException e) {
                System.out.println("Thread " + id + " foi interrompida.");
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[NUM_THREADS];

        // Criação e inicialização das threads
        for (int i = 0; i < NUM_THREADS; i++) {
            System.out.println("main(): criando thread " + (i + 1));
            threads[i] = new Thread(new Tarefa(i));
            threads[i].start();
        }

        // Aguarda o término de cada thread criada
        for (int i = 0; i < NUM_THREADS; i++) {
            try {
                threads[i].join();
                System.out.println("Main: thread " + (i + 1) + " terminou.");
            } catch (InterruptedException e) {
                System.out.println("Thread principal foi interrompida.");
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("Main: programa encerrado.");
    }
}