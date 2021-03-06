package es.codeurjc.test.complex;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ComplexTest {

	private Complex zero;

	@Before
	public void setUp() {
		zero = new Complex(0, 0);
	}

	@Test
	public void GivenZeroComplex_thenRealPartZeroAndImagPartZero() {
		assertEquals(0, zero.getRealPart(), 0.001);
		assertEquals(0, zero.getImaginaryPart(), 0.001);
	}

	@Test
	public void GivenZeroComplex_whenAddToComplex1_1_thenComplex1_1IsObtained() {

		assertEquals(new Complex(1, 1), zero.add(new Complex(1, 1)));
	}

	@Test
	public void GivenComplex1_1_whenAddToZero_thenComplex1_1IsObtained() {

		assertEquals(new Complex(1, 1), (new Complex(1, 1)).add(zero));
	}
}
