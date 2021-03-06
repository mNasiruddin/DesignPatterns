/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.SvocCustomerIndex;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class SvocCustomerIndexRecord extends UpdatableRecordImpl<SvocCustomerIndexRecord> implements Record11<Integer, String, Integer, String, Integer, Timestamp, Short, Timestamp, Boolean, Timestamp, Timestamp> {

    private static final long serialVersionUID = -929377773;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.email</code>.
     */
    public void setEmail(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.email</code>.
     */
    public String getEmail() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.fk_parent</code>.
     */
    public void setFkParent(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.fk_parent</code>.
     */
    public Integer getFkParent() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.brand_type</code>.
     */
    public void setBrandType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.brand_type</code>.
     */
    public String getBrandType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.fk_svoc_customer</code>.
     */
    public void setFkSvocCustomer(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.fk_svoc_customer</code>.
     */
    public Integer getFkSvocCustomer() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.created_date</code>.
     */
    public void setCreatedDate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.created_date</code>.
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.sync</code>.
     */
    public void setSync(Short value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.sync</code>.
     */
    public Short getSync() {
        return (Short) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.updated_date</code>.
     */
    public void setUpdatedDate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.updated_date</code>.
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.marketing_consent</code>.
     */
    public void setMarketingConsent(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.marketing_consent</code>.
     */
    public Boolean getMarketingConsent() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.mc_subscribe_date</code>.
     */
    public void setMcSubscribeDate(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.mc_subscribe_date</code>.
     */
    public Timestamp getMcSubscribeDate() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.mc_unsubscribe_date</code>.
     */
    public void setMcUnsubscribeDate(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.svoc_customer_index.mc_unsubscribe_date</code>.
     */
    public Timestamp getMcUnsubscribeDate() {
        return (Timestamp) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, Integer, String, Integer, Timestamp, Short, Timestamp, Boolean, Timestamp, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, Integer, String, Integer, Timestamp, Short, Timestamp, Boolean, Timestamp, Timestamp> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SvocCustomerIndex.SVOC_CUSTOMER_INDEX.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SvocCustomerIndex.SVOC_CUSTOMER_INDEX.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return SvocCustomerIndex.SVOC_CUSTOMER_INDEX.FK_PARENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SvocCustomerIndex.SVOC_CUSTOMER_INDEX.BRAND_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return SvocCustomerIndex.SVOC_CUSTOMER_INDEX.FK_SVOC_CUSTOMER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return SvocCustomerIndex.SVOC_CUSTOMER_INDEX.CREATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field7() {
        return SvocCustomerIndex.SVOC_CUSTOMER_INDEX.SYNC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return SvocCustomerIndex.SVOC_CUSTOMER_INDEX.UPDATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return SvocCustomerIndex.SVOC_CUSTOMER_INDEX.MARKETING_CONSENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return SvocCustomerIndex.SVOC_CUSTOMER_INDEX.MC_SUBSCRIBE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return SvocCustomerIndex.SVOC_CUSTOMER_INDEX.MC_UNSUBSCRIBE_DATE;
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
    public String component2() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getFkParent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getBrandType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getFkSvocCustomer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component7() {
        return getSync();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getUpdatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getMarketingConsent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getMcSubscribeDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getMcUnsubscribeDate();
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
    public String value2() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getFkParent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getBrandType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getFkSvocCustomer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value7() {
        return getSync();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getMarketingConsent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getMcSubscribeDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getMcUnsubscribeDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocCustomerIndexRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocCustomerIndexRecord value2(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocCustomerIndexRecord value3(Integer value) {
        setFkParent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocCustomerIndexRecord value4(String value) {
        setBrandType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocCustomerIndexRecord value5(Integer value) {
        setFkSvocCustomer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocCustomerIndexRecord value6(Timestamp value) {
        setCreatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocCustomerIndexRecord value7(Short value) {
        setSync(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocCustomerIndexRecord value8(Timestamp value) {
        setUpdatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocCustomerIndexRecord value9(Boolean value) {
        setMarketingConsent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocCustomerIndexRecord value10(Timestamp value) {
        setMcSubscribeDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocCustomerIndexRecord value11(Timestamp value) {
        setMcUnsubscribeDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SvocCustomerIndexRecord values(Integer value1, String value2, Integer value3, String value4, Integer value5, Timestamp value6, Short value7, Timestamp value8, Boolean value9, Timestamp value10, Timestamp value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SvocCustomerIndexRecord
     */
    public SvocCustomerIndexRecord() {
        super(SvocCustomerIndex.SVOC_CUSTOMER_INDEX);
    }

    /**
     * Create a detached, initialised SvocCustomerIndexRecord
     */
    public SvocCustomerIndexRecord(Integer id, String email, Integer fkParent, String brandType, Integer fkSvocCustomer, Timestamp createdDate, Short sync, Timestamp updatedDate, Boolean marketingConsent, Timestamp mcSubscribeDate, Timestamp mcUnsubscribeDate) {
        super(SvocCustomerIndex.SVOC_CUSTOMER_INDEX);

        set(0, id);
        set(1, email);
        set(2, fkParent);
        set(3, brandType);
        set(4, fkSvocCustomer);
        set(5, createdDate);
        set(6, sync);
        set(7, updatedDate);
        set(8, marketingConsent);
        set(9, mcSubscribeDate);
        set(10, mcUnsubscribeDate);
    }
}
