package designPatterns.structural.adapter;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);

        System.out.println("====================================");

        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        card = designer.designCard(objectAdapter);
        System.out.println(card);

    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("John Doe");
        employee.setJobTitle("Software Engineer");
        employee.setOfficeLocation("123 Wall St, New York, NY");
    }
}
