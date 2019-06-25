package edu.umss.storeservice.dtoSales;

import edu.umss.storeservice.dto.DtoBase;
import edu.umss.storeservice.modeloSales.Product;

import java.sql.Timestamp;
import java.util.Date;

public class ProductDto extends DtoBase<Product> {
    private String productName;
    private String productNumber;
    private String productDescription;
    private Timestamp createDate;
    private Timestamp modifiedDate;

    public ProductDto( String productName, String productNumber, String productDescription, Timestamp createDate, Timestamp modifiedDate) {
        this.productName = productName;
        this.productNumber = productNumber;
        this.productDescription = productDescription;
        this.createDate = createDate;
        this.modifiedDate = modifiedDate;
    }



    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
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
