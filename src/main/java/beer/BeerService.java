package beer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class BeerService {

    @Autowired
    private BeerRepository beerRepository;

    public Beer getRandomBeer(){
        //Find all possible beers then pick a random one
        List<Beer> beers = beerRepository.findAll();
        //Pick a random number between zero and the size of the list and return the list index, the max bound here is excluded so won't go over the list length
        int randomNum = ThreadLocalRandom.current().nextInt(0, beers.size());

        return beers.get(randomNum);
    }
}
