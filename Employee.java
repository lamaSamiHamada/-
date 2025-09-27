/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logical;

/**
 *
 * @author HP
 */
public class Employee {
    private String name ;
    private String email;
    private boolean isMale;

    public Employee(String name, String email, boolean isMale) {
        this.name = name;
        this.email = email;
        this.isMale = isMale;
    }

    public boolean isIsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
            
    
}
