/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_785", schema = "TEST")
public interface T_785_INTERFACE extends java.lang.Cloneable, java.io.Serializable {

	/**
	 * The table column <code>TEST.T_785.ID</code>
	 */
	public void setID(java.lang.Integer value);

	/**
	 * The table column <code>TEST.T_785.ID</code>
	 */
	@javax.persistence.Column(name = "ID", precision = 7)
	public java.lang.Integer getID();

	/**
	 * The table column <code>TEST.T_785.NAME</code>
	 */
	public void setNAME(java.lang.String value);

	/**
	 * The table column <code>TEST.T_785.NAME</code>
	 */
	@javax.persistence.Column(name = "NAME", length = 50)
	public java.lang.String getNAME();

	/**
	 * The table column <code>TEST.T_785.VALUE</code>
	 */
	public void setVALUE(java.lang.String value);

	/**
	 * The table column <code>TEST.T_785.VALUE</code>
	 */
	@javax.persistence.Column(name = "VALUE", length = 50)
	public java.lang.String getVALUE();
}