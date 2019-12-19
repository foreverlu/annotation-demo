package com.requestMapping;

/**
 * Created by caoweiwei on 2019/12/14.
 */
public class Controller {

    @RequestMapping("/tom")
    public String tom(){
        System.out.println("controller------------tom");
        return "tom";
    }

    @RequestMapping(("/jack"))
    public void jack(){
        System.out.println("controller-----------jack");
    }

}
