import java.util.ArrayList;
interface person {
    public String getName();
    public String setName();
    public String getAge();
    public String setAge();
}
interface job {
    public String getPosition();
    public String setPosition();
    public int getEmpiD();
    public int setEmpID();
}
class Employee {
    private String Name;
    private String Position;
    private int EmpID;
    private ArrayList<Project> Projects;

    public Employee(String Name, String Position, int EmpID){
        this.Name = Name;
        this.Position = Position;
        this.EmpID = EmpID;
        this.Projects = new ArrayList<>();
    }

    public void addProject(Project Project) {
        this.Projects.add(Project);
    }

    public void getEmployeeDetails() {
        System.out.println("Name: " + this.Name);
        System.out.println("Position: " + this.Position);
        System.out.println("EmpID: " + this.EmpID);
        System.out.println("Projects:");

        for (Project project : this.Projects) {
            System.out.println(project.getProjectName() + project.getProjectDescription());
        }
    }
}
class Project {
    private String projectName;
    private String projectDescription;

    public Project(String projectName, String projectDescription) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public String getProjectDescription() {
        return this.projectDescription;
    }
}

public class fin {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tom", "UX/UI", 0001);
        employee1.addProject(new Project("Web A", "Developing a web application"));
        employee1.addProject(new Project("Mobile app A", "Developing a mobile app"));

        Employee employee2 = new Employee("Tim", "FrontEnd", 0002);
        employee2.addProject(new Project("Web A", "Developing a web application"));

        employee1.getEmployeeDetails();
        employee2.getEmployeeDetails();
    }
}