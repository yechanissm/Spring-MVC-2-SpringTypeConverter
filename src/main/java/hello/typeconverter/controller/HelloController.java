package hello.typeconverter.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @GetMapping("/hello-v1")
    public String helloV1(HttpServletRequest request) {
        String data = request.getParameter("data"); //문자 타입조회
        Integer intvalue = Integer.valueOf(data);
        System.out.println("intvalue = " + intvalue);
        return "ok";
    }
    
    @GetMapping("/hello-v2")
    public String helloV(@RequestParam Integer data){
        System.out.println("data = " + data);
        return "ok";
    }
}