package home_automation;

import java.util.List;

public class Rooms {
	private String roomType;
	private List<Devices> devices;

	public Rooms() {
		// TODO Auto-generated constructor stub
	}

	public Rooms(String roomType, List<Devices> devices) {

		this.roomType = roomType;
		this.devices = devices;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public List<Devices> getDevices() {
		return devices;
	}

	public void setDevices(List<Devices> devices) {
		this.devices = devices;
	}

	public void addRoom(String roomType) {
		this.roomType = roomType;
	}

	public void addDevice(String deviceName) {

		devices.add(new Devices(deviceName));
	}

	public void displayStatusOfAllDevices() {
		System.out.println(roomType + "===>");
		for (Devices Device : devices) {
			System.out.println(Device.getDeviceName() + "==>" + (Device.getisDeviceOn() ? "on" : "off"));

		}
	}

	public void displaystatus(String SingleDevice) {

		for (Devices Device : devices) {
			if (SingleDevice.equals(Device.getDeviceName()))
				System.out.println(Device.getDeviceName() + "==>" + (Device.getisDeviceOn() ? "on" : "off"));

		}
	}

	public void changeStatus(String deviceStatus) {
		boolean flag = false;
		Devices device = new Devices();
		for (Devices Device : devices) {
			device = Device;
			if (deviceStatus.equals(Device.getDeviceName())) {
				flag = true;
				break;
			}
		}
		if (flag) {
			if (device.getisDeviceOn()) {
				System.out.println("previous status : " + (device.getisDeviceOn() ? "on" : "off"));
				device.deviceOff();
				System.out.println("current status : " + (device.getisDeviceOn() ? "on" : "off"));

			} else {
				System.out.println("previous status : " + (device.getisDeviceOn() ? "on" : "off"));
				device.deviceOn();
				System.out.println("current status : " + (device.getisDeviceOn() ? "on" : "off"));

			}
		}

	}

	public void calTime() {
		for (Devices Device : devices) {

			System.out.println(Device.getDeviceName() + "==>" + (Device.getisDeviceOn() ? "on" : "off"));
			Device.deviceOnTime();
		}
	}

}
