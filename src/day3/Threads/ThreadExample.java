package day3.Threads;

/* THREAD (Asynchronoys) : untuk jalanin beberapa tugas secara bersamaan di latar belakang
* tanpa mengganggu proses utamanya */

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Value : " + i);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                System.out.println("Error : Interrupted thread");
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start(); // Thread Pertama
        thread1.interrupt(); // Interupsi thread pertama ketika lagi jalan buat nunjukin error
        thread2.start(); // Thread Kedua yang akan tetep jalan walaupun thread 1 mati
    }
}
