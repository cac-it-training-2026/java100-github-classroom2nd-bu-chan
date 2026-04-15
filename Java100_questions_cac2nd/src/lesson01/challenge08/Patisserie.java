/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		System.out.println();
		System.out.println("閉店時間になりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println();
		System.out.println("売上の割合");
		System.out.println("売上合計\t\\" + (int) sum_value);

		double sito_salse = SITO_VALUE * sito_num;
		double syoko_salse = SYOKO_VALUE * syoko_num;
		double pisu_salse = PISU_VALUE * pisu_num;
		System.out.println();
		System.out.println("内訳");
		System.out.println("シトロン\t\t\\" + (int) sito_salse + "・・・" + (int) (sito_salse / sum_value * 100) + "%");
		System.out.println("ショコラ\t\t\\" + (int) syoko_salse + "・・・" + (int) (syoko_salse / sum_value * 100) + "%");
		System.out.println("ピスターシュ\t\\" + (int) pisu_salse + "・・・" + (int) (pisu_salse / sum_value * 100) + "%");

	}

}