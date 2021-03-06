/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.EmailVip;

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
public class EmailVipRecord extends TableRecordImpl<EmailVipRecord> implements Record8<Integer, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 359903348;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.email_vip.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.email_vip.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.email_vip.salutation</code>.
     */
    public void setSalutation(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.email_vip.salutation</code>.
     */
    public String getSalutation() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.email_vip.first_name</code>.
     */
    public void setFirstName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.email_vip.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.email_vip.last_name</code>.
     */
    public void setLastName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.email_vip.last_name</code>.
     */
    public String getLastName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.email_vip.email</code>.
     */
    public void setEmail(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.email_vip.email</code>.
     */
    public String getEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.email_vip.company_name</code>.
     */
    public void setCompanyName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.email_vip.company_name</code>.
     */
    public String getCompanyName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.email_vip.title</code>.
     */
    public void setTitle(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.email_vip.title</code>.
     */
    public String getTitle() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.email_vip.mailing_country</code>.
     */
    public void setMailingCountry(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.email_vip.mailing_country</code>.
     */
    public String getMailingCountry() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, String, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return EmailVip.EMAIL_VIP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EmailVip.EMAIL_VIP.SALUTATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EmailVip.EMAIL_VIP.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EmailVip.EMAIL_VIP.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EmailVip.EMAIL_VIP.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return EmailVip.EMAIL_VIP.COMPANY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return EmailVip.EMAIL_VIP.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return EmailVip.EMAIL_VIP.MAILING_COUNTRY;
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
        return getSalutation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCompanyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getMailingCountry();
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
        return getSalutation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCompanyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getMailingCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailVipRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailVipRecord value2(String value) {
        setSalutation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailVipRecord value3(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailVipRecord value4(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailVipRecord value5(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailVipRecord value6(String value) {
        setCompanyName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailVipRecord value7(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailVipRecord value8(String value) {
        setMailingCountry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailVipRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8) {
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
     * Create a detached EmailVipRecord
     */
    public EmailVipRecord() {
        super(EmailVip.EMAIL_VIP);
    }

    /**
     * Create a detached, initialised EmailVipRecord
     */
    public EmailVipRecord(Integer id, String salutation, String firstName, String lastName, String email, String companyName, String title, String mailingCountry) {
        super(EmailVip.EMAIL_VIP);

        set(0, id);
        set(1, salutation);
        set(2, firstName);
        set(3, lastName);
        set(4, email);
        set(5, companyName);
        set(6, title);
        set(7, mailingCountry);
    }
}
