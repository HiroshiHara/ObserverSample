package observer;

import generator.NumberGenerator;

/**
 * 観察した数値を「数字」で表現する観察者
 * @author mrbob
 *
 */
public class DigitObserver implements Observer {
	/**
	 * 数値が生成されるたびにコンソールにその数値を「数字」で表示する
	 */
	@Override
	public void update(NumberGenerator x_generator) {
		System.out.println("DigitObserver:" + x_generator.getNumber());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
