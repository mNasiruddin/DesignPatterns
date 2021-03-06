/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.LocationRecord;

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
public class Location extends TableImpl<LocationRecord> {

    private static final long serialVersionUID = 560944205;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Location</code>
     */
    public static final Location LOCATION = new Location();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LocationRecord> getRecordType() {
        return LocationRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Location_ID</code>.
     */
    public final TableField<LocationRecord, Integer> LOCATION_ID = createField("Location_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Agency_ID</code>.
     */
    public final TableField<LocationRecord, Integer> AGENCY_ID = createField("Agency_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Location_Name</code>.
     */
    public final TableField<LocationRecord, String> LOCATION_NAME = createField("Location_Name", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.display_order</code>.
     */
    public final TableField<LocationRecord, Long> DISPLAY_ORDER = createField("display_order", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Location_Address</code>.
     */
    public final TableField<LocationRecord, String> LOCATION_ADDRESS = createField("Location_Address", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Country_ID</code>.
     */
    public final TableField<LocationRecord, String> COUNTRY_ID = createField("Country_ID", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.location_email</code>.
     */
    public final TableField<LocationRecord, String> LOCATION_EMAIL = createField("location_email", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Phone</code>.
     */
    public final TableField<LocationRecord, String> PHONE = createField("Phone", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Fax</code>.
     */
    public final TableField<LocationRecord, String> FAX = createField("Fax", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.OpenBank_Holidays</code>.
     */
    public final TableField<LocationRecord, Boolean> OPENBANK_HOLIDAYS = createField("OpenBank_Holidays", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Open_text</code>.
     */
    public final TableField<LocationRecord, String> OPEN_TEXT = createField("Open_text", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Location_Desc</code>.
     */
    public final TableField<LocationRecord, String> LOCATION_DESC = createField("Location_Desc", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Airport</code>.
     */
    public final TableField<LocationRecord, Boolean> AIRPORT = createField("Airport", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Status</code>.
     */
    public final TableField<LocationRecord, Integer> STATUS = createField("Status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.pickup_before</code>.
     */
    public final TableField<LocationRecord, Boolean> PICKUP_BEFORE = createField("pickup_before", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.pickup_after</code>.
     */
    public final TableField<LocationRecord, Boolean> PICKUP_AFTER = createField("pickup_after", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.dropoff_before</code>.
     */
    public final TableField<LocationRecord, Boolean> DROPOFF_BEFORE = createField("dropoff_before", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.dropoff_after</code>.
     */
    public final TableField<LocationRecord, Boolean> DROPOFF_AFTER = createField("dropoff_after", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.afterhrs_pickup_DELETE</code>.
     */
    public final TableField<LocationRecord, Boolean> AFTERHRS_PICKUP_DELETE = createField("afterhrs_pickup_DELETE", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.afterhrs_dropoff_DELETE</code>.
     */
    public final TableField<LocationRecord, Boolean> AFTERHRS_DROPOFF_DELETE = createField("afterhrs_dropoff_DELETE", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Page_Title</code>.
     */
    public final TableField<LocationRecord, String> PAGE_TITLE = createField("Page_Title", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Meta_Description</code>.
     */
    public final TableField<LocationRecord, String> META_DESCRIPTION = createField("Meta_Description", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Meta_Keywords</code>.
     */
    public final TableField<LocationRecord, String> META_KEYWORDS = createField("Meta_Keywords", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Location_Image</code>.
     */
    public final TableField<LocationRecord, byte[]> LOCATION_IMAGE = createField("Location_Image", org.jooq.impl.SQLDataType.BINARY(2147483647), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Image_Width</code>.
     */
    public final TableField<LocationRecord, String> IMAGE_WIDTH = createField("Image_Width", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Image_Height</code>.
     */
    public final TableField<LocationRecord, String> IMAGE_HEIGHT = createField("Image_Height", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.image_above</code>.
     */
    public final TableField<LocationRecord, Short> IMAGE_ABOVE = createField("image_above", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Updated</code>.
     */
    public final TableField<LocationRecord, Boolean> UPDATED = createField("Updated", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Index_Display</code>.
     */
    public final TableField<LocationRecord, Boolean> INDEX_DISPLAY = createField("Index_Display", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Index_Name</code>.
     */
    public final TableField<LocationRecord, String> INDEX_NAME = createField("Index_Name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Alt_URL</code>.
     */
    public final TableField<LocationRecord, String> ALT_URL = createField("Alt_URL", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.airport_code</code>.
     */
    public final TableField<LocationRecord, String> AIRPORT_CODE = createField("airport_code", org.jooq.impl.SQLDataType.VARCHAR(4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.contact_phone</code>.
     */
    public final TableField<LocationRecord, String> CONTACT_PHONE = createField("contact_phone", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.Car_Agent_ID</code>.
     */
    public final TableField<LocationRecord, Integer> CAR_AGENT_ID = createField("Car_Agent_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.allow_pickup_only</code>.
     */
    public final TableField<LocationRecord, Boolean> ALLOW_PICKUP_ONLY = createField("allow_pickup_only", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.allow_drop_only</code>.
     */
    public final TableField<LocationRecord, Integer> ALLOW_DROP_ONLY = createField("allow_drop_only", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.agent_loc_id</code>.
     */
    public final TableField<LocationRecord, String> AGENT_LOC_ID = createField("agent_loc_id", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.NI_Location</code>.
     */
    public final TableField<LocationRecord, Integer> NI_LOCATION = createField("NI_Location", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.location_name_de</code>.
     */
    public final TableField<LocationRecord, String> LOCATION_NAME_DE = createField("location_name_de", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.iata_city_code</code>.
     */
    public final TableField<LocationRecord, String> IATA_CITY_CODE = createField("iata_city_code", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.latitude</code>.
     */
    public final TableField<LocationRecord, BigDecimal> LATITUDE = createField("latitude", org.jooq.impl.SQLDataType.NUMERIC(18, 8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.longitude</code>.
     */
    public final TableField<LocationRecord, BigDecimal> LONGITUDE = createField("longitude", org.jooq.impl.SQLDataType.NUMERIC(18, 8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.cityname</code>.
     */
    public final TableField<LocationRecord, String> CITYNAME = createField("cityname", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.postalcode</code>.
     */
    public final TableField<LocationRecord, String> POSTALCODE = createField("postalcode", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.county</code>.
     */
    public final TableField<LocationRecord, String> COUNTY = createField("county", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.stateprov</code>.
     */
    public final TableField<LocationRecord, String> STATEPROV = createField("stateprov", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.addressline</code>.
     */
    public final TableField<LocationRecord, String> ADDRESSLINE = createField("addressline", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.statecode</code>.
     */
    public final TableField<LocationRecord, String> STATECODE = createField("statecode", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.bookingCountLast28</code>.
     */
    public final TableField<LocationRecord, Integer> BOOKINGCOUNTLAST28 = createField("bookingCountLast28", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.seoLocationName</code>.
     */
    public final TableField<LocationRecord, String> SEOLOCATIONNAME = createField("seoLocationName", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.directions_text</code>.
     */
    public final TableField<LocationRecord, String> DIRECTIONS_TEXT = createField("directions_text", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.railway</code>.
     */
    public final TableField<LocationRecord, Boolean> RAILWAY = createField("railway", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.ferryport</code>.
     */
    public final TableField<LocationRecord, Boolean> FERRYPORT = createField("ferryport", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.amendedBy</code>.
     */
    public final TableField<LocationRecord, Integer> AMENDEDBY = createField("amendedBy", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.fk_timezones</code>.
     */
    public final TableField<LocationRecord, Integer> FK_TIMEZONES = createField("fk_timezones", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.globalUniqueID</code>.
     */
    public final TableField<LocationRecord, Integer> GLOBALUNIQUEID = createField("globalUniqueID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Location.queriesThisYear</code>.
     */
    public final TableField<LocationRecord, Integer> QUERIESTHISYEAR = createField("queriesThisYear", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Location</code> table reference
     */
    public Location() {
        this(DSL.name("Location"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Location</code> table reference
     */
    public Location(String alias) {
        this(DSL.name(alias), LOCATION);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Location</code> table reference
     */
    public Location(Name alias) {
        this(alias, LOCATION);
    }

    private Location(Name alias, Table<LocationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Location(Name alias, Table<LocationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Location(Table<O> child, ForeignKey<O, LocationRecord> key) {
        super(child, key, LOCATION);
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
        return Arrays.<Index>asList(Indexes.LOCATION_PK_LOCATION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LocationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_LOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LocationRecord> getPrimaryKey() {
        return Keys.PK_LOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LocationRecord>> getKeys() {
        return Arrays.<UniqueKey<LocationRecord>>asList(Keys.PK_LOCATION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Location as(String alias) {
        return new Location(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Location as(Name alias) {
        return new Location(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Location rename(String name) {
        return new Location(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Location rename(Name name) {
        return new Location(name, null);
    }
}
