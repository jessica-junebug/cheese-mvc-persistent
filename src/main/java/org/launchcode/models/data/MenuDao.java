package org.launchcode.models.data;

/**
 * Created by penelope fox on 8/9/2017.
 */
import org.launchcode.models.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;


@Repository
@Transactional
public interface MenuDao extends CrudRepository<Menu, Integer> {
}