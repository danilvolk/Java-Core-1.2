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
            if (i == 33) {
                errorCallbackl.onError("Задача " + i + " Ошибка в выполнении!!!!!!!!!!!!!!!!!!!!!");
            } else {
                callback.onDone("Задача " + i + " Выполнена");
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
