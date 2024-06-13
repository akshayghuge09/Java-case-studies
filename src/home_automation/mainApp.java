package home_automation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {

		List<Rooms> roomList = new ArrayList<>();

		Scanner s = new Scanner(System.in);

		System.out.println("house name is : ");
		String houseName = s.next();
		int ch;
		do {

			System.out.println("=================================================================");
			System.out.println("==============================MENU===============================");
			System.out.println("1. Add roomtype");
			System.out.println("2. Remove roomtype");
			System.out.println("3. Display rooms ");
			System.out.println("4. Control devices");
			System.out.println("5. All Device on time");
			System.out.println("6. Exist App");
			ch = s.nextInt();
			switch (ch) {
			case 1:

				String room;
				System.out.println("Enter the roomtype:  ");
				room = s.next();
				List<Devices> deviceList = new ArrayList<>();
				System.out.println("**************************************************************");
				System.out.println("===> menu<===");

				int deviceChoice;

				do {

					System.out.println("Add device");
					System.out.println("Enter Device name : ");
					String device1 = s.next();
					deviceList.add(new Devices(device1));

					System.out.println("press 1 for continue device list ");
					System.out.println("press 0 for exist device list ");
					deviceChoice = s.nextInt();
				} while (deviceChoice != 0);
				System.out.println("Added device in room :  ");
				for (Devices devices : deviceList) {
					System.out.println(devices.getDeviceName());

				}
				roomList.add(new Rooms(room, deviceList));
				break;

			case 2: {
				int count = 1;
				System.out.println("Displaying all the rooms in house");
				for (Rooms r : roomList) {

					System.out.println("position: " + count + "" + r.getRoomType());
					count++;

				}
				System.out.println("Enter the position of room which we want remove from app");
				int position = s.nextInt();
				roomList.remove(position - 1);
				break;
			}
			case 3: {
				System.out.println("Displaying all the rooms in house");
				for (Rooms r : roomList) {

					System.out.println(r.getRoomType());

				}
				break;
			}
			case 4:

				System.out.println("Displaying all the rooms in house");
				for (Rooms r : roomList) {

					System.out.println(r.getRoomType());

				}
				System.out.println("Enter the roomtype to control device ");
				String roomType1 = s.next();
				for (Rooms r : roomList) {
					if (roomType1.equals(r.getRoomType())) {
						r.displayStatusOfAllDevices();
						int choice;
						do {
							System.out.println("to you want to turn on/off the device\n 1. yes \n 2. no");
							choice = s.nextInt();
							if (choice == 1) {
								System.out.println("---------------------------------------------------");
								System.out.println("enter the device name that you want to turn on/off");
								System.out.println("---------------------------------------------------");
								String d = s.next();
								r.changeStatus(d);
								r.displaystatus(d);
							}
						} while (choice != 2);

					}

				}
				break;
			case 5:
				System.out.println("showing on time for all devices inn the room");
				for (Rooms r : roomList) {

					r.calTime();

				}
				break;
			default:
				System.out.println("thank you for using App");
			}
		} while (ch != 6);

	}

}
