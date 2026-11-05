package singletonExample;

public class HealthMonitoring {
	
	private static HealthMonitoring healthMonitoring;
	private int heartRate;
	
	// Private constructor
	private HealthMonitoring() {
		
	}
	
	public static HealthMonitoring getInstance() {
		
		if(healthMonitoring == null) {
			healthMonitoring = new HealthMonitoring();
		}
		return healthMonitoring;
	}
	
	// Setter Method
	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}
	
	// Setter Method
	public int getHeartRate() {
		return this.heartRate;
	}

}
