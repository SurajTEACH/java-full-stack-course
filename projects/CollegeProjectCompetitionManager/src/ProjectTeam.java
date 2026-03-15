package projects.CollegeProjectCompetitionManager.src;

public class ProjectTeam {
    String teamId;
    String section;
    String domain;
    String projectName;
    int projectScore;

    // constructor  value ko initialize karta hai
    ProjectTeam(String teamId, String section, String domain, String projectName, int projectScore) {
        this.teamId = teamId;
        this.section = section;
        this.domain = domain;
        this.projectName = projectName;
        this.projectScore = projectScore;
    }
}
