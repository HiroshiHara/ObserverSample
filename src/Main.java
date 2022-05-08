import generator.IncrementalNumberGenerator;
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
		System.out.println("RandomNumberGenerator - Test");
		NumberGenerator g_randomGenerator = new RandomNumberGenerator();
		Observer g_digitObserver1 = new DigitObserver();
		Observer g_graphObserver1 = new GraphObserver();
		g_randomGenerator.addObserver(g_digitObserver1);
		g_randomGenerator.addObserver(g_graphObserver1);
		g_randomGenerator.execute();
		
		System.out.println("");
		
		System.out.println("IncrementalNumberGenerator - Test");
		NumberGenerator g_incGenerator = new IncrementalNumberGenerator(1, 30, 2);
		Observer g_digitObserver2 = new DigitObserver();
		Observer g_graphObserver2 = new GraphObserver();
		g_incGenerator.addObserver(g_digitObserver2);
		g_incGenerator.addObserver(g_graphObserver2);
		g_incGenerator.execute();
	}
}
