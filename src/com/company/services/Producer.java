package com.company.services;
import com.company.data.Data;
import java.util.concurrent.TimeUnit;

public class Producer implements Runnable{
    private Data data;

    public Producer(Data data) {
        this.data = data;
    }
    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {

                data.addMessage(" " + i++);
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
