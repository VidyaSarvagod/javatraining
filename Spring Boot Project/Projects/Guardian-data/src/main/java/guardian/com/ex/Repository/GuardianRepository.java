package guardian.com.ex.Repository;

import guardian.com.ex.entity.Guardian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface GuardianRepository extends JpaRepository<Guardian,Long>{

//    @Query("from Guardian where name=:name ")
    Guardian findByName(@Param("name") String name);
}
