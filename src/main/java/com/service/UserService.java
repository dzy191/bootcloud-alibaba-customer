package com.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {
    @Value(value = "${server.port}")
    private String serverPort;

    @GetMapping(value = "/provider/nacos/discovery/{string}")
    public String echo(@PathVariable String string) {
        return "Nacos provide " + serverPort + " ：Hello" + string;
    }

    @RequestMapping(value = "check_Userprovider.do")
    public String check() {
        System.out.println("服务提供者1--check方法正在动作");
        return "check服务";
    }
}
