package com.company;

public class Worker implements OnTaskDoneListener, OnTaskErrorListener {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallbackl;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallbackl) {
        this.callback = callback;
        this.errorCallbackl = errorCallbackl;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            callback.onDone("Задача " + i + " Выполнена");
            if (i == 33) {
                errorCallbackl.onError("Задача " + i + " НЕ выполнена!!!!!!!!!!!!!!!!!!!!!");
            }
        }
    }

    @Override
    public void onDone(String result) {

    }

    @Override
    public void onError(String result) {

    }
}
