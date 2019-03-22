/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.MarketingCarAgentLocation;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class MarketingCarAgentLocationRecord extends UpdatableRecordImpl<MarketingCarAgentLocationRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = 446656394;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.marketing_car_agent_location.marketing_car_agent_location_id</code>.
     */
    public void setMarketingCarAgentLocationId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.marketing_car_agent_location.marketing_car_agent_location_id</code>.
     */
    public Integer getMarketingCarAgentLocationId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.marketing_car_agent_location.marketing_location_id</code>.
     */
    public void setMarketingLocationId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.marketing_car_agent_location.marketing_location_id</code>.
     */
    public Integer getMarketingLocationId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.marketing_car_agent_location.car_agent_location_id</code>.
     */
    public void setCarAgentLocationId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.marketing_car_agent_location.car_agent_location_id</code>.
     */
    public Integer getCarAgentLocationId() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MarketingCarAgentLocation.MARKETING_CAR_AGENT_LOCATION.MARKETING_CAR_AGENT_LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return MarketingCarAgentLocation.MARKETING_CAR_AGENT_LOCATION.MARKETING_LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return MarketingCarAgentLocation.MARKETING_CAR_AGENT_LOCATION.CAR_AGENT_LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getMarketingCarAgentLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getMarketingLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getCarAgentLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getMarketingCarAgentLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getMarketingLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCarAgentLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingCarAgentLocationRecord value1(Integer value) {
        setMarketingCarAgentLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingCarAgentLocationRecord value2(Integer value) {
        setMarketingLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingCarAgentLocationRecord value3(Integer value) {
        setCarAgentLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketingCarAgentLocationRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MarketingCarAgentLocationRecord
     */
    public MarketingCarAgentLocationRecord() {
        super(MarketingCarAgentLocation.MARKETING_CAR_AGENT_LOCATION);
    }

    /**
     * Create a detached, initialised MarketingCarAgentLocationRecord
     */
    public MarketingCarAgentLocationRecord(Integer marketingCarAgentLocationId, Integer marketingLocationId, Integer carAgentLocationId) {
        super(MarketingCarAgentLocation.MARKETING_CAR_AGENT_LOCATION);

        set(0, marketingCarAgentLocationId);
        set(1, marketingLocationId);
        set(2, carAgentLocationId);
    }
}