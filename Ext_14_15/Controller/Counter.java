package Ext_14_15.Controller;

public class Counter implements AutoCloseable {

    static int sum;
    {
        sum = 0;
    }

    public void add() {
        sum++;
    }

    @Override
    public void close() {
        System.out.println("Counter closed");
    }
}