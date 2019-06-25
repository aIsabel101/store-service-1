package edu.umss.storeservice.dtoSales;

import edu.umss.storeservice.dto.DtoBase;
import edu.umss.storeservice.modeloSales.Employee;

public class EmployeeDto extends DtoBase<Employee> {
  private String loginUser;
    private String passwordUser;


    public EmployeeDto( String loginUser, String passwordUser) {
        this.loginUser = loginUser;
        this.passwordUser = passwordUser;
    }


    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

}
