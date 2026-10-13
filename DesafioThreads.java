public class DesafioThreads {
    private static final int NUM_THREADS = 10;

    static class TarefaDesafio implements Runnable {
        private final int id;

        public TarefaDesafio(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            System.out.println("Thread [" + id + "] -> Iniciou sua execução.");

            try {
                //Simula tempo de espera diferente para cada thread
                long tempoEspera = (long) (Math.random() * 2000) + 500;
                Thread.sleep(tempoEspera);
            } catch (InterruptedException e) {
                System.out.println("Thread [" + id + "] foi interrompida.");
                Thread.currentThread().interrupt();
            }

            // 3. Mensagem de término
            System.out.println("Thread [" + id + "] -> Concluiu a tarefa e encerrou.");
        }
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[NUM_THREADS];

        // Criando e iniciando 10 threads (IDs de 0 a 9)
        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i] = new Thread(new TarefaDesafio(i));
            threads[i].start();
        }

        // Aguarda todas as 10 threads usando join()
        for (int i = 0; i < NUM_THREADS; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread principal foi interrompida.");
                Thread.currentThread().interrupt();
                return;
            }
        }

        // Mensagem final após a conclusão de todas
        System.out.println("Todas as threads foram concluídas.");
    }
}