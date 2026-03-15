Question #2 
College Project Competition Manager

 Implement a college project competition manager that processes N commands. The system maintains an ordered List of project teams. Each team contains teamId (String), section (String), domain (String), projectName (String), and projectScore (int). The system must support registration, score revision, domain-based filtering display, and final qualification display. 

The commands to be supported: 




1. REGISTER
 Register the team only if teamId is not already present. 
2. REVISE
 If the team exists, update only the projectScore with the new value and print:REVISED
 If the team does not exist, print: team is not available
3. FILTERDOMAIN
 Display only the teams belonging to the given domain in the format: The relative order of teams must be preserved. if multiple teams belong to that , print all of them. If no team is present for that domain, print: Team is not available for the domain:
 4. QUALIFY
 Display all teams whose projectScore is greater than or equal to the cutoff value. 
If no team meets the cutoff condition, print: No team qualified
 The relative order of teams must be preserved.
 The QUALIFY command will always appear as the last command. 

The program must print output only for REVISE (if team not available), FILTERDOMAIN, and QUALIFY commands, in the order they appear.

Function Description
 In the provided code snippet, implement the provided class/methods according to the given constraints.


Class: 

 ProjectTeam: Represents a team with teamId, section, domain, projectName, and projectScore.
 CompetitionManager: This class maintains an ordered List of teams and performs operations based on the input commands.

 
Methods:

 int registerTeam(String teamId, String section, String domain, String projectName, int projectScore): Registers a team if not already present. 

int reviseScore(String teamId, int projectScore): Updates the projectScore if the team exists.

 List<ProjectTeam> filterByDomain(String domain): Returns teams of the given domain, preserving order. 

List <ProjectTeam> qualifyTeams(int cutoff): Returns teams qualifying the cutoff, preserving order. 
You can write your code in the space below the phrase “WRITE YOUR CODE HERE”. 

Input Format

 The first line contains an integer N, denoting the number of commands. 
The next N lines each contain one of the commands specified above. 

Sample Input

10 
REGISTER T1 A AI SmartBot 85
REGISTER T2 B Web ShopEase 72 
REGISTER T3 C Cloud DataSync 65 
REGISTER T4 D AI RoboX 90 
REVISE T2 78 REVISE T5 88 
FILTERDOMAIN AI FILTERDOMAIN Security 
REVISE T3 82 
QUALIFY 80

Output Format

The output contains the commands result according to the given conditions. 

Sample Output 

REVISED T2 78 
team is not available 
T1 A AI SmartBot 85 
T4 D AI RoboX 90 
Team is not available for the domain: Security 
REVISED T3 82 
T1 A AI SmartBot 85 
T3 C Cloud DataSync 82 
T4 D AI RoboX 90 


Explanation 

Four teams are successfully registered: T1 (AI), T2 (Web), T3 (Cloud), and T4 (AI). Since all teamIds are unique, none of the REGISTER operations are ignored. 

REVISE T2 updates the projectScore of T2 from 72 to 78 and prints the confirmation message. 

REVISE T5 attempts to update a non-existing team, so it prints "team is not available". 
FILTERDOMAIN AI displays all teams belonging to the AI domain. Both T1 and T4 belong to AI, so they are printed in their original insertion order. 

FILTERDOMAIN Security finds no matching teams, so it prints "Team is not available for the domain: Security". 

REVISE T3 updates its projectScore from 65 to 82 and prints the confirmation message. 

Finally, QUALIFY 80 displays all teams whose projectScore is greater than or equal to 80. After revisions, T1 (85), T3 (82), and T4 (90) meet the cutoff and are printed in insertion order.