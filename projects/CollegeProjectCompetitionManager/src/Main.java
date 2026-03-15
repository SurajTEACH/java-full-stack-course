package projects.CollegeProjectCompetitionManager.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CompetitionManager manager = new CompetitionManager();
        
        System.out.println("Welcome to College Project Competition Manager");


        System.out.println("Enter the number of commands:");

        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            String commands = sc.nextLine();

            sc.nextLine();

            if(commands.equals("REGISTER")){
                System.out.println("Enter the team id:");
                String teamId = sc.next();

                System.out.println("Enter the section:");
                String section = sc.next();

                System.out.println("Enter the domain:");
                String domain = sc.next();

                System.out.println("Enter the project name:");
                String projectName = sc.next();

                System.out.println("Enter the project score:");
                int projectScore = sc.nextInt();

                manager.registerTeam(teamId, section, domain, projectName, projectScore);

            }
            else if(commands.equals("REVISE")){
                System.out.println("Enter the team id:");
                String teamId = sc.next();

                System.out.println("Enter the project score:");
                int projectScore = sc.nextInt();

                manager.reviseSocre(teamId, projectScore);
            }
            else if(commands.equals("FILTERDOMAIN")){
                System.out.println("Enter the domain:");
                String domain = sc.next();
                manager.filterByDomain(domain);
            }
            else if(commands.equals("QUALIFY")){
                System.out.println("Enter the cutoff value:");
                int cutoff = sc.nextInt();
                manager.qualifyTeams(cutoff);
            }
        }
    }
}
