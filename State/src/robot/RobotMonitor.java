package robot;

public class RobotMonitor {
	Robot robot;
	
	public RobotMonitor(Robot robot) {
		this.robot = robot;
	}
	
	public void report() {
		System.out.println("Team: " + robot.getTeam());
		System.out.println("Robot has " + robot.power + " actions left");
	}
}
