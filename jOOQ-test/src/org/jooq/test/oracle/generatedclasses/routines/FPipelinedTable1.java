/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class FPipelinedTable1 extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle.generatedclasses.udt.records.UNumberTableRecord> {

	private static final long serialVersionUID = 890699200;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.udt.records.UNumberTableRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.udt.records.UNumberTableRecord.class));

	/**
	 * Create a new routine call instance
	 */
	public FPipelinedTable1() {
		super(org.jooq.SQLDialect.ORACLE, "F_PIPELINED_TABLE1", org.jooq.test.oracle.generatedclasses.Test.TEST, org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.udt.records.UNumberTableRecord.class));

		setReturnParameter(RETURN_VALUE);
	}
}