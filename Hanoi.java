class DoHanoi {
	private void move(int discno, String from, String to) {
		System.out.printf("Move disc %d from %s to %s.\n", discno, from, to);
	}

	private void dohanoi(int discno, String from, String to, String work) {
		if (discno == 1) {
			move(discno, from, to);
		} else {
			dohanoi(discno - 1, from, work, to);
			move(discno, from, to);
			dohanoi(discno - 1, work, to, from);
		}
	}

	public DoHanoi(int discs) {
		dohanoi(discs, "from-pole", "to-pole", "work-pole");
	}
}

public class Hanoi {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.printf("Usage: Hanoi discs\n");
			System.exit(1);
		}

		int discs;
		try {
			discs = Integer.valueOf(args[0]);
		} catch (Exception e) {
			discs = 0;
		}

		if (discs < 1) {
			System.out.printf("Invalid value (%d).\n", discs);
			System.exit(1);
		}

		new DoHanoi(discs);
	}
}
