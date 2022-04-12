package com.example.demo.Service;

import com.example.demo.Entity.GuardianEntity;
import com.example.demo.Repository.GuardianRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service

public class GuardianService {

    @Autowired
    private GuardianRepo guardianRepository;

    //post-save
    public GuardianEntity saveGuardian(GuardianEntity guardian){
        return guardianRepository.save(guardian);

    }
    //post-save
    public List<GuardianEntity> saveGuardians(List<GuardianEntity> guardians){
        return guardianRepository.saveAll(guardians);
    }
    //get
    public List<GuardianEntity> getGuardians(){
        return guardianRepository.findAll();
    }
    //GET-guardians by id
    public GuardianEntity getGuardiansById(long id){
        return guardianRepository.findById(id).orElse(null);
    }
    //GET-guardians by name
    public GuardianEntity getGuardiansByName(String name)
    {
        return guardianRepository.findByName(name);
    }
    //delete
    public  String deleteGuardian(long id)
    {
        guardianRepository.deleteById(id);
        return  "product removed" +id;
    }
    //update
    public GuardianEntity updateGuardian(GuardianEntity guardian)
    {
        GuardianEntity existingGuardian=guardianRepository.findById(guardian.getId()).orElse(null);
        assert existingGuardian != null;
        existingGuardian.setName(guardian.getName());
        existingGuardian.setRelationship(guardian.getRelationship());
        existingGuardian.setAddress1(guardian.getAddress1());
        existingGuardian.setAddress2(guardian.getAddress2());
        existingGuardian.setAddress3(guardian.getAddress3());
        existingGuardian.setAddress4(guardian.getAddress4());
        return guardianRepository.save(existingGuardian);
    }



}



