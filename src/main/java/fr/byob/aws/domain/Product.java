package fr.byob.aws.domain;

import java.util.Objects;
import java.util.Set;

import com.amazonaws.services.dynamodb.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBTable;

/**
 * POJO Product bean
 * 
 * @author gpereira
 * 
 */
@DynamoDBTable(tableName = "ProductCatalog")
public final class Product {
	private String id;
	private String title;
	private String isbn;
	private Set<String> authors;
	private Double price;
	private String category;
	private String dimensions;
	private Boolean inPublication;

	public Product() {
	}

	@DynamoDBHashKey(attributeName = "Id")
	@DynamoDBAutoGeneratedKey
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@DynamoDBAttribute(attributeName = "Title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@DynamoDBAttribute(attributeName = "ISBN")
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@DynamoDBAttribute(attributeName = "Authors")
	public Set<String> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<String> authors) {
		this.authors = authors;
	}

	@DynamoDBAttribute(attributeName = "Price")
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@DynamoDBAttribute(attributeName = "Category")
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@DynamoDBAttribute(attributeName = "Dimensions")
	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	@DynamoDBAttribute(attributeName = "InPublication")
	public Boolean getInPublication() {
		return inPublication;
	}

	public void setInPublication(Boolean inPublication) {
		this.inPublication = inPublication;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn, authors, category, dimensions, id,
				inPublication, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Product) {
			return this.hashCode() == obj.hashCode();
		}
		return false;
	}

}
