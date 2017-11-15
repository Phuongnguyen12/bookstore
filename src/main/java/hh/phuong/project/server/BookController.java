package hh.phuong.project.server;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
    @RequestMapping(
            value="/hello", method=RequestMethod.GET

    )
    public String greetingForm(
            Model model

    ) {
        //model.addAttribute("message", new Message());

        return "hello";
    }
}
