package hello;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by agup101 on 4/20/2017.
 */
@Repository
public interface PersonRepository extends GraphRepository<Person> {

    Person findByName(String name);
    Person findByTeammatesName(String name);
}