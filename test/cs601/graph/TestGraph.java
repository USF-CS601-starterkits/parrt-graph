import junit.framework.TestCase;

import java.io.IOException;
import java.io.StringReader;

public class TestGraph extends TestCase {
	public void testPrint() throws IOException {
		Tool t = new Tool();
		String g =
			"110 -> 112\n" +
			"112 -> 326\n" +
			"print\n";
		StringReader in = new StringReader(g);
		String found = t.exec(in);
		String expecting =
			"UnweightedGraph:\n" +
			"110 -> 112\n" +
			"112 -> 326\n";
		assertEquals(expecting, found);
	}

	public void testLen() throws IOException {
		Tool t = new Tool();
		String g =
			"110 -> 112\n" +
			"112 -> 326\n" +
			"len 110 326\n";
		StringReader in = new StringReader(g);
		String found = t.exec(in);
		String expecting =
			"len 110 -> 326 = 2\n";
		assertEquals(expecting, found);
	}
}
