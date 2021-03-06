/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBooleans extends org.jooq.impl.TableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.TBooleansRecord> {

	private static final long serialVersionUID = 1236140414;

	/**
	 * The singleton instance of <code>PUBLIC.T_BOOLEANS</code>
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.TBooleans T_BOOLEANS = new org.jooq.test.hsqldb.generatedclasses.tables.TBooleans();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.TBooleansRecord> getRecordType() {
		return org.jooq.test.hsqldb.generatedclasses.tables.records.TBooleansRecord.class;
	}

	/**
	 * The column <code>PUBLIC.T_BOOLEANS.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBooleansRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>PUBLIC.T_BOOLEANS.ONE_ZERO</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_10> ONE_ZERO = createField("ONE_ZERO", org.jooq.impl.SQLDataType.INTEGER.asConvertedDataType(new org.jooq.test._.converters.Boolean_10_Converter()), this);

	/**
	 * The column <code>PUBLIC.T_BOOLEANS.TRUE_FALSE_LC</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_TF_LC> TRUE_FALSE_LC = createField("TRUE_FALSE_LC", org.jooq.impl.SQLDataType.VARCHAR.length(5).asConvertedDataType(new org.jooq.test._.converters.Boolean_TF_LC_Converter()), this);

	/**
	 * The column <code>PUBLIC.T_BOOLEANS.TRUE_FALSE_UC</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_TF_UC> TRUE_FALSE_UC = createField("TRUE_FALSE_UC", org.jooq.impl.SQLDataType.VARCHAR.length(5).asConvertedDataType(new org.jooq.test._.converters.Boolean_TF_UC_Converter()), this);

	/**
	 * The column <code>PUBLIC.T_BOOLEANS.YES_NO_LC</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_YES_NO_LC> YES_NO_LC = createField("YES_NO_LC", org.jooq.impl.SQLDataType.VARCHAR.length(3).asConvertedDataType(new org.jooq.test._.converters.Boolean_YES_NO_LC_Converter()), this);

	/**
	 * The column <code>PUBLIC.T_BOOLEANS.YES_NO_UC</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_YES_NO_UC> YES_NO_UC = createField("YES_NO_UC", org.jooq.impl.SQLDataType.VARCHAR.length(3).asConvertedDataType(new org.jooq.test._.converters.Boolean_YES_NO_UC_Converter()), this);

	/**
	 * The column <code>PUBLIC.T_BOOLEANS.Y_N_LC</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_YN_LC> Y_N_LC = createField("Y_N_LC", org.jooq.impl.SQLDataType.CHAR.length(1).asConvertedDataType(new org.jooq.test._.converters.Boolean_YN_LC_Converter()), this);

	/**
	 * The column <code>PUBLIC.T_BOOLEANS.Y_N_UC</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_YN_UC> Y_N_UC = createField("Y_N_UC", org.jooq.impl.SQLDataType.CHAR.length(1).asConvertedDataType(new org.jooq.test._.converters.Boolean_YN_UC_Converter()), this);

	/**
	 * The column <code>PUBLIC.T_BOOLEANS.VC_BOOLEAN</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBooleansRecord, java.lang.Boolean> VC_BOOLEAN = createField("VC_BOOLEAN", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.T_BOOLEANS.C_BOOLEAN</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBooleansRecord, java.lang.Boolean> C_BOOLEAN = createField("C_BOOLEAN", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>PUBLIC.T_BOOLEANS.N_BOOLEAN</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBooleansRecord, java.lang.Boolean> N_BOOLEAN = createField("N_BOOLEAN", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * Create a <code>PUBLIC.T_BOOLEANS</code> table reference
	 */
	public TBooleans() {
		super("T_BOOLEANS", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>PUBLIC.T_BOOLEANS</code> table reference
	 */
	public TBooleans(java.lang.String alias) {
		super(alias, org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.test.hsqldb.generatedclasses.tables.TBooleans.T_BOOLEANS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.TBooleansRecord> getPrimaryKey() {
		return org.jooq.test.hsqldb.generatedclasses.Keys.PK_T_BOOLEANS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.TBooleansRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.TBooleansRecord>>asList(org.jooq.test.hsqldb.generatedclasses.Keys.PK_T_BOOLEANS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.hsqldb.generatedclasses.tables.TBooleans as(java.lang.String alias) {
		return new org.jooq.test.hsqldb.generatedclasses.tables.TBooleans(alias);
	}
}
