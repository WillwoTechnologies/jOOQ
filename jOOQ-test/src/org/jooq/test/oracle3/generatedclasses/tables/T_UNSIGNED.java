/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_UNSIGNED extends org.jooq.impl.TableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_UNSIGNED> implements java.lang.Cloneable {

	private static final long serialVersionUID = 1082000197;

	/**
	 * The singleton instance of <code>T_UNSIGNED</code>
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.T_UNSIGNED T_UNSIGNED = new org.jooq.test.oracle3.generatedclasses.tables.T_UNSIGNED();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.T_UNSIGNED> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.tables.records.T_UNSIGNED.class;
	}

	/**
	 * The column <code>T_UNSIGNED.U_BYTE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_UNSIGNED, java.lang.Short> U_BYTE = createField("U_BYTE", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>T_UNSIGNED.U_SHORT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_UNSIGNED, java.lang.Integer> U_SHORT = createField("U_SHORT", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>T_UNSIGNED.U_INT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_UNSIGNED, java.lang.Long> U_INT = createField("U_INT", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>T_UNSIGNED.U_LONG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_UNSIGNED, java.math.BigInteger> U_LONG = createField("U_LONG", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(20), this);

	/**
	 * Create a <code>T_UNSIGNED</code> table reference
	 */
	public T_UNSIGNED() {
		super("T_UNSIGNED", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>T_UNSIGNED</code> table reference
	 */
	public T_UNSIGNED(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.oracle3.generatedclasses.tables.T_UNSIGNED.T_UNSIGNED);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.T_UNSIGNED as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_UNSIGNED(alias);
	}
}
