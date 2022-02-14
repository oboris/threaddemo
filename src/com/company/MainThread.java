package com.company;

public class MainThread extends Thread{
    private final int id;
    private final BreakThread breakThread;

    public MainThread(int id, BreakThread breakThread) {
        this.id = id;
        this.breakThread = breakThread;
    }

    @Override
    public void run() {
        long sum = 0;
        boolean isStop = false;
        do{
            sum++;
            isStop = breakThread.isCanBreak();
        } while (!isStop);
        System.out.println(id + " - " + sum);
    }
}
