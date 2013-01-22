package fr.byob.aws.domain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Product builder, used to build the Product bean
 * 
 * @author gpereira
 *
 */
public class ProductBuilder {
	
	static final String TITLE = "test1";
	static final String ISBN = "test2";
	static final Set<String> AUTHORS = new HashSet<>(Arrays.asList("test3", "test4"));
	static final Double PRICE = 20.99;
	static final String CATEGORY =  "test5";
	static final String DIMENSIONS = "test6";
	static final Boolean IN_PUBLICATION = true;
	
    private String title = TITLE;
    private String isbn = ISBN;
    private Set<String> authors = AUTHORS;
    private Double price = PRICE;
    private String category = CATEGORY;
    private String dimensions = DIMENSIONS;
    private Boolean inPublication = IN_PUBLICATION;
	
	
	/**
	 * Set product title 
	 * @param title
	 * @return the productBuilder
	 */
	public ProductBuilder title(String title){
		this.title = title;
		return this;
	}
	
	/**
	 * Set product isbn 
	 * @param isbn
	 * @return the productBuilder
	 */
	public ProductBuilder isbn(String isbn){
		this.isbn = isbn;
		return this;
	}
	
	/**
	 * Set product authors 
	 * @param authors
	 * @return the productBuilder
	 */
	public ProductBuilder authors(Set<String> authors){
		this.authors = authors;
		return this;
	}
	
	/**
	 * Set product price 
	 * @param price
	 * @return the productBuilder
	 */
	public ProductBuilder price(Double price){
		this.price = price;
		return this;
	}
	
	/**
	 * Set product category 
	 * @param category
	 * @return the productBuilder
	 */
	public ProductBuilder category(String category){
		this.category = category;
		return this;
	}
	
	/**
	 * Set product dimensions 
	 * @param dimensions
	 * @return the productBuilder
	 */
	public ProductBuilder dimensions(String dimensions){
		this.dimensions = dimensions;
		return this;
	}
	
	/**
	 * Set product inPublication 
	 * @param inPublication
	 * @return the productBuilder
	 */
	public ProductBuilder inPublication(Boolean inPublication){
		this.inPublication = inPublication;
		return this;
	}
	
	/**
	 * Builds the product
	 * @return the product
	 */
	public final Product build() {
		Product product = new Product();
		product.setTitle(title);
		product.setIsbn(isbn);
		product.setAuthors(authors);
		product.setPrice(price);
		product.setCategory(category);
		product.setDimensions(dimensions);
		product.setInPublication(inPublication);
		return product;
	}
	
}
