/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Supplierbrand;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class SupplierbrandRecord extends UpdatableRecordImpl<SupplierbrandRecord> implements Record8<Integer, String, String, String, String, String, Boolean, Integer> {

    private static final long serialVersionUID = -1889778894;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SupplierBrand.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SupplierBrand.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SupplierBrand.brand_name</code>.
     */
    public void setBrandName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SupplierBrand.brand_name</code>.
     */
    public String getBrandName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SupplierBrand.chaincode</code>.
     */
    public void setChaincode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SupplierBrand.chaincode</code>.
     */
    public String getChaincode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SupplierBrand.quasichaincode</code>.
     */
    public void setQuasichaincode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SupplierBrand.quasichaincode</code>.
     */
    public String getQuasichaincode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SupplierBrand.picture</code>.
     */
    public void setPicture(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SupplierBrand.picture</code>.
     */
    public String getPicture() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SupplierBrand.ui_token</code>.
     */
    public void setUiToken(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SupplierBrand.ui_token</code>.
     */
    public String getUiToken() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SupplierBrand.is_live</code>.
     */
    public void setIsLive(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SupplierBrand.is_live</code>.
     */
    public Boolean getIsLive() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SupplierBrand.supplier_brand_group</code>.
     */
    public void setSupplierBrandGroup(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SupplierBrand.supplier_brand_group</code>.
     */
    public Integer getSupplierBrandGroup() {
        return (Integer) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, String, Boolean, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, String, Boolean, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Supplierbrand.SUPPLIERBRAND.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Supplierbrand.SUPPLIERBRAND.BRAND_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Supplierbrand.SUPPLIERBRAND.CHAINCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Supplierbrand.SUPPLIERBRAND.QUASICHAINCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Supplierbrand.SUPPLIERBRAND.PICTURE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Supplierbrand.SUPPLIERBRAND.UI_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return Supplierbrand.SUPPLIERBRAND.IS_LIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Supplierbrand.SUPPLIERBRAND.SUPPLIER_BRAND_GROUP;
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
        return getBrandName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getChaincode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getQuasichaincode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPicture();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getUiToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getIsLive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getSupplierBrandGroup();
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
        return getBrandName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getChaincode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getQuasichaincode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPicture();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUiToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getIsLive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getSupplierBrandGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplierbrandRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplierbrandRecord value2(String value) {
        setBrandName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplierbrandRecord value3(String value) {
        setChaincode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplierbrandRecord value4(String value) {
        setQuasichaincode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplierbrandRecord value5(String value) {
        setPicture(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplierbrandRecord value6(String value) {
        setUiToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplierbrandRecord value7(Boolean value) {
        setIsLive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplierbrandRecord value8(Integer value) {
        setSupplierBrandGroup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SupplierbrandRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Boolean value7, Integer value8) {
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
     * Create a detached SupplierbrandRecord
     */
    public SupplierbrandRecord() {
        super(Supplierbrand.SUPPLIERBRAND);
    }

    /**
     * Create a detached, initialised SupplierbrandRecord
     */
    public SupplierbrandRecord(Integer id, String brandName, String chaincode, String quasichaincode, String picture, String uiToken, Boolean isLive, Integer supplierBrandGroup) {
        super(Supplierbrand.SUPPLIERBRAND);

        set(0, id);
        set(1, brandName);
        set(2, chaincode);
        set(3, quasichaincode);
        set(4, picture);
        set(5, uiToken);
        set(6, isLive);
        set(7, supplierBrandGroup);
    }
}