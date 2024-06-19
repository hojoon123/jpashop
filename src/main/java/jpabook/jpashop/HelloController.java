package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(@org.jetbrains.annotations.NotNull Model model) { // 동적
        model.addAttribute("data", "hello!!!");
        return "hello"; // 파일명
    }
}
