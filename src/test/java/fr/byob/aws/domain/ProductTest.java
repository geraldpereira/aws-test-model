package fr.byob.aws.domain;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class ProductTest {
	
	@Test
	public void testEquals() {
		final ProductBuilder builder = new ProductBuilder();
		final Product p1 = builder.build();
		final Product p2 = builder.build();
		assertEquals(p1, p2);
	}

	@Test
	public void testId() {
		final Product product = new Product();
		product.setId(ProductBuilder.ID);
		assertEquals(ProductBuilder.ID,product.getId());
	}
	@Test
	public void testtTitle() {
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
