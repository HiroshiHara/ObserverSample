package observer;

import generator.NumberGenerator;

/**
 * 観察した数値が奇数なら「ODD」偶数なら「×」を表現する観察者
 * @author mrbob
 *
 */
public class OddObserver implements Observer {
	
	/**
	 * 数値が生成されるたびにコンソールにその数値が<br>
	 * 奇数なら「ODD」偶数なら「×」を表示する
	 */
	@Override
	public void update(NumberGenerator x_generator) {
		System.out.print("OddObserver:");
		if (x_generator.getNumber() % 2 != 0) {
			System.out.println("ODD");
		} else {
			System.out.println("×");
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
