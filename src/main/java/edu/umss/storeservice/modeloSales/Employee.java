package edu.umss.storeservice.modeloSales;

import edu.umss.storeservice.dtoSales.EmployeeDto;
import edu.umss.storeservice.model.ModelBase;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;
import java.util.Objects;

@Entity
@SpringBootApplication
public class Employee extends ModelBase<EmployeeDto> {
   // private Employee employee;
    private Integer idEmployee;
    private String loginUser;
    private String passwordUser;
    private Person personByIdEmployee;

    @Id
    @Column(name = "idEmployee", nullable = false)
    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    @Basic
    @Column(name = "loginUser", nullable = false, length = 60)
    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    @Basic
    @Column(name = "passwordUser", nullable = false, length = 60)
    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(idEmployee, employee.idEmployee) &&
                Objects.equals(loginUser, employee.loginUser) &&
                Objects.equals(passwordUser, employee.passwordUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmployee, loginUser, passwordUser);
    }

    @OneToOne
    @JoinColumn(name = "idEmployee", referencedColumnName = "idPerson", nullable = false)
    public Person getPersonByIdEmployee() {
        return personByIdEmployee;
    }

    public void setPersonByIdEmployee(Person personByIdEmployee) {
        this.personByIdEmployee = personByIdEmployee;
    }
}
