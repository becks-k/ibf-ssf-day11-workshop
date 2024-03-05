package ibf.ssf.day11workshop.controllers;


import java.security.SecureRandom;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// NEVER EVER create a controller with variables within class
// Security issues
@Controller
@RequestMapping(path={"/", "/index.html"})
public class RandomNumberController {
    
    @GetMapping
    public String getRandomNumbers(Model model) {
        System.out.println("GET >>>>>>>>> getRandomNumbers");

        Random random = new SecureRandom();
        int n = random.nextInt(31);
        String imgURL = "../numbers/number%d.jpg".formatted(n);
        model.addAttribute("imgURL", imgURL);
        
        // Returns to html file
        // Methods that handle requests for root URL "/" determines the landing page
        return "number"; 

        // List<Integer> numList = new Random().ints( 0, 3)
        //     .limit(1) //???
        //     .boxed()
        //     .collect(Collectors.toList());
        

    }

}
