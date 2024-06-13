package home_automation;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Devices implements controls {

	private String deviceName;
	private LocalTime startTime;
	private LocalTime stopTime;
	private int deviceTime;
	private boolean isDeviceOn;

	public Devices() {

	}

	public Devices(String deviceName) {

		this.deviceName = deviceName;

	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getStopTime() {
		return stopTime;
	}

	public void setStopTime(LocalTime stopTime) {
		this.stopTime = stopTime;
	}

	public int getDeviceTime() {
		return deviceTime;
	}

	public void setDeviceTime(int deviceTime) {
		this.deviceTime = deviceTime;
	}

	public boolean getisDeviceOn() {
		return isDeviceOn;
	}

	public void setDeviceOn(boolean isDeviceOn) {
		this.isDeviceOn = isDeviceOn;
	}

	@Override
	public void deviceOn() {
		this.isDeviceOn = true;
		this.startTime = LocalTime.now();
		this.stopTime = startTime;

	}

	@Override
	public void deviceOff() {
		this.isDeviceOn = false;
		this.stopTime = LocalTime.now();

	}

	@Override
	public void deviceOnTime() {
		if (startTime != null) {
			this.deviceTime = (int) startTime.until(stopTime, ChronoUnit.SECONDS);
		}
		System.out.println("Device on time was :" + deviceTime + "sec");
	}

}
