/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.CurrencyXmldownloadRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CurrencyXmldownload extends TableImpl<CurrencyXmldownloadRecord> {

    private static final long serialVersionUID = -839214747;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Currency_XMLDownload</code>
     */
    public static final CurrencyXmldownload CURRENCY_XMLDOWNLOAD = new CurrencyXmldownload();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CurrencyXmldownloadRecord> getRecordType() {
        return CurrencyXmldownloadRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Currency_XMLDownload.id</code>.
     */
    public final TableField<CurrencyXmldownloadRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Currency_XMLDownload.dowload_date</code>.
     */
    public final TableField<CurrencyXmldownloadRecord, Timestamp> DOWLOAD_DATE = createField("dowload_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Currency_XMLDownload.xml_text</code>.
     */
    public final TableField<CurrencyXmldownloadRecord, String> XML_TEXT = createField("xml_text", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Currency_XMLDownload.download_date_only</code>.
     */
    public final TableField<CurrencyXmldownloadRecord, Timestamp> DOWNLOAD_DATE_ONLY = createField("download_date_only", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Currency_XMLDownload</code> table reference
     */
    public CurrencyXmldownload() {
        this(DSL.name("Currency_XMLDownload"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Currency_XMLDownload</code> table reference
     */
    public CurrencyXmldownload(String alias) {
        this(DSL.name(alias), CURRENCY_XMLDOWNLOAD);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Currency_XMLDownload</code> table reference
     */
    public CurrencyXmldownload(Name alias) {
        this(alias, CURRENCY_XMLDOWNLOAD);
    }

    private CurrencyXmldownload(Name alias, Table<CurrencyXmldownloadRecord> aliased) {
        this(alias, aliased, null);
    }

    private CurrencyXmldownload(Name alias, Table<CurrencyXmldownloadRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CurrencyXmldownload(Table<O> child, ForeignKey<O, CurrencyXmldownloadRecord> key) {
        super(child, key, CURRENCY_XMLDOWNLOAD);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dbo.DBO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CURRENCY_XMLDOWNLOAD_PK_CURRENCY_XMLDOWNLOAD);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CurrencyXmldownloadRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CURRENCY_XMLDOWNLOAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CurrencyXmldownloadRecord> getPrimaryKey() {
        return Keys.PK_CURRENCY_XMLDOWNLOAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CurrencyXmldownloadRecord>> getKeys() {
        return Arrays.<UniqueKey<CurrencyXmldownloadRecord>>asList(Keys.PK_CURRENCY_XMLDOWNLOAD);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CurrencyXmldownload as(String alias) {
        return new CurrencyXmldownload(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CurrencyXmldownload as(Name alias) {
        return new CurrencyXmldownload(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CurrencyXmldownload rename(String name) {
        return new CurrencyXmldownload(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CurrencyXmldownload rename(Name name) {
        return new CurrencyXmldownload(name, null);
    }
}
