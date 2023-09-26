package definingOfClasses;

import java.util.ArrayList;

public class Call {

	private String date;
	private String startTime;
	private int durationMinutesTime;
	private static ArrayList<Call> calls = new ArrayList<Call>();

	public Call() {

	}

	public Call(String date, String startTime, int durationMinutesTime) {
		this.date = validateDate(date);
		this.startTime = validateTime(startTime);
		this.durationMinutesTime = durationMinutesTime;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public int getDurationMinutesTime() {
		return durationMinutesTime;
	}

	public void setDurationMinutesTime(int durationMinutesTime) {
		this.durationMinutesTime = durationMinutesTime;
	}

	public String validateTime(String time) {
		String[] extracted = time.split("[:]");
		int hours = Integer.parseInt(extracted[0]);
		int minutes = Integer.parseInt(extracted[1]);

		boolean validHours = (hours > 0) && (hours <= 23);
		boolean validMinutes = (minutes > 0) && (minutes <= 59);
		boolean isValidTime = validHours && validMinutes;
		if (isValidTime) {
			if (hours > 0 && hours <= 9 && minutes > 0 && minutes <= 9) {
				return String.format("%02d:%02d", hours, minutes);
			} else if (hours > 0 && hours <= 9 && minutes > 9) {
				return String.format("%02d:%d", hours, minutes);
			} else {
				return String.format("%d:%02d", hours, minutes);
			}

		} else {
			return "\"INCORECT TIME!\"";
		}
	}

	public String validateDate(String date) {
		String[] extracted = date.split("[.:-]+");
		int day = Integer.parseInt(extracted[0]);
		int month = Integer.parseInt(extracted[1]);
		int year = Integer.parseInt(extracted[2]);

		boolean isValidMonth = (month > 0) && (month <= 12);
		boolean isValidDay = false;

		if (isValidMonth) {
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				isValidDay = (day > 0) && (day <= 31);
			} else {
				isValidDay = (day > 0) && (day <= 30);
			}
		}

		if (isValidDay && isValidMonth) {
			if (day > 0 && day <= 9 && month > 0 && month <= 9) {
				return String.format("%02d.%02d.%d", day, month, year);
			} else if (day > 0 && day <= 9 && month > 9) {
				return String.format("%02d.%d.%d", day, month, year);
			} else {
				return String.format("%d.%02d.%d", day, month, year);
			}
		} else {
			return "\"INCORECT DATE!\"";
		}

	}

	public static void callHistory(Call call) {
		calls.add(call);
	}

	public static double sumOfAllCalls(double costPerMinute) {
		double totalCost = 0;
		for (Call call : calls) {
			double duration = call.getDurationMinutesTime();
			double costForOneCall = duration * costPerMinute;
			totalCost += costForOneCall;
		}
		return totalCost;
	}

	public static void removeLongestCall(ArrayList<Call> calls) {
		if (!calls.isEmpty()) {
			Call longestCall = calls.get(0);

			for (Call call : calls) {
				if (call.getDurationMinutesTime() > longestCall.getDurationMinutesTime()) {
					longestCall = call;
				}
			}

			calls.remove(longestCall);
		}
	}

	@Override
	public String toString() {
		return "New Call:\non " + date + "\nstarted at: " + startTime + "\nduration time in minutes: "
				+ durationMinutesTime + "m";
	}

}
