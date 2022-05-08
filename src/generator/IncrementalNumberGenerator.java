package generator;

/**
 * 規定値の間で数を一定の値ごとに増やしていくクラス
 * @author mrbob
 *
 */
public class IncrementalNumberGenerator extends NumberGenerator {
	/**
	 * 開始値
	 */
	private int g_start;
	
	/**
	 * 終了値(終了時はこの値を含まない)
	 */
	private int g_end;
	
	/**
	 * 増加値
	 */
	private int g_inc;
	
	/**
	 * 現在の値を保持する
	 */
	private int g_number;
	
	public IncrementalNumberGenerator(int x_start, int x_end, int x_inc) {
		if (x_start >= x_end) {
			throw new IllegalArgumentException("開始値は終了値より小さい値に設定してください");
		}
		if (x_inc < 1) {
			throw new IllegalArgumentException("増加値は0より大きい値に設定してください");
		}
		this.g_start = x_start;
		this.g_end = x_end;
		this.g_inc = x_inc;
	}
	
	/**
	 * 現在の値を取得する
	 * @return 現在の値
	 */
	@Override
	public int getNumber() {
		return g_number;
	}
	
	/**
	 * 開始値から終了値まで増加値を加算する<br>
	 * 終了値を超える時点で処理を終了する<br>
	 * 加算するたび観察者に伝達する
	 */
	@Override
	public void execute() {
		for (g_number = g_start ; g_number < g_end; g_number += g_inc) {
			notifyObservers();
		}
	}
}
