package guardian.com.ex.Service;

import guardian.com.ex.Repository.GuardianRepository;
import guardian.com.ex.entity.Guardian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuardianService {

    @Autowired
    private GuardianRepository guardianRepository;

    //post-save
    public Guardian saveGuardian(Guardian guardian){
        return guardianRepository.save(guardian);

    }
    //post-save
    public List<Guardian> saveGuardians(List<Guardian> guardians){
        return guardianRepository.saveAll(guardians);
    }
    //get
    public List<Guardian> getGuardians(){
        return guardianRepository.findAll();
    }
    //GET-guardians by id
    public Guardian getGuardiansById(long id){
        return guardianRepository.findById(id).orElse(null);
    }
    //GET-guardians by name
    public Guardian getGuardiansByName(String name){
        return guardianRepository.findByName(name);
    }
    //delete
    public  String deleteGuardian(long id)
    {
        guardianRepository.deleteById(id);
        return  "product removed" +id;
    }
    //update
    public Guardian updateGuardian(Guardian guardian)
    {
        Guardian existingGuardian=guardianRepository.findById(guardian.getId()).orElse(null);
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
