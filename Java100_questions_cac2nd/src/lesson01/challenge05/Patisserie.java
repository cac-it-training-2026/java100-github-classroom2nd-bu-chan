/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {

	public static final int SITO_VALUE = 250;
	public static final int SYOKO_VALUE = 280;
	public static final int PISU_VALUE = 320;

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン\t\t>");
		String sito = reader.readLine();

		System.out.print("ショコラ\t\t>");
		String syoko = reader.readLine();

		System.out.print("ピスターシュ\t>");
		String pisu = reader.readLine();

		System.out.println();

		System.out.println("シトロン\t\t" + sito + "個");
		System.out.println("ショコラ\t\t" + syoko + "個");
		System.out.println("ピスターシュ\t" + pisu + "個");

		System.out.println();

		int sito_num = Integer.parseInt(sito);
		int syoko_num = Integer.parseInt(syoko);
		int pisu_num = Integer.parseInt(pisu);

		int sum_num = sito_num + syoko_num + pisu_num;
		int sum_value = SITO_VALUE * sito_num + SYOKO_VALUE * syoko_num + PISU_VALUE * pisu_num;

		System.out.println("合計個数\t" + sum_num);
		System.out.println("合計金額\t" + sum_value);
		System.out.println();

		System.out.println("をお買いあげですね");
		System.out.println("承りました。");

	}

}
