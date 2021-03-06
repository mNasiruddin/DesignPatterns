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
import jooq.cartrawler_dev_internal.dbo.tables.records.OtaReloadRecord;

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
public class OtaReload extends TableImpl<OtaReloadRecord> {

    private static final long serialVersionUID = 467890235;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.ota_reload</code>
     */
    public static final OtaReload OTA_RELOAD = new OtaReload();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OtaReloadRecord> getRecordType() {
        return OtaReloadRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ota_reload.id</code>.
     */
    public final TableField<OtaReloadRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ota_reload.reload_key</code>.
     */
    public final TableField<OtaReloadRecord, String> RELOAD_KEY = createField("reload_key", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ota_reload.reload_in_progress</code>.
     */
    public final TableField<OtaReloadRecord, Boolean> RELOAD_IN_PROGRESS = createField("reload_in_progress", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ota_reload.last_change_time</code>.
     */
    public final TableField<OtaReloadRecord, Long> LAST_CHANGE_TIME = createField("last_change_time", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.ota_reload</code> table reference
     */
    public OtaReload() {
        this(DSL.name("ota_reload"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ota_reload</code> table reference
     */
    public OtaReload(String alias) {
        this(DSL.name(alias), OTA_RELOAD);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ota_reload</code> table reference
     */
    public OtaReload(Name alias) {
        this(alias, OTA_RELOAD);
    }

    private OtaReload(Name alias, Table<OtaReloadRecord> aliased) {
        this(alias, aliased, null);
    }

    private OtaReload(Name alias, Table<OtaReloadRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> OtaReload(Table<O> child, ForeignKey<O, OtaReloadRecord> key) {
        super(child, key, OTA_RELOAD);
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
        return Arrays.<Index>asList(Indexes.OTA_RELOAD_PK_OTA_RELOAD, Indexes.OTA_RELOAD_PK_OTA_RELOAD_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OtaReloadRecord, Integer> getIdentity() {
        return Keys.IDENTITY_OTA_RELOAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OtaReloadRecord> getPrimaryKey() {
        return Keys.PK_OTA_RELOAD_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OtaReloadRecord>> getKeys() {
        return Arrays.<UniqueKey<OtaReloadRecord>>asList(Keys.PK_OTA_RELOAD_1, Keys.PK_OTA_RELOAD);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaReload as(String alias) {
        return new OtaReload(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaReload as(Name alias) {
        return new OtaReload(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OtaReload rename(String name) {
        return new OtaReload(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OtaReload rename(Name name) {
        return new OtaReload(name, null);
    }
}
