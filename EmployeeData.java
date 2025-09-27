/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logical;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class EmployeeData {

    private static ArrayList<Employee> emps = new ArrayList<>();

    public static boolean addEmployee(String name, String email, boolean isMale) {
        return emps.add(new Employee(name, email, isMale));
    }

    public static String getEmployeesAsString() {
        String result = "";
        for (Employee e : emps) {
            if (e.isIsMale()) {
                result += e.getName() + "(" + e.getEmail() + "): Male\n";
            } else {
                result += e.getName() + "(" + e.getEmail() + "): Female\n";
            }

        }
        return result;
    }
      public static int getNumberEmployees() {
     
        return emps.size();
    } 
}
