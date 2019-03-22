/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.LflscrapetableRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class Lflscrapetable extends TableImpl<LflscrapetableRecord> {

    private static final long serialVersionUID = 1553371049;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.LFLScrapeTable</code>
     */
    public static final Lflscrapetable LFLSCRAPETABLE = new Lflscrapetable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LflscrapetableRecord> getRecordType() {
        return LflscrapetableRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LFLScrapeTable.id</code>.
     */
    public final TableField<LflscrapetableRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LFLScrapeTable.line</code>.
     */
    public final TableField<LflscrapetableRecord, String> LINE = createField("line", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LFLScrapeTable.location</code>.
     */
    public final TableField<LflscrapetableRecord, String> LOCATION = createField("location", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LFLScrapeTable.scrapeTime</code>.
     */
    public final TableField<LflscrapetableRecord, Timestamp> SCRAPETIME = createField("scrapeTime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LFLScrapeTable.pickup</code>.
     */
    public final TableField<LflscrapetableRecord, Timestamp> PICKUP = createField("pickup", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LFLScrapeTable.dropoff</code>.
     */
    public final TableField<LflscrapetableRecord, Timestamp> DROPOFF = createField("dropoff", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LFLScrapeTable.runtime</code>.
     */
    public final TableField<LflscrapetableRecord, Long> RUNTIME = createField("runtime", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LFLScrapeTable.ip_addr</code>.
     */
    public final TableField<LflscrapetableRecord, String> IP_ADDR = createField("ip_addr", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LFLScrapeTable.size</code>.
     */
    public final TableField<LflscrapetableRecord, Integer> SIZE = createField("size", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.LFLScrapeTable</code> table reference
     */
    public Lflscrapetable() {
        this(DSL.name("LFLScrapeTable"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.LFLScrapeTable</code> table reference
     */
    public Lflscrapetable(String alias) {
        this(DSL.name(alias), LFLSCRAPETABLE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.LFLScrapeTable</code> table reference
     */
    public Lflscrapetable(Name alias) {
        this(alias, LFLSCRAPETABLE);
    }

    private Lflscrapetable(Name alias, Table<LflscrapetableRecord> aliased) {
        this(alias, aliased, null);
    }

    private Lflscrapetable(Name alias, Table<LflscrapetableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Lflscrapetable(Table<O> child, ForeignKey<O, LflscrapetableRecord> key) {
        super(child, key, LFLSCRAPETABLE);
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
    public Identity<LflscrapetableRecord, Integer> getIdentity() {
        return Keys.IDENTITY_LFLSCRAPETABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Lflscrapetable as(String alias) {
        return new Lflscrapetable(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Lflscrapetable as(Name alias) {
        return new Lflscrapetable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Lflscrapetable rename(String name) {
        return new Lflscrapetable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Lflscrapetable rename(Name name) {
        return new Lflscrapetable(name, null);
    }
}