package edu.umss.storeservice.dtoSales;

import edu.umss.storeservice.dto.DtoBase;
import edu.umss.storeservice.modeloSales.Person;

import java.sql.Timestamp;

public class PersonDto extends DtoBase<Person> {
    private String firstName;
    private String lastName;
    private String email;
    private String nationality;
    private Timestamp createDate;
    private Timestamp modifiedDate;

    public PersonDto( String firstName, String lastName, String email, String nationality, Timestamp createDate, Timestamp modifiedDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.nationality = nationality;
        this.createDate = createDate;
        this.modifiedDate = modifiedDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


}
