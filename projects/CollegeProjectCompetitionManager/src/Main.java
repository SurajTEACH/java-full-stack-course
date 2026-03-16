package projects.CollegeProjectCompetitionManager.src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CompetitionManager manager = new CompetitionManager();

        int N = sc.nextInt();
        sc.nextLine(); // buffer clear

        for (int i = 0; i < N; i++) {

            String line = sc.nextLine(); // full command line
            String parts[] = line.split(" ");

            String command = parts[0];

            if (command.equals("REGISTER")) {

                String teamId = parts[1];
                String section = parts[2];
                String domain = parts[3];
                String projectName = parts[4];
                int projectScore = Integer.parseInt(parts[5]);

                manager.registerTeam(teamId, section, domain, projectName, projectScore);
            }

            else if (command.equals("REVISE")) {

                String teamId = parts[1];
                int projectScore = Integer.parseInt(parts[2]);

                manager.reviseSocre(teamId, projectScore);
            }

            else if (command.equals("FILTERDOMAIN")) {

                String domain = parts[1];
                manager.filterByDomain(domain);
            }

            else if (command.equals("QUALIFY")) {

                int cutoff = Integer.parseInt(parts[1]);
                manager.qualifyTeams(cutoff);
            }
        }

        sc.close();
    }
}