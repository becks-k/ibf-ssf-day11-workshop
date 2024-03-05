package ibf.ssf.day11workshop.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
// Note: Placing RequestMapping here would give an error
public class AppErrorController implements ErrorController {
    
    //On encountering 404 error page, redirects browser to landing page
    @RequestMapping(path="/error")
    public String handleError() {
            return "redirect:/"; // Redirects client to landing page on encountering error page
        }   

    
}
