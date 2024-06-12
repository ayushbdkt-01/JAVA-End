// Write a java program for to solve producer consumer problem in which a
// producer produces a value and consumer consume the value before producer
// generate the next value




class SharedResource {
    private int value;
    private boolean produced = false;

    // Method for producer to set the value
    public synchronized void produce(int val) {
        while (produced) {
            try {
                wait(); // Wait for the consumer to consume the value
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value = val;
        produced = true;
        System.out.println("Produced: " + value);
        notify(); // Notify the consumer that a value is ready
    }

    // Method for consumer to consume the value
    public synchronized int consume() {
        while (!produced) {
            try {
                wait(); // Wait for the producer to produce the value
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + value);
        produced = false;
        notify(); // Notify the producer that the value has been consumed
        return value;
    }
}

class Producer extends Thread {
    private SharedResource shared;

    public Producer(SharedResource shared) {
        this.shared = shared;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            shared.produce(i);
            try {
                Thread.sleep(1000); // Simulate time taken to produce a value
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



class Consumer extends Thread {
    private SharedResource shared;

    public Consumer(SharedResource shared) {
        this.shared = shared;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            shared.consume();
            try {
                Thread.sleep(1000); // Simulate time taken to consume a value
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class p41 {
    public static void main(String[] args) {
        SharedResource shared = new SharedResource();
        Producer producer = new Producer(shared);
        Consumer consumer = new Consumer(shared);

        producer.start();
        consumer.start();
    }
}
