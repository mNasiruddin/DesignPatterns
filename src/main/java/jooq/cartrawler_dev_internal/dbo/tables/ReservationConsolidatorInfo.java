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
import jooq.cartrawler_dev_internal.dbo.tables.records.ReservationConsolidatorInfoRecord;

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
public class ReservationConsolidatorInfo extends TableImpl<ReservationConsolidatorInfoRecord> {

    private static final long serialVersionUID = 438763824;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info</code>
     */
    public static final ReservationConsolidatorInfo RESERVATION_CONSOLIDATOR_INFO = new ReservationConsolidatorInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationConsolidatorInfoRecord> getRecordType() {
        return ReservationConsolidatorInfoRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.guid</code>.
     */
    public final TableField<ReservationConsolidatorInfoRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.id</code>.
     */
    public final TableField<ReservationConsolidatorInfoRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.fk_reservation</code>.
     */
    public final TableField<ReservationConsolidatorInfoRecord, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.ConsolidatorCode</code>.
     */
    public final TableField<ReservationConsolidatorInfoRecord, String> CONSOLIDATORCODE = createField("ConsolidatorCode", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.ConsolidatorCodeContext</code>.
     */
    public final TableField<ReservationConsolidatorInfoRecord, String> CONSOLIDATORCODECONTEXT = createField("ConsolidatorCodeContext", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.LocationName</code>.
     */
    public final TableField<ReservationConsolidatorInfoRecord, String> LOCATIONNAME = createField("LocationName", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.StageDescription</code>.
     */
    public final TableField<ReservationConsolidatorInfoRecord, String> STAGEDESCRIPTION = createField("StageDescription", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.AtAirport</code>.
     */
    public final TableField<ReservationConsolidatorInfoRecord, String> ATAIRPORT = createField("AtAirport", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.VendorCode</code>.
     */
    public final TableField<ReservationConsolidatorInfoRecord, String> VENDORCODE = createField("VendorCode", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.VendorAccountNumber</code>.
     */
    public final TableField<ReservationConsolidatorInfoRecord, String> VENDORACCOUNTNUMBER = createField("VendorAccountNumber", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.VendorPlanCode</code>.
     */
    public final TableField<ReservationConsolidatorInfoRecord, String> VENDORPLANCODE = createField("VendorPlanCode", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.AddressLine1</code>.
     */
    public final TableField<ReservationConsolidatorInfoRecord, String> ADDRESSLINE1 = createField("AddressLine1", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.AddressLine2</code>.
     */
    public final TableField<ReservationConsolidatorInfoRecord, String> ADDRESSLINE2 = createField("AddressLine2", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.AddressLine3</code>.
     */
    public final TableField<ReservationConsolidatorInfoRecord, String> ADDRESSLINE3 = createField("AddressLine3", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.CityName</code>.
     */
    public final TableField<ReservationConsolidatorInfoRecord, String> CITYNAME = createField("CityName", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.PostalCode</code>.
     */
    public final TableField<ReservationConsolidatorInfoRecord, String> POSTALCODE = createField("PostalCode", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.CountryCode</code>.
     */
    public final TableField<ReservationConsolidatorInfoRecord, String> COUNTRYCODE = createField("CountryCode", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.Telephone</code>.
     */
    public final TableField<ReservationConsolidatorInfoRecord, String> TELEPHONE = createField("Telephone", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.CounterLocation</code>.
     */
    public final TableField<ReservationConsolidatorInfoRecord, String> COUNTERLOCATION = createField("CounterLocation", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.SupplierSubReference </code>.
     */
    public final TableField<ReservationConsolidatorInfoRecord, String> SUPPLIERSUBREFERENCE_ = createField("SupplierSubReference ", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info.VoucherURL </code>.
     */
    public final TableField<ReservationConsolidatorInfoRecord, String> VOUCHERURL_ = createField("VoucherURL ", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info</code> table reference
     */
    public ReservationConsolidatorInfo() {
        this(DSL.name("reservation_consolidator_info"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info</code> table reference
     */
    public ReservationConsolidatorInfo(String alias) {
        this(DSL.name(alias), RESERVATION_CONSOLIDATOR_INFO);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_consolidator_info</code> table reference
     */
    public ReservationConsolidatorInfo(Name alias) {
        this(alias, RESERVATION_CONSOLIDATOR_INFO);
    }

    private ReservationConsolidatorInfo(Name alias, Table<ReservationConsolidatorInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReservationConsolidatorInfo(Name alias, Table<ReservationConsolidatorInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReservationConsolidatorInfo(Table<O> child, ForeignKey<O, ReservationConsolidatorInfoRecord> key) {
        super(child, key, RESERVATION_CONSOLIDATOR_INFO);
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
        return Arrays.<Index>asList(Indexes.RESERVATION_CONSOLIDATOR_INFO_PK_RESERVATION_CONSOLIDATOR_INFO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReservationConsolidatorInfoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RESERVATION_CONSOLIDATOR_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationConsolidatorInfoRecord> getPrimaryKey() {
        return Keys.PK_RESERVATION_CONSOLIDATOR_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationConsolidatorInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<ReservationConsolidatorInfoRecord>>asList(Keys.PK_RESERVATION_CONSOLIDATOR_INFO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfo as(String alias) {
        return new ReservationConsolidatorInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConsolidatorInfo as(Name alias) {
        return new ReservationConsolidatorInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationConsolidatorInfo rename(String name) {
        return new ReservationConsolidatorInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationConsolidatorInfo rename(Name name) {
        return new ReservationConsolidatorInfo(name, null);
    }
}