/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ClientStoredcards;

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
public class ClientStoredcardsRecord extends UpdatableRecordImpl<ClientStoredcardsRecord> implements Record6<Integer, Integer, String, String, String, Integer> {

    private static final long serialVersionUID = -657366425;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.client_storedcards.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.client_storedcards.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.client_storedcards.parent_id</code>.
     */
    public void setParentId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.client_storedcards.parent_id</code>.
     */
    public Integer getParentId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.client_storedcards.realex_pass_ref</code>.
     */
    public void setRealexPassRef(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.client_storedcards.realex_pass_ref</code>.
     */
    public String getRealexPassRef() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.client_storedcards.realex_card_ref</code>.
     */
    public void setRealexCardRef(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.client_storedcards.realex_card_ref</code>.
     */
    public String getRealexCardRef() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.client_storedcards.narrative</code>.
     */
    public void setNarrative(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.client_storedcards.narrative</code>.
     */
    public String getNarrative() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.client_storedcards.card_id</code>.
     */
    public void setCardId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.client_storedcards.card_id</code>.
     */
    public Integer getCardId() {
        return (Integer) get(5);
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
    public Row6<Integer, Integer, String, String, String, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, String, String, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ClientStoredcards.CLIENT_STOREDCARDS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ClientStoredcards.CLIENT_STOREDCARDS.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ClientStoredcards.CLIENT_STOREDCARDS.REALEX_PASS_REF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ClientStoredcards.CLIENT_STOREDCARDS.REALEX_CARD_REF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ClientStoredcards.CLIENT_STOREDCARDS.NARRATIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ClientStoredcards.CLIENT_STOREDCARDS.CARD_ID;
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
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getRealexPassRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getRealexCardRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getNarrative();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getCardId();
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
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRealexPassRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRealexCardRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getNarrative();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getCardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientStoredcardsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientStoredcardsRecord value2(Integer value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientStoredcardsRecord value3(String value) {
        setRealexPassRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientStoredcardsRecord value4(String value) {
        setRealexCardRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientStoredcardsRecord value5(String value) {
        setNarrative(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientStoredcardsRecord value6(Integer value) {
        setCardId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientStoredcardsRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Integer value6) {
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
     * Create a detached ClientStoredcardsRecord
     */
    public ClientStoredcardsRecord() {
        super(ClientStoredcards.CLIENT_STOREDCARDS);
    }

    /**
     * Create a detached, initialised ClientStoredcardsRecord
     */
    public ClientStoredcardsRecord(Integer id, Integer parentId, String realexPassRef, String realexCardRef, String narrative, Integer cardId) {
        super(ClientStoredcards.CLIENT_STOREDCARDS);

        set(0, id);
        set(1, parentId);
        set(2, realexPassRef);
        set(3, realexCardRef);
        set(4, narrative);
        set(5, cardId);
    }
}
