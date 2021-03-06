/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.CarAgentLocationBak13092017;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
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
public class CarAgentLocationBak13092017Record extends UpdatableRecordImpl<CarAgentLocationBak13092017Record> implements Record15<Integer, Boolean, Integer, String, String, String, Integer, Short, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Timestamp, Short> {

    private static final long serialVersionUID = -80543560;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.car_agent_location_id</code>.
     */
    public void setCarAgentLocationId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.car_agent_location_id</code>.
     */
    public Integer getCarAgentLocationId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.status</code>.
     */
    public void setStatus(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.status</code>.
     */
    public Boolean getStatus() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.car_agent_id</code>.
     */
    public void setCarAgentId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.car_agent_id</code>.
     */
    public Integer getCarAgentId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.car_agent_location_name</code>.
     */
    public void setCarAgentLocationName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.car_agent_location_name</code>.
     */
    public String getCarAgentLocationName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.car_agent_location_code</code>.
     */
    public void setCarAgentLocationCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.car_agent_location_code</code>.
     */
    public String getCarAgentLocationCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.corporate_location_code</code>.
     */
    public void setCorporateLocationCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.corporate_location_code</code>.
     */
    public String getCorporateLocationCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.physical_location_id</code>.
     */
    public void setPhysicalLocationId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.physical_location_id</code>.
     */
    public Integer getPhysicalLocationId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.flags</code>.
     */
    public void setFlags(Short value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.flags</code>.
     */
    public Short getFlags() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.filter_option</code>.
     */
    public void setFilterOption(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.filter_option</code>.
     */
    public Integer getFilterOption() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.CarMetrics1</code>.
     */
    public void setCarmetrics1(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.CarMetrics1</code>.
     */
    public BigDecimal getCarmetrics1() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.CarMetrics2</code>.
     */
    public void setCarmetrics2(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.CarMetrics2</code>.
     */
    public BigDecimal getCarmetrics2() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.CarMetrics3</code>.
     */
    public void setCarmetrics3(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.CarMetrics3</code>.
     */
    public BigDecimal getCarmetrics3() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.CarMetrics4</code>.
     */
    public void setCarmetrics4(BigDecimal value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.CarMetrics4</code>.
     */
    public BigDecimal getCarmetrics4() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.demolition_date</code>.
     */
    public void setDemolitionDate(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.demolition_date</code>.
     */
    public Timestamp getDemolitionDate() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.demolition_reason</code>.
     */
    public void setDemolitionReason(Short value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.car_agent_location_bak13092017.demolition_reason</code>.
     */
    public Short getDemolitionReason() {
        return (Short) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, Boolean, Integer, String, String, String, Integer, Short, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Timestamp, Short> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, Boolean, Integer, String, String, String, Integer, Short, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Timestamp, Short> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CarAgentLocationBak13092017.CAR_AGENT_LOCATION_BAK13092017.CAR_AGENT_LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field2() {
        return CarAgentLocationBak13092017.CAR_AGENT_LOCATION_BAK13092017.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CarAgentLocationBak13092017.CAR_AGENT_LOCATION_BAK13092017.CAR_AGENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CarAgentLocationBak13092017.CAR_AGENT_LOCATION_BAK13092017.CAR_AGENT_LOCATION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CarAgentLocationBak13092017.CAR_AGENT_LOCATION_BAK13092017.CAR_AGENT_LOCATION_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CarAgentLocationBak13092017.CAR_AGENT_LOCATION_BAK13092017.CORPORATE_LOCATION_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return CarAgentLocationBak13092017.CAR_AGENT_LOCATION_BAK13092017.PHYSICAL_LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field8() {
        return CarAgentLocationBak13092017.CAR_AGENT_LOCATION_BAK13092017.FLAGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return CarAgentLocationBak13092017.CAR_AGENT_LOCATION_BAK13092017.FILTER_OPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return CarAgentLocationBak13092017.CAR_AGENT_LOCATION_BAK13092017.CARMETRICS1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field11() {
        return CarAgentLocationBak13092017.CAR_AGENT_LOCATION_BAK13092017.CARMETRICS2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field12() {
        return CarAgentLocationBak13092017.CAR_AGENT_LOCATION_BAK13092017.CARMETRICS3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field13() {
        return CarAgentLocationBak13092017.CAR_AGENT_LOCATION_BAK13092017.CARMETRICS4;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return CarAgentLocationBak13092017.CAR_AGENT_LOCATION_BAK13092017.DEMOLITION_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field15() {
        return CarAgentLocationBak13092017.CAR_AGENT_LOCATION_BAK13092017.DEMOLITION_REASON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCarAgentLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component2() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCarAgentLocationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCarAgentLocationCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCorporateLocationCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getPhysicalLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component8() {
        return getFlags();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getFilterOption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getCarmetrics1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component11() {
        return getCarmetrics2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component12() {
        return getCarmetrics3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component13() {
        return getCarmetrics4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getDemolitionDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component15() {
        return getDemolitionReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCarAgentLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value2() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCarAgentLocationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCarAgentLocationCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCorporateLocationCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getPhysicalLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value8() {
        return getFlags();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getFilterOption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getCarmetrics1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value11() {
        return getCarmetrics2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value12() {
        return getCarmetrics3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value13() {
        return getCarmetrics4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getDemolitionDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value15() {
        return getDemolitionReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentLocationBak13092017Record value1(Integer value) {
        setCarAgentLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentLocationBak13092017Record value2(Boolean value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentLocationBak13092017Record value3(Integer value) {
        setCarAgentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentLocationBak13092017Record value4(String value) {
        setCarAgentLocationName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentLocationBak13092017Record value5(String value) {
        setCarAgentLocationCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentLocationBak13092017Record value6(String value) {
        setCorporateLocationCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentLocationBak13092017Record value7(Integer value) {
        setPhysicalLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentLocationBak13092017Record value8(Short value) {
        setFlags(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentLocationBak13092017Record value9(Integer value) {
        setFilterOption(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentLocationBak13092017Record value10(BigDecimal value) {
        setCarmetrics1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentLocationBak13092017Record value11(BigDecimal value) {
        setCarmetrics2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentLocationBak13092017Record value12(BigDecimal value) {
        setCarmetrics3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentLocationBak13092017Record value13(BigDecimal value) {
        setCarmetrics4(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentLocationBak13092017Record value14(Timestamp value) {
        setDemolitionDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentLocationBak13092017Record value15(Short value) {
        setDemolitionReason(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentLocationBak13092017Record values(Integer value1, Boolean value2, Integer value3, String value4, String value5, String value6, Integer value7, Short value8, Integer value9, BigDecimal value10, BigDecimal value11, BigDecimal value12, BigDecimal value13, Timestamp value14, Short value15) {
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
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CarAgentLocationBak13092017Record
     */
    public CarAgentLocationBak13092017Record() {
        super(CarAgentLocationBak13092017.CAR_AGENT_LOCATION_BAK13092017);
    }

    /**
     * Create a detached, initialised CarAgentLocationBak13092017Record
     */
    public CarAgentLocationBak13092017Record(Integer carAgentLocationId, Boolean status, Integer carAgentId, String carAgentLocationName, String carAgentLocationCode, String corporateLocationCode, Integer physicalLocationId, Short flags, Integer filterOption, BigDecimal carmetrics1, BigDecimal carmetrics2, BigDecimal carmetrics3, BigDecimal carmetrics4, Timestamp demolitionDate, Short demolitionReason) {
        super(CarAgentLocationBak13092017.CAR_AGENT_LOCATION_BAK13092017);

        set(0, carAgentLocationId);
        set(1, status);
        set(2, carAgentId);
        set(3, carAgentLocationName);
        set(4, carAgentLocationCode);
        set(5, corporateLocationCode);
        set(6, physicalLocationId);
        set(7, flags);
        set(8, filterOption);
        set(9, carmetrics1);
        set(10, carmetrics2);
        set(11, carmetrics3);
        set(12, carmetrics4);
        set(13, demolitionDate);
        set(14, demolitionReason);
    }
}
