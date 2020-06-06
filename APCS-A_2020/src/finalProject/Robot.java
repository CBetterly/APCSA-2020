package finalProject;

import java.util.ArrayList;

public class Robot {
	private int teamNumber;
	private String teamName;
	// Robot data will be stored in Matches
	private ArrayList<Integer> matchesParticipatedIn;

	public Robot() {
		teamNumber = 9999;
		teamName = "Default Robot";
		matchesParticipatedIn = new ArrayList<Integer>();
	}

	public Robot(int num) {
		teamNumber = num;
		teamName = "Team " + teamNumber;
		matchesParticipatedIn = new ArrayList<Integer>();
	}

	public Robot(int num, String name) {
		teamNumber = num;
		teamName = name;
		matchesParticipatedIn = new ArrayList<Integer>();
	}

	public int getTeamNumber() {
		return teamNumber;
	}

	public void setTeamNumber(int teamNumber) {
		this.teamNumber = teamNumber;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public void addMatchParticipatedIn(int matchNum) {
		matchesParticipatedIn.add(matchNum);
	}
	
	public ArrayList<Integer> getMatchesParticipatedIn() {
		return matchesParticipatedIn;
	}

	public String toString() {
		return "Team " + teamNumber;
	}
}
