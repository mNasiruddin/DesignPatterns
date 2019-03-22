/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.LocationPickupType;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class LocationPickupTypeRecord extends UpdatableRecordImpl<LocationPickupTypeRecord> implements Record4<UUID, Integer, String, String> {

    private static final long serialVersionUID = -1276316261;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.location_pickup_type.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.location_pickup_type.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.location_pickup_type.loc_pickup_type_id</code>.
     */
    public void setLocPickupTypeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.location_pickup_type.loc_pickup_type_id</code>.
     */
    public Integer getLocPickupTypeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.location_pickup_type.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.location_pickup_type.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.location_pickup_type.ota_code</code>.
     */
    public void setOtaCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.location_pickup_type.ota_code</code>.
     */
    public String getOtaCode() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UUID, Integer, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UUID, Integer, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return LocationPickupType.LOCATION_PICKUP_TYPE.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return LocationPickupType.LOCATION_PICKUP_TYPE.LOC_PICKUP_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return LocationPickupType.LOCATION_PICKUP_TYPE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return LocationPickupType.LOCATION_PICKUP_TYPE.OTA_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getLocPickupTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getOtaCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getLocPickupTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOtaCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationPickupTypeRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationPickupTypeRecord value2(Integer value) {
        setLocPickupTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationPickupTypeRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationPickupTypeRecord value4(String value) {
        setOtaCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationPickupTypeRecord values(UUID value1, Integer value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LocationPickupTypeRecord
     */
    public LocationPickupTypeRecord() {
        super(LocationPickupType.LOCATION_PICKUP_TYPE);
    }

    /**
     * Create a detached, initialised LocationPickupTypeRecord
     */
    public LocationPickupTypeRecord(UUID guid, Integer locPickupTypeId, String name, String otaCode) {
        super(LocationPickupType.LOCATION_PICKUP_TYPE);

        set(0, guid);
        set(1, locPickupTypeId);
        set(2, name);
        set(3, otaCode);
    }
}