package com.company;

import com.company.data.Data;
import com.company.services.Consumer;
import com.company.services.Producer;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Data singletonData = Data.getInstance();

        Consumer consumer = new Consumer(singletonData);
        Producer producer = new Producer(singletonData);

        Thread consumerThread = new Thread(consumer, "consumerThread");
        consumerThread.start();

        Thread producerThread = new Thread(producer, "producerThread");
        producerThread.start();

        while (true) {

            try {
                System.in.read();
                System.out.print("Ready");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


