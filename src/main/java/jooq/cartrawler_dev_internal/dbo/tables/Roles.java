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
import jooq.cartrawler_dev_internal.dbo.tables.records.RolesRecord;

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
public class Roles extends TableImpl<RolesRecord> {

    private static final long serialVersionUID = -1171877194;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Roles</code>
     */
    public static final Roles ROLES = new Roles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RolesRecord> getRecordType() {
        return RolesRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Roles.id</code>.
     */
    public final TableField<RolesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Roles.role_name</code>.
     */
    public final TableField<RolesRecord, String> ROLE_NAME = createField("role_name", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Roles</code> table reference
     */
    public Roles() {
        this(DSL.name("Roles"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Roles</code> table reference
     */
    public Roles(String alias) {
        this(DSL.name(alias), ROLES);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Roles</code> table reference
     */
    public Roles(Name alias) {
        this(alias, ROLES);
    }

    private Roles(Name alias, Table<RolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Roles(Name alias, Table<RolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Roles(Table<O> child, ForeignKey<O, RolesRecord> key) {
        super(child, key, ROLES);
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
        return Arrays.<Index>asList(Indexes.ROLES_PK__ROLES__3213E83F3BFFE745);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RolesRecord> getPrimaryKey() {
        return Keys.PK__ROLES__3213E83F3BFFE745;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RolesRecord>> getKeys() {
        return Arrays.<UniqueKey<RolesRecord>>asList(Keys.PK__ROLES__3213E83F3BFFE745);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Roles as(String alias) {
        return new Roles(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Roles as(Name alias) {
        return new Roles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Roles rename(String name) {
        return new Roles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Roles rename(Name name) {
        return new Roles(name, null);
    }
}