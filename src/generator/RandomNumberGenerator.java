package generator;

import java.util.Random;

/**
 * 乱数を生成するクラス
 * @author mrbob
 *
 */
public class RandomNumberGenerator extends NumberGenerator {
	/**
	 * 乱数生成器を保持する
	 */
	private Random g_random = new Random();
	
	/**
	 * 現在の乱数値を保持する
	 */
	private int g_number;
	
	/**
	 * 現在の乱数値を取得する
	 * @return 現在の乱数値
	 */
	@Override
	public int getNumber() {
		return g_number;
	}
	
	/**
	 * 0-50の範囲で乱数を20個生成する<br>
	 * 生成するたび観察者に伝達する
	 */
	@Override
	public void execute() {
		for (int i = 0; i < 20; i++) {
			g_number = g_random.nextInt(50);
			notifyObservers();
		}
	}
}
