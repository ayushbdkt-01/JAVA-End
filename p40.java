// Multithreaded programming:
// Write a program MultiThreads that creates two threads-one thread with the
// name CSthread and the other thread named ITthread.
// Each thread should
// display its respective name and execute after a gap of 500 milliseconds. Each
// thread should also display a number indicating the number of times it got a
// chance to execute






class CSthread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("CSthread is executing. Execution Count: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class ITthread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("ITthread is executing. Execution Count: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class p40 {
    public static void main(String args[]) {
        // Create two thread objects
        CSthread csThread = new CSthread();
        ITthread itThread = new ITthread();

        // Start both threads
        csThread.start();
        itThread.start();
    }
}
