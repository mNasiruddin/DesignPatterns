/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.MsreplicationObjects;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class MsreplicationObjectsRecord extends TableRecordImpl<MsreplicationObjectsRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = -1718296933;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSreplication_objects.publisher</code>.
     */
    public void setPublisher(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSreplication_objects.publisher</code>.
     */
    public String getPublisher() {
        return (String) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSreplication_objects.publisher_db</code>.
     */
    public void setPublisherDb(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSreplication_objects.publisher_db</code>.
     */
    public String getPublisherDb() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSreplication_objects.publication</code>.
     */
    public void setPublication(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSreplication_objects.publication</code>.
     */
    public String getPublication() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSreplication_objects.object_name</code>.
     */
    public void setObjectName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSreplication_objects.object_name</code>.
     */
    public String getObjectName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSreplication_objects.object_type</code>.
     */
    public void setObjectType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSreplication_objects.object_type</code>.
     */
    public String getObjectType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MSreplication_objects.article</code>.
     */
    public void setArticle(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MSreplication_objects.article</code>.
     */
    public String getArticle() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return MsreplicationObjects.MSREPLICATION_OBJECTS.PUBLISHER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MsreplicationObjects.MSREPLICATION_OBJECTS.PUBLISHER_DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MsreplicationObjects.MSREPLICATION_OBJECTS.PUBLICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MsreplicationObjects.MSREPLICATION_OBJECTS.OBJECT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return MsreplicationObjects.MSREPLICATION_OBJECTS.OBJECT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return MsreplicationObjects.MSREPLICATION_OBJECTS.ARTICLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getPublisher();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPublisherDb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPublication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getObjectName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getObjectType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getArticle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getPublisher();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPublisherDb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPublication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getObjectName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getObjectType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getArticle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsreplicationObjectsRecord value1(String value) {
        setPublisher(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsreplicationObjectsRecord value2(String value) {
        setPublisherDb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsreplicationObjectsRecord value3(String value) {
        setPublication(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsreplicationObjectsRecord value4(String value) {
        setObjectName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsreplicationObjectsRecord value5(String value) {
        setObjectType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsreplicationObjectsRecord value6(String value) {
        setArticle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsreplicationObjectsRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
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
     * Create a detached MsreplicationObjectsRecord
     */
    public MsreplicationObjectsRecord() {
        super(MsreplicationObjects.MSREPLICATION_OBJECTS);
    }

    /**
     * Create a detached, initialised MsreplicationObjectsRecord
     */
    public MsreplicationObjectsRecord(String publisher, String publisherDb, String publication, String objectName, String objectType, String article) {
        super(MsreplicationObjects.MSREPLICATION_OBJECTS);

        set(0, publisher);
        set(1, publisherDb);
        set(2, publication);
        set(3, objectName);
        set(4, objectType);
        set(5, article);
    }
}
