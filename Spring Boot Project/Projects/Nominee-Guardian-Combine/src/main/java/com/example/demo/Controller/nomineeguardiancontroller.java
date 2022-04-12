package com.example.demo.Controller;
import com.example.demo.Entity.NomineeEntity;
import com.example.demo.Service.GuardianService;

import com.example.demo.Entity.GuardianEntity;
//import com.example.demo.Service.GuardianService;
import com.example.demo.Service.NomineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@Component
public class nomineeguardiancontroller {

   @Autowired
   private GuardianService guardianService;
    @Autowired
   private NomineeService nomineeService;



    @PostMapping("/addGuardian")
    public GuardianEntity addGuardian(@RequestBody GuardianEntity guardian)
    {
        return guardianService.saveGuardian(guardian);
    }

    @PostMapping("/addGuardians")
    public List<GuardianEntity> addGuardians(@RequestBody List<GuardianEntity> guardians)
    {
        return guardianService.saveGuardians(guardians);
    }

    @PutMapping("/update")
    public GuardianEntity updateGuardians(@RequestBody GuardianEntity guardian)
    {
        return guardianService.updateGuardian(guardian);
    }

    @GetMapping("/getGuardians")
    public List<GuardianEntity> findAllGuardians()
    {
        return guardianService.getGuardians();
    }

    @GetMapping("/getGuardianById/{id}")
    public GuardianEntity findGuardianById(@PathVariable long id)
    {

        return guardianService.getGuardiansById(id);

    }

    @GetMapping("/getGuardianByName/{name}")
    public GuardianEntity findGuardianByName(@PathVariable String name)
    {
        return guardianService.getGuardiansByName(name);

    }

    @DeleteMapping("/Delete/{id}")
    public String deleteGuardian(@PathVariable long id){
        return guardianService.deleteGuardian(id);
    }



    //******************************************************************************************************************

    @PostMapping("/addNominee")
    public NomineeEntity addNominee(@RequestBody NomineeEntity nomineeEntity)
    {
        return nomineeService.saveNominee(nomineeEntity);
    }

    @PostMapping("/addNominees")
    public List<NomineeEntity> addNominees(@RequestBody List<NomineeEntity> nomineeEntity)
    {
        return nomineeService.saveNominees(nomineeEntity);
    }

    @PutMapping("/updateNominee")
    public NomineeEntity updateNominee(@RequestBody NomineeEntity nomineeEntity)
    {
        return nomineeService.updateNominee(nomineeEntity);
    }

    @GetMapping("/getNominees")
    public List<NomineeEntity> findAllNominees()
    {
        return nomineeService.getNominees();
    }

    @GetMapping("/getNomineeById/{id}")
    public NomineeEntity findNomineeById(@PathVariable long id)
    {

        return nomineeService.getNomineeById(id);

    }

    @GetMapping("/getNomineeByName/{name}")
    public NomineeEntity findNomineeByName(@PathVariable String name)
    {
        return nomineeService.getNomineeByName(name);

    }

    @DeleteMapping("/DeleteNominee/{id}")
    public String deleteNominee(@PathVariable long id){
        return nomineeService.deleteNominee(id);
    }




}
