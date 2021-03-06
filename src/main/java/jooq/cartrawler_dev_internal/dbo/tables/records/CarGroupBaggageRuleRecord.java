/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.CarGroupBaggageRule;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;


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
public class CarGroupBaggageRuleRecord extends UpdatableRecordImpl<CarGroupBaggageRuleRecord> implements Record5<Integer, Integer, String, String, UByte> {

    private static final long serialVersionUID = 1265778868;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.car_group_baggage_rule.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.car_group_baggage_rule.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.car_group_baggage_rule.region_id</code>.
     */
    public void setRegionId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.car_group_baggage_rule.region_id</code>.
     */
    public Integer getRegionId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.car_group_baggage_rule.sippFirstChar</code>.
     */
    public void setSippfirstchar(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.car_group_baggage_rule.sippFirstChar</code>.
     */
    public String getSippfirstchar() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.car_group_baggage_rule.sippSecondChar</code>.
     */
    public void setSippsecondchar(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.car_group_baggage_rule.sippSecondChar</code>.
     */
    public String getSippsecondchar() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.car_group_baggage_rule.bags</code>.
     */
    public void setBags(UByte value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.car_group_baggage_rule.bags</code>.
     */
    public UByte getBags() {
        return (UByte) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, String, UByte> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, String, UByte> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CarGroupBaggageRule.CAR_GROUP_BAGGAGE_RULE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CarGroupBaggageRule.CAR_GROUP_BAGGAGE_RULE.REGION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CarGroupBaggageRule.CAR_GROUP_BAGGAGE_RULE.SIPPFIRSTCHAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CarGroupBaggageRule.CAR_GROUP_BAGGAGE_RULE.SIPPSECONDCHAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field5() {
        return CarGroupBaggageRule.CAR_GROUP_BAGGAGE_RULE.BAGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getRegionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSippfirstchar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSippsecondchar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component5() {
        return getBags();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getRegionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSippfirstchar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSippsecondchar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value5() {
        return getBags();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarGroupBaggageRuleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarGroupBaggageRuleRecord value2(Integer value) {
        setRegionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarGroupBaggageRuleRecord value3(String value) {
        setSippfirstchar(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarGroupBaggageRuleRecord value4(String value) {
        setSippsecondchar(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarGroupBaggageRuleRecord value5(UByte value) {
        setBags(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarGroupBaggageRuleRecord values(Integer value1, Integer value2, String value3, String value4, UByte value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CarGroupBaggageRuleRecord
     */
    public CarGroupBaggageRuleRecord() {
        super(CarGroupBaggageRule.CAR_GROUP_BAGGAGE_RULE);
    }

    /**
     * Create a detached, initialised CarGroupBaggageRuleRecord
     */
    public CarGroupBaggageRuleRecord(Integer id, Integer regionId, String sippfirstchar, String sippsecondchar, UByte bags) {
        super(CarGroupBaggageRule.CAR_GROUP_BAGGAGE_RULE);

        set(0, id);
        set(1, regionId);
        set(2, sippfirstchar);
        set(3, sippsecondchar);
        set(4, bags);
    }
}
