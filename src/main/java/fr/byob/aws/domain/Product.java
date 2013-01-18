package fr.byob.aws.domain;

import java.util.List;
import java.util.Objects;


/**
 * POJO Product bean
 * 
 * @author gpereira
 *
 */
public class Product {
	private Integer id;
    private String title;
    private String isbn;
    private List<String> authors;
    private Double price;
    private String category;
    private String dimensions;
    private Boolean inPublication;

    public Product(){
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public Boolean getInPublication() {
		return inPublication;
	}

	public void setInPublication(Boolean inPublication) {
		this.inPublication = inPublication;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn,authors,category,dimensions,id,inPublication,price,title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		Product other = (Product) obj;
		return this.hashCode() == other.hashCode();
	}

}
