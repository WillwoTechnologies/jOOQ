/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_TRIGGERS", schema = "TEST")
public interface T_TRIGGERS_INTERFACE extends java.lang.Cloneable, java.io.Serializable {

	/**
	 * The table column <code>TEST.T_TRIGGERS.ID_GENERATED</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setID_GENERATED(java.lang.Integer value);

	/**
	 * The table column <code>TEST.T_TRIGGERS.ID_GENERATED</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID_GENERATED", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID_GENERATED();

	/**
	 * The table column <code>TEST.T_TRIGGERS.ID</code>
	 */
	public void setID(java.lang.Integer value);

	/**
	 * The table column <code>TEST.T_TRIGGERS.ID</code>
	 */
	@javax.persistence.Column(name = "ID", nullable = false, precision = 7)
	public java.lang.Integer getID();

	/**
	 * The table column <code>TEST.T_TRIGGERS.COUNTER</code>
	 */
	public void setCOUNTER(java.lang.Integer value);

	/**
	 * The table column <code>TEST.T_TRIGGERS.COUNTER</code>
	 */
	@javax.persistence.Column(name = "COUNTER", nullable = false, precision = 7)
	public java.lang.Integer getCOUNTER();
}