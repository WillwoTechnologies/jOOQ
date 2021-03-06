/**
 * Copyright (c) 2009-2013, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name of the "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.jooq.test;

import static org.jooq.test.access.generatedclasses.Tables.T_BOOK_TO_BOOK_STORE;
import static org.jooq.test.access.generatedclasses.Tables.T_BOOLEANS;
import static org.jooq.test.access.generatedclasses.Tables.T_DATES;
import static org.jooq.test.access.generatedclasses.Tables.T_EXOTIC_TYPES;
import static org.jooq.test.access.generatedclasses.Tables.T_IDENTITY;
import static org.jooq.test.access.generatedclasses.Tables.T_IDENTITY_PK;
import static org.jooq.test.access.generatedclasses.Tables.T_UNSIGNED;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.util.UUID;

import org.jooq.ArrayRecord;
import org.jooq.DSLContext;
import org.jooq.DataType;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UDTRecord;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;
import org.jooq.test._.converters.Boolean_10;
import org.jooq.test._.converters.Boolean_TF_LC;
import org.jooq.test._.converters.Boolean_TF_UC;
import org.jooq.test._.converters.Boolean_YES_NO_LC;
import org.jooq.test._.converters.Boolean_YES_NO_UC;
import org.jooq.test._.converters.Boolean_YN_LC;
import org.jooq.test._.converters.Boolean_YN_UC;
import org.jooq.test.access.generatedclasses.tables.TAuthor;
import org.jooq.test.access.generatedclasses.tables.TBook;
import org.jooq.test.access.generatedclasses.tables.TBookStore;
import org.jooq.test.access.generatedclasses.tables.TBookToBookStore;
import org.jooq.test.access.generatedclasses.tables.TBooleans;
import org.jooq.test.access.generatedclasses.tables.TExoticTypes;
import org.jooq.test.access.generatedclasses.tables.TIdentity;
import org.jooq.test.access.generatedclasses.tables.TIdentityPk;
import org.jooq.test.access.generatedclasses.tables.TTriggers;
import org.jooq.test.access.generatedclasses.tables.TUnsigned;
import org.jooq.test.access.generatedclasses.tables.T_639NumbersTable;
import org.jooq.test.access.generatedclasses.tables.T_725LobTest;
import org.jooq.test.access.generatedclasses.tables.T_785;
import org.jooq.test.access.generatedclasses.tables.records.TAuthorRecord;
import org.jooq.test.access.generatedclasses.tables.records.TBookRecord;
import org.jooq.test.access.generatedclasses.tables.records.TBookStoreRecord;
import org.jooq.test.access.generatedclasses.tables.records.TBookToBookStoreRecord;
import org.jooq.test.access.generatedclasses.tables.records.TBooleansRecord;
import org.jooq.test.access.generatedclasses.tables.records.TDatesRecord;
import org.jooq.test.access.generatedclasses.tables.records.TExoticTypesRecord;
import org.jooq.test.access.generatedclasses.tables.records.TIdentityPkRecord;
import org.jooq.test.access.generatedclasses.tables.records.TIdentityRecord;
import org.jooq.test.access.generatedclasses.tables.records.TTriggersRecord;
import org.jooq.test.access.generatedclasses.tables.records.TUnsignedRecord;
import org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord;
import org.jooq.test.access.generatedclasses.tables.records.T_725LobTestRecord;
import org.jooq.test.access.generatedclasses.tables.records.T_785Record;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;
import org.jooq.types.UShort;
import org.jooq.util.access.AccessDataType;


/**
 * Integration test that creates tables and performs various sql operations.
 *
 * @author Lukas Eder
 */
public class AccessTest extends jOOQAbstractTest<
        TAuthorRecord,
        Object,
        TBookRecord,
        TBookStoreRecord,
        TBookToBookStoreRecord,
        TBookRecord,
        TBookRecord,
        TBookRecord,
        TDatesRecord,
        TBooleansRecord,
        TBookRecord,
        TTriggersRecord,
        TUnsignedRecord,
        TExoticTypesRecord,
        TIdentityRecord,
        TIdentityPkRecord,
        T_725LobTestRecord,
        T_639NumbersTableRecord,
        T_785Record> {

    @Override
    protected DSLContext create0(Settings settings) {
        return DSL.using(getConnection(), SQLDialect.ACCESS, settings);
    }

    @Override
    protected Table<TAuthorRecord> TAuthor() {
        return TAuthor.T_AUTHOR;
    }

    @Override
    protected TableField<TAuthorRecord, String> TAuthor_LAST_NAME() {
        return TAuthor.LAST_NAME;
    }

    @Override
    protected TableField<TAuthorRecord, String> TAuthor_FIRST_NAME() {
        return TAuthor.FIRST_NAME;
    }

    @Override
    protected TableField<TAuthorRecord, Date> TAuthor_DATE_OF_BIRTH() {
        return TAuthor.DATE_OF_BIRTH;
    }

    @Override
    protected TableField<TAuthorRecord, Integer> TAuthor_YEAR_OF_BIRTH() {
        return TAuthor.YEAR_OF_BIRTH;
    }

    @Override
    protected TableField<TAuthorRecord, Integer> TAuthor_ID() {
        return TAuthor.ID;
    }

    @Override
    protected TableField<TAuthorRecord, ? extends UDTRecord<?>> TAuthor_ADDRESS() {
        return null;
    }

    @Override
    protected Table<TBookRecord> TBook() {
        return TBook.T_BOOK;
    }

    @Override
    protected TableField<TBookRecord, Integer> TBook_ID() {
        return TBook.ID;
    }

    @Override
    protected TableField<TBookRecord, Integer> TBook_AUTHOR_ID() {
        return TBook.AUTHOR_ID;
    }

    @Override
    protected TableField<TBookRecord, Integer> TBook_CO_AUTHOR_ID() {
        return TBook.CO_AUTHOR_ID;
    }

    @Override
    protected TableField<TBookRecord, String> TBook_TITLE() {
        return TBook.TITLE;
    }

    @Override
    protected Table<TBookStoreRecord> TBookStore() {
        return TBookStore.T_BOOK_STORE;
    }

    @Override
    protected TableField<TBookStoreRecord, String> TBookStore_NAME() {
        return TBookStore.XNAME;
    }

    @Override
    protected Table<TBookToBookStoreRecord> TBookToBookStore() {
        return T_BOOK_TO_BOOK_STORE;
    }

    @Override
    protected Table<TBookRecord> TBookSale() {
        return null;
    }

    @Override
    protected TableField<TBookToBookStoreRecord, Integer> TBookToBookStore_BOOK_ID() {
        return TBookToBookStore.BOOK_ID;
    }

    @Override
    protected TableField<TBookToBookStoreRecord, String> TBookToBookStore_BOOK_STORE_NAME() {
        return TBookToBookStore.BOOK_STORE_NAME;
    }

    @Override
    protected TableField<TBookToBookStoreRecord, Integer> TBookToBookStore_STOCK() {
        return TBookToBookStore.STOCK;
    }

    @Override
    protected ForeignKey<TBookRecord, TAuthorRecord> FK_T_BOOK_AUTHOR_ID() {
        return null;
    }

    @Override
    protected ForeignKey<TBookRecord, TAuthorRecord> FK_T_BOOK_CO_AUTHOR_ID() {
        return null;
    }

    @Override
    protected Table<T_725LobTestRecord> T725() {
        return T_725LobTest.T_725_LOB_TEST;
    }

    @Override
    protected TableField<T_725LobTestRecord, Integer> T725_ID() {
        return T_725LobTest.ID;
    }

    @Override
    protected TableField<T_725LobTestRecord, byte[]> T725_LOB() {
        return T_725LobTest.LOB;
    }

    @Override
    protected Table<T_785Record> T785() {
        return T_785.T_785;
    }

    @Override
    protected TableField<T_785Record, Integer> T785_ID() {
        return T_785.ID;
    }

    @Override
    protected TableField<T_785Record, String> T785_NAME() {
        return T_785.XNAME;
    }

    @Override
    protected TableField<T_785Record, String> T785_VALUE() {
        return T_785.XVALUE;
    }

    @Override
    protected Table<TUnsignedRecord> TUnsigned() {
        return T_UNSIGNED;
    }

    @Override
    protected TableField<TUnsignedRecord, UByte> TUnsigned_U_BYTE() {
        return TUnsigned.U_BYTE;
    }

    @Override
    protected TableField<TUnsignedRecord, UShort> TUnsigned_U_SHORT() {
        return TUnsigned.U_SHORT;
    }

    @Override
    protected TableField<TUnsignedRecord, UInteger> TUnsigned_U_INT() {
        return TUnsigned.U_INT;
    }

    @Override
    protected TableField<TUnsignedRecord, ULong> TUnsigned_U_LONG() {
        return TUnsigned.U_LONG;
    }

    @Override
    protected Table<TExoticTypesRecord> TExoticTypes() {
        return T_EXOTIC_TYPES;
    }

    @Override
    protected TableField<TExoticTypesRecord, Integer> TExoticTypes_ID() {
        return TExoticTypes.ID;
    }

    @Override
    protected TableField<TExoticTypesRecord, UUID> TExoticTypes_UU() {
        return TExoticTypes.UU;
    }

    @Override
    protected Table<TDatesRecord> TDates() {
        return T_DATES;
    }

    @Override
    protected Table<TBooleansRecord> TBooleans() {
        return T_BOOLEANS;
    }

    @Override
    protected TableField<TBooleansRecord, Integer> TBooleans_ID() {
        return TBooleans.ID;
    }

    @Override
    protected TableField<TBooleansRecord, Boolean_10> TBooleans_BOOLEAN_10() {
        return TBooleans.ONE_ZERO;
    }

    @Override
    protected TableField<TBooleansRecord, Boolean_TF_LC> TBooleans_Boolean_TF_LC() {
        return TBooleans.TRUE_FALSE_LC;
    }

    @Override
    protected TableField<TBooleansRecord, Boolean_TF_UC> TBooleans_Boolean_TF_UC() {
        return TBooleans.TRUE_FALSE_UC;
    }

    @Override
    protected TableField<TBooleansRecord, Boolean_YN_LC> TBooleans_Boolean_YN_LC() {
        return TBooleans.Y_N_LC;
    }

    @Override
    protected TableField<TBooleansRecord, Boolean_YN_UC> TBooleans_Boolean_YN_UC() {
        return TBooleans.Y_N_UC;
    }

    @Override
    protected TableField<TBooleansRecord, Boolean_YES_NO_LC> TBooleans_Boolean_YES_NO_LC() {
        return TBooleans.YES_NO_LC;
    }

    @Override
    protected TableField<TBooleansRecord, Boolean_YES_NO_UC> TBooleans_Boolean_YES_NO_UC() {
        return TBooleans.YES_NO_UC;
    }

    @Override
    protected TableField<TBooleansRecord, Boolean> TBooleans_VC() {
        return TBooleans.VC_BOOLEAN;
    }

    @Override
    protected TableField<TBooleansRecord, Boolean> TBooleans_C() {
        return TBooleans.C_BOOLEAN;
    }

    @Override
    protected TableField<TBooleansRecord, Boolean> TBooleans_N() {
        return TBooleans.N_BOOLEAN;
    }

    @Override
    protected Table<T_639NumbersTableRecord> T639() {
        return T_639NumbersTable.T_639_NUMBERS_TABLE;
    }

    @Override
    protected TableField<T_639NumbersTableRecord, Integer> T639_ID() {
        return T_639NumbersTable.ID;
    }

    @Override
    protected TableField<T_639NumbersTableRecord, BigDecimal> T639_BIG_DECIMAL() {
        return T_639NumbersTable.BIG_DECIMAL;
    }

    @Override
    protected TableField<T_639NumbersTableRecord, BigInteger> T639_BIG_INTEGER() {
        return T_639NumbersTable.BIG_INTEGER;
    }

    @Override
    protected TableField<T_639NumbersTableRecord, Byte> T639_BYTE() {
        return T_639NumbersTable.XBYTE;
    }

    @Override
    protected TableField<T_639NumbersTableRecord, Byte> T639_BYTE_DECIMAL() {
        return T_639NumbersTable.BYTE_DECIMAL;
    }

    @Override
    protected TableField<T_639NumbersTableRecord, Short> T639_SHORT() {
        return T_639NumbersTable.XSHORT;
    }

    @Override
    protected TableField<T_639NumbersTableRecord, Short> T639_SHORT_DECIMAL() {
        return T_639NumbersTable.SHORT_DECIMAL;
    }

    @Override
    protected TableField<T_639NumbersTableRecord, Integer> T639_INTEGER() {
        return T_639NumbersTable.XINTEGER;
    }

    @Override
    protected TableField<T_639NumbersTableRecord, Integer> T639_INTEGER_DECIMAL() {
        return T_639NumbersTable.INTEGER_DECIMAL;
    }

    @Override
    protected TableField<T_639NumbersTableRecord, Long> T639_LONG() {
        return T_639NumbersTable.XLONG;
    }

    @Override
    protected TableField<T_639NumbersTableRecord, Long> T639_LONG_DECIMAL() {
        return T_639NumbersTable.LONG_DECIMAL;
    }

    @Override
    protected TableField<T_639NumbersTableRecord, Double> T639_DOUBLE() {
        return T_639NumbersTable.XDOUBLE;
    }

    @Override
    protected TableField<T_639NumbersTableRecord, Float> T639_FLOAT() {
        return null;
    }

    @Override
    protected Table<TBookRecord> TArrays() {
        return null;
    }

    @Override
    protected TableField<TBookRecord, Integer> TArrays_ID() {
        return null;
    }

    @Override
    protected TableField<TBookRecord, String[]> TArrays_STRING() {
        return null;
    }

    @Override
    protected TableField<TBookRecord, Integer[]> TArrays_NUMBER() {
        return null;
    }

    @Override
    protected TableField<TBookRecord, Date[]> TArrays_DATE() {
        return null;
    }

    @Override
    protected TableField<TBookRecord, ArrayRecord<String>> TArrays_STRING_R() {
        return null;
    }

    @Override
    protected TableField<TBookRecord, ArrayRecord<Integer>> TArrays_NUMBER_R() {
        return null;
    }

    @Override
    protected TableField<TBookRecord, ArrayRecord<Date>> TArrays_DATE_R() {
        return null;
    }

    @Override
    protected TableField<TBookRecord, ? extends ArrayRecord<Long>> TArrays_NUMBER_LONG_R() {
        return null;
    }

    @Override
    protected TableField<TBookRecord, Integer> TBook_LANGUAGE_ID() {
        return TBook.LANGUAGE_ID;
    }

    @Override
    protected TableField<TBookRecord, Integer> TBook_PUBLISHED_IN() {
        return TBook.PUBLISHED_IN;
    }

    @Override
    protected TableField<TBookRecord, String> TBook_CONTENT_TEXT() {
        return TBook.CONTENT_TEXT;
    }

    @Override
    protected TableField<TBookRecord, byte[]> TBook_CONTENT_PDF() {
        return TBook.CONTENT_PDF;
    }

    @Override
    protected TableField<TBookRecord, ? extends Enum<?>> TBook_STATUS() {
        return null;
    }

    @Override
    protected Table<TBookRecord> VLibrary() {
        return null;
    }

    @Override
    protected TableField<TBookRecord, String> VLibrary_TITLE() {
        return null;
    }

    @Override
    protected TableField<TBookRecord, String> VLibrary_AUTHOR() {
        return null;
    }

    @Override
    protected Table<?> VAuthor() {
        return null;
    }

    @Override
    protected Table<?> VBook() {
        return null;
    }

    @Override
    protected Table<TBookRecord> TDirectory() {
        return null;
    }

    @Override
    protected TableField<TBookRecord, Integer> TDirectory_ID() {
        return null;
    }

    @Override
    protected TableField<TBookRecord, Integer> TDirectory_PARENT_ID() {
        return null;
    }

    @Override
    protected TableField<TBookRecord, Integer> TDirectory_IS_DIRECTORY() {
        return null;
    }

    @Override
    protected TableField<TBookRecord, String> TDirectory_NAME() {
        return null;
    }

    @Override
    protected Table<TTriggersRecord> TTriggers() {
        return TTriggers.T_TRIGGERS;
    }

    @Override
    protected TableField<TTriggersRecord, Integer> TTriggers_ID_GENERATED() {
        return TTriggers.ID_GENERATED;
    }

    @Override
    protected TableField<TTriggersRecord, Integer> TTriggers_ID() {
        return TTriggers.ID;
    }

    @Override
    protected TableField<TTriggersRecord, Integer> TTriggers_COUNTER() {
        return TTriggers.XINTEGER;
    }

    @Override
    protected Table<TIdentityRecord> TIdentity() {
        return T_IDENTITY;
    }

    @Override
    protected TableField<TIdentityRecord, Integer> TIdentity_ID() {
        return TIdentity.ID;
    }

    @Override
    protected TableField<TIdentityRecord, Integer> TIdentity_VAL() {
        return TIdentity.VAL;
    }

    @Override
    protected Table<TIdentityPkRecord> TIdentityPK() {
        return T_IDENTITY_PK;
    }

    @Override
    protected TableField<TIdentityPkRecord, Integer> TIdentityPK_ID() {
        return TIdentityPk.ID;
    }

    @Override
    protected TableField<TIdentityPkRecord, Integer> TIdentityPK_VAL() {
        return TIdentityPk.VAL;
    }

    @Override
    protected Field<? extends Number> FAuthorExistsField(String authorName) {
        return null;
    }

    @Override
    protected Field<? extends Number> FOneField() {
        return null;
    }

    @Override
    protected Field<? extends Number> FNumberField(Number n) {
        return null;
    }

    @Override
    protected Field<? extends Number> FNumberField(Field<? extends Number> n) {
        return null;
    }

    @Override
    protected Field<? extends Number> F317Field(Number n1, Number n2, Number n3, Number n4) {
        return null;
    }

    @Override
    protected Field<? extends Number> F317Field(Field<? extends Number> n1, Field<? extends Number> n2,
        Field<? extends Number> n3, Field<? extends Number> n4) {
        return null;
    }

    @Override
    protected Field<Result<Record>> FGetOneCursorField(Integer[] array) {
        return null;
    }

    @Override
    protected Field<Integer[]> FArrays1Field(Field<Integer[]> array) {
        return null;
    }


    @Override
    protected Field<Long[]> FArrays2Field(Field<Long[]> array) {
        return null;
    }


    @Override
    protected Field<String[]> FArrays3Field(Field<String[]> array) {
        return null;
    }


    @Override
    protected <T extends ArrayRecord<Integer>> Field<T> FArrays1Field_R(Field<T> array) {
        return null;
    }


    @Override
    protected <T extends ArrayRecord<Long>> Field<T> FArrays2Field_R(Field<T> array) {
        return null;
    }


    @Override
    protected <T extends ArrayRecord<String>> Field<T> FArrays3Field_R(Field<T> array) {
        return null;
    }


    @Override
    protected Class<? extends UDTRecord<?>> cUAddressType() {
        return null;
    }

    @Override
    protected Class<? extends UDTRecord<?>> cUStreetType() {
        return null;
    }

    @Override
    protected Class<?> cRoutines() {
        return null;
    }

    @Override
    protected boolean supportsOUTParameters() {
        return false;
    }

    @Override
    protected boolean supportsReferences() {
        return true;
    }

    @Override
    protected boolean supportsRecursiveQueries() {
        return false;
    }

    @Override
    protected Class<?> cLibrary() {
        return null;
    }

    @Override
    protected Class<?> cSequences() {
        return null;
    }

    @Override
    protected TableField<TBookRecord, ? extends UDTRecord<?>[]> TArrays_UDT() {
        return null;
    }

    @Override
    protected DataType<?>[] getCastableDataTypes() {
        return new DataType<?>[] {
            AccessDataType.BIGINT,
            AccessDataType.BINARY,
            AccessDataType.BINARYLARGEOBJECT,
            AccessDataType.BIT,
            AccessDataType.BOOLEAN,
            AccessDataType.CHAR,
            AccessDataType.CHARACTER,
            AccessDataType.CHARACTERLARGEOBJECT,
            AccessDataType.CHARACTERVARYING,
            AccessDataType.CHARLARGEOBJECT,
            AccessDataType.DATE,
            AccessDataType.DATETIME,
            AccessDataType.DECIMAL,
            AccessDataType.DOUBLE,
            AccessDataType.DOUBLEPRECISION,
            AccessDataType.FLOAT,
            AccessDataType.INT,
            AccessDataType.INTEGER,
            AccessDataType.LONGVARBINARY,
            AccessDataType.LONGVARCHAR,
            AccessDataType.NUMERIC,
            AccessDataType.OBJECT,
            AccessDataType.OTHER,
            AccessDataType.REAL,
            AccessDataType.SMALLINT,
            AccessDataType.TIME,
            AccessDataType.TIMESTAMP,
            AccessDataType.TINYINT,
            AccessDataType.VARBINARY,
            AccessDataType.VARCHAR,
            AccessDataType.VARCHARIGNORECASE,
        };
    }
}
