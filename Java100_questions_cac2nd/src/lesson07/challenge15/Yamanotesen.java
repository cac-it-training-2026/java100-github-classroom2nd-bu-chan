package lesson07.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {

		System.out.println("※※※ 山手線ゲーム ※※※");
		System.out.println("      ゲームスタート！    ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] stations = { "a", "b", "c", "d", "e", "f" };

		String[] input_stations = new String[stations.length];

		boolean flag = false;
		boolean[] rest = new boolean[stations.length];

		for (int i = 0; i < stations.length / 2; i++) {
			flag = false;
			input_stations[i] = br.readLine();

			for (int j = 0; j < stations.length; j++) {
				if (input_stations[i].equals(stations[j]) && rest[j] == false) {
					flag = true;
					rest[j] = true;
					;
					break;
				}
			}

			if (!flag) {
				break;
			}

			//コンピュータ
			boolean com = false;
			while (!com) {
				int num = (int) (Math.random() * 10) % input_stations.length;

				if (!rest[num]) {
					System.out.println(stations[num]);
					rest[num] = true;
					com = true;
				}
			}

		}

		if (flag) {
			System.out.println("あなたの勝ちです！");
		} else {
			System.out.println("あなたの負けです！");
		}

	}

}