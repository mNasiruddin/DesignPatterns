/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.Ip4tocountryderivedRecord;

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
public class Ip4tocountryderived extends TableImpl<Ip4tocountryderivedRecord> {

    private static final long serialVersionUID = -1587842679;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.ip4ToCountryDerived</code>
     */
    public static final Ip4tocountryderived IP4TOCOUNTRYDERIVED = new Ip4tocountryderived();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Ip4tocountryderivedRecord> getRecordType() {
        return Ip4tocountryderivedRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ip4ToCountryDerived.ipfrom</code>.
     */
    public final TableField<Ip4tocountryderivedRecord, Integer> IPFROM = createField("ipfrom", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ip4ToCountryDerived.country_id</code>.
     */
    public final TableField<Ip4tocountryderivedRecord, String> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.CHAR(2).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ip4ToCountryDerived.ipto</code>.
     */
    public final TableField<Ip4tocountryderivedRecord, Integer> IPTO = createField("ipto", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.ip4ToCountryDerived</code> table reference
     */
    public Ip4tocountryderived() {
        this(DSL.name("ip4ToCountryDerived"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ip4ToCountryDerived</code> table reference
     */
    public Ip4tocountryderived(String alias) {
        this(DSL.name(alias), IP4TOCOUNTRYDERIVED);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ip4ToCountryDerived</code> table reference
     */
    public Ip4tocountryderived(Name alias) {
        this(alias, IP4TOCOUNTRYDERIVED);
    }

    private Ip4tocountryderived(Name alias, Table<Ip4tocountryderivedRecord> aliased) {
        this(alias, aliased, null);
    }

    private Ip4tocountryderived(Name alias, Table<Ip4tocountryderivedRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Ip4tocountryderived(Table<O> child, ForeignKey<O, Ip4tocountryderivedRecord> key) {
        super(child, key, IP4TOCOUNTRYDERIVED);
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
    public Ip4tocountryderived as(String alias) {
        return new Ip4tocountryderived(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Ip4tocountryderived as(Name alias) {
        return new Ip4tocountryderived(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Ip4tocountryderived rename(String name) {
        return new Ip4tocountryderived(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Ip4tocountryderived rename(Name name) {
        return new Ip4tocountryderived(name, null);
    }
}
