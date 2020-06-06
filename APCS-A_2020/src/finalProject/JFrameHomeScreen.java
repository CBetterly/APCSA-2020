package finalProject;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

//import golfApp.HSGolfLogin;
//import golfApp.User;
//import golfApp.UserList;

public class JFrameHomeScreen extends javax.swing.JFrame {

	private static final long serialVersionUID = 7323709150920190108L;
	private javax.swing.JTextArea textArea;
	private javax.swing.JButton searchTeamBtn;
	private javax.swing.JButton searchMatchBtn;
	private javax.swing.JLabel loginMessageLbl;
	private javax.swing.JPanel loginPanel;
	private javax.swing.JLabel mainTitleLbl;
	private javax.swing.JLabel userNameLbl;
	private javax.swing.JTextField userNameTxtFld;
	private Scanner userInfo = new Scanner("");
	private static final int WIDTH = 1280;
	private static final int HEIGHT = 720;

	// private UserList users;
	private ArrayList<User> userList;
	private ArrayList<Match> matchList;
	private ArrayList<Robot> robotList;

	/**
	 * Creates new form JFrameGUI
	 */
	public JFrameHomeScreen() throws FileNotFoundException {
		robotList = new ArrayList<Robot>();

		String csvFile = "src/finalProject/DMR Database - I want slop (All Robots, CSV Format).csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		// Help reading CSV adapted from this site:
		// https://mkyong.com/java/how-to-read-and-parse-csv-file-in-java/

		// Creates the list of Robots
		try {
			br = new BufferedReader(new FileReader(csvFile));
			int count = 0;
			while ((line = br.readLine()) != null) {
				// use comma as separator
				String[] lineData = line.split(cvsSplitBy);
				if (count > 0) {
					robotList.add(new Robot(Integer.parseInt(lineData[0])));
					System.out.println("Robot " + lineData[0] + " loaded from .csv file");
				}
				count++;
			}
			System.out.println("All robots successfully loaded from .csv file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		// Creates the list of Matches
		matchList = new ArrayList<Match>();

		String csvFile2 = "src/finalProject/DMR Database - Raw Data (CSV Format).csv";
		BufferedReader br2 = null;
		String line2 = "";

		try {
			br2 = new BufferedReader(new FileReader(csvFile2));
			int count = -3;
			while ((line2 = br2.readLine()) != null) {
				// use comma as separator
				String[] lineData2 = line2.split(cvsSplitBy);
				if (count >= 0 && count <= 521) {
					// if it is time to create a new match
					if (count % 6 == 0) {
						matchList.add(new Match(Integer.parseInt(lineData2[0])));
					}
					// then as long as it's not null, we update the match we are working on with
					// this new RobotMatchInstance
					if (lineData2.length == 21 && !lineData2[2].equals("")) {
						// System.out.println("We here and we good. Size is " + lineData2.length);
						// System.out.println(new RobotMatchInstance(Integer.parseInt(lineData2[1]),
						// Integer.parseInt(lineData2[0]), Integer.parseInt(lineData2[2]),
						// Integer.parseInt(lineData2[3]), Integer.parseInt(lineData2[4]),
						// Integer.parseInt(lineData2[5]), Integer.parseInt(lineData2[6]),
						// Integer.parseInt(lineData2[7]), Integer.parseInt(lineData2[8]),
						// Integer.parseInt(lineData2[9]), Integer.parseInt(lineData2[10]),
						// Integer.parseInt(lineData2[11]), Integer.parseInt(lineData2[12]),
						// Integer.parseInt(lineData2[13]), Integer.parseInt(lineData2[14]),
						// Integer.parseInt(lineData2[15]), Integer.parseInt(lineData2[16]),
						// Integer.parseInt(lineData2[17]), Integer.parseInt(lineData2[18]),
						// Integer.parseInt(lineData2[19]), Integer.parseInt(lineData2[20])));
						matchList.get(matchList.size() - 1).updateMatchInstance(count % 6,
								new RobotMatchInstance(Integer.parseInt(lineData2[1]), Integer.parseInt(lineData2[0]),
										Integer.parseInt(lineData2[2]), Integer.parseInt(lineData2[3]),
										Integer.parseInt(lineData2[4]), Integer.parseInt(lineData2[5]),
										Integer.parseInt(lineData2[6]), Integer.parseInt(lineData2[7]),
										Integer.parseInt(lineData2[8]), Integer.parseInt(lineData2[9]),
										Integer.parseInt(lineData2[10]), Integer.parseInt(lineData2[11]),
										Integer.parseInt(lineData2[12]), Integer.parseInt(lineData2[13]),
										Integer.parseInt(lineData2[14]), Integer.parseInt(lineData2[15]),
										Integer.parseInt(lineData2[16]), Integer.parseInt(lineData2[17]),
										Integer.parseInt(lineData2[18]), Integer.parseInt(lineData2[19]),
										Integer.parseInt(lineData2[20])));

						// robotsTemp[count%6] =
						// matchList.get(matchList.size()-1)

						// matchList.get(matchList.size()-1).setTeam(count%6,
						// Integer.parseInt(lineData2[1]));
					} else if (lineData2.length == 2 || lineData2.length == 21 && lineData2[2].equals("")) {
						// System.out.println("NOTICE: Data Missing for this match");

						matchList.get(matchList.size() - 1).updateMatchInstance(count % 6,
								new RobotMatchInstance(Integer.parseInt(lineData2[1]), Integer.parseInt(lineData2[0])));

					}
					// Don't bother even adding a match if there is no team number
				}
				count++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br2 != null) {
				try {
					br2.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		// for (Match mat : matchList) {
		// System.out.println(mat);
		// }

		initComponents();
		userList = new ArrayList<User>();
		Scanner readUsers = new Scanner(new File("src/finalProject/users.dat"));
		while (readUsers.hasNext()) {
			String str = readUsers.nextLine();
			userInfo = new Scanner(str);
			// System.out.println(str);
			if (userInfo.hasNext()) {
				User newUser = new User(userInfo.next(), userInfo.next());
				userList.add(newUser);
			}
		}
		readUsers.close();

		// users = new UserList();
		// userList = users.getUsers();
		loginMessageLbl.setVisible(true);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// @SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		loginPanel = new javax.swing.JPanel();
		mainTitleLbl = new javax.swing.JLabel();
		userNameLbl = new javax.swing.JLabel();
		userNameTxtFld = new javax.swing.JTextField();
		searchTeamBtn = new javax.swing.JButton();
		searchMatchBtn = new javax.swing.JButton();
		loginMessageLbl = new javax.swing.JLabel();
		textArea = new javax.swing.JTextArea();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		loginPanel.setBackground(new java.awt.Color(27, 20, 100));

		mainTitleLbl.setForeground(Color.WHITE);
		mainTitleLbl.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
		mainTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		mainTitleLbl.setText("FRC 3128 Database Home");
		mainTitleLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);

		userNameLbl.setForeground(Color.WHITE);
		userNameLbl.setBackground(new java.awt.Color(27, 20, 100));
		userNameLbl.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
		userNameLbl.setText("Search");

		userNameTxtFld.setCaretColor(new java.awt.Color(0, 104, 165));
		userNameTxtFld.setForeground(Color.WHITE);
		userNameTxtFld.setFont(new java.awt.Font("Open Sans", 0, userNameTxtFld.getFont().getSize()));
		userNameTxtFld.setBackground(new java.awt.Color(7, 38, 130));

		searchTeamBtn.setForeground(Color.WHITE);
		searchTeamBtn.setBackground(new java.awt.Color(27, 20, 100));
		searchTeamBtn.setText("Search Team");
		searchTeamBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				searchTeamBtnActionPerformed(evt);
			}
		});

		searchMatchBtn.setForeground(Color.WHITE);
		searchMatchBtn.setBackground(new java.awt.Color(27, 20, 100));
		searchMatchBtn.setText("Search Match");
		searchMatchBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				searchMatchBtnActionPerformed(evt);
			}
		});

		loginMessageLbl.setFont(new java.awt.Font("Open Sans", 0, loginMessageLbl.getFont().getSize()));
		loginMessageLbl.setForeground(Color.WHITE);
		loginMessageLbl.setText("");

		// creates new GroupLayout called loginPanelLayout
		javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
		// sets the Layout to itself
		loginPanel.setLayout(loginPanelLayout);
		// sets the horizontal group to itself.createParallelGroup from itself as a
		// sequential group with gaps from itself as a parallel group from itself as a
		// sequential group.

		// This sequential group has some components added:
		// MainTitleLbl
		// a sequential group that has a gap and is a sequential group of the
		// userNameLbl and a gap and the userNameTxtFld
		loginPanelLayout.setHorizontalGroup(loginPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(loginPanelLayout.createSequentialGroup().addContainerGap().addGroup(loginPanelLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(loginPanelLayout.createSequentialGroup()
								.addComponent(mainTitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, WIDTH - 40,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
								.addGap(0, 0, Short.MAX_VALUE)
								.addGroup(loginPanelLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												loginPanelLayout.createSequentialGroup().addGroup(loginPanelLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(loginPanelLayout.createSequentialGroup()
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
														.addGroup(loginPanelLayout.createSequentialGroup()
																.addComponent(userNameLbl)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(userNameTxtFld,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 300,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(200, 200, 400))
														.addGroup(loginPanelLayout.createSequentialGroup()
																.addGap(34, 34, 34).addComponent(searchTeamBtn)
																.addGap(34, 34, 34).addComponent(searchMatchBtn)))
														.addGap(172, 172, 172))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												loginPanelLayout.createSequentialGroup().addComponent(loginMessageLbl)
														.addComponent(textArea).addGap(134, 134, 500)))))));
		loginPanelLayout.setVerticalGroup(loginPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(loginPanelLayout.createSequentialGroup().addComponent(mainTitleLbl).addGap(18, 50, 500)
						.addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(userNameLbl).addComponent(userNameTxtFld,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE))
						.addGap(18, 18, 18)
						.addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(searchTeamBtn).addComponent(searchMatchBtn,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))/*
																				 * .addComponent(searchTeamBtn).
																				 * addComponent(searchMatchBtn)
																				 */
						.addComponent(loginMessageLbl).addComponent(textArea).addGap(0, 500, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		setSize(WIDTH, HEIGHT);
		// pack();
	}// </editor-fold>//GEN-END:initComponents

	private void searchTeamBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchTeamBtnActionPerformed
		boolean success = false;
		int robNum = Integer.parseInt(userNameTxtFld.getText().trim());
		ArrayList<RobotMatchInstance> thanos = new ArrayList<RobotMatchInstance>();
		for (Match mat : matchList) {
			for (RobotMatchInstance rmi : mat.getRobotMatchInstances()) {
				if (rmi.teamNumber == robNum) {
					thanos.add(rmi);
				}
			}
		}

		if (thanos.size() != 0) {
			System.out.println("——————————————————————————\nFull Report on Robot " + robNum + ":");
			System.out.println(
					"\t\tAUTO\t\t\t\t\tTELEOP\t\t\t\t\t\tENDGAME\t\t\tOTHER\n\t\tMove\tInner\tOuter\tLow\tMiss\tInner\tOuter\tLower\tMiss\tRot\tPos\tAttmt\tClimb\tClTik\tDefTik\tWOF\tPenalT\tDef\tOOF");
			for (RobotMatchInstance rmi : thanos) {
				success = true;
				System.out.println(rmi.fullRobotOutput());
			}
		}

		if (!success) {
			loginMessageLbl.setText("Sorry, that team number is not in our records.");
		}

	}

	private void searchMatchBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchTeamBtnActionPerformed

		boolean success = false;
		for (Match mat : matchList) {
			if (mat.getMatchNumber() == Integer.parseInt(userNameTxtFld.getText().trim())) {
				success = true;
				System.out.println(mat.fullOutput());
			}
		}

		if (!success) {
			loginMessageLbl.setText("That match number is not in our records; try entering a number between 1 and 75.");
		}

		// for (User u : userList) {
		// if (u.getUserName().equals(userNameTxtFld.getText())) {
		// loginMessageLbl.setText("Welcome " + u.getUserName() + "! Please wait a
		// moment while we log you in...");
		// loginMessageLbl.setVisible(true);
		//
		// Timer timer = new Timer();
		//
		// timer.schedule(new TimerTask() {
		//
		// @Override
		// public void run() {
		// dispose();
		//
		// }
		//
		// }, 1000);
		//
		// break;
		// } else {
		// System.out.println("Login failed");
		// loginMessageLbl.setText("Invalid username or password");
		// loginMessageLbl.setVisible(true);
		// super.repaint();
		// }
		// }
	}
}
