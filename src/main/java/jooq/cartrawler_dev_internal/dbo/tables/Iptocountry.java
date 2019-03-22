/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.IptocountryRecord;

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
public class Iptocountry extends TableImpl<IptocountryRecord> {

    private static final long serialVersionUID = -97132843;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.IpToCountry</code>
     */
    public static final Iptocountry IPTOCOUNTRY = new Iptocountry();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IptocountryRecord> getRecordType() {
        return IptocountryRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.IpToCountry.ipfrom</code>.
     */
    public final TableField<IptocountryRecord, Long> IPFROM = createField("ipfrom", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.IpToCountry.ipto</code>.
     */
    public final TableField<IptocountryRecord, Long> IPTO = createField("ipto", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.IpToCountry.registry</code>.
     */
    public final TableField<IptocountryRecord, String> REGISTRY = createField("registry", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.IpToCountry.assigned</code>.
     */
    public final TableField<IptocountryRecord, String> ASSIGNED = createField("assigned", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.IpToCountry.ctry</code>.
     */
    public final TableField<IptocountryRecord, String> CTRY = createField("ctry", org.jooq.impl.SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.IpToCountry.cntry</code>.
     */
    public final TableField<IptocountryRecord, String> CNTRY = createField("cntry", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.IpToCountry.country</code>.
     */
    public final TableField<IptocountryRecord, String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.IpToCountry</code> table reference
     */
    public Iptocountry() {
        this(DSL.name("IpToCountry"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.IpToCountry</code> table reference
     */
    public Iptocountry(String alias) {
        this(DSL.name(alias), IPTOCOUNTRY);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.IpToCountry</code> table reference
     */
    public Iptocountry(Name alias) {
        this(alias, IPTOCOUNTRY);
    }

    private Iptocountry(Name alias, Table<IptocountryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Iptocountry(Name alias, Table<IptocountryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Iptocountry(Table<O> child, ForeignKey<O, IptocountryRecord> key) {
        super(child, key, IPTOCOUNTRY);
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
        return Arrays.<Index>asList(Indexes.IPTOCOUNTRY_PK_IPTOCOUNTRY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<IptocountryRecord> getPrimaryKey() {
        return Keys.PK_IPTOCOUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<IptocountryRecord>> getKeys() {
        return Arrays.<UniqueKey<IptocountryRecord>>asList(Keys.PK_IPTOCOUNTRY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Iptocountry as(String alias) {
        return new Iptocountry(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Iptocountry as(Name alias) {
        return new Iptocountry(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Iptocountry rename(String name) {
        return new Iptocountry(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Iptocountry rename(Name name) {
        return new Iptocountry(name, null);
    }
}