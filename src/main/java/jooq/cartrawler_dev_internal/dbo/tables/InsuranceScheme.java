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
import jooq.cartrawler_dev_internal.dbo.tables.records.InsuranceSchemeRecord;

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
public class InsuranceScheme extends TableImpl<InsuranceSchemeRecord> {

    private static final long serialVersionUID = -963436896;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.insurance_scheme</code>
     */
    public static final InsuranceScheme INSURANCE_SCHEME = new InsuranceScheme();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InsuranceSchemeRecord> getRecordType() {
        return InsuranceSchemeRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.insurance_scheme.ID</code>.
     */
    public final TableField<InsuranceSchemeRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.insurance_scheme.fk_insurance_product</code>.
     */
    public final TableField<InsuranceSchemeRecord, Integer> FK_INSURANCE_PRODUCT = createField("fk_insurance_product", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.insurance_scheme.series</code>.
     */
    public final TableField<InsuranceSchemeRecord, Integer> SERIES = createField("series", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.insurance_scheme.iso2_country</code>.
     */
    public final TableField<InsuranceSchemeRecord, String> ISO2_COUNTRY = createField("iso2_country", org.jooq.impl.SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.insurance_scheme.excess_amount</code>.
     */
    public final TableField<InsuranceSchemeRecord, BigDecimal> EXCESS_AMOUNT = createField("excess_amount", org.jooq.impl.SQLDataType.NUMERIC(19, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.insurance_scheme.excess_currency</code>.
     */
    public final TableField<InsuranceSchemeRecord, String> EXCESS_CURRENCY = createField("excess_currency", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.insurance_scheme</code> table reference
     */
    public InsuranceScheme() {
        this(DSL.name("insurance_scheme"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.insurance_scheme</code> table reference
     */
    public InsuranceScheme(String alias) {
        this(DSL.name(alias), INSURANCE_SCHEME);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.insurance_scheme</code> table reference
     */
    public InsuranceScheme(Name alias) {
        this(alias, INSURANCE_SCHEME);
    }

    private InsuranceScheme(Name alias, Table<InsuranceSchemeRecord> aliased) {
        this(alias, aliased, null);
    }

    private InsuranceScheme(Name alias, Table<InsuranceSchemeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InsuranceScheme(Table<O> child, ForeignKey<O, InsuranceSchemeRecord> key) {
        super(child, key, INSURANCE_SCHEME);
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
        return Arrays.<Index>asList(Indexes.INSURANCE_SCHEME_PK_INSURANCE_SCHEME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<InsuranceSchemeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_INSURANCE_SCHEME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<InsuranceSchemeRecord> getPrimaryKey() {
        return Keys.PK_INSURANCE_SCHEME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InsuranceSchemeRecord>> getKeys() {
        return Arrays.<UniqueKey<InsuranceSchemeRecord>>asList(Keys.PK_INSURANCE_SCHEME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsuranceScheme as(String alias) {
        return new InsuranceScheme(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsuranceScheme as(Name alias) {
        return new InsuranceScheme(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InsuranceScheme rename(String name) {
        return new InsuranceScheme(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InsuranceScheme rename(Name name) {
        return new InsuranceScheme(name, null);
    }
}
