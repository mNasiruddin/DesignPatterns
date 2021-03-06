/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.LatlongCountrycodeRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class LatlongCountrycode extends TableImpl<LatlongCountrycodeRecord> {

    private static final long serialVersionUID = 1340479247;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.latlong_countrycode</code>
     */
    public static final LatlongCountrycode LATLONG_COUNTRYCODE = new LatlongCountrycode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LatlongCountrycodeRecord> getRecordType() {
        return LatlongCountrycodeRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.latlong_countrycode.guid</code>.
     */
    public final TableField<LatlongCountrycodeRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.latlong_countrycode.name</code>.
     */
    public final TableField<LatlongCountrycodeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.latlong_countrycode.alpha2</code>.
     */
    public final TableField<LatlongCountrycodeRecord, String> ALPHA2 = createField("alpha2", org.jooq.impl.SQLDataType.CHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.latlong_countrycode.alpha3</code>.
     */
    public final TableField<LatlongCountrycodeRecord, String> ALPHA3 = createField("alpha3", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.latlong_countrycode.number</code>.
     */
    public final TableField<LatlongCountrycodeRecord, String> NUMBER = createField("number", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.latlong_countrycode</code> table reference
     */
    public LatlongCountrycode() {
        this(DSL.name("latlong_countrycode"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.latlong_countrycode</code> table reference
     */
    public LatlongCountrycode(String alias) {
        this(DSL.name(alias), LATLONG_COUNTRYCODE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.latlong_countrycode</code> table reference
     */
    public LatlongCountrycode(Name alias) {
        this(alias, LATLONG_COUNTRYCODE);
    }

    private LatlongCountrycode(Name alias, Table<LatlongCountrycodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private LatlongCountrycode(Name alias, Table<LatlongCountrycodeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> LatlongCountrycode(Table<O> child, ForeignKey<O, LatlongCountrycodeRecord> key) {
        super(child, key, LATLONG_COUNTRYCODE);
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
        return Arrays.<Index>asList(Indexes.LATLONG_COUNTRYCODE_PK_LATLONG_COUNTRYCODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LatlongCountrycodeRecord> getPrimaryKey() {
        return Keys.PK_LATLONG_COUNTRYCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LatlongCountrycodeRecord>> getKeys() {
        return Arrays.<UniqueKey<LatlongCountrycodeRecord>>asList(Keys.PK_LATLONG_COUNTRYCODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LatlongCountrycode as(String alias) {
        return new LatlongCountrycode(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LatlongCountrycode as(Name alias) {
        return new LatlongCountrycode(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LatlongCountrycode rename(String name) {
        return new LatlongCountrycode(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LatlongCountrycode rename(Name name) {
        return new LatlongCountrycode(name, null);
    }
}
