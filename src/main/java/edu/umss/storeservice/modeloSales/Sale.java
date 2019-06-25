package edu.umss.storeservice.modeloSales;

import edu.umss.storeservice.dto.SaleDto;
import edu.umss.storeservice.model.ModelBase;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Sale extends ModelBase<SaleDto> {
    private Integer idSale;
    private String saleName;
    private Timestamp createDate;
    private Timestamp modifiedDate;
    private Employee employeeByIdEmployee;

    @Id
    @Column(name = "idSale", nullable = false)
    public Integer getIdSale() {
        return idSale;
    }

    public void setIdSale(Integer idSale) {
        this.idSale = idSale;
    }

    @Basic
    @Column(name = "saleName", nullable = false, length = 120)
    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
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
        Sale sale = (Sale) o;
        return Objects.equals(idSale, sale.idSale) &&
                Objects.equals(saleName, sale.saleName) &&
                Objects.equals(createDate, sale.createDate) &&
                Objects.equals(modifiedDate, sale.modifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSale, saleName, createDate, modifiedDate);
    }

    @ManyToOne
    @JoinColumn(name = "idEmployee", referencedColumnName = "idEmployee")
    public Employee getEmployeeByIdEmployee() {
        return employeeByIdEmployee;
    }

    public void setEmployeeByIdEmployee(Employee employeeByIdEmployee) {
        this.employeeByIdEmployee = employeeByIdEmployee;
    }
}
