/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Virtuallocationitems;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class VirtuallocationitemsRecord extends UpdatableRecordImpl<VirtuallocationitemsRecord> implements Record6<UUID, Integer, Integer, String, Integer, String> {

    private static final long serialVersionUID = 1019848374;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VirtualLocationItems.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VirtualLocationItems.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VirtualLocationItems.ID</code>.
     */
    public void setId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VirtualLocationItems.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VirtualLocationItems.location_id</code>.
     */
    public void setLocationId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VirtualLocationItems.location_id</code>.
     */
    public Integer getLocationId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VirtualLocationItems.country_id</code>.
     */
    public void setCountryId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VirtualLocationItems.country_id</code>.
     */
    public String getCountryId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VirtualLocationItems.ref</code>.
     */
    public void setRef(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VirtualLocationItems.ref</code>.
     */
    public Integer getRef() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VirtualLocationItems.state_code</code>.
     */
    public void setStateCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VirtualLocationItems.state_code</code>.
     */
    public String getStateCode() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UUID, Integer, Integer, String, Integer, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UUID, Integer, Integer, String, Integer, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Virtuallocationitems.VIRTUALLOCATIONITEMS.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Virtuallocationitems.VIRTUALLOCATIONITEMS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Virtuallocationitems.VIRTUALLOCATIONITEMS.LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Virtuallocationitems.VIRTUALLOCATIONITEMS.COUNTRY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Virtuallocationitems.VIRTUALLOCATIONITEMS.REF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Virtuallocationitems.VIRTUALLOCATIONITEMS.STATE_CODE;
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
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getStateCode();
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
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getStateCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtuallocationitemsRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtuallocationitemsRecord value2(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtuallocationitemsRecord value3(Integer value) {
        setLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtuallocationitemsRecord value4(String value) {
        setCountryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtuallocationitemsRecord value5(Integer value) {
        setRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtuallocationitemsRecord value6(String value) {
        setStateCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtuallocationitemsRecord values(UUID value1, Integer value2, Integer value3, String value4, Integer value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VirtuallocationitemsRecord
     */
    public VirtuallocationitemsRecord() {
        super(Virtuallocationitems.VIRTUALLOCATIONITEMS);
    }

    /**
     * Create a detached, initialised VirtuallocationitemsRecord
     */
    public VirtuallocationitemsRecord(UUID guid, Integer id, Integer locationId, String countryId, Integer ref, String stateCode) {
        super(Virtuallocationitems.VIRTUALLOCATIONITEMS);

        set(0, guid);
        set(1, id);
        set(2, locationId);
        set(3, countryId);
        set(4, ref);
        set(5, stateCode);
    }
}
