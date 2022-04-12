package com.example.demo.Repository;

import com.example.demo.Entity.GuardianEntity;
import com.example.demo.Entity.NomineeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface NomineeRepo extends JpaRepository<NomineeEntity,Long> {
   NomineeEntity findByName(@Param("name") String name);
}
