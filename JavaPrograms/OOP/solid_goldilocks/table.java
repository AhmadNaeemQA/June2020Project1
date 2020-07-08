package solid_goldilocks;

import java.util.ArrayList;
import java.util.List;

public class table {
	private static List<seat> table = new ArrayList<seat>();

	public static void add(seat newSeat) {
		table.add(newSeat);
	}

	public static void getAll() {
		for (int i = 0; i < table.size(); i++) {
			table.get(i).toString();
		}
	}
}
