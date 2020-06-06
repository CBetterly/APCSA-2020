package finalProject;

public class Match {
	private int matchNumber;
	//Array format [r1,r2,r3,b1,b2,b3]
	private RobotMatchInstance[] RobotMatchInstances;
	private int redScore;
	private int blueScore;
	private int redPenalties;
	private int bluePenalties;
	
	public Match() {
		this(-1, new RobotMatchInstance[6]);
	}
	
	public Match(int matchNum) {
		setMatchNumber(matchNum);
		RobotMatchInstances = new RobotMatchInstance[6];
	}
	
	public Match(int matchNum, RobotMatchInstance[] teams1) {
		setMatchNumber(matchNum);
		setRobotMatchInstances(teams1);
		RobotMatchInstances = new RobotMatchInstance[6];
	}

	public int getMatchNumber() {
		return matchNumber;
	}

	public void setMatchNumber(int matchNumber) {
		this.matchNumber = matchNumber;
	}

	public RobotMatchInstance[] getRobotMatchInstances() {
		return RobotMatchInstances;
	}

	public void setRobotMatchInstances(RobotMatchInstance[] teams) {
		this.RobotMatchInstances = teams;
	}

	public int getRedScore() {
		return redScore;
	}

	public void setRedScore(int redScore) {
		this.redScore = redScore;
	}

	public int getBlueScore() {
		return blueScore;
	}

	public void setBlueScore(int blueScore) {
		this.blueScore = blueScore;
	}

	public int getRedPenalties() {
		return redPenalties;
	}

	public void setRedPenalties(int redPenalties) {
		this.redPenalties = redPenalties;
	}

	public int getBluePenalties() {
		return bluePenalties;
	}

	public void setBluePenalties(int bluePenalties) {
		this.bluePenalties = bluePenalties;
	}

	public void updateMatchInstance(int driverStation, RobotMatchInstance robotMatchInstance) {
		RobotMatchInstances[driverStation] = robotMatchInstance;
	}
	
	public String toString() {
		return "This is Match " + matchNumber;
	}

	public String fullOutput() {
		return "——————————————————————————\nFull Report on Match " + matchNumber + ":\n\t\t\tAUTO\t\t\t\t\tTELEOP\t\t\t\t\t\tENDGAME\t\t\tOTHER\n\t\t\tMove\tInner\tOuter\tLow\tMiss\tInner\tOuter\tLower\tMiss\tRot\tPos\tAttmt\tClimb\tClTik\tDefTik\tWOF\tPenalT\tDef\tOOF\nRed  1 - " +  RobotMatchInstances[0].getFullReport() + "\nRed  2 - " +  RobotMatchInstances[1].getFullReport() + "\nRed  3 - " +  RobotMatchInstances[2].getFullReport() + "\nBlue 1 - " +  RobotMatchInstances[3].getFullReport() + "\nBlue 2 - " +  RobotMatchInstances[4].getFullReport() + "\nBlue 3 - " +  RobotMatchInstances[5].getFullReport();
	}
}
