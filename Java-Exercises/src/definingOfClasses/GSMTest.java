package definingOfClasses;

public class GSMTest {

	public static void main(String[] args) {

		GSM[] phone = new GSM[2];

		Battery battery = new Battery();
		battery.setModel("SOC");
		battery.setHoursOfTalks(6);
		battery.setIdelTime(24);

		Display display = new Display(5.5, "black");

		phone[0] = new GSM("Iphone 14 pro Max", "Apple", 2000, "Steve Jobs", battery, display);
		phone[1] = new GSM("Samsung Z Fold", "Samsung", 1700, "Samsung Group");
		phone[1].setBatteryCharacteristics(new Battery("SOD", 40, 12));
		phone[1].setDisplayCharacteristics(new Display(6.8, "brown"));

		for (int i = 0; i < phone.length; i++) {
			System.out.println(phone[i]);
			if (i == phone.length - 1) {
				break;
			}
			System.out.println("----------------------------------------------------------------");
		}
		
		System.out.println(GSM.getInfoNokia());

	}

}
