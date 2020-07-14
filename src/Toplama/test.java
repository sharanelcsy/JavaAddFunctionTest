/* Salih Buhari Bas */

package Toplama;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void add_toplama()
	{
		final int sonuc = 4;
		final int gercek = ToplamaFonksiyon.add(2,2);
		assertEquals(gercek,sonuc);
	}
}
