package edu.umss.storeservice.modeloSales;

import edu.umss.storeservice.dtoSales.ProductDto;
import edu.umss.storeservice.model.ModelBase;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Product  extends ModelBase<ProductDto> {
    private Integer idProduct;
    private String productName;
    private String productNumber;
    private String productDescription;
    private Timestamp createDate;
    private Timestamp modifiedDate;

    @Id
    @Column(name = "idProduct", nullable = false)
    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    @Basic
    @Column(name = "productName", nullable = false, length = 120)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "productNumber", nullable = false, length = 120)
    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    @Basic
    @Column(name = "productDescription", nullable = false, length = 220)
    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
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
        Product product = (Product) o;
        return Objects.equals(idProduct, product.idProduct) &&
                Objects.equals(productName, product.productName) &&
                Objects.equals(productNumber, product.productNumber) &&
                Objects.equals(productDescription, product.productDescription) &&
                Objects.equals(createDate, product.createDate) &&
                Objects.equals(modifiedDate, product.modifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduct, productName, productNumber, productDescription, createDate, modifiedDate);
    }
}
