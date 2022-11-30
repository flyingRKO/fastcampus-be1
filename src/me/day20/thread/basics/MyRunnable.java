package me.day20.thread.basics;

public class MyRunnable implements Runnable {
    private static final int ITERATIONS = 10;
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < ITERATIONS; i++) {
            System.out.println(name + " => " + i);
        }
    }

    @Override
    public String toString() {
        return "MyRunnable{" +
                "name='" + name + '\'' +
                '}';
    }
}
