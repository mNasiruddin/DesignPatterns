/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.SpacemonitorRecord;

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
public class Spacemonitor extends TableImpl<SpacemonitorRecord> {

    private static final long serialVersionUID = -1889327506;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.SpaceMonitor</code>
     */
    public static final Spacemonitor SPACEMONITOR = new Spacemonitor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SpacemonitorRecord> getRecordType() {
        return SpacemonitorRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SpaceMonitor.databasename</code>.
     */
    public final TableField<SpacemonitorRecord, String> DATABASENAME = createField("databasename", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SpaceMonitor.logsize_MB</code>.
     */
    public final TableField<SpacemonitorRecord, BigDecimal> LOGSIZE_MB = createField("logsize_MB", org.jooq.impl.SQLDataType.NUMERIC(8, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SpaceMonitor.row_size</code>.
     */
    public final TableField<SpacemonitorRecord, BigDecimal> ROW_SIZE = createField("row_size", org.jooq.impl.SQLDataType.NUMERIC(8, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SpaceMonitor.total_size</code>.
     */
    public final TableField<SpacemonitorRecord, BigDecimal> TOTAL_SIZE = createField("total_size", org.jooq.impl.SQLDataType.NUMERIC(8, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SpaceMonitor.updatedate</code>.
     */
    public final TableField<SpacemonitorRecord, Timestamp> UPDATEDATE = createField("updatedate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.SpaceMonitor</code> table reference
     */
    public Spacemonitor() {
        this(DSL.name("SpaceMonitor"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.SpaceMonitor</code> table reference
     */
    public Spacemonitor(String alias) {
        this(DSL.name(alias), SPACEMONITOR);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.SpaceMonitor</code> table reference
     */
    public Spacemonitor(Name alias) {
        this(alias, SPACEMONITOR);
    }

    private Spacemonitor(Name alias, Table<SpacemonitorRecord> aliased) {
        this(alias, aliased, null);
    }

    private Spacemonitor(Name alias, Table<SpacemonitorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Spacemonitor(Table<O> child, ForeignKey<O, SpacemonitorRecord> key) {
        super(child, key, SPACEMONITOR);
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
    public Spacemonitor as(String alias) {
        return new Spacemonitor(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Spacemonitor as(Name alias) {
        return new Spacemonitor(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Spacemonitor rename(String name) {
        return new Spacemonitor(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Spacemonitor rename(Name name) {
        return new Spacemonitor(name, null);
    }
}
