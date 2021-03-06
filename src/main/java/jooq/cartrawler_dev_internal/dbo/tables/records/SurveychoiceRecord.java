/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Surveychoice;

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
public class SurveychoiceRecord extends UpdatableRecordImpl<SurveychoiceRecord> implements Record4<Integer, Integer, String, Short> {

    private static final long serialVersionUID = -1459803384;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SurveyChoice.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SurveyChoice.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SurveyChoice.fk_survey_question</code>.
     */
    public void setFkSurveyQuestion(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SurveyChoice.fk_survey_question</code>.
     */
    public Integer getFkSurveyQuestion() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SurveyChoice.verbiage</code>.
     */
    public void setVerbiage(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SurveyChoice.verbiage</code>.
     */
    public String getVerbiage() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SurveyChoice.icon_id</code>.
     */
    public void setIconId(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SurveyChoice.icon_id</code>.
     */
    public Short getIconId() {
        return (Short) get(3);
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
    public Row4<Integer, Integer, String, Short> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, Short> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Surveychoice.SURVEYCHOICE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Surveychoice.SURVEYCHOICE.FK_SURVEY_QUESTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Surveychoice.SURVEYCHOICE.VERBIAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return Surveychoice.SURVEYCHOICE.ICON_ID;
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
        return getFkSurveyQuestion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getVerbiage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getIconId();
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
        return getFkSurveyQuestion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getVerbiage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getIconId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveychoiceRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveychoiceRecord value2(Integer value) {
        setFkSurveyQuestion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveychoiceRecord value3(String value) {
        setVerbiage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveychoiceRecord value4(Short value) {
        setIconId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveychoiceRecord values(Integer value1, Integer value2, String value3, Short value4) {
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
     * Create a detached SurveychoiceRecord
     */
    public SurveychoiceRecord() {
        super(Surveychoice.SURVEYCHOICE);
    }

    /**
     * Create a detached, initialised SurveychoiceRecord
     */
    public SurveychoiceRecord(Integer id, Integer fkSurveyQuestion, String verbiage, Short iconId) {
        super(Surveychoice.SURVEYCHOICE);

        set(0, id);
        set(1, fkSurveyQuestion);
        set(2, verbiage);
        set(3, iconId);
    }
}
