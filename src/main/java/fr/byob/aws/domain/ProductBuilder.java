package fr.byob.aws.domain;

import java.util.Arrays;
import java.util.List;

public class ProductBuilder {
	
	private final static Integer ID = 130;
	private final static String TITLE = "test1";
	private final static String ISBN = "test2";
	private final static  List<String> AUTHORS = Arrays.asList("test3", "test4");
	private final static Double PRICE = 20.99;
	private final static String CATEGORY =  "test5";
	private final static String DIMENSIONS = "test6";
	private final static Boolean IN_PUBLICATION = true;
	
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
