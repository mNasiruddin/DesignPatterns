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
import jooq.cartrawler_dev_internal.dbo.tables.records.OtamanageServerRecord;

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
public class OtamanageServer extends TableImpl<OtamanageServerRecord> {

    private static final long serialVersionUID = -1134238054;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.otamanage_server</code>
     */
    public static final OtamanageServer OTAMANAGE_SERVER = new OtamanageServer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OtamanageServerRecord> getRecordType() {
        return OtamanageServerRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otamanage_server.id</code>.
     */
    public final TableField<OtamanageServerRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otamanage_server.server</code>.
     */
    public final TableField<OtamanageServerRecord, String> SERVER = createField("server", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otamanage_server.cartrawler_url</code>.
     */
    public final TableField<OtamanageServerRecord, String> CARTRAWLER_URL = createField("cartrawler_url", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otamanage_server.ssh_host</code>.
     */
    public final TableField<OtamanageServerRecord, String> SSH_HOST = createField("ssh_host", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otamanage_server.ssh_port</code>.
     */
    public final TableField<OtamanageServerRecord, Integer> SSH_PORT = createField("ssh_port", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otamanage_server.active</code>.
     */
    public final TableField<OtamanageServerRecord, Boolean> ACTIVE = createField("active", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.field("('0')", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.otamanage_server</code> table reference
     */
    public OtamanageServer() {
        this(DSL.name("otamanage_server"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.otamanage_server</code> table reference
     */
    public OtamanageServer(String alias) {
        this(DSL.name(alias), OTAMANAGE_SERVER);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.otamanage_server</code> table reference
     */
    public OtamanageServer(Name alias) {
        this(alias, OTAMANAGE_SERVER);
    }

    private OtamanageServer(Name alias, Table<OtamanageServerRecord> aliased) {
        this(alias, aliased, null);
    }

    private OtamanageServer(Name alias, Table<OtamanageServerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> OtamanageServer(Table<O> child, ForeignKey<O, OtamanageServerRecord> key) {
        super(child, key, OTAMANAGE_SERVER);
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
        return Arrays.<Index>asList(Indexes.OTAMANAGE_SERVER_PK_OTAMANAGE_SERVER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OtamanageServerRecord, Integer> getIdentity() {
        return Keys.IDENTITY_OTAMANAGE_SERVER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OtamanageServerRecord> getPrimaryKey() {
        return Keys.PK_OTAMANAGE_SERVER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OtamanageServerRecord>> getKeys() {
        return Arrays.<UniqueKey<OtamanageServerRecord>>asList(Keys.PK_OTAMANAGE_SERVER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtamanageServer as(String alias) {
        return new OtamanageServer(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtamanageServer as(Name alias) {
        return new OtamanageServer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OtamanageServer rename(String name) {
        return new OtamanageServer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OtamanageServer rename(Name name) {
        return new OtamanageServer(name, null);
    }
}
