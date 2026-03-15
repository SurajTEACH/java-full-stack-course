package projects.CollegeProjectCompetitionManager.src;

import java.util.*;

public class CompetitionManager {
    
     ArrayList<ProjectTeam> teams = new ArrayList<>();

     // register team

     void registerTeam(String teamId, String section, String domain, String projectName, int projectScore) {
       
         for (int i = 0; i < teams.size(); i++) {
            ProjectTeam t = teams.get(i);
            
            if (t.teamId.equals(teamId)) {
                System.out.println("teamId is already present");
                return; 
            }
          }
          
          ProjectTeam team = new ProjectTeam(teamId, section, domain, projectName, projectScore);

          teams.add(team);
         
     }

     // Revise Score

        void reviseSocre(String temaId, int score){
          for(int i=0;i<teams.size();i++){
             ProjectTeam t = teams.get(i);

             if(t.teamId.equals(temaId)){
                t.projectScore = score;
                System.out.println("Revised score :-" + temaId + " "+ score);
                return;
             }
          }

          System.out.println("......team is not available.........");
        }

        // filter by domain

        void filterByDomain(String domain){
            boolean present = false;

            for(int i=0;i<teams.size();i++){
                ProjectTeam t = teams.get(i);
                if(t.domain.equals(domain)){
                    System.out.println(t.teamId + " " + t.section + " " + t.domain + " " + t.projectName + " " + t.projectScore);
                    present = true;
                }
            }

            if(!present){
                System.out.println("Team is not available for the domain: " + domain);
            }
        
        }

        // qualify teams

        void qualifyTeams(int cutoff){
           boolean present = false;

           for(int i=0;i<teams.size();i++){
               ProjectTeam t = teams.get(i);
               if(t.projectScore >= cutoff){
                   System.out.println(t.teamId + " " + t.section + " " + t.domain + " " + t.projectName + " " + t.projectScore);
                   present = true;
               }
           }

           if(!present){
               System.out.println("No team qualified plase try again");
           }
        }
    
}
