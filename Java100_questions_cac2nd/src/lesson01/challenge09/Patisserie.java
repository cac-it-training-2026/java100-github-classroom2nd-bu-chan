/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		System.out.println();
		System.out.println("明日の三色マカロンの配合率が決まりました！");
		System.out.println();
		System.out.println("シトロンの味\t\t・・・" + (int) (sito_salse / sum_value * 100) + "%");
		System.out.println("ショコラの味\t\t・・・" + (int) (syoko_salse / sum_value * 100) + "%");
		System.out.println("ピスターシュの味\t・・・" + (int) (pisu_salse / sum_value * 100) + "%");

		System.out.println();
		System.out.println("が楽しめます！");
		System.out.println();

		int maka_value = (int) (sum_value / sum_num) / 10 * 10;

		System.out.println("値段は\\" + maka_value + "です。");

	}
}
