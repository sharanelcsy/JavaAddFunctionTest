/* Salih Buhari Bas */

package Toplama;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void add_toplama()
	{
		final int sonuc = 5;
		final int gercek = ToplamaFonksiyon.add(2,2);
		assertEquals("Toplama islemi hatali (Wrong Result)",gercek,sonuc);
	}
}
