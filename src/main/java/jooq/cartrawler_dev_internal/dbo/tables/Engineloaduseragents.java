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
import jooq.cartrawler_dev_internal.dbo.tables.records.EngineloaduseragentsRecord;

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
public class Engineloaduseragents extends TableImpl<EngineloaduseragentsRecord> {

    private static final long serialVersionUID = -1917471601;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.engineLoadUserAgents</code>
     */
    public static final Engineloaduseragents ENGINELOADUSERAGENTS = new Engineloaduseragents();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EngineloaduseragentsRecord> getRecordType() {
        return EngineloaduseragentsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.engineLoadUserAgents.id</code>.
     */
    public final TableField<EngineloaduseragentsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.engineLoadUserAgents.userAgent</code>.
     */
    public final TableField<EngineloaduseragentsRecord, String> USERAGENT = createField("userAgent", org.jooq.impl.SQLDataType.NVARCHAR(300).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.engineLoadUserAgents</code> table reference
     */
    public Engineloaduseragents() {
        this(DSL.name("engineLoadUserAgents"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.engineLoadUserAgents</code> table reference
     */
    public Engineloaduseragents(String alias) {
        this(DSL.name(alias), ENGINELOADUSERAGENTS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.engineLoadUserAgents</code> table reference
     */
    public Engineloaduseragents(Name alias) {
        this(alias, ENGINELOADUSERAGENTS);
    }

    private Engineloaduseragents(Name alias, Table<EngineloaduseragentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Engineloaduseragents(Name alias, Table<EngineloaduseragentsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Engineloaduseragents(Table<O> child, ForeignKey<O, EngineloaduseragentsRecord> key) {
        super(child, key, ENGINELOADUSERAGENTS);
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
        return Arrays.<Index>asList(Indexes.ENGINELOADUSERAGENTS_PK_ENGINELOADUSERAGENTS2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EngineloaduseragentsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ENGINELOADUSERAGENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EngineloaduseragentsRecord> getPrimaryKey() {
        return Keys.PK_ENGINELOADUSERAGENTS2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EngineloaduseragentsRecord>> getKeys() {
        return Arrays.<UniqueKey<EngineloaduseragentsRecord>>asList(Keys.PK_ENGINELOADUSERAGENTS2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Engineloaduseragents as(String alias) {
        return new Engineloaduseragents(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Engineloaduseragents as(Name alias) {
        return new Engineloaduseragents(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Engineloaduseragents rename(String name) {
        return new Engineloaduseragents(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Engineloaduseragents rename(Name name) {
        return new Engineloaduseragents(name, null);
    }
}
