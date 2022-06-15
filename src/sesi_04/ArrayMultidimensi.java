package sesi_04;

public class ArrayMultidimensi {
	public static void main (String[] args) {
		String[][] framework = { { "Java", "kotlin" }, { "React", "ReactNative" }, { "PHP", "Laravel" } };

		for (int x = 0; x < framework.length; x++) {
			System.out.println("bahasa:" + framework[x][0]);
			System.out.println("bahasa:" + framework[x][1]);
		}
	}
}
