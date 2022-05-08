package observer;

import generator.NumberGenerator;

/**
 * 「観察者」を表現するインタフェース
 * @author mrbob
 *
 */
public interface Observer {
	/**
	 * 観察者に情報の更新を伝達する抽象メソッド
	 * @param x_generator
	 */
	public abstract void update(NumberGenerator x_generator);
}
