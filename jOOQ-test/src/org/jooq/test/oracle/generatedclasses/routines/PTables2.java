/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class PTables2 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1634853584;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.udt.records.UNumberLongTableRecord> IN_TABLE = createParameter("IN_TABLE", org.jooq.impl.SQLDataType.BIGINT.asArrayDataType(org.jooq.test.oracle.generatedclasses.udt.records.UNumberLongTableRecord.class));

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.udt.records.UNumberLongTableRecord> OUT_TABLE = createParameter("OUT_TABLE", org.jooq.impl.SQLDataType.BIGINT.asArrayDataType(org.jooq.test.oracle.generatedclasses.udt.records.UNumberLongTableRecord.class));

	/**
	 * Create a new routine call instance
	 */
	public PTables2() {
		super(org.jooq.SQLDialect.ORACLE, "P_TABLES2", org.jooq.test.oracle.generatedclasses.Test.TEST);

		addInParameter(IN_TABLE);
		addOutParameter(OUT_TABLE);
	}

	/**
	 * Set the <code>IN_TABLE</code> parameter to the routine
	 */
	public void setInTable(org.jooq.test.oracle.generatedclasses.udt.records.UNumberLongTableRecord value) {
		setValue(IN_TABLE, value);
	}

	public org.jooq.test.oracle.generatedclasses.udt.records.UNumberLongTableRecord getOutTable() {
		return getValue(OUT_TABLE);
	}
}