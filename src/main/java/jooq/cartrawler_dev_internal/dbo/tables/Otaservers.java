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
import jooq.cartrawler_dev_internal.dbo.tables.records.OtaserversRecord;

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
public class Otaservers extends TableImpl<OtaserversRecord> {

    private static final long serialVersionUID = 332129597;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.OTAServers</code>
     */
    public static final Otaservers OTASERVERS = new Otaservers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OtaserversRecord> getRecordType() {
        return OtaserversRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OTAServers.Id</code>.
     */
    public final TableField<OtaserversRecord, Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OTAServers.url</code>.
     */
    public final TableField<OtaserversRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OTAServers.production</code>.
     */
    public final TableField<OtaserversRecord, Boolean> PRODUCTION = createField("production", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OTAServers.username</code>.
     */
    public final TableField<OtaserversRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OTAServers.password</code>.
     */
    public final TableField<OtaserversRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.OTAServers.status</code>.
     */
    public final TableField<OtaserversRecord, Boolean> STATUS = createField("status", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.OTAServers</code> table reference
     */
    public Otaservers() {
        this(DSL.name("OTAServers"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.OTAServers</code> table reference
     */
    public Otaservers(String alias) {
        this(DSL.name(alias), OTASERVERS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.OTAServers</code> table reference
     */
    public Otaservers(Name alias) {
        this(alias, OTASERVERS);
    }

    private Otaservers(Name alias, Table<OtaserversRecord> aliased) {
        this(alias, aliased, null);
    }

    private Otaservers(Name alias, Table<OtaserversRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Otaservers(Table<O> child, ForeignKey<O, OtaserversRecord> key) {
        super(child, key, OTASERVERS);
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
        return Arrays.<Index>asList(Indexes.OTASERVERS_PK_OTASERVERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OtaserversRecord, Integer> getIdentity() {
        return Keys.IDENTITY_OTASERVERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OtaserversRecord> getPrimaryKey() {
        return Keys.PK_OTASERVERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OtaserversRecord>> getKeys() {
        return Arrays.<UniqueKey<OtaserversRecord>>asList(Keys.PK_OTASERVERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Otaservers as(String alias) {
        return new Otaservers(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Otaservers as(Name alias) {
        return new Otaservers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Otaservers rename(String name) {
        return new Otaservers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Otaservers rename(Name name) {
        return new Otaservers(name, null);
    }
}
