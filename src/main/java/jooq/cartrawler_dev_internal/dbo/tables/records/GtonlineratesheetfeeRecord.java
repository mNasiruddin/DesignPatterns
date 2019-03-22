/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Gtonlineratesheetfee;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class GtonlineratesheetfeeRecord extends UpdatableRecordImpl<GtonlineratesheetfeeRecord> implements Record12<Integer, Integer, String, String, String, String, String, Long, Long, Long, Long, BigDecimal> {

    private static final long serialVersionUID = -1727377357;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.fee_id</code>.
     */
    public void setFeeId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.fee_id</code>.
     */
    public Integer getFeeId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.car_agent_id</code>.
     */
    public void setCarAgentId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.car_agent_id</code>.
     */
    public Integer getCarAgentId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.fee</code>.
     */
    public void setFee(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.fee</code>.
     */
    public String getFee() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.fleet_code</code>.
     */
    public void setFleetCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.fleet_code</code>.
     */
    public String getFleetCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.rate_code_str</code>.
     */
    public void setRateCodeStr(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.rate_code_str</code>.
     */
    public String getRateCodeStr() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.pickup_locations</code>.
     */
    public void setPickupLocations(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.pickup_locations</code>.
     */
    public String getPickupLocations() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.return_locations</code>.
     */
    public void setReturnLocations(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.return_locations</code>.
     */
    public String getReturnLocations() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.booking_from</code>.
     */
    public void setBookingFrom(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.booking_from</code>.
     */
    public Long getBookingFrom() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.booking_to</code>.
     */
    public void setBookingTo(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.booking_to</code>.
     */
    public Long getBookingTo() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.travel_from</code>.
     */
    public void setTravelFrom(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.travel_from</code>.
     */
    public Long getTravelFrom() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.travel_to</code>.
     */
    public void setTravelTo(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.travel_to</code>.
     */
    public Long getTravelTo() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.Amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetFee.Amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, String, String, String, String, Long, Long, Long, Long, BigDecimal> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, String, String, String, String, Long, Long, Long, Long, BigDecimal> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Gtonlineratesheetfee.GTONLINERATESHEETFEE.FEE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Gtonlineratesheetfee.GTONLINERATESHEETFEE.CAR_AGENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Gtonlineratesheetfee.GTONLINERATESHEETFEE.FEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Gtonlineratesheetfee.GTONLINERATESHEETFEE.FLEET_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Gtonlineratesheetfee.GTONLINERATESHEETFEE.RATE_CODE_STR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Gtonlineratesheetfee.GTONLINERATESHEETFEE.PICKUP_LOCATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Gtonlineratesheetfee.GTONLINERATESHEETFEE.RETURN_LOCATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return Gtonlineratesheetfee.GTONLINERATESHEETFEE.BOOKING_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return Gtonlineratesheetfee.GTONLINERATESHEETFEE.BOOKING_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return Gtonlineratesheetfee.GTONLINERATESHEETFEE.TRAVEL_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return Gtonlineratesheetfee.GTONLINERATESHEETFEE.TRAVEL_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field12() {
        return Gtonlineratesheetfee.GTONLINERATESHEETFEE.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getFeeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getFleetCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getRateCodeStr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getPickupLocations();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getReturnLocations();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getBookingFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getBookingTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getTravelFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component11() {
        return getTravelTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component12() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFeeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFleetCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getRateCodeStr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPickupLocations();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getReturnLocations();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getBookingFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getBookingTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getTravelFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getTravelTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value12() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetfeeRecord value1(Integer value) {
        setFeeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetfeeRecord value2(Integer value) {
        setCarAgentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetfeeRecord value3(String value) {
        setFee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetfeeRecord value4(String value) {
        setFleetCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetfeeRecord value5(String value) {
        setRateCodeStr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetfeeRecord value6(String value) {
        setPickupLocations(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetfeeRecord value7(String value) {
        setReturnLocations(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetfeeRecord value8(Long value) {
        setBookingFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetfeeRecord value9(Long value) {
        setBookingTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetfeeRecord value10(Long value) {
        setTravelFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetfeeRecord value11(Long value) {
        setTravelTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetfeeRecord value12(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetfeeRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6, String value7, Long value8, Long value9, Long value10, Long value11, BigDecimal value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GtonlineratesheetfeeRecord
     */
    public GtonlineratesheetfeeRecord() {
        super(Gtonlineratesheetfee.GTONLINERATESHEETFEE);
    }

    /**
     * Create a detached, initialised GtonlineratesheetfeeRecord
     */
    public GtonlineratesheetfeeRecord(Integer feeId, Integer carAgentId, String fee, String fleetCode, String rateCodeStr, String pickupLocations, String returnLocations, Long bookingFrom, Long bookingTo, Long travelFrom, Long travelTo, BigDecimal amount) {
        super(Gtonlineratesheetfee.GTONLINERATESHEETFEE);

        set(0, feeId);
        set(1, carAgentId);
        set(2, fee);
        set(3, fleetCode);
        set(4, rateCodeStr);
        set(5, pickupLocations);
        set(6, returnLocations);
        set(7, bookingFrom);
        set(8, bookingTo);
        set(9, travelFrom);
        set(10, travelTo);
        set(11, amount);
    }
}