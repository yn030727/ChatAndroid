package com.example.chatandroid.logic.model.debug;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class TestMain {
    static int count = 1;
    static int turn1 = 1;

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Condition condition1 = lock.newCondition();
        Condition condition2 = lock.newCondition();
        Condition condition3 = lock.newCondition();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (count < 101 ) {
                    lock.lock();
                    condition1.signal();

                    while(turn1 != 1) {
                        try {
                            condition1.await();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("1:" + count);
                    count++;
                    turn1 = 2;

                    try {
                        condition1.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (count < 101) {
                    lock.lock();
                    condition2.signal();
                    while(turn1 != 2) {
                        try {
                            condition2.await();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    System.out.println("2:" + count);
                    count++;
                    turn1 = 3;

                    try {
                        condition2.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (count < 101) {
                    lock.lock();
                    condition3.signal();
                    while(turn1 != 3) {
                        try {
                            condition3.await();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    System.out.println("3:" + count);
                    count++;
                    turn1 = 1;

                    try {
                        condition3.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                }
            }
        }).start();
    }

    public static synchronized void setCount(){
        int[] array = new int[10];

    }
}


