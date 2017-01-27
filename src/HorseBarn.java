
public class HorseBarn {

	Horse[] a = new Horse[7];

	public static HorseBarn createTestBarn() {

		HorseBarn b = new HorseBarn();
		b.a[0] = new Horse("Trigger", 1340);
		b.a[1] = null;
		b.a[2] = new Horse("Silver", 1210);
		b.a[3] = new Horse("Lady", 1575);
		b.a[4] = null;
		b.a[5] = new Horse("Patches", 1350);
		b.a[6] = new Horse("Duke", 1410);

		return b;
	}

	public int findHorseSpace(String string) {
		for (int i = 0; i < a.length; i++) {

			if (a[i] != null) {
				if (string.equals(a[i].getName())) {

					return i;
				}
			}

		}
		return -1;
	}

	public Horse[] getSpaces() {

		return a;
	}

	public void consolidate() {
		int goodVar = 0;
		int nullVar = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] != null) {
				goodVar = i;
				// middleVar = goodVar;

			}

			if (a[i] == null) {

				if (a[nullVar] != null) {
					nullVar = i;
				}
			}

			if (goodVar > nullVar) {

				a[nullVar] = a[goodVar];

				a[goodVar] = null;

				nullVar++;

			}

		}

	}

}
