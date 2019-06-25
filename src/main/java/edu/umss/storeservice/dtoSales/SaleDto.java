package edu.umss.storeservice.dtoSales;

import edu.umss.storeservice.dto.DtoBase;
import edu.umss.storeservice.modeloSales.Employee;
import edu.umss.storeservice.modeloSales.Sale;

import java.sql.Timestamp;

public class SaleDto extends DtoBase<Sale> {

    private String saleName;
    private Timestamp createDate;
    private Timestamp modifiedDate;
    private Employee employeeByIdEmployee;


    public SaleDto( String saleName, Timestamp createDate, Timestamp modifiedDate, Employee employeeByIdEmployee) {
        this.saleName = saleName;
        this.createDate = createDate;
        this.modifiedDate = modifiedDate;
        this.employeeByIdEmployee = employeeByIdEmployee;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
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

    public Employee getEmployeeByIdEmployee() {
        return employeeByIdEmployee;
    }

    public void setEmployeeByIdEmployee(Employee employeeByIdEmployee) {
        this.employeeByIdEmployee = employeeByIdEmployee;
    }
}
