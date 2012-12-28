package fr.byob.aws.domain;

import java.util.Arrays;
import java.util.List;

public class ProductBuilder {
	
	private Integer id = 130;
    private String title = "test1";
    private String ISBN = "test2";
    private List<String> authors = Arrays.asList("test3", "test4");
    private Double price = 20.99;
    private String category = "test5";
    private String dimensions = "test6";
    private Boolean inPublication = true;
	
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
	
	public ProductBuilder ISBN(String ISBN){
		this.ISBN = ISBN;
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
		product.setISBN(ISBN);
		product.setAuthors(authors);
		product.setPrice(price);
		product.setCategory(category);
		product.setDimensions(dimensions);
		product.setInPublication(inPublication);
		return product;
	}
	
}
