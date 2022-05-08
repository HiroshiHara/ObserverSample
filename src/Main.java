import generator.IncrementalNumberGenerator;
import generator.NumberGenerator;
import generator.RandomNumberGenerator;
import observer.DigitObserver;
import observer.GraphObserver;
import observer.Observer;
import observer.OddObserver;

/**
 * プログラム実行クラス
 * @author mrbob
 *
 */
public class Main {
	public static void main(String[] args) {
		Observer g_digitObserver = new DigitObserver();
		Observer g_graphObserver = new GraphObserver();
		Observer g_oddObserver = new OddObserver();
		
		System.out.println("RandomNumberGenerator - Test");
		NumberGenerator g_randomGenerator = new RandomNumberGenerator();
		g_randomGenerator.addObserver(g_digitObserver);
		g_randomGenerator.addObserver(g_graphObserver);
		g_randomGenerator.addObserver(g_oddObserver);
		g_randomGenerator.execute();
		
		System.out.println("");
		
		System.out.println("IncrementalNumberGenerator - Test");
		NumberGenerator g_incGenerator = new IncrementalNumberGenerator(1, 30, 2);
		g_incGenerator.addObserver(g_digitObserver);
		g_incGenerator.addObserver(g_graphObserver);
		g_incGenerator.addObserver(g_oddObserver);
		g_incGenerator.execute();
	}
}
