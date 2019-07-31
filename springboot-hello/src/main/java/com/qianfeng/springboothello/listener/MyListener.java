package com.qianfeng.springboothello.listener;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.stereotype.Component;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @author FuZhiFan
 * @Date 2019/7/29
 */
@Component
public class MyListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.err.println("Mylistener  requesDestroyed");

    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.err.println("Mylistener requestInitialized");
    }
}
