package finalProject;

public class RobotMatchInstance {
	public int teamNumber;
	public int matchNumber;
	public int AMove;
	public int AInner;
	public int AOuter;
	public int ALow;
	public int AMissed;
	public int TInner;
	public int TOuter;
	public int TLow;
	public int TMissed;
	public int Rot;
	public int Pos;
	public int attemptClimb;
	public int climb;
	public int climbTik;
	public int defTik;
	public int WoF;
	public int Penalties;
	public int Defence;
	public int OOF;

	public RobotMatchInstance() {

	}

	public RobotMatchInstance(int teamNumber1, int matchNumber1) {
		teamNumber = teamNumber1;
		matchNumber = matchNumber1;
	}

	public RobotMatchInstance(int teamNumber1, int matchNumber1, int AMove1, int AInner1, int AOuter1, int ALow1,
			int AMissed1, int TInner1, int TOuter1, int TLow1, int TMissed1, int Rot1, int Pos1, int attemptClimb1,
			int climb1, int climbTik1, int defTik1, int WoF1, int Penalties1, int Defence1, int OOF1) {

		teamNumber = teamNumber1;
		matchNumber = matchNumber1;
		AMove = AMove1;
		AInner = AInner1;
		AOuter = AOuter1;
		ALow = ALow1;
		AMissed = AMissed1;
		TInner = TInner1;
		TOuter = TOuter1;
		TLow = TLow1;
		TMissed = TMissed1;
		Rot = Rot1;
		Pos = Pos1;
		attemptClimb = attemptClimb1;
		climb = climb1;
		climbTik = climbTik1;
		defTik = defTik1;
		WoF = WoF1;
		Penalties = Penalties1;
		Defence = Defence1;
		OOF = OOF1;
	}
	
	public String getFullReport() {
		return "Team " + teamNumber + ":\t" + AMove + "\t" + AInner + "\t" + AOuter + "\t" + ALow + "\t" + AMissed + "\t" + TInner + "\t" + TOuter + "\t" + TLow + "\t" + TMissed + "\t" + Rot + "\t" + Pos + "\t" + attemptClimb + "\t" + climb + "\t" + climbTik + "\t" + defTik + "\t" + WoF + "\t" + Penalties + "\t" + Defence + "\t" + OOF;
	}

	public String toString() {
		return "This was match " + matchNumber + ", where team " + teamNumber + " got " + AMove + "AMove.";
	}

	public String fullRobotOutput() {
		return "Match " + matchNumber + ":\t" + AMove + "\t" + AInner + "\t" + AOuter + "\t" + ALow + "\t" + AMissed + "\t" + TInner + "\t" + TOuter + "\t" + TLow + "\t" + TMissed + "\t" + Rot + "\t" + Pos + "\t" + attemptClimb + "\t" + climb + "\t" + climbTik + "\t" + defTik + "\t" + WoF + "\t" + Penalties + "\t" + Defence + "\t" + OOF;
	}
}
