package lesson07.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {

		System.out.println("※※※ 山手線ゲーム ※※※");
		System.out.println("      ゲームスタート！    ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] stations = { "品川", "大崎", "五反田", "目黒",
				"恵比寿", "渋谷", "原宿", "代々木", "新宿", "新大久保", "高田馬場",
				"目白", "池袋", "大塚", "巣鴨", "駒込", "田端", "西日暮里", "日暮里",
				"鴬谷", "上野", "御徒町", "秋葉原", "神田", "東京", "有楽町", "新橋",
				"浜松町", "田町", "高輪ゲートウェイ" };

		String[] input_stations = new String[stations.length];

		boolean flag = false;

		for (int i = 0; i < stations.length; i++) {
			input_stations[i] = br.readLine();
			if (i > 0) {
				//正誤判定
				for (int j = 0; j < i; j++) {
					if (input_stations[i].equals(input_stations[j])) {
						flag = false;
						break;
					}
				}
				if (!flag) {
					break;
				}
			}

			//重複確認
			for (int j = 0; j < stations.length; j++) {
				if (input_stations[i].equals(stations[j])) {
					flag = true;
					break;
				}

			}
			if (flag == false) {
				break;
			}

		}

		if (flag) {
			System.out.println("あなたの勝ちです！");
		} else {
			System.out.println("あなたの負けです！");
		}

	}

}
