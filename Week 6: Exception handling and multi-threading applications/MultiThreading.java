class Stack {
    int size = 5, top = -1, s[] = new int[size];

    public synchronized void push() // Pushes numbers from 1 to 5 to the stack
    {
        for (int i = 0; i < size; i++) {
            System.out.println("Pushing " + (i + 1) + " into the stack");
            s[i] = i + 1;
            top++;
        }
    }

    public synchronized void pop() { // pops all elements from the stack
        for (int i = 0; i < size; i++) {
            System.out.println("Popping element: " + s[top]);
            top--;
        }
    }
}

class Producer extends Thread {
    Stack ob;

    Producer(Stack ob) {
        this.ob = ob;
    }

    public void run() {
        Thread.currentThread().setName("Producer");
        try {
            ob.push();
            if (ob.top == ob.size - 1)
                Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception occured.");
        }
    }
}

class Consumer extends Thread {
    Stack ob;

    Consumer(Stack ob) {
        this.ob = ob;
    }

    public void run() {
        Thread.currentThread().setName("Consumer");
        try {
            ob.pop();
            if (ob.top == -1)
                Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception occured.");
        }
    }
}

public class MultiThreading {
    public static void main(String args[]) {
        Stack s = new Stack();
        Producer ob1 = new Producer(s);
        Consumer ob2 = new Consumer(s);

        try {
            ob1.start();
            ob1.join();
            ob2.start();
        } catch (InterruptedException e) {
            System.out.println("Exception occured.");
        }
    }
}
