package lesson08.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Robot {
	int energy;
	String name;
	int water;

	/*
	 * 入力された材料の量と人数に応じて、
	 * 1人あたりの材料量を計算し、
	 * 作成可能な料理を判定して返す。
	 * */
	String makeEggDishes(int flourNum, int sugarNum, int eggNum, int butterNum, int pepor) {
		String menu;
		if (flourNum / pepor >= 170 && sugarNum / pepor >= 50 && eggNum / pepor >= 2 && butterNum / pepor >= 80) {
			menu = "クッキー";
		} else if (eggNum / pepor >= 2 && butterNum / pepor >= 5) {
			menu = "オムレツ";
		} else if (eggNum / pepor >= 1) {
			menu = "ゆで卵";
		} else {
			menu = null;
		}

		return menu;
	}
}

class ClearRobot {
	void clearTable(int[] ingredients) {
		for (int i = 0; i < ingredients.length; i++) {
			ingredients[i] = 0;
		}
	}
}

public class SuperRobot {

	public static void main(String[] args) throws IOException {

		System.out.println("Rさん：");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("小麦粉の量を入力してください（グラム）＞");
		String flourNumStr = br.readLine();
		int flourNum = Integer.parseInt(flourNumStr);

		System.out.print("\n砂糖の量を入力してください（グラム）＞");
		String sugarNumStr = br.readLine();
		int sugarNum = Integer.parseInt(sugarNumStr);

		System.out.print("\n卵の個数を入力してください＞");
		String eggNumStr = br.readLine();
		int eggNum = Integer.parseInt(eggNumStr);

		System.out.print("\nバターの量を入力してください（グラム）＞");
		String butterNumStr = br.readLine();
		int butterNum = Integer.parseInt(butterNumStr);

		System.out.print("\n人数を入力してください（人）＞");
		String pepor_str = br.readLine();
		int pepor = Integer.parseInt(pepor_str);

		String menu;
		System.out.println();
		Robot robot = new Robot();
		menu = robot.makeEggDishes(flourNum, sugarNum, eggNum, butterNum, pepor);
		if (menu == null) {
			System.out.println("何も作れません。");
		} else {
			System.out.println(menu + "が" + pepor + "分出来ました。");
		}

		System.out.println("\nあとかたづけをします。\n");
		int[] ingredients = new int[4];
		ingredients[0] = flourNum;
		ingredients[1] = sugarNum;
		ingredients[2] = eggNum;
		ingredients[3] = butterNum;

		ClearRobot clearRobot = new ClearRobot();
		clearRobot.clearTable(ingredients);

		System.out.println("小麦粉  ：" + ingredients[0] + "g");
		System.out.println("砂糖    ：" + ingredients[1] + "g");
		System.out.println("卵      ：" + ingredients[2] + "個");
		System.out.println("バター  ：" + ingredients[3] + "g");

		System.out.println("\nきれいになりました。");
	}

}