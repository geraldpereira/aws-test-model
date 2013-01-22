package fr.byob.aws.domain;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

import org.junit.Test;

import static junit.framework.Assert.*;

public class ProductTest {
	
	/**
	 * 	Jersey uses JAXB beans so our Product cannot be immutable (with an internal buidler).
	 */
	@Test
	public void testEquals() {
	    EqualsVerifier.forClass(Product.class).suppress(Warning.NONFINAL_FIELDS).verify();
	}

	@Test
	public void testId() {
		final Product product = new Product();
		product.setId("fakeId");
		assertEquals("fakeId",product.getId());
	}
	@Test
	public void testTitle() {
		final Product product = new Product();
		product.setTitle(ProductBuilder.TITLE);
		assertEquals(ProductBuilder.TITLE,product.getTitle());
	}
	@Test
	public void testIsbn() {
		final Product product = new Product();
		product.setIsbn(ProductBuilder.ISBN);
		assertEquals(ProductBuilder.ISBN,product.getIsbn());
	}
	@Test
	public void testAuthors() {
		final Product product = new Product();
		product.setAuthors(ProductBuilder.AUTHORS);
		assertEquals(ProductBuilder.AUTHORS,product.getAuthors());
	}
	@Test
	public void testPrice() {
		final Product product = new Product();
		product.setPrice(ProductBuilder.PRICE);
		assertEquals(ProductBuilder.PRICE,product.getPrice());
	}
	@Test
	public void testCategory() {
		final Product product = new Product();
		product.setCategory(ProductBuilder.CATEGORY);
		assertEquals(ProductBuilder.CATEGORY,product.getCategory());
	}
	@Test
	public void testDimensions() {
		final Product product = new Product();
		product.setDimensions(ProductBuilder.DIMENSIONS);
		assertEquals(ProductBuilder.DIMENSIONS,product.getDimensions());
	}
	@Test
	public void testInPublication() {
		final Product product = new Product();
		product.setInPublication(ProductBuilder.IN_PUBLICATION);
		assertEquals(ProductBuilder.IN_PUBLICATION,product.getInPublication());
	}
}
