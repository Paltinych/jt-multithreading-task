public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();

        ThreadGroup mainGroup = new ThreadGroup("main.group");

        System.out.println("Создаю потоки...");

        Thread thread1 = new Thread(mainGroup, myThread, "Поток 1");
        Thread thread2 = new Thread(mainGroup, myThread, "Поток 2");
        Thread thread3 = new Thread(mainGroup, myThread, "Поток 3");
        Thread thread4 = new Thread(mainGroup, myThread, "Поток 4");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(15000);

        System.out.println("Завершаю все потоки.");
        mainGroup.interrupt();
    }
}
