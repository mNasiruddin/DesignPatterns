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
import jooq.cartrawler_dev_internal.dbo.tables.records.ClientGroupRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class ClientGroup extends TableImpl<ClientGroupRecord> {

    private static final long serialVersionUID = 1788350234;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.client_group</code>
     */
    public static final ClientGroup CLIENT_GROUP = new ClientGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClientGroupRecord> getRecordType() {
        return ClientGroupRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.client_group.id</code>.
     */
    public final TableField<ClientGroupRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.client_group.client_id</code>.
     */
    public final TableField<ClientGroupRecord, Integer> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.client_group.tag</code>.
     */
    public final TableField<ClientGroupRecord, String> TAG = createField("tag", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.client_group</code> table reference
     */
    public ClientGroup() {
        this(DSL.name("client_group"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.client_group</code> table reference
     */
    public ClientGroup(String alias) {
        this(DSL.name(alias), CLIENT_GROUP);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.client_group</code> table reference
     */
    public ClientGroup(Name alias) {
        this(alias, CLIENT_GROUP);
    }

    private ClientGroup(Name alias, Table<ClientGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private ClientGroup(Name alias, Table<ClientGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ClientGroup(Table<O> child, ForeignKey<O, ClientGroupRecord> key) {
        super(child, key, CLIENT_GROUP);
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
        return Arrays.<Index>asList(Indexes.CLIENT_GROUP_CLIENT_ID_IX, Indexes.CLIENT_GROUP_ID_IX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ClientGroupRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ClientGroupRecord, ?>>asList(Keys.FK__CLIENT_GR__CLIEN__14E94780);
    }

    public Client client() {
        return new Client(this, Keys.FK__CLIENT_GR__CLIEN__14E94780);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientGroup as(String alias) {
        return new ClientGroup(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientGroup as(Name alias) {
        return new ClientGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ClientGroup rename(String name) {
        return new ClientGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ClientGroup rename(Name name) {
        return new ClientGroup(name, null);
    }
}
