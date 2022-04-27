package com.example.demo.Service;

import com.example.demo.Entity.CustomerEntity;
import com.example.demo.Entity.NomineeEntity;
import com.example.demo.Repository.CustomerRepo;
import com.example.demo.Repository.NomineeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustmerService {

        @Autowired
        private CustomerRepo customerRepo;

        //post-save
        public CustomerEntity saveCustomer(CustomerEntity customerEntity){
            return customerRepo.save(customerEntity);

        }
        //post-save
        public List<CustomerEntity> saveCustomers(List<CustomerEntity> customerEntity){
            return customerRepo.saveAll(customerEntity);
        }
        //get
        public List<CustomerEntity> getCustomers(){
            return customerRepo.findAll();
        }
        //GET-guardians by id
        public CustomerEntity getCustomerId(long id){
            return customerRepo.findById(id).orElse(null);
        }
        /*GET-guardians by name
        public CustomerEntity getCustomerByName(String Customername)
        {
            return customerRepo.findByName(Customername);
        }*/
        //delete
        public  String deleteCustomer(long id)
        {
            customerRepo.deleteById(id);
            return  "product removed" +id;
        }
        //update
        public CustomerEntity updateCutomer(CustomerEntity customerEntity)
        {
            CustomerEntity existingNominee=customerRepo.findById(customerEntity.getId()).orElse(null);
            // assert existingNominee != null;
            existingNominee.setCustomerNo(customerEntity.getCustomerNo());
            existingNominee.setCurrency(customerEntity.getCurrency());
            existingNominee.setAccountClass(customerEntity.getAccountClass());
            existingNominee.setSDUserReference(customerEntity.getSDUserReference());
            existingNominee.setCustomerName(customerEntity.getCustomerName());
            existingNominee.setAccount(customerEntity.getAccount());
            existingNominee.setBranchCode(customerEntity.getBranchCode());
            return customerRepo.save(existingNominee);
        }


    }



