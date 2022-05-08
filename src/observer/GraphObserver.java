package observer;

import generator.NumberGenerator;

/**
 * 観察した数値を「グラフ」で表現する観察者
 * @author mrbob
 *
 */
public class GraphObserver implements Observer {
	
	/**
	 * 数値が生成されるたびにコンソールにその数値を「グラフ」で表示する
	 */
	@Override
	public void update(NumberGenerator x_generator) {
		System.out.print("GraphObserver:");
		for (int i = 0; i < x_generator.getNumber(); i++) {
			System.out.print("*");
		}
		System.out.println("");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
