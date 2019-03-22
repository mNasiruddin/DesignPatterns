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
import jooq.cartrawler_dev_internal.dbo.tables.records.LocationTermsRecord;

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
public class LocationTerms extends TableImpl<LocationTermsRecord> {

    private static final long serialVersionUID = 1047398767;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Location_Terms</code>
     */
    public static final LocationTerms LOCATION_TERMS = new LocationTerms();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LocationTermsRecord> getRecordType() {
        return LocationTermsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location_Terms.Location_ID</code>.
     */
    public final TableField<LocationTermsRecord, Integer> LOCATION_ID = createField("Location_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location_Terms.TC_Master_ID</code>.
     */
    public final TableField<LocationTermsRecord, Integer> TC_MASTER_ID = createField("TC_Master_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location_Terms.GroupOrder</code>.
     */
    public final TableField<LocationTermsRecord, Integer> GROUPORDER = createField("GroupOrder", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location_Terms.Agency_ID</code>.
     */
    public final TableField<LocationTermsRecord, Integer> AGENCY_ID = createField("Agency_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Location_Terms</code> table reference
     */
    public LocationTerms() {
        this(DSL.name("Location_Terms"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Location_Terms</code> table reference
     */
    public LocationTerms(String alias) {
        this(DSL.name(alias), LOCATION_TERMS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Location_Terms</code> table reference
     */
    public LocationTerms(Name alias) {
        this(alias, LOCATION_TERMS);
    }

    private LocationTerms(Name alias, Table<LocationTermsRecord> aliased) {
        this(alias, aliased, null);
    }

    private LocationTerms(Name alias, Table<LocationTermsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> LocationTerms(Table<O> child, ForeignKey<O, LocationTermsRecord> key) {
        super(child, key, LOCATION_TERMS);
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
        return Arrays.<Index>asList(Indexes.LOCATION_TERMS_PK_LOCATION_TERMS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LocationTermsRecord> getPrimaryKey() {
        return Keys.PK_LOCATION_TERMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LocationTermsRecord>> getKeys() {
        return Arrays.<UniqueKey<LocationTermsRecord>>asList(Keys.PK_LOCATION_TERMS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationTerms as(String alias) {
        return new LocationTerms(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationTerms as(Name alias) {
        return new LocationTerms(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LocationTerms rename(String name) {
        return new LocationTerms(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LocationTerms rename(Name name) {
        return new LocationTerms(name, null);
    }
}