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
import jooq.cartrawler_dev_internal.dbo.tables.records.RemoteQueriesMagiclocationsRecord;

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
public class RemoteQueriesMagiclocations extends TableImpl<RemoteQueriesMagiclocationsRecord> {

    private static final long serialVersionUID = -348654951;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.remote_queries_magiclocations</code>
     */
    public static final RemoteQueriesMagiclocations REMOTE_QUERIES_MAGICLOCATIONS = new RemoteQueriesMagiclocations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RemoteQueriesMagiclocationsRecord> getRecordType() {
        return RemoteQueriesMagiclocationsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_magiclocations.id</code>.
     */
    public final TableField<RemoteQueriesMagiclocationsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_magiclocations.customer_id</code>.
     */
    public final TableField<RemoteQueriesMagiclocationsRecord, Long> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_magiclocations.search_text</code>.
     */
    public final TableField<RemoteQueriesMagiclocationsRecord, String> SEARCH_TEXT = createField("search_text", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_magiclocations.num_results</code>.
     */
    public final TableField<RemoteQueriesMagiclocationsRecord, Integer> NUM_RESULTS = createField("num_results", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_magiclocations.lang</code>.
     */
    public final TableField<RemoteQueriesMagiclocationsRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.CHAR(5).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_magiclocations.search_type</code>.
     */
    public final TableField<RemoteQueriesMagiclocationsRecord, String> SEARCH_TYPE = createField("search_type", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_magiclocations.timestamp</code>.
     */
    public final TableField<RemoteQueriesMagiclocationsRecord, Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("(getdate())", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_magiclocations.source</code>.
     */
    public final TableField<RemoteQueriesMagiclocationsRecord, Integer> SOURCE = createField("source", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.remote_queries_magiclocations</code> table reference
     */
    public RemoteQueriesMagiclocations() {
        this(DSL.name("remote_queries_magiclocations"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.remote_queries_magiclocations</code> table reference
     */
    public RemoteQueriesMagiclocations(String alias) {
        this(DSL.name(alias), REMOTE_QUERIES_MAGICLOCATIONS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.remote_queries_magiclocations</code> table reference
     */
    public RemoteQueriesMagiclocations(Name alias) {
        this(alias, REMOTE_QUERIES_MAGICLOCATIONS);
    }

    private RemoteQueriesMagiclocations(Name alias, Table<RemoteQueriesMagiclocationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RemoteQueriesMagiclocations(Name alias, Table<RemoteQueriesMagiclocationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RemoteQueriesMagiclocations(Table<O> child, ForeignKey<O, RemoteQueriesMagiclocationsRecord> key) {
        super(child, key, REMOTE_QUERIES_MAGICLOCATIONS);
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
        return Arrays.<Index>asList(Indexes.REMOTE_QUERIES_MAGICLOCATIONS_PK_REMOTE_QUERIES_MAGICLOCATIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RemoteQueriesMagiclocationsRecord, Long> getIdentity() {
        return Keys.IDENTITY_REMOTE_QUERIES_MAGICLOCATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RemoteQueriesMagiclocationsRecord> getPrimaryKey() {
        return Keys.PK_REMOTE_QUERIES_MAGICLOCATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RemoteQueriesMagiclocationsRecord>> getKeys() {
        return Arrays.<UniqueKey<RemoteQueriesMagiclocationsRecord>>asList(Keys.PK_REMOTE_QUERIES_MAGICLOCATIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueriesMagiclocations as(String alias) {
        return new RemoteQueriesMagiclocations(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueriesMagiclocations as(Name alias) {
        return new RemoteQueriesMagiclocations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RemoteQueriesMagiclocations rename(String name) {
        return new RemoteQueriesMagiclocations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RemoteQueriesMagiclocations rename(Name name) {
        return new RemoteQueriesMagiclocations(name, null);
    }
}
