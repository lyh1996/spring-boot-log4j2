package com.example.springbootlog4j2.Controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 633805 LYH
 * @version V1.0
 * @description 对类的描述
 * @create 2019-08-17 14:21
 * @since 1.7
 */
@RestController
@Log4j2
public class TestController2 {

    @RequestMapping(value = "/index2")
    public void test() {
        log.info("哈哈哈哈哈哈哈2222");
        log.info("哈哈哈哈哈哈哈2222");
        log.info("哈哈哈哈哈哈哈2222");
        log.info("哈哈哈哈哈哈哈111");

        System.out.println("lyh2222。。。。。。。。");
    }

}
