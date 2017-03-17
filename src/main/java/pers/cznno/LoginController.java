package pers.cznno;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cznno on 3/17/2017.
 */
    @Controller
    @RequestMapping(value = "/index")
public class LoginController {
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String infoSubmit() {
        return "index";
    }
}
