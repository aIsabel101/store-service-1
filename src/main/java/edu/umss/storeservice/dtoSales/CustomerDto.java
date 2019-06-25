package edu.umss.storeservice.dtoSales;

import edu.umss.storeservice.dto.DtoBase;
import edu.umss.storeservice.modeloSales.Person;

public class CustomerDto extends DtoBase<Person> {
    private Integer isNewCustomer;
    private Person personByIdCustomer;

    public CustomerDto( Integer isNewCustomer, Person personByIdCustomer) {
        this.isNewCustomer = isNewCustomer;
        this.personByIdCustomer = personByIdCustomer;
    }


    public Integer getIsNewCustomer() {
        return isNewCustomer;
    }

    public void setIsNewCustomer(Integer isNewCustomer) {
        this.isNewCustomer = isNewCustomer;
    }

    public Person getPersonByIdCustomer() {
        return personByIdCustomer;
    }

    public void setPersonByIdCustomer(Person personByIdCustomer) {
        this.personByIdCustomer = personByIdCustomer;
    }
}
