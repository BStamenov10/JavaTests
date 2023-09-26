package definingOfClasses;

import java.util.ArrayList;

public class CallTest {

	public static void main(String[] args) {

		ArrayList<Call> calls = new ArrayList<Call>();

		Call firstCall = new Call("12.4.2023", "21:51", 23);
		calls.add(firstCall);
		Call secondCall = new Call("4.2.2024", "22:07", 2);
		calls.add(secondCall);
		Call thirdCall = new Call("32.9.2023", "31:50", 6);
		calls.add(thirdCall);
		
		for (Call call : calls) {
			Call.callHistory(call);
			System.out.println(call);
			
			if (call != calls.get(calls.size() - 1)) {
				System.out.println("--------------------------------");
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.printf("The sum of all calls is: %.2f leva%n%n",  Call.sumOfAllCalls(0.37));

		Call.removeLongestCall(calls);
		
		for (Call call : calls) {
			System.out.println(call);
			if (call != calls.get(calls.size() - 1)) {
				System.out.println("--------------------------------");
			}
		}
		
		
		
	}

}
