package com.qianfeng.springbootmybaties.controller;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author FuZhiFan
 * @Date 2019/7/31
 */
@RestController
@RequestMapping("log")
@Slf4j
public class LogController {

    private Logger logger = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("out")
    private String out(){
        logger.debug("debug....");
        logger.info("info....");
        logger.warn("warn....");
        logger.error("error....");
        return "ok";
    }
}
