/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Currency;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class CurrencyRecord extends UpdatableRecordImpl<CurrencyRecord> implements Record10<String, BigDecimal, Timestamp, Boolean, String, String, String, Timestamp, Boolean, Boolean> {

    private static final long serialVersionUID = -62363183;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Currency.Currency_Name</code>.
     */
    public void setCurrencyName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Currency.Currency_Name</code>.
     */
    public String getCurrencyName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Currency.Currency_Rate</code>.
     */
    public void setCurrencyRate(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Currency.Currency_Rate</code>.
     */
    public BigDecimal getCurrencyRate() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Currency.Date_Changed</code>.
     */
    public void setDateChanged(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Currency.Date_Changed</code>.
     */
    public Timestamp getDateChanged() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Currency.Live</code>.
     */
    public void setLive(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Currency.Live</code>.
     */
    public Boolean getLive() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Currency.Code</code>.
     */
    public void setCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Currency.Code</code>.
     */
    public String getCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Currency.Description</code>.
     */
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Currency.Description</code>.
     */
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Currency.symbol</code>.
     */
    public void setSymbol(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Currency.symbol</code>.
     */
    public String getSymbol() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Currency.exchange_updated</code>.
     */
    public void setExchangeUpdated(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Currency.exchange_updated</code>.
     */
    public Timestamp getExchangeUpdated() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Currency.charge_currency</code>.
     */
    public void setChargeCurrency(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Currency.charge_currency</code>.
     */
    public Boolean getChargeCurrency() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Currency.display</code>.
     */
    public void setDisplay(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Currency.display</code>.
     */
    public Boolean getDisplay() {
        return (Boolean) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, BigDecimal, Timestamp, Boolean, String, String, String, Timestamp, Boolean, Boolean> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, BigDecimal, Timestamp, Boolean, String, String, String, Timestamp, Boolean, Boolean> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Currency.CURRENCY.CURRENCY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return Currency.CURRENCY.CURRENCY_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Currency.CURRENCY.DATE_CHANGED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return Currency.CURRENCY.LIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Currency.CURRENCY.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Currency.CURRENCY.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Currency.CURRENCY.SYMBOL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Currency.CURRENCY.EXCHANGE_UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return Currency.CURRENCY.CHARGE_CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return Currency.CURRENCY.DISPLAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getCurrencyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component2() {
        return getCurrencyRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getDateChanged();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getLive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSymbol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getExchangeUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getChargeCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getDisplay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getCurrencyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value2() {
        return getCurrencyRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getDateChanged();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getLive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSymbol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getExchangeUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getChargeCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getDisplay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CurrencyRecord value1(String value) {
        setCurrencyName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CurrencyRecord value2(BigDecimal value) {
        setCurrencyRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CurrencyRecord value3(Timestamp value) {
        setDateChanged(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CurrencyRecord value4(Boolean value) {
        setLive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CurrencyRecord value5(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CurrencyRecord value6(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CurrencyRecord value7(String value) {
        setSymbol(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CurrencyRecord value8(Timestamp value) {
        setExchangeUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CurrencyRecord value9(Boolean value) {
        setChargeCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CurrencyRecord value10(Boolean value) {
        setDisplay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CurrencyRecord values(String value1, BigDecimal value2, Timestamp value3, Boolean value4, String value5, String value6, String value7, Timestamp value8, Boolean value9, Boolean value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CurrencyRecord
     */
    public CurrencyRecord() {
        super(Currency.CURRENCY);
    }

    /**
     * Create a detached, initialised CurrencyRecord
     */
    public CurrencyRecord(String currencyName, BigDecimal currencyRate, Timestamp dateChanged, Boolean live, String code, String description, String symbol, Timestamp exchangeUpdated, Boolean chargeCurrency, Boolean display) {
        super(Currency.CURRENCY);

        set(0, currencyName);
        set(1, currencyRate);
        set(2, dateChanged);
        set(3, live);
        set(4, code);
        set(5, description);
        set(6, symbol);
        set(7, exchangeUpdated);
        set(8, chargeCurrency);
        set(9, display);
    }
}