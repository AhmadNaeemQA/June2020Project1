package solid_goldilocks;

public class instances {

	public instances() {

	}

	public void check() {
		createGoldilock();
		createSeats();
		table.getAll();

		return;
	}

	public void createGoldilock() {
		goldilock goldilock = new goldilock(100, 80);
	}

	public void createSeats() {
		seat s1 = new seat(200, 100);
		seat s2 = new seat(50, 30);
		seat s3 = new seat(150, 50);

	}
}
