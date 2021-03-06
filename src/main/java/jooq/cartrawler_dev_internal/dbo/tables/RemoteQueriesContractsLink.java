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
import jooq.cartrawler_dev_internal.dbo.tables.records.RemoteQueriesContractsLinkRecord;

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
public class RemoteQueriesContractsLink extends TableImpl<RemoteQueriesContractsLinkRecord> {

    private static final long serialVersionUID = 2002247795;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Remote_Queries_Contracts_Link</code>
     */
    public static final RemoteQueriesContractsLink REMOTE_QUERIES_CONTRACTS_LINK = new RemoteQueriesContractsLink();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RemoteQueriesContractsLinkRecord> getRecordType() {
        return RemoteQueriesContractsLinkRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Remote_Queries_Contracts_Link.id</code>.
     */
    public final TableField<RemoteQueriesContractsLinkRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Remote_Queries_Contracts_Link.guid</code>.
     */
    public final TableField<RemoteQueriesContractsLinkRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Remote_Queries_Contracts_Link.fk_remote_queries</code>.
     */
    public final TableField<RemoteQueriesContractsLinkRecord, Long> FK_REMOTE_QUERIES = createField("fk_remote_queries", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Remote_Queries_Contracts_Link</code> table reference
     */
    public RemoteQueriesContractsLink() {
        this(DSL.name("Remote_Queries_Contracts_Link"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Remote_Queries_Contracts_Link</code> table reference
     */
    public RemoteQueriesContractsLink(String alias) {
        this(DSL.name(alias), REMOTE_QUERIES_CONTRACTS_LINK);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Remote_Queries_Contracts_Link</code> table reference
     */
    public RemoteQueriesContractsLink(Name alias) {
        this(alias, REMOTE_QUERIES_CONTRACTS_LINK);
    }

    private RemoteQueriesContractsLink(Name alias, Table<RemoteQueriesContractsLinkRecord> aliased) {
        this(alias, aliased, null);
    }

    private RemoteQueriesContractsLink(Name alias, Table<RemoteQueriesContractsLinkRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RemoteQueriesContractsLink(Table<O> child, ForeignKey<O, RemoteQueriesContractsLinkRecord> key) {
        super(child, key, REMOTE_QUERIES_CONTRACTS_LINK);
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
        return Arrays.<Index>asList(Indexes.REMOTE_QUERIES_CONTRACTS_LINK_PK__REMOTE_Q__3213E83F4F47C5E3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RemoteQueriesContractsLinkRecord, Long> getIdentity() {
        return Keys.IDENTITY_REMOTE_QUERIES_CONTRACTS_LINK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RemoteQueriesContractsLinkRecord> getPrimaryKey() {
        return Keys.PK__REMOTE_Q__3213E83F4F47C5E3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RemoteQueriesContractsLinkRecord>> getKeys() {
        return Arrays.<UniqueKey<RemoteQueriesContractsLinkRecord>>asList(Keys.PK__REMOTE_Q__3213E83F4F47C5E3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueriesContractsLink as(String alias) {
        return new RemoteQueriesContractsLink(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueriesContractsLink as(Name alias) {
        return new RemoteQueriesContractsLink(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RemoteQueriesContractsLink rename(String name) {
        return new RemoteQueriesContractsLink(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RemoteQueriesContractsLink rename(Name name) {
        return new RemoteQueriesContractsLink(name, null);
    }
}
