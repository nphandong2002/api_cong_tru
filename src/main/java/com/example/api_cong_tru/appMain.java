package com.example.api_cong_tru;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdvice;

@Controller
@RequestMapping("/api")
public class appMain {
    @GetMapping("/cong")
    public ResponseEntity cong(@RequestParam("a") int a, @RequestParam("b") int b){
        return ResponseEntity.ok(a + b);
    }
    @GetMapping("/tru")
    public ResponseEntity tru(@RequestParam("a") int a,@RequestParam("b") int b){
        return ResponseEntity.ok(a - b);
    }
    @GetMapping("/nhan")
    public ResponseEntity nhan(@RequestParam("a") int a,@RequestParam("b") int b){
        return ResponseEntity.ok(a * b);
    }
    @GetMapping("/chia")
    public ResponseEntity chia(@RequestParam("a") int a,@RequestParam("b") int b){
        if(b == 0 ) return ResponseEntity.ok("Không thể chia cho số không");
        return ResponseEntity.ok(a / b);
    }
}
