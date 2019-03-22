/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Agelimit;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class AgelimitRecord extends UpdatableRecordImpl<AgelimitRecord> implements Record5<Integer, Integer, Integer, Integer, BigDecimal> {

    private static final long serialVersionUID = -1753776216;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AgeLimit.ref</code>.
     */
    public void setRef(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AgeLimit.ref</code>.
     */
    public Integer getRef() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AgeLimit.agency_id</code>.
     */
    public void setAgencyId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AgeLimit.agency_id</code>.
     */
    public Integer getAgencyId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AgeLimit.age_from</code>.
     */
    public void setAgeFrom(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AgeLimit.age_from</code>.
     */
    public Integer getAgeFrom() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AgeLimit.age_to</code>.
     */
    public void setAgeTo(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AgeLimit.age_to</code>.
     */
    public Integer getAgeTo() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AgeLimit.charge</code>.
     */
    public void setCharge(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AgeLimit.charge</code>.
     */
    public BigDecimal getCharge() {
        return (BigDecimal) get(4);
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
    public Row5<Integer, Integer, Integer, Integer, BigDecimal> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Integer, BigDecimal> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Agelimit.AGELIMIT.REF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Agelimit.AGELIMIT.AGENCY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Agelimit.AGELIMIT.AGE_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Agelimit.AGELIMIT.AGE_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return Agelimit.AGELIMIT.CHARGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getAgencyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getAgeFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getAgeTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getCharge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getAgencyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAgeFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getAgeTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getCharge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgelimitRecord value1(Integer value) {
        setRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgelimitRecord value2(Integer value) {
        setAgencyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgelimitRecord value3(Integer value) {
        setAgeFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgelimitRecord value4(Integer value) {
        setAgeTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgelimitRecord value5(BigDecimal value) {
        setCharge(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AgelimitRecord values(Integer value1, Integer value2, Integer value3, Integer value4, BigDecimal value5) {
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
     * Create a detached AgelimitRecord
     */
    public AgelimitRecord() {
        super(Agelimit.AGELIMIT);
    }

    /**
     * Create a detached, initialised AgelimitRecord
     */
    public AgelimitRecord(Integer ref, Integer agencyId, Integer ageFrom, Integer ageTo, BigDecimal charge) {
        super(Agelimit.AGELIMIT);

        set(0, ref);
        set(1, agencyId);
        set(2, ageFrom);
        set(3, ageTo);
        set(4, charge);
    }
}