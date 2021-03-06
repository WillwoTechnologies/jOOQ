/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Attributes extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 1248111361;

	/**
	 * The singleton instance of <code>SYSCAT.ATTRIBUTES</code>
	 */
	public static final org.jooq.util.db2.syscat.tables.Attributes ATTRIBUTES = new org.jooq.util.db2.syscat.tables.Attributes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.TYPESCHEMA</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPESCHEMA = createField("TYPESCHEMA", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.TYPEMODULENAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPEMODULENAME = createField("TYPEMODULENAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.TYPENAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPENAME = createField("TYPENAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.ATTR_NAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ATTR_NAME = createField("ATTR_NAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.ATTR_TYPESCHEMA</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ATTR_TYPESCHEMA = createField("ATTR_TYPESCHEMA", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.ATTR_TYPEMODULENAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ATTR_TYPEMODULENAME = createField("ATTR_TYPEMODULENAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.ATTR_TYPENAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ATTR_TYPENAME = createField("ATTR_TYPENAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.TARGET_TYPESCHEMA</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TARGET_TYPESCHEMA = createField("TARGET_TYPESCHEMA", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.TARGET_TYPEMODULENAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TARGET_TYPEMODULENAME = createField("TARGET_TYPEMODULENAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.TARGET_TYPENAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TARGET_TYPENAME = createField("TARGET_TYPENAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.SOURCE_TYPESCHEMA</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SOURCE_TYPESCHEMA = createField("SOURCE_TYPESCHEMA", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.SOURCE_TYPEMODULENAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SOURCE_TYPEMODULENAME = createField("SOURCE_TYPEMODULENAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.SOURCE_TYPENAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SOURCE_TYPENAME = createField("SOURCE_TYPENAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.ORDINAL</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> ORDINAL = createField("ORDINAL", org.jooq.impl.SQLDataType.SMALLINT, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.LENGTH</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> LENGTH = createField("LENGTH", org.jooq.impl.SQLDataType.INTEGER, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.SCALE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> SCALE = createField("SCALE", org.jooq.impl.SQLDataType.SMALLINT, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.CODEPAGE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> CODEPAGE = createField("CODEPAGE", org.jooq.impl.SQLDataType.SMALLINT, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.COLLATIONSCHEMA</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATIONSCHEMA = createField("COLLATIONSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.COLLATIONNAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATIONNAME = createField("COLLATIONNAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.LOGGED</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> LOGGED = createField("LOGGED", org.jooq.impl.SQLDataType.CHAR, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.COMPACT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> COMPACT = createField("COMPACT", org.jooq.impl.SQLDataType.CHAR, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.DL_FEATURES</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> DL_FEATURES = createField("DL_FEATURES", org.jooq.impl.SQLDataType.CHAR, ATTRIBUTES);

	/**
	 * The column <code>SYSCAT.ATTRIBUTES.JAVA_FIELDNAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> JAVA_FIELDNAME = createField("JAVA_FIELDNAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * No further instances allowed
	 */
	private Attributes() {
		super("ATTRIBUTES", org.jooq.util.db2.syscat.Syscat.SYSCAT);
	}
}
