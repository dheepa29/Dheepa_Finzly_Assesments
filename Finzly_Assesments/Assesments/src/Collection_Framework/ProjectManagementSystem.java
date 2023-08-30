import java.util.*;

class TeamMember {
    private String name;
    private String role;

    public TeamMember(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Role: " + role;
    }
}

class Project {
    private String projectName;
    private String projectDescription;
    private Set<TeamMember> teamMembers;

    public Project(String projectName, String projectDescription) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.teamMembers = new HashSet<>();
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public Set<TeamMember> getTeamMembers() {
        return teamMembers;
    }

    public void addTeamMember(TeamMember teamMember) {
        teamMembers.add(teamMember);
    }

    @Override
    public String toString() {
        StringBuilder teamMemberNames = new StringBuilder();
        for (TeamMember teamMember : teamMembers) {
            teamMemberNames.append("\n - ").append(teamMember.getName());
        }
        return "Project Name: " + projectName +
                "\nDescription: " + projectDescription +
                "\nTeam Members:" + teamMemberNames;
    }
}

public class ProjectManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Project> projects = new HashMap<>();

        while (true) {
            System.out.println("\nProject Management System");
            System.out.println("1. Add Project");
            System.out.println("2. Assign Team Member");
            System.out.println("3. View Project Details");
            System.out.println("4. List All Projects");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Project Name: ");
                    String projectName = scanner.nextLine();
                    System.out.print("Enter Project Description: ");
                    String projectDescription = scanner.nextLine();
                    projects.put(projectName, new Project(projectName, projectDescription));
                    System.out.println("Project added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Project Name: ");
                    String assignProjectName = scanner.nextLine();
                    if (projects.containsKey(assignProjectName)) {
                        System.out.print("Enter Team Member Name: ");
                        String teamMemberName = scanner.nextLine();
                        System.out.print("Enter Team Member Role: ");
                        String teamMemberRole = scanner.nextLine();
                        TeamMember teamMember = new TeamMember(teamMemberName, teamMemberRole);
                        projects.get(assignProjectName).addTeamMember(teamMember);
                        System.out.println("Team member assigned successfully.");
                    } else {
                        System.out.println("Project not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Project Name: ");
                    String viewProjectName = scanner.nextLine();
                    if (projects.containsKey(viewProjectName)) {
                        System.out.println("Project Details: " + projects.get(viewProjectName));
                    } else {
                        System.out.println("Project not found.");
                    }
                    break;

                case 4:
                    System.out.println("List of Projects:");
                    for (Project project : projects.values()) {
                        System.out.println(project.getProjectName());
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
