package guardian.com.ex.entity;

import javax.persistence.*;

@Entity
@Table(name = "guardian")
public class Guardian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

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

    public Guardian() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Guardian(Long id, String name, String relationship, String address1, String address2, String address3, String address4) {
        this.id = id;
        this.name = name;
        Relationship = relationship;
        Address1 = address1;
        Address2 = address2;
        Address3 = address3;
        Address4 = address4;
    }

    @Override
    public String toString() {
        return "Guardian{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Relationship='" + Relationship + '\'' +
                ", Address1='" + Address1 + '\'' +
                ", Address2='" + Address2 + '\'' +
                ", Address3='" + Address3 + '\'' +
                ", Address4='" + Address4 + '\'' +
                '}';
    }
    //public Guardian(String name) {
    //    this.name = name;
   // }

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
