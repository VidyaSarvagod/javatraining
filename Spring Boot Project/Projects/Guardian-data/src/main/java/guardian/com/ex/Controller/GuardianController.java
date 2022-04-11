package guardian.com.ex.Controller;

import guardian.com.ex.Service.GuardianService;
import guardian.com.ex.entity.Guardian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GuardianController {

        @Autowired
        private GuardianService guardianService;

        @PostMapping("/addGuardian")
        public Guardian addGuardian(@RequestBody Guardian guardian)
         {
             return guardianService.saveGuardian(guardian);
         }

         @PostMapping("/addGuardians")
          public List<Guardian> addGuardians(@RequestBody List<Guardian> guardians)
          {
              return guardianService.saveGuardians(guardians);
          }

        @PutMapping("/update")
        public Guardian updateGuardians(@RequestBody Guardian guardian)
        {
            return guardianService.updateGuardian(guardian);
        }

        @GetMapping("/getGuardians")
          public List<Guardian> findAllGuardians()
          {
            return guardianService.getGuardians();
          }

          @GetMapping("/getGuardianById/{id}")
           public Guardian findGuardianById(@PathVariable long id)
          {

              return guardianService.getGuardiansById(id);

           }

         @GetMapping("/getGuardianByName/{name}")
          public Guardian findGuardianByName(@PathVariable String name)
          {
            return guardianService.getGuardiansByName(name);

         }

         @DeleteMapping("/Delete/{id}")
        public String deleteGuardian(@PathVariable long id){
            return guardianService.deleteGuardian(id);
         }









}
