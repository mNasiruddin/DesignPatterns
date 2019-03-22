/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.SalesforceBookingscustomeridRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class SalesforceBookingscustomerid extends TableImpl<SalesforceBookingscustomeridRecord> {

    private static final long serialVersionUID = 2119958254;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.SalesForce_BookingsCustomerId</code>
     */
    public static final SalesforceBookingscustomerid SALESFORCE_BOOKINGSCUSTOMERID = new SalesforceBookingscustomerid();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SalesforceBookingscustomeridRecord> getRecordType() {
        return SalesforceBookingscustomeridRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_BookingsCustomerId.customer_id</code>.
     */
    public final TableField<SalesforceBookingscustomeridRecord, Integer> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_BookingsCustomerId.customer_last_name</code>.
     */
    public final TableField<SalesforceBookingscustomeridRecord, String> CUSTOMER_LAST_NAME = createField("customer_last_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_BookingsCustomerId.customer_first_name</code>.
     */
    public final TableField<SalesforceBookingscustomeridRecord, String> CUSTOMER_FIRST_NAME = createField("customer_first_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_BookingsCustomerId.customer_email</code>.
     */
    public final TableField<SalesforceBookingscustomeridRecord, String> CUSTOMER_EMAIL = createField("customer_email", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_BookingsCustomerId.ref</code>.
     */
    public final TableField<SalesforceBookingscustomeridRecord, Integer> REF = createField("ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_BookingsCustomerId.Booking_id</code>.
     */
    public final TableField<SalesforceBookingscustomeridRecord, String> BOOKING_ID = createField("Booking_id", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_BookingsCustomerId.Supplier_Reference</code>.
     */
    public final TableField<SalesforceBookingscustomeridRecord, String> SUPPLIER_REFERENCE = createField("Supplier_Reference", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_BookingsCustomerId.FirstName</code>.
     */
    public final TableField<SalesforceBookingscustomeridRecord, String> FIRSTNAME = createField("FirstName", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_BookingsCustomerId.Surname</code>.
     */
    public final TableField<SalesforceBookingscustomeridRecord, String> SURNAME = createField("Surname", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_BookingsCustomerId.Pickup_Date</code>.
     */
    public final TableField<SalesforceBookingscustomeridRecord, Timestamp> PICKUP_DATE = createField("Pickup_Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_BookingsCustomerId.Pickup_Time</code>.
     */
    public final TableField<SalesforceBookingscustomeridRecord, String> PICKUP_TIME = createField("Pickup_Time", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_BookingsCustomerId.card_number</code>.
     */
    public final TableField<SalesforceBookingscustomeridRecord, String> CARD_NUMBER = createField("card_number", org.jooq.impl.SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_BookingsCustomerId.Email</code>.
     */
    public final TableField<SalesforceBookingscustomeridRecord, String> EMAIL = createField("Email", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_BookingsCustomerId.BookingDate</code>.
     */
    public final TableField<SalesforceBookingscustomeridRecord, Timestamp> BOOKINGDATE = createField("BookingDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_BookingsCustomerId.Country_of_Residence</code>.
     */
    public final TableField<SalesforceBookingscustomeridRecord, String> COUNTRY_OF_RESIDENCE = createField("Country_of_Residence", org.jooq.impl.SQLDataType.CHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.SalesForce_BookingsCustomerId.pickup_location_name</code>.
     */
    public final TableField<SalesforceBookingscustomeridRecord, String> PICKUP_LOCATION_NAME = createField("pickup_location_name", org.jooq.impl.SQLDataType.VARCHAR(265), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.SalesForce_BookingsCustomerId</code> table reference
     */
    public SalesforceBookingscustomerid() {
        this(DSL.name("SalesForce_BookingsCustomerId"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.SalesForce_BookingsCustomerId</code> table reference
     */
    public SalesforceBookingscustomerid(String alias) {
        this(DSL.name(alias), SALESFORCE_BOOKINGSCUSTOMERID);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.SalesForce_BookingsCustomerId</code> table reference
     */
    public SalesforceBookingscustomerid(Name alias) {
        this(alias, SALESFORCE_BOOKINGSCUSTOMERID);
    }

    private SalesforceBookingscustomerid(Name alias, Table<SalesforceBookingscustomeridRecord> aliased) {
        this(alias, aliased, null);
    }

    private SalesforceBookingscustomerid(Name alias, Table<SalesforceBookingscustomeridRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SalesforceBookingscustomerid(Table<O> child, ForeignKey<O, SalesforceBookingscustomeridRecord> key) {
        super(child, key, SALESFORCE_BOOKINGSCUSTOMERID);
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
    public SalesforceBookingscustomerid as(String alias) {
        return new SalesforceBookingscustomerid(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingscustomerid as(Name alias) {
        return new SalesforceBookingscustomerid(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesforceBookingscustomerid rename(String name) {
        return new SalesforceBookingscustomerid(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesforceBookingscustomerid rename(Name name) {
        return new SalesforceBookingscustomerid(name, null);
    }
}