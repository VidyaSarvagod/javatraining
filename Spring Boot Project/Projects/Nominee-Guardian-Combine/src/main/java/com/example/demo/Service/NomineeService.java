package com.example.demo.Service;

import com.example.demo.Entity.GuardianEntity;
import com.example.demo.Entity.NomineeEntity;
import com.example.demo.Repository.GuardianRepo;
import com.example.demo.Repository.NomineeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NomineeService {

    @Autowired
    private NomineeRepo nomineeRepo;

    //post-save
    public NomineeEntity saveNominee(NomineeEntity nomineeEntity){
        return nomineeRepo.save(nomineeEntity);

    }
    //post-save
    public List<NomineeEntity> saveNominees(List<NomineeEntity> nomineeEntity){
        return nomineeRepo.saveAll(nomineeEntity);
    }
    //get
    public List<NomineeEntity> getNominees(){
        return nomineeRepo.findAll();
    }
    //GET-guardians by id
    public NomineeEntity getNomineeById(long id){
        return nomineeRepo.findById(id).orElse(null);
    }
    //GET-guardians by name
    public NomineeEntity getNomineeByName(String name)
    {
        return nomineeRepo.findByName(name);
    }
    //delete
    public  String deleteNominee(long id)
    {
        nomineeRepo.deleteById(id);
        return  "product removed" +id;
    }
    //update
    public NomineeEntity updateNominee(NomineeEntity nomineeEntity)
    {
        NomineeEntity existingNominee=nomineeRepo.findById(nomineeEntity.getId()).orElse(null);
       // assert existingNominee != null;

        existingNominee.setName(nomineeEntity.getName());
        existingNominee.setDob(nomineeEntity.getDob());
        existingNominee.setRelationship(nomineeEntity.getRelationship());
        existingNominee.setAddress1(nomineeEntity.getAddress1());
        existingNominee.setAddress1(nomineeEntity.getAddress2());
        existingNominee.setAddress1(nomineeEntity.getAddress3());
        existingNominee.setAddress1(nomineeEntity.getAddress4());
        return nomineeRepo.save(existingNominee);
    }


}
