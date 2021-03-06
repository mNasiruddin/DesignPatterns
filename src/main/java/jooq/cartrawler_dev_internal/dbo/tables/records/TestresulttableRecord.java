/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Testresulttable;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


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
public class TestresulttableRecord extends TableRecordImpl<TestresulttableRecord> implements Record8<Integer, String, String, BigDecimal, String, Boolean, Integer, Boolean> {

    private static final long serialVersionUID = 147495224;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TestResultTable.fk_scrape</code>.
     */
    public void setFkScrape(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TestResultTable.fk_scrape</code>.
     */
    public Integer getFkScrape() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TestResultTable.provider</code>.
     */
    public void setProvider(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TestResultTable.provider</code>.
     */
    public String getProvider() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TestResultTable.SIPP</code>.
     */
    public void setSipp(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TestResultTable.SIPP</code>.
     */
    public String getSipp() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TestResultTable.price</code>.
     */
    public void setPrice(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TestResultTable.price</code>.
     */
    public BigDecimal getPrice() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TestResultTable.currency</code>.
     */
    public void setCurrency(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TestResultTable.currency</code>.
     */
    public String getCurrency() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TestResultTable.aircon</code>.
     */
    public void setAircon(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TestResultTable.aircon</code>.
     */
    public Boolean getAircon() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TestResultTable.doors</code>.
     */
    public void setDoors(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TestResultTable.doors</code>.
     */
    public Integer getDoors() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.TestResultTable.auto</code>.
     */
    public void setAuto(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.TestResultTable.auto</code>.
     */
    public Boolean getAuto() {
        return (Boolean) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, BigDecimal, String, Boolean, Integer, Boolean> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, BigDecimal, String, Boolean, Integer, Boolean> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Testresulttable.TESTRESULTTABLE.FK_SCRAPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Testresulttable.TESTRESULTTABLE.PROVIDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Testresulttable.TESTRESULTTABLE.SIPP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return Testresulttable.TESTRESULTTABLE.PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Testresulttable.TESTRESULTTABLE.CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return Testresulttable.TESTRESULTTABLE.AIRCON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Testresulttable.TESTRESULTTABLE.DOORS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return Testresulttable.TESTRESULTTABLE.AUTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getFkScrape();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getProvider();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSipp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getAircon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getDoors();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
        return getAuto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFkScrape();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getProvider();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSipp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getAircon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getDoors();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getAuto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestresulttableRecord value1(Integer value) {
        setFkScrape(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestresulttableRecord value2(String value) {
        setProvider(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestresulttableRecord value3(String value) {
        setSipp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestresulttableRecord value4(BigDecimal value) {
        setPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestresulttableRecord value5(String value) {
        setCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestresulttableRecord value6(Boolean value) {
        setAircon(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestresulttableRecord value7(Integer value) {
        setDoors(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestresulttableRecord value8(Boolean value) {
        setAuto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestresulttableRecord values(Integer value1, String value2, String value3, BigDecimal value4, String value5, Boolean value6, Integer value7, Boolean value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TestresulttableRecord
     */
    public TestresulttableRecord() {
        super(Testresulttable.TESTRESULTTABLE);
    }

    /**
     * Create a detached, initialised TestresulttableRecord
     */
    public TestresulttableRecord(Integer fkScrape, String provider, String sipp, BigDecimal price, String currency, Boolean aircon, Integer doors, Boolean auto) {
        super(Testresulttable.TESTRESULTTABLE);

        set(0, fkScrape);
        set(1, provider);
        set(2, sipp);
        set(3, price);
        set(4, currency);
        set(5, aircon);
        set(6, doors);
        set(7, auto);
    }
}
