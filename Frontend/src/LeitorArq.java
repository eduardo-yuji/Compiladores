import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class LeitorArq {
	public InputStream is;

	public LeitorArq(String nome) {
		try {
			is = new FileInputStream(nome);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int lerProxCaracter() {
		int c = -1;
		try {
			c = is.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (c);
	}

}
