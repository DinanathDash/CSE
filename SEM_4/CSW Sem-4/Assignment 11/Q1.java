class AdditionThread extends Thread {
    private double a, b;

    public AdditionThread(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        double result = a + b;
        System.out.println("Addition Result: " + result);
    }
}

class SubtractionThread extends Thread {
    private double a, b;

    public SubtractionThread(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        double result = a - b;
        System.out.println("Subtraction Result: " + result);
    }
}

class MultiplicationThread extends Thread {
    private double a, b;

    public MultiplicationThread(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        double result = a * b;
        System.out.println("Multiplication Result: " + result);
    }
}

class DivisionThread extends Thread {
    private double a, b;

    public DivisionThread(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            double result = a / b;
            System.out.println("Division Result: " + result);
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 5.0;

        Thread addThread = new AdditionThread(num1, num2);
        Thread subThread = new SubtractionThread(num1, num2);
        Thread mulThread = new MultiplicationThread(num1, num2);
        Thread divThread = new DivisionThread(num1, num2);

        addThread.start();
        subThread.start();
        mulThread.start();
        divThread.start();

        try {
            addThread.join();
            subThread.join();
            mulThread.join();
            divThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All calculations are done.");
    }
}
