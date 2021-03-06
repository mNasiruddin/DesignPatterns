/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.IssruleMvExperiment;

import org.jooq.Field;
import org.jooq.Record18;
import org.jooq.Row18;
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
public class IssruleMvExperimentRecord extends TableRecordImpl<IssruleMvExperimentRecord> implements Record18<Integer, Timestamp, Timestamp, Integer, String, Integer, String, Integer, String, Integer, String, Double, Double, Integer, Integer, Integer, String, String> {

    private static final long serialVersionUID = -59407939;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.rule_id</code>.
     */
    public void setRuleId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.rule_id</code>.
     */
    public Integer getRuleId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.deleted</code>.
     */
    public void setDeleted(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.deleted</code>.
     */
    public Timestamp getDeleted() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.src_group</code>.
     */
    public void setSrcGroup(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.src_group</code>.
     */
    public Integer getSrcGroup() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.src_group_name</code>.
     */
    public void setSrcGroupName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.src_group_name</code>.
     */
    public String getSrcGroupName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.dest_group</code>.
     */
    public void setDestGroup(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.dest_group</code>.
     */
    public Integer getDestGroup() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.dest_group_name</code>.
     */
    public void setDestGroupName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.dest_group_name</code>.
     */
    public String getDestGroupName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.client_group</code>.
     */
    public void setClientGroup(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.client_group</code>.
     */
    public Integer getClientGroup() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.client_group_name</code>.
     */
    public void setClientGroupName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.client_group_name</code>.
     */
    public String getClientGroupName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.channel_group</code>.
     */
    public void setChannelGroup(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.channel_group</code>.
     */
    public Integer getChannelGroup() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.channel_group_name</code>.
     */
    public void setChannelGroupName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.channel_group_name</code>.
     */
    public String getChannelGroupName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.car_price_start</code>.
     */
    public void setCarPriceStart(Double value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.car_price_start</code>.
     */
    public Double getCarPriceStart() {
        return (Double) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.car_price_end</code>.
     */
    public void setCarPriceEnd(Double value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.car_price_end</code>.
     */
    public Double getCarPriceEnd() {
        return (Double) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.duration_start</code>.
     */
    public void setDurationStart(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.duration_start</code>.
     */
    public Integer getDurationStart() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.duration_end</code>.
     */
    public void setDurationEnd(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.duration_end</code>.
     */
    public Integer getDurationEnd() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.group_id</code>.
     */
    public void setGroupId(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.group_id</code>.
     */
    public Integer getGroupId() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.group_name</code>.
     */
    public void setGroupName(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.group_name</code>.
     */
    public String getGroupName() {
        return (String) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.segment_name</code>.
     */
    public void setSegmentName(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issRule_mv_experiment.segment_name</code>.
     */
    public String getSegmentName() {
        return (String) get(17);
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Integer, Timestamp, Timestamp, Integer, String, Integer, String, Integer, String, Integer, String, Double, Double, Integer, Integer, Integer, String, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Integer, Timestamp, Timestamp, Integer, String, Integer, String, Integer, String, Integer, String, Double, Double, Integer, Integer, Integer, String, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return IssruleMvExperiment.ISSRULE_MV_EXPERIMENT.RULE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return IssruleMvExperiment.ISSRULE_MV_EXPERIMENT.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return IssruleMvExperiment.ISSRULE_MV_EXPERIMENT.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return IssruleMvExperiment.ISSRULE_MV_EXPERIMENT.SRC_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return IssruleMvExperiment.ISSRULE_MV_EXPERIMENT.SRC_GROUP_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return IssruleMvExperiment.ISSRULE_MV_EXPERIMENT.DEST_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return IssruleMvExperiment.ISSRULE_MV_EXPERIMENT.DEST_GROUP_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return IssruleMvExperiment.ISSRULE_MV_EXPERIMENT.CLIENT_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return IssruleMvExperiment.ISSRULE_MV_EXPERIMENT.CLIENT_GROUP_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return IssruleMvExperiment.ISSRULE_MV_EXPERIMENT.CHANNEL_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return IssruleMvExperiment.ISSRULE_MV_EXPERIMENT.CHANNEL_GROUP_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field12() {
        return IssruleMvExperiment.ISSRULE_MV_EXPERIMENT.CAR_PRICE_START;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field13() {
        return IssruleMvExperiment.ISSRULE_MV_EXPERIMENT.CAR_PRICE_END;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return IssruleMvExperiment.ISSRULE_MV_EXPERIMENT.DURATION_START;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return IssruleMvExperiment.ISSRULE_MV_EXPERIMENT.DURATION_END;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field16() {
        return IssruleMvExperiment.ISSRULE_MV_EXPERIMENT.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return IssruleMvExperiment.ISSRULE_MV_EXPERIMENT.GROUP_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return IssruleMvExperiment.ISSRULE_MV_EXPERIMENT.SEGMENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getRuleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getSrcGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSrcGroupName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getDestGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getDestGroupName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getClientGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getClientGroupName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getChannelGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getChannelGroupName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component12() {
        return getCarPriceStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component13() {
        return getCarPriceEnd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getDurationStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getDurationEnd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component16() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getGroupName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getSegmentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRuleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getSrcGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSrcGroupName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getDestGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDestGroupName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getClientGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getClientGroupName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getChannelGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getChannelGroupName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value12() {
        return getCarPriceStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value13() {
        return getCarPriceEnd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getDurationStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getDurationEnd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value16() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getGroupName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getSegmentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssruleMvExperimentRecord value1(Integer value) {
        setRuleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssruleMvExperimentRecord value2(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssruleMvExperimentRecord value3(Timestamp value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssruleMvExperimentRecord value4(Integer value) {
        setSrcGroup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssruleMvExperimentRecord value5(String value) {
        setSrcGroupName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssruleMvExperimentRecord value6(Integer value) {
        setDestGroup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssruleMvExperimentRecord value7(String value) {
        setDestGroupName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssruleMvExperimentRecord value8(Integer value) {
        setClientGroup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssruleMvExperimentRecord value9(String value) {
        setClientGroupName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssruleMvExperimentRecord value10(Integer value) {
        setChannelGroup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssruleMvExperimentRecord value11(String value) {
        setChannelGroupName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssruleMvExperimentRecord value12(Double value) {
        setCarPriceStart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssruleMvExperimentRecord value13(Double value) {
        setCarPriceEnd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssruleMvExperimentRecord value14(Integer value) {
        setDurationStart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssruleMvExperimentRecord value15(Integer value) {
        setDurationEnd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssruleMvExperimentRecord value16(Integer value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssruleMvExperimentRecord value17(String value) {
        setGroupName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssruleMvExperimentRecord value18(String value) {
        setSegmentName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssruleMvExperimentRecord values(Integer value1, Timestamp value2, Timestamp value3, Integer value4, String value5, Integer value6, String value7, Integer value8, String value9, Integer value10, String value11, Double value12, Double value13, Integer value14, Integer value15, Integer value16, String value17, String value18) {
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
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IssruleMvExperimentRecord
     */
    public IssruleMvExperimentRecord() {
        super(IssruleMvExperiment.ISSRULE_MV_EXPERIMENT);
    }

    /**
     * Create a detached, initialised IssruleMvExperimentRecord
     */
    public IssruleMvExperimentRecord(Integer ruleId, Timestamp created, Timestamp deleted, Integer srcGroup, String srcGroupName, Integer destGroup, String destGroupName, Integer clientGroup, String clientGroupName, Integer channelGroup, String channelGroupName, Double carPriceStart, Double carPriceEnd, Integer durationStart, Integer durationEnd, Integer groupId, String groupName, String segmentName) {
        super(IssruleMvExperiment.ISSRULE_MV_EXPERIMENT);

        set(0, ruleId);
        set(1, created);
        set(2, deleted);
        set(3, srcGroup);
        set(4, srcGroupName);
        set(5, destGroup);
        set(6, destGroupName);
        set(7, clientGroup);
        set(8, clientGroupName);
        set(9, channelGroup);
        set(10, channelGroupName);
        set(11, carPriceStart);
        set(12, carPriceEnd);
        set(13, durationStart);
        set(14, durationEnd);
        set(15, groupId);
        set(16, groupName);
        set(17, segmentName);
    }
}
