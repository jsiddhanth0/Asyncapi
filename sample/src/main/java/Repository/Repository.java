package Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Entity.RPLEntity;


public interface Repository extends JpaRepository<RPLEntity,String> {
	@Query(value="SELECT * FROM RPL_NER_STATUS", nativeQuery = true)
	List<RPLEntity> customQuery(@Param("query") String query);

}
