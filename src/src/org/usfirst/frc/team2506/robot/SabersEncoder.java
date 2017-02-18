package org.usfirst.frc.team2506.robot;
import edu.wpi.first.wpilibj.Encoder;


public class SabersEncoder  {
	
	public static final double SHAFTDEGREES = .001;
	public static final double PULSEDEGREES = 360/1024;
	public static final double WHEELDEGREES = .052;
	
	private Encoder encoder;
	
		public double getRate(){
				double getRate = encoder.getRate();
				double RPM = (getRate*60);
				
				return RPM;
			}
		public double getDistanceShaft(){
			double ShaftDegreesTraveled = encoder.getDistance();
			double ShaftDistance = ShaftDegreesTraveled * SHAFTDEGREES;
			
			
			return ShaftDistance;
		}
		public double getDistanceWheel(){
			double WheelDegreesTraveled = encoder.getDistance();
			double WheelDistance = WheelDegreesTraveled * WHEELDEGREES;
			
			return WheelDistance;
		}
		
		public SabersEncoder() {
			
			encoder = new Encoder(0,1);
			encoder.setDistancePerPulse(PULSEDEGREES);
			
			
		}
		
		
	
}
