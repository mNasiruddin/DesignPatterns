/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.AgencyRates;

import org.jooq.Field;
import org.jooq.Record5;
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
public class AgencyRatesRecord extends UpdatableRecordImpl<AgencyRatesRecord> implements Record6<Integer, String, String, Integer, Integer, BigDecimal> {

    private static final long serialVersionUID = -461057509;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency_Rates.Agency_ID</code>.
     */
    public void setAgencyId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency_Rates.Agency_ID</code>.
     */
    public Integer getAgencyId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency_Rates.Group_ID</code>.
     */
    public void setGroupId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency_Rates.Group_ID</code>.
     */
    public String getGroupId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency_Rates.Season_ID</code>.
     */
    public void setSeasonId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency_Rates.Season_ID</code>.
     */
    public String getSeasonId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency_Rates.Days_From</code>.
     */
    public void setDaysFrom(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency_Rates.Days_From</code>.
     */
    public Integer getDaysFrom() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency_Rates.Days_To</code>.
     */
    public void setDaysTo(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency_Rates.Days_To</code>.
     */
    public Integer getDaysTo() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Agency_Rates.Rate</code>.
     */
    public void setRate(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Agency_Rates.Rate</code>.
     */
    public BigDecimal getRate() {
        return (BigDecimal) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record5<String, String, Integer, Integer, Integer> key() {
        return (Record5) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, Integer, Integer, BigDecimal> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, Integer, Integer, BigDecimal> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AgencyRates.AGENCY_RATES.AGENCY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AgencyRates.AGENCY_RATES.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return AgencyRates.AGENCY_RATES.SEASON_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return AgencyRates.AGENCY_RATES.DAYS_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return AgencyRates.AGENCY_RATES.DAYS_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return AgencyRates.AGENCY_RATES.RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getAgencyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSeasonId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getDaysFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getDaysTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAgencyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSeasonId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getDaysFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getDaysTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgencyRatesRecord value1(Integer value) {
        setAgencyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgencyRatesRecord value2(String value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgencyRatesRecord value3(String value) {
        setSeasonId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgencyRatesRecord value4(Integer value) {
        setDaysFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgencyRatesRecord value5(Integer value) {
        setDaysTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgencyRatesRecord value6(BigDecimal value) {
        setRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgencyRatesRecord values(Integer value1, String value2, String value3, Integer value4, Integer value5, BigDecimal value6) {
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
     * Create a detached AgencyRatesRecord
     */
    public AgencyRatesRecord() {
        super(AgencyRates.AGENCY_RATES);
    }

    /**
     * Create a detached, initialised AgencyRatesRecord
     */
    public AgencyRatesRecord(Integer agencyId, String groupId, String seasonId, Integer daysFrom, Integer daysTo, BigDecimal rate) {
        super(AgencyRates.AGENCY_RATES);

        set(0, agencyId);
        set(1, groupId);
        set(2, seasonId);
        set(3, daysFrom);
        set(4, daysTo);
        set(5, rate);
    }
}
