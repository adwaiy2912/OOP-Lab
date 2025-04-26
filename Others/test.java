public class test {
    private int item;
    private boolean isEmpty = true;

    synchronized void produce(int value) {
        while (!isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        item = value;
        isEmpty = false;
        System.out.println("Produced: " + item);

        notify();
    }

    synchronized int consume() {
        while (isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int consumedItem = item;
        isEmpty = true;
        System.out.println("Consumed: " + consumedItem);

        notify();
        return consumedItem;
    }

    public static void main(String[] args) {
        test sharedBuffer = new test();

        // Producer
        Thread producerThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                sharedBuffer.produce(i);
                try {
                    Thread.sleep(1000); // Simulate some production time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Consumer
        Thread consumerThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                sharedBuffer.consume();
                try {
                    Thread.sleep(1500); // Simulate some consumption time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}