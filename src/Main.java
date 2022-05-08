import generator.NumberGenerator;
import generator.RandomNumberGenerator;
import observer.DigitObserver;
import observer.GraphObserver;
import observer.Observer;

/**
 * プログラム実行クラス
 * @author mrbob
 *
 */
public class Main {
	public static void main(String[] args) {
		NumberGenerator g_generator = new RandomNumberGenerator();
		Observer g_digitObserver = new DigitObserver();
		Observer g_graphObserver = new GraphObserver();
		g_generator.addObserver(g_digitObserver);
		g_generator.addObserver(g_graphObserver);
		g_generator.execute();
	}
}
