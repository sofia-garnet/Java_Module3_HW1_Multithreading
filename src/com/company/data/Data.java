package com.company.data;
import java.util.LinkedList;
import java.util.Queue;

public class Data {

    private static Data single_instance = null;

    Queue<String> dataStorage;

    private Data() {
        dataStorage = new LinkedList();
    }

    // static method to create instance of Singleton class
    public static Data getInstance() {
        if (single_instance == null)
            single_instance = new Data();
        return single_instance;
    }

    public void addMessage(String message) {
        synchronized (this) {
            dataStorage.add(message);
        }
    }

    public String getMessage() {
        synchronized (this) {
            return dataStorage.poll();
        }
    }
}