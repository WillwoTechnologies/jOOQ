/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * An m:n relation between books and book stores
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK_TO_BOOK_STORE", schema = "TEST", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"BOOK_STORE_NAME", "BOOK_ID"})
})
public class TBookToBookStore implements java.io.Serializable {

	private static final long serialVersionUID = 1943372630;

	private java.lang.String  bookStoreName;
	private java.lang.Integer bookId;
	private java.lang.Integer stock;

	@javax.persistence.Column(name = "BOOK_STORE_NAME")
	public java.lang.String getBookStoreName() {
		return this.bookStoreName;
	}

	public void setBookStoreName(java.lang.String bookStoreName) {
		this.bookStoreName = bookStoreName;
	}

	@javax.persistence.Column(name = "BOOK_ID")
	public java.lang.Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(java.lang.Integer bookId) {
		this.bookId = bookId;
	}

	@javax.persistence.Column(name = "STOCK")
	public java.lang.Integer getStock() {
		return this.stock;
	}

	public void setStock(java.lang.Integer stock) {
		this.stock = stock;
	}
}