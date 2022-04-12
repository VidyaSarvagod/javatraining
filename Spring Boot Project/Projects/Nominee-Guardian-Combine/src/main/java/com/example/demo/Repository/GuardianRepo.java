package com.example.demo.Repository;

import com.example.demo.Entity.GuardianEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface GuardianRepo extends JpaRepository<GuardianEntity,Long> {
    //    @Query("from Guardian where name=:name ")
    GuardianEntity findByName(@Param("name") String name);
}
