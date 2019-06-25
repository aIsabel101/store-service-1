package edu.umss.storeservice.modeloSales;

import edu.umss.storeservice.dtoSales.PersonDto;
import edu.umss.storeservice.model.ModelBase;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Person extends ModelBase<PersonDto> {
    //private Person person;
    private Integer idPerson;
    private String firstName;
    private String lastName;
    private String email;
    private String nationality;
    private Timestamp createDate;
    private Timestamp modifiedDate;


    @Id
    @Column(name = "idPerson", nullable = false)
    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    /*public Person getPerson () {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }*/


    @Basic
    @Column(name = "firstName", nullable = false, length = 60)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "lastName", nullable = false, length = 60)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 120)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "nationality", nullable = false, length = 120)
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Basic
    @Column(name = "createDate", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "modifiedDate", nullable = true)
    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(idPerson, person.idPerson) &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(email, person.email) &&
                Objects.equals(nationality, person.nationality) &&
                Objects.equals(createDate, person.createDate) &&
                Objects.equals(modifiedDate, person.modifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPerson, firstName, lastName, email, nationality, createDate, modifiedDate);
    }
}
