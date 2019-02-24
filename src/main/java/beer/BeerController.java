package beer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BeerController {

    @Autowired
    BeerService beerService;

    @RequestMapping("/beer")
    public String beer(Model model) {
        Beer beer = beerService.getRandomBeer();
        //set the return info to the model for displaying on the UI
        model.addAttribute("name", beer.getName());
        model.addAttribute("description", beer.getDescription());
        model.addAttribute("abv", beer.getAbv());
        model.addAttribute("location", beer.getLocation());
        //Return the beer.html for the UI
        return "beer";
    }
}
