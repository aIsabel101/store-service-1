package edu.umss.storeservice.modeloSales;

import edu.umss.storeservice.dtoSales.CustomerDto;
import edu.umss.storeservice.model.ModelBase;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Customer extends ModelBase<CustomerDto> {
    private Integer idCustomer;
    private Integer isNewCustomer;
    private Person personByIdCustomer;

    @Id
    @Column(name = "idCustomer", nullable = false)

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Basic
    @Column(name = "isNewCustomer", nullable = false)
    public Integer getIsNewCustomer() {
        return isNewCustomer;
    }

    public void setIsNewCustomer(Integer isNewCustomer) {
        this.isNewCustomer = isNewCustomer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(idCustomer, customer.idCustomer) &&
                Objects.equals(isNewCustomer, customer.isNewCustomer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCustomer, isNewCustomer);
    }

    @OneToOne
    @JoinColumn(name = "idCustomer", referencedColumnName = "idPerson", nullable = false)
    public Person getPersonByIdCustomer() {
        return personByIdCustomer;
    }

    public void setPersonByIdCustomer(Person personByIdCustomer) {
        this.personByIdCustomer = personByIdCustomer;
    }
}
