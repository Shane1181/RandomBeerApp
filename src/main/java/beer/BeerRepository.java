package beer;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeerRepository extends CrudRepository<Beer, Long> {

    /*
    * Repository for all JPA queries
    * */
    @Query("Select b from Beer b where b.id = :id")
    Beer findBeer(@Param("id") Long id);

    List<Beer> findAll();
}
