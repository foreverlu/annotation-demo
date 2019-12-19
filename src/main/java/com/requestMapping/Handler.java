package com.requestMapping;

/**
 * Created by caoweiwei on 2019/12/18.
 */
public class Handler {

    private String method;

    private String controller;

    public Handler(String method, String controller) {
        this.method = method;
        this.controller = controller;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }
}
