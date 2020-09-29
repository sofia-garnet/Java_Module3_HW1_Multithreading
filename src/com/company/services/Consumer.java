package com.company.services;

import com.company.data.Data;

public class Consumer implements Runnable{
    private Data data;

    public Consumer(Data data) {
        this.data = data;
    }

    @Override
    public void run() {

        while (true) {
            String message = data.getMessage();
            if (message != null) {
                System.out.print(message);
            }
        }
    }
}
