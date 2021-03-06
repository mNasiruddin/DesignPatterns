/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Gtonlineratesheetitem;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class GtonlineratesheetitemRecord extends UpdatableRecordImpl<GtonlineratesheetitemRecord> implements Record13<Integer, Integer, Integer, Integer, BigDecimal, BigDecimal, Boolean, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = -2003822021;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.rate_id</code>.
     */
    public void setRateId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.rate_id</code>.
     */
    public Integer getRateId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.from_distance</code>.
     */
    public void setFromDistance(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.from_distance</code>.
     */
    public Integer getFromDistance() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.to_distance</code>.
     */
    public void setToDistance(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.to_distance</code>.
     */
    public Integer getToDistance() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.rate</code>.
     */
    public void setRate(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.rate</code>.
     */
    public BigDecimal getRate() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.return_rate</code>.
     */
    public void setReturnRate(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.return_rate</code>.
     */
    public BigDecimal getReturnRate() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.packaged</code>.
     */
    public void setPackaged(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.packaged</code>.
     */
    public Boolean getPackaged() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.senior_rate</code>.
     */
    public void setSeniorRate(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.senior_rate</code>.
     */
    public BigDecimal getSeniorRate() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.senior_return_rate</code>.
     */
    public void setSeniorReturnRate(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.senior_return_rate</code>.
     */
    public BigDecimal getSeniorReturnRate() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.student_rate</code>.
     */
    public void setStudentRate(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.student_rate</code>.
     */
    public BigDecimal getStudentRate() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.student_return_rate</code>.
     */
    public void setStudentReturnRate(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.student_return_rate</code>.
     */
    public BigDecimal getStudentReturnRate() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.child_rate</code>.
     */
    public void setChildRate(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.child_rate</code>.
     */
    public BigDecimal getChildRate() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.child_return_rate</code>.
     */
    public void setChildReturnRate(BigDecimal value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.child_return_rate</code>.
     */
    public BigDecimal getChildReturnRate() {
        return (BigDecimal) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, Integer, Integer, Integer, BigDecimal, BigDecimal, Boolean, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, Integer, Integer, Integer, BigDecimal, BigDecimal, Boolean, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Gtonlineratesheetitem.GTONLINERATESHEETITEM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Gtonlineratesheetitem.GTONLINERATESHEETITEM.RATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Gtonlineratesheetitem.GTONLINERATESHEETITEM.FROM_DISTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Gtonlineratesheetitem.GTONLINERATESHEETITEM.TO_DISTANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return Gtonlineratesheetitem.GTONLINERATESHEETITEM.RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return Gtonlineratesheetitem.GTONLINERATESHEETITEM.RETURN_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return Gtonlineratesheetitem.GTONLINERATESHEETITEM.PACKAGED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return Gtonlineratesheetitem.GTONLINERATESHEETITEM.SENIOR_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return Gtonlineratesheetitem.GTONLINERATESHEETITEM.SENIOR_RETURN_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return Gtonlineratesheetitem.GTONLINERATESHEETITEM.STUDENT_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field11() {
        return Gtonlineratesheetitem.GTONLINERATESHEETITEM.STUDENT_RETURN_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field12() {
        return Gtonlineratesheetitem.GTONLINERATESHEETITEM.CHILD_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field13() {
        return Gtonlineratesheetitem.GTONLINERATESHEETITEM.CHILD_RETURN_RATE;
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
        return getRateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getFromDistance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getToDistance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getReturnRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getPackaged();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getSeniorRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getSeniorReturnRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getStudentRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component11() {
        return getStudentReturnRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component12() {
        return getChildRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component13() {
        return getChildReturnRate();
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
        return getRateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getFromDistance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getToDistance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getReturnRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getPackaged();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getSeniorRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getSeniorReturnRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getStudentRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value11() {
        return getStudentReturnRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value12() {
        return getChildRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value13() {
        return getChildReturnRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetitemRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetitemRecord value2(Integer value) {
        setRateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetitemRecord value3(Integer value) {
        setFromDistance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetitemRecord value4(Integer value) {
        setToDistance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetitemRecord value5(BigDecimal value) {
        setRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetitemRecord value6(BigDecimal value) {
        setReturnRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetitemRecord value7(Boolean value) {
        setPackaged(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetitemRecord value8(BigDecimal value) {
        setSeniorRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetitemRecord value9(BigDecimal value) {
        setSeniorReturnRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetitemRecord value10(BigDecimal value) {
        setStudentRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetitemRecord value11(BigDecimal value) {
        setStudentReturnRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetitemRecord value12(BigDecimal value) {
        setChildRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetitemRecord value13(BigDecimal value) {
        setChildReturnRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetitemRecord values(Integer value1, Integer value2, Integer value3, Integer value4, BigDecimal value5, BigDecimal value6, Boolean value7, BigDecimal value8, BigDecimal value9, BigDecimal value10, BigDecimal value11, BigDecimal value12, BigDecimal value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GtonlineratesheetitemRecord
     */
    public GtonlineratesheetitemRecord() {
        super(Gtonlineratesheetitem.GTONLINERATESHEETITEM);
    }

    /**
     * Create a detached, initialised GtonlineratesheetitemRecord
     */
    public GtonlineratesheetitemRecord(Integer id, Integer rateId, Integer fromDistance, Integer toDistance, BigDecimal rate, BigDecimal returnRate, Boolean packaged, BigDecimal seniorRate, BigDecimal seniorReturnRate, BigDecimal studentRate, BigDecimal studentReturnRate, BigDecimal childRate, BigDecimal childReturnRate) {
        super(Gtonlineratesheetitem.GTONLINERATESHEETITEM);

        set(0, id);
        set(1, rateId);
        set(2, fromDistance);
        set(3, toDistance);
        set(4, rate);
        set(5, returnRate);
        set(6, packaged);
        set(7, seniorRate);
        set(8, seniorReturnRate);
        set(9, studentRate);
        set(10, studentReturnRate);
        set(11, childRate);
        set(12, childReturnRate);
    }
}
