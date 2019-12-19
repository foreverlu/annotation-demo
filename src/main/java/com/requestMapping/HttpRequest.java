package com.requestMapping;

/**
 * Created by caoweiwei on 2019/12/14.
 */
public class HttpRequest {

    private String url;

    public HttpRequest(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
