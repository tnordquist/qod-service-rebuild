package edu.cnm.deepdive.qod.demo.model.dao;

import edu.cnm.deepdive.qod.demo.model.entity.Source;
import java.util.List;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/**
 * The interfaces are the types the client expects its dependencies to be
 */
public interface SourceRepository extends CrudRepository<Source, UUID> {

  List<Source> findAllByOrderByNameAsc();

  List<Source> findAllByNameContainingOrderByNameAsc(String fragment);


}
