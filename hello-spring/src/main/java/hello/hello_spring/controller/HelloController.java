package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","hi~");
        return "hello"; //리턴의 이름이  hello 라는 것. hello.html을 찾아서 렌더링 한다는 의미
        //viewResolver 가 화면을 찾아서 처리한다.
        //`resource:templates/` + {ViewName} + `.html`
    }
}
