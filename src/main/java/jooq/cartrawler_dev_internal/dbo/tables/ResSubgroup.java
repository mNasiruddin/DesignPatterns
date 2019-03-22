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
import jooq.cartrawler_dev_internal.dbo.tables.records.ResSubgroupRecord;

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
public class ResSubgroup extends TableImpl<ResSubgroupRecord> {

    private static final long serialVersionUID = 702316663;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.res_subgroup</code>
     */
    public static final ResSubgroup RES_SUBGROUP = new ResSubgroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ResSubgroupRecord> getRecordType() {
        return ResSubgroupRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.res_subgroup.id</code>.
     */
    public final TableField<ResSubgroupRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.res_subgroup.subgroup_id</code>.
     */
    public final TableField<ResSubgroupRecord, String> SUBGROUP_ID = createField("subgroup_id", org.jooq.impl.SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.res_subgroup.subgroup</code>.
     */
    public final TableField<ResSubgroupRecord, String> SUBGROUP = createField("subgroup", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.res_subgroup</code> table reference
     */
    public ResSubgroup() {
        this(DSL.name("res_subgroup"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.res_subgroup</code> table reference
     */
    public ResSubgroup(String alias) {
        this(DSL.name(alias), RES_SUBGROUP);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.res_subgroup</code> table reference
     */
    public ResSubgroup(Name alias) {
        this(alias, RES_SUBGROUP);
    }

    private ResSubgroup(Name alias, Table<ResSubgroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private ResSubgroup(Name alias, Table<ResSubgroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ResSubgroup(Table<O> child, ForeignKey<O, ResSubgroupRecord> key) {
        super(child, key, RES_SUBGROUP);
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
        return Arrays.<Index>asList(Indexes.RES_SUBGROUP_PK_RES_SUBGROUP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ResSubgroupRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RES_SUBGROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ResSubgroupRecord> getPrimaryKey() {
        return Keys.PK_RES_SUBGROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ResSubgroupRecord>> getKeys() {
        return Arrays.<UniqueKey<ResSubgroupRecord>>asList(Keys.PK_RES_SUBGROUP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResSubgroup as(String alias) {
        return new ResSubgroup(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResSubgroup as(Name alias) {
        return new ResSubgroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ResSubgroup rename(String name) {
        return new ResSubgroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ResSubgroup rename(Name name) {
        return new ResSubgroup(name, null);
    }
}