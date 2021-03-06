/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.MspeerConflictdetectionconfigresponseRecord;

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
public class MspeerConflictdetectionconfigresponse extends TableImpl<MspeerConflictdetectionconfigresponseRecord> {

    private static final long serialVersionUID = -1628974861;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse</code>
     */
    public static final MspeerConflictdetectionconfigresponse MSPEER_CONFLICTDETECTIONCONFIGRESPONSE = new MspeerConflictdetectionconfigresponse();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MspeerConflictdetectionconfigresponseRecord> getRecordType() {
        return MspeerConflictdetectionconfigresponseRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.request_id</code>.
     */
    public final TableField<MspeerConflictdetectionconfigresponseRecord, Integer> REQUEST_ID = createField("request_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.peer_node</code>.
     */
    public final TableField<MspeerConflictdetectionconfigresponseRecord, String> PEER_NODE = createField("peer_node", org.jooq.impl.SQLDataType.NVARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.peer_db</code>.
     */
    public final TableField<MspeerConflictdetectionconfigresponseRecord, String> PEER_DB = createField("peer_db", org.jooq.impl.SQLDataType.NVARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.peer_version</code>.
     */
    public final TableField<MspeerConflictdetectionconfigresponseRecord, Integer> PEER_VERSION = createField("peer_version", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.peer_db_version</code>.
     */
    public final TableField<MspeerConflictdetectionconfigresponseRecord, Integer> PEER_DB_VERSION = createField("peer_db_version", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.is_peer</code>.
     */
    public final TableField<MspeerConflictdetectionconfigresponseRecord, Boolean> IS_PEER = createField("is_peer", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.conflictdetection_enabled</code>.
     */
    public final TableField<MspeerConflictdetectionconfigresponseRecord, Boolean> CONFLICTDETECTION_ENABLED = createField("conflictdetection_enabled", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.originator_id</code>.
     */
    public final TableField<MspeerConflictdetectionconfigresponseRecord, Integer> ORIGINATOR_ID = createField("originator_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.peer_conflict_retention</code>.
     */
    public final TableField<MspeerConflictdetectionconfigresponseRecord, Integer> PEER_CONFLICT_RETENTION = createField("peer_conflict_retention", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.peer_continue_onconflict</code>.
     */
    public final TableField<MspeerConflictdetectionconfigresponseRecord, Boolean> PEER_CONTINUE_ONCONFLICT = createField("peer_continue_onconflict", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<MspeerConflictdetectionconfigresponseRecord, Object> PEER_SUBSCRIPTIONS = createField("peer_subscriptions", org.jooq.impl.DefaultDataType.getDefaultDataType("\"\""), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.progress_phase</code>.
     */
    public final TableField<MspeerConflictdetectionconfigresponseRecord, String> PROGRESS_PHASE = createField("progress_phase", org.jooq.impl.SQLDataType.NVARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse.modified_date</code>.
     */
    public final TableField<MspeerConflictdetectionconfigresponseRecord, Timestamp> MODIFIED_DATE = createField("modified_date", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("(getdate())", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse</code> table reference
     */
    public MspeerConflictdetectionconfigresponse() {
        this(DSL.name("MSpeer_conflictdetectionconfigresponse"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse</code> table reference
     */
    public MspeerConflictdetectionconfigresponse(String alias) {
        this(DSL.name(alias), MSPEER_CONFLICTDETECTIONCONFIGRESPONSE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.MSpeer_conflictdetectionconfigresponse</code> table reference
     */
    public MspeerConflictdetectionconfigresponse(Name alias) {
        this(alias, MSPEER_CONFLICTDETECTIONCONFIGRESPONSE);
    }

    private MspeerConflictdetectionconfigresponse(Name alias, Table<MspeerConflictdetectionconfigresponseRecord> aliased) {
        this(alias, aliased, null);
    }

    private MspeerConflictdetectionconfigresponse(Name alias, Table<MspeerConflictdetectionconfigresponseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MspeerConflictdetectionconfigresponse(Table<O> child, ForeignKey<O, MspeerConflictdetectionconfigresponseRecord> key) {
        super(child, key, MSPEER_CONFLICTDETECTIONCONFIGRESPONSE);
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
        return Arrays.<Index>asList(Indexes.MSPEER_CONFLICTDETECTIONCONFIGRESPONSE_UCI_MSPEER_CONFLICTDETECTIONCONFIGRESPONSE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MspeerConflictdetectionconfigresponseRecord>> getKeys() {
        return Arrays.<UniqueKey<MspeerConflictdetectionconfigresponseRecord>>asList(Keys.UCI_MSPEER_CONFLICTDETECTIONCONFIGRESPONSE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigresponse as(String alias) {
        return new MspeerConflictdetectionconfigresponse(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerConflictdetectionconfigresponse as(Name alias) {
        return new MspeerConflictdetectionconfigresponse(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MspeerConflictdetectionconfigresponse rename(String name) {
        return new MspeerConflictdetectionconfigresponse(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MspeerConflictdetectionconfigresponse rename(Name name) {
        return new MspeerConflictdetectionconfigresponse(name, null);
    }
}
