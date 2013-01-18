package fr.byob.aws.domain;

import java.util.Arrays;
import java.util.List;

/**
 * Product builder, used to build the Product bean
 * 
 * @author gpereira
 *
 */
public class ProductBuilder {
	
	private static final Integer ID = 130;
	private static final String TITLE = "test1";
	private static final String ISBN = "test2";
	private static final  List<String> AUTHORS = Arrays.asList("test3", "test4");
	private static final Double PRICE = 20.99;
	private static final String CATEGORY =  "test5";
	private static final String DIMENSIONS = "test6";
	private static final Boolean IN_PUBLICATION = true;
	
	private Integer id = ID;
    private String title = TITLE;
    private String isbn = ISBN;
    private List<String> authors = AUTHORS;
    private Double price = PRICE;
    private String category = CATEGORY;
    private String dimensions = DIMENSIONS;
    private Boolean inPublication = IN_PUBLICATION;
	
	public ProductBuilder(){
	}
	
	
	public ProductBuilder id(Integer id){
		this.id = id;
		return this;
	}
	
	public ProductBuilder title(String title){
		this.title = title;
		return this;
	}
	
	public ProductBuilder isbn(String isbn){
		this.isbn = isbn;
		return this;
	}
	
	public ProductBuilder authors(List<String> authors){
		this.authors = authors;
		return this;
	}
	
	public ProductBuilder price(Double price){
		this.price = price;
		return this;
	}
	
	public ProductBuilder category(String category){
		this.category = category;
		return this;
	}
	
	public ProductBuilder dimensions(String dimensions){
		this.dimensions = dimensions;
		return this;
	}
	
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
		product.setId(id);
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
