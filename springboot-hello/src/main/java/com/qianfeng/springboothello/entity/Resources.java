package com.qianfeng.springboothello.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author FuZhiFan
 * @Date 2019/7/29
 */
@Component
@ConfigurationProperties(prefix="resource")
public class Resources {

    private String fileServer;
    private String emailServer;

    public String getFileServer() {
        return fileServer;
    }

    public void setFileServer(String fileServer) {
        this.fileServer = fileServer;
    }

    public String getEmailServer() {
        return emailServer;
    }

    public void setEmailServer(String emailServer) {
        this.emailServer = emailServer;
    }
}
