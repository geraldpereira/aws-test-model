package fr.byob.aws.domain;

import static junit.framework.Assert.*;

import org.junit.Test;

public class ProductBuilderTest {
	
	@Test
	public void testId() {
		final Product product = new ProductBuilder().id(ProductBuilder.ID).build();
		assertEquals(ProductBuilder.ID,product.getId());
	}
	@Test
	public void testTitle() {
		final Product product = new Product();
		product.setTitle(ProductBuilder.TITLE);
		assertEquals(ProductBuilder.TITLE,product.getTitle());
	}
	@Test
	public void testIsbn() {
		final Product product = new ProductBuilder().isbn(ProductBuilder.ISBN).build();
		assertEquals(ProductBuilder.ISBN,product.getIsbn());
	}
	@Test
	public void testAuthors() {
		final Product product = new ProductBuilder().authors(ProductBuilder.AUTHORS).build();
		assertEquals(ProductBuilder.AUTHORS,product.getAuthors());
	}
	@Test
	public void testPrice() {
		final Product product = new ProductBuilder().price(ProductBuilder.PRICE).build();
		assertEquals(ProductBuilder.PRICE,product.getPrice());
	}
	@Test
	public void testCategory() {
		final Product product = new ProductBuilder().category(ProductBuilder.CATEGORY).build();
		assertEquals(ProductBuilder.CATEGORY,product.getCategory());
	}
	@Test
	public void testDimensions() {
		final Product product = new ProductBuilder().dimensions(ProductBuilder.DIMENSIONS).build();
		assertEquals(ProductBuilder.DIMENSIONS,product.getDimensions());
	}
	@Test
	public void testInPublication() {
		final Product product = new ProductBuilder().inPublication(ProductBuilder.IN_PUBLICATION).build();
		assertEquals(ProductBuilder.IN_PUBLICATION,product.getInPublication());
	}
}
