/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.IsocountryTempRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class IsocountryTemp extends TableImpl<IsocountryTempRecord> {

    private static final long serialVersionUID = -2077645814;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.isocountry_temp</code>
     */
    public static final IsocountryTemp ISOCOUNTRY_TEMP = new IsocountryTemp();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IsocountryTempRecord> getRecordType() {
        return IsocountryTempRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.isocountry_temp.country_id</code>.
     */
    public final TableField<IsocountryTempRecord, String> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.VARCHAR(8).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.isocountry_temp.country_name</code>.
     */
    public final TableField<IsocountryTempRecord, String> COUNTRY_NAME = createField("country_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.isocountry_temp.ISO3</code>.
     */
    public final TableField<IsocountryTempRecord, String> ISO3 = createField("ISO3", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.isocountry_temp</code> table reference
     */
    public IsocountryTemp() {
        this(DSL.name("isocountry_temp"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.isocountry_temp</code> table reference
     */
    public IsocountryTemp(String alias) {
        this(DSL.name(alias), ISOCOUNTRY_TEMP);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.isocountry_temp</code> table reference
     */
    public IsocountryTemp(Name alias) {
        this(alias, ISOCOUNTRY_TEMP);
    }

    private IsocountryTemp(Name alias, Table<IsocountryTempRecord> aliased) {
        this(alias, aliased, null);
    }

    private IsocountryTemp(Name alias, Table<IsocountryTempRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> IsocountryTemp(Table<O> child, ForeignKey<O, IsocountryTempRecord> key) {
        super(child, key, ISOCOUNTRY_TEMP);
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
    public IsocountryTemp as(String alias) {
        return new IsocountryTemp(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IsocountryTemp as(Name alias) {
        return new IsocountryTemp(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IsocountryTemp rename(String name) {
        return new IsocountryTemp(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IsocountryTemp rename(Name name) {
        return new IsocountryTemp(name, null);
    }
}
