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
import jooq.cartrawler_dev_internal.dbo.tables.records.IsschannelListRecord;

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
public class IsschannelList extends TableImpl<IsschannelListRecord> {

    private static final long serialVersionUID = -1578318813;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.issChannel_list</code>
     */
    public static final IsschannelList ISSCHANNEL_LIST = new IsschannelList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IsschannelListRecord> getRecordType() {
        return IsschannelListRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issChannel_list.channel_Id</code>.
     */
    public final TableField<IsschannelListRecord, Integer> CHANNEL_ID = createField("channel_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issChannel_list.channel_group_id</code>.
     */
    public final TableField<IsschannelListRecord, Integer> CHANNEL_GROUP_ID = createField("channel_group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.issChannel_list</code> table reference
     */
    public IsschannelList() {
        this(DSL.name("issChannel_list"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.issChannel_list</code> table reference
     */
    public IsschannelList(String alias) {
        this(DSL.name(alias), ISSCHANNEL_LIST);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.issChannel_list</code> table reference
     */
    public IsschannelList(Name alias) {
        this(alias, ISSCHANNEL_LIST);
    }

    private IsschannelList(Name alias, Table<IsschannelListRecord> aliased) {
        this(alias, aliased, null);
    }

    private IsschannelList(Name alias, Table<IsschannelListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> IsschannelList(Table<O> child, ForeignKey<O, IsschannelListRecord> key) {
        super(child, key, ISSCHANNEL_LIST);
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
        return Arrays.<Index>asList(Indexes.ISSCHANNEL_LIST_PK_ISSCHANNEL_LIST);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<IsschannelListRecord> getPrimaryKey() {
        return Keys.PK_ISSCHANNEL_LIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<IsschannelListRecord>> getKeys() {
        return Arrays.<UniqueKey<IsschannelListRecord>>asList(Keys.PK_ISSCHANNEL_LIST);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<IsschannelListRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<IsschannelListRecord, ?>>asList(Keys.FK_ISSCHANNEL_LIST_CHANNEL_GROUP_ID);
    }

    public IsschannelGroup isschannelGroup() {
        return new IsschannelGroup(this, Keys.FK_ISSCHANNEL_LIST_CHANNEL_GROUP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IsschannelList as(String alias) {
        return new IsschannelList(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IsschannelList as(Name alias) {
        return new IsschannelList(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IsschannelList rename(String name) {
        return new IsschannelList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IsschannelList rename(Name name) {
        return new IsschannelList(name, null);
    }
}
