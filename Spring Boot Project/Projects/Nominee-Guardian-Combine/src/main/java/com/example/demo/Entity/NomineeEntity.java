package com.example.demo.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="NomineeCombine")
public class NomineeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private Date dob;

    @Column
    private String Relationship;

    @Column
    private String Address1;

    @Column
    private String Address2;

    @Column
    private String Address3;

    @Column
    private String Address4;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public NomineeEntity(long id) {
        this.id = id;
    }

    public NomineeEntity() {
    }

    public NomineeEntity(String name, Date dob, String relationship, String address1, String address2, String address3, String address4) {
        this.name = name;
        this.dob = dob;
        Relationship = relationship;
        Address1 = address1;
        Address2 = address2;
        Address3 = address3;
        Address4 = address4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getRelationship() {
        return Relationship;
    }

    public void setRelationship(String relationship) {
        Relationship = relationship;
    }

    public String getAddress1() {
        return Address1;
    }

    public void setAddress1(String address1) {
        Address1 = address1;
    }

    public String getAddress2() {
        return Address2;
    }

    public void setAddress2(String address2) {
        Address2 = address2;
    }

    public String getAddress3() {
        return Address3;
    }

    public void setAddress3(String address3) {
        Address3 = address3;
    }

    public String getAddress4() {
        return Address4;
    }

    public void setAddress4(String address4) {
        Address4 = address4;
    }
}
