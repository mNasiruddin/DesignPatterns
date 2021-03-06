/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ReservationCompanyInfo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class ReservationCompanyInfoRecord extends UpdatableRecordImpl<ReservationCompanyInfoRecord> implements Record4<Integer, String, String, String> {

    private static final long serialVersionUID = -346876857;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_company_info.ref</code>.
     */
    public void setRef(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_company_info.ref</code>.
     */
    public Integer getRef() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_company_info.order_id</code>.
     */
    public void setOrderId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_company_info.order_id</code>.
     */
    public String getOrderId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_company_info.company_name</code>.
     */
    public void setCompanyName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_company_info.company_name</code>.
     */
    public String getCompanyName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Reservation_company_info.vat</code>.
     */
    public void setVat(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Reservation_company_info.vat</code>.
     */
    public String getVat() {
        return (String) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReservationCompanyInfo.RESERVATION_COMPANY_INFO.REF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ReservationCompanyInfo.RESERVATION_COMPANY_INFO.ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ReservationCompanyInfo.RESERVATION_COMPANY_INFO.COMPANY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ReservationCompanyInfo.RESERVATION_COMPANY_INFO.VAT;
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
    public String component2() {
        return getOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCompanyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getVat();
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
    public String value2() {
        return getOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCompanyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getVat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationCompanyInfoRecord value1(Integer value) {
        setRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationCompanyInfoRecord value2(String value) {
        setOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationCompanyInfoRecord value3(String value) {
        setCompanyName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationCompanyInfoRecord value4(String value) {
        setVat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationCompanyInfoRecord values(Integer value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReservationCompanyInfoRecord
     */
    public ReservationCompanyInfoRecord() {
        super(ReservationCompanyInfo.RESERVATION_COMPANY_INFO);
    }

    /**
     * Create a detached, initialised ReservationCompanyInfoRecord
     */
    public ReservationCompanyInfoRecord(Integer ref, String orderId, String companyName, String vat) {
        super(ReservationCompanyInfo.RESERVATION_COMPANY_INFO);

        set(0, ref);
        set(1, orderId);
        set(2, companyName);
        set(3, vat);
    }
}
