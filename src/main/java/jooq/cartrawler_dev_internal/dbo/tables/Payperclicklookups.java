/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.PayperclicklookupsRecord;

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
import org.jooq.types.UByte;


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
public class Payperclicklookups extends TableImpl<PayperclicklookupsRecord> {

    private static final long serialVersionUID = 1046424695;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.PayPerClickLookups</code>
     */
    public static final Payperclicklookups PAYPERCLICKLOOKUPS = new Payperclicklookups();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PayperclicklookupsRecord> getRecordType() {
        return PayperclicklookupsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayPerClickLookups.id</code>.
     */
    public final TableField<PayperclicklookupsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayPerClickLookups.location_ID</code>.
     */
    public final TableField<PayperclicklookupsRecord, Integer> LOCATION_ID = createField("location_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayPerClickLookups.country_ID</code>.
     */
    public final TableField<PayperclicklookupsRecord, String> COUNTRY_ID = createField("country_ID", org.jooq.impl.SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayPerClickLookups.keyword</code>.
     */
    public final TableField<PayperclicklookupsRecord, String> KEYWORD = createField("keyword", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayPerClickLookups.price</code>.
     */
    public final TableField<PayperclicklookupsRecord, BigDecimal> PRICE = createField("price", org.jooq.impl.SQLDataType.NUMERIC(19, 4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayPerClickLookups.topPosition</code>.
     */
    public final TableField<PayperclicklookupsRecord, UByte> TOPPOSITION = createField("topPosition", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.PayPerClickLookups</code> table reference
     */
    public Payperclicklookups() {
        this(DSL.name("PayPerClickLookups"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.PayPerClickLookups</code> table reference
     */
    public Payperclicklookups(String alias) {
        this(DSL.name(alias), PAYPERCLICKLOOKUPS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.PayPerClickLookups</code> table reference
     */
    public Payperclicklookups(Name alias) {
        this(alias, PAYPERCLICKLOOKUPS);
    }

    private Payperclicklookups(Name alias, Table<PayperclicklookupsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Payperclicklookups(Name alias, Table<PayperclicklookupsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Payperclicklookups(Table<O> child, ForeignKey<O, PayperclicklookupsRecord> key) {
        super(child, key, PAYPERCLICKLOOKUPS);
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
        return Arrays.<Index>asList(Indexes.PAYPERCLICKLOOKUPS_PK_PAYPERCLICKLOOKUPS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PayperclicklookupsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PAYPERCLICKLOOKUPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PayperclicklookupsRecord> getPrimaryKey() {
        return Keys.PK_PAYPERCLICKLOOKUPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PayperclicklookupsRecord>> getKeys() {
        return Arrays.<UniqueKey<PayperclicklookupsRecord>>asList(Keys.PK_PAYPERCLICKLOOKUPS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Payperclicklookups as(String alias) {
        return new Payperclicklookups(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Payperclicklookups as(Name alias) {
        return new Payperclicklookups(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Payperclicklookups rename(String name) {
        return new Payperclicklookups(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Payperclicklookups rename(Name name) {
        return new Payperclicklookups(name, null);
    }
}
