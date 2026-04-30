/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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

		double sito_num = Double.parseDouble(sito);
		double syoko_num = Double.parseDouble(syoko);
		double pisu_num = Double.parseDouble(pisu);

		System.out.println("シトロン\t\t" + sito_num + "個");
		System.out.println("ショコラ\t\t" + syoko_num + "個");
		System.out.println("ピスターシュ\t" + pisu_num + "個");

		System.out.println();

		double sum_num = sito_num + syoko_num + pisu_num;
		double sum_value = SITO_VALUE * sito_num + SYOKO_VALUE * syoko_num + PISU_VALUE * pisu_num;

		System.out.println("合計個数\t" + sum_num + "個");
		System.out.println("合計金額\t" + (int) sum_value + "円");
		System.out.println();

		System.out.println("をお買いあげですね");
		System.out.println("承りました。");
		System.out.println();

		double sito_now_num = SITO_FIRST_NUM - sito_num;
		double syoko_now_num = SYOKO_FIRST_NUM - syoko_num;
		double pisu_now_num = PISU_FIRST_NUM - pisu_num;

		System.out.println("本日のおすすめ商品");
		System.out.println();
		System.out.println("シトロン\t\t\\" + SITO_VALUE + "・・・残り" + (int) sito_now_num + "個");
		System.out.println("ショコラ\t\t\\" + SYOKO_VALUE + "・・・残り" + (int) syoko_now_num + "個");
		System.out.println("ピスターシュ\t\\" + PISU_VALUE + "・・・残り" + (int) pisu_now_num + "個");

	}

}