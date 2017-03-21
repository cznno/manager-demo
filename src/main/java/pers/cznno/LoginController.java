package pers.cznno;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cznno on 3/17/2017.
 */
    @Controller
    @RequestMapping(value = "/index")
public class LoginController {

//    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    @RequestMapping(produces = "text/html")
    public String infoSubmit() {
        return "index";
    }

}

