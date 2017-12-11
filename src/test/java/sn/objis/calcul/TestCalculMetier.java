package sn.objis.calcul;

import junit.framework.TestCase;

public class TestCalculMetier extends TestCase {
	CalculMetier calculMetier;
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		calculMetier=new CalculMetier();
		super.setUp();
	}
	
	public void testSomme(){
		assertTrue(calculMetier.somme(4, 5)==9);
	}
	
	public void testProduit(){
		assertTrue(calculMetier.produit(4, 5)==20);
	}

}
