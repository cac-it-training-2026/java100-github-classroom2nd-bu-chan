/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {

	public static final int SITO_VALUE = 250;
	public static final int SYOKO_VALUE = 280;
	public static final int PISU_VALUE = 320;
	public static final int SITO_FIRST_NUM = 30;
	public static final int SYOKO_FIRST_NUM = 30;
	public static final int PISU_FIRST_NUM = 30;

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
		System.out.println();

		int sito_now_num = SITO_FIRST_NUM - sito_num;
		int syoko_now_num = SYOKO_FIRST_NUM - syoko_num;
		int pisu_now_num = PISU_FIRST_NUM - pisu_num;

		System.out.println("本日のおすすめ商品");
		System.out.println();
		System.out.println("シトロン\t\t\\" + SITO_VALUE + "・・・残り" + sito_now_num + "個");
		System.out.println("ショコラ\t\t\\" + SYOKO_VALUE + "・・・残り" + syoko_now_num + "個");
		System.out.println("ピスターシュ\t\\" + PISU_VALUE + "・・・残り" + pisu_now_num + "個");

	}

}
