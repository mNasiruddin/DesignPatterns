/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.SortOrderDoors;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class SortOrderDoorsRecord extends TableRecordImpl<SortOrderDoorsRecord> implements Record3<Integer, Integer, Double> {

    private static final long serialVersionUID = -687707214;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.sort_order_doors.pax</code>.
     */
    public void setPax(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.sort_order_doors.pax</code>.
     */
    public Integer getPax() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.sort_order_doors.doors</code>.
     */
    public void setDoors(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.sort_order_doors.doors</code>.
     */
    public Integer getDoors() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.sort_order_doors.score</code>.
     */
    public void setScore(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.sort_order_doors.score</code>.
     */
    public Double getScore() {
        return (Double) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Double> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Double> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SortOrderDoors.SORT_ORDER_DOORS.PAX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return SortOrderDoors.SORT_ORDER_DOORS.DOORS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return SortOrderDoors.SORT_ORDER_DOORS.SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getPax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getDoors();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component3() {
        return getScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getDoors();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortOrderDoorsRecord value1(Integer value) {
        setPax(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortOrderDoorsRecord value2(Integer value) {
        setDoors(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortOrderDoorsRecord value3(Double value) {
        setScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortOrderDoorsRecord values(Integer value1, Integer value2, Double value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SortOrderDoorsRecord
     */
    public SortOrderDoorsRecord() {
        super(SortOrderDoors.SORT_ORDER_DOORS);
    }

    /**
     * Create a detached, initialised SortOrderDoorsRecord
     */
    public SortOrderDoorsRecord(Integer pax, Integer doors, Double score) {
        super(SortOrderDoors.SORT_ORDER_DOORS);

        set(0, pax);
        set(1, doors);
        set(2, score);
    }
}