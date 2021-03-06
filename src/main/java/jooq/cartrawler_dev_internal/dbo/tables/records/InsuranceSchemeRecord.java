/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.InsuranceScheme;

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
public class InsuranceSchemeRecord extends UpdatableRecordImpl<InsuranceSchemeRecord> implements Record6<Integer, Integer, Integer, String, BigDecimal, String> {

    private static final long serialVersionUID = 116512343;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_scheme.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_scheme.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_scheme.fk_insurance_product</code>.
     */
    public void setFkInsuranceProduct(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_scheme.fk_insurance_product</code>.
     */
    public Integer getFkInsuranceProduct() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_scheme.series</code>.
     */
    public void setSeries(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_scheme.series</code>.
     */
    public Integer getSeries() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_scheme.iso2_country</code>.
     */
    public void setIso2Country(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_scheme.iso2_country</code>.
     */
    public String getIso2Country() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_scheme.excess_amount</code>.
     */
    public void setExcessAmount(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_scheme.excess_amount</code>.
     */
    public BigDecimal getExcessAmount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.insurance_scheme.excess_currency</code>.
     */
    public void setExcessCurrency(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.insurance_scheme.excess_currency</code>.
     */
    public String getExcessCurrency() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, String, BigDecimal, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, String, BigDecimal, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return InsuranceScheme.INSURANCE_SCHEME.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return InsuranceScheme.INSURANCE_SCHEME.FK_INSURANCE_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return InsuranceScheme.INSURANCE_SCHEME.SERIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return InsuranceScheme.INSURANCE_SCHEME.ISO2_COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return InsuranceScheme.INSURANCE_SCHEME.EXCESS_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return InsuranceScheme.INSURANCE_SCHEME.EXCESS_CURRENCY;
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
        return getFkInsuranceProduct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getSeries();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getIso2Country();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getExcessAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getExcessCurrency();
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
        return getFkInsuranceProduct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSeries();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getIso2Country();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getExcessAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getExcessCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsuranceSchemeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsuranceSchemeRecord value2(Integer value) {
        setFkInsuranceProduct(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsuranceSchemeRecord value3(Integer value) {
        setSeries(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsuranceSchemeRecord value4(String value) {
        setIso2Country(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsuranceSchemeRecord value5(BigDecimal value) {
        setExcessAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsuranceSchemeRecord value6(String value) {
        setExcessCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsuranceSchemeRecord values(Integer value1, Integer value2, Integer value3, String value4, BigDecimal value5, String value6) {
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
     * Create a detached InsuranceSchemeRecord
     */
    public InsuranceSchemeRecord() {
        super(InsuranceScheme.INSURANCE_SCHEME);
    }

    /**
     * Create a detached, initialised InsuranceSchemeRecord
     */
    public InsuranceSchemeRecord(Integer id, Integer fkInsuranceProduct, Integer series, String iso2Country, BigDecimal excessAmount, String excessCurrency) {
        super(InsuranceScheme.INSURANCE_SCHEME);

        set(0, id);
        set(1, fkInsuranceProduct);
        set(2, series);
        set(3, iso2Country);
        set(4, excessAmount);
        set(5, excessCurrency);
    }
}
