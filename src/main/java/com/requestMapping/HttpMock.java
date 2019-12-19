package com.requestMapping;

/**
 * Created by caoweiwei on 2019/12/19.
 */
public class HttpMock {

    DispatchServlet dispatchServlet = new DispatchServlet();

    public void request(String url) {
        HttpRequest request = new HttpRequest(url);
        Object res = dispatchServlet.dispatch(request);
        System.out.println("response-----------" + res);
    }

}
