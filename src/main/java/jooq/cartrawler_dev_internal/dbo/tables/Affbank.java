/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.AffbankRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Affbank extends TableImpl<AffbankRecord> {

    private static final long serialVersionUID = 234554360;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.AffBank</code>
     */
    public static final Affbank AFFBANK = new Affbank();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AffbankRecord> getRecordType() {
        return AffbankRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffBank.idAffBank</code>.
     */
    public final TableField<AffbankRecord, Integer> IDAFFBANK = createField("idAffBank", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffBank.Client_ID</code>.
     */
    public final TableField<AffbankRecord, Integer> CLIENT_ID = createField("Client_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffBank.AccName</code>.
     */
    public final TableField<AffbankRecord, String> ACCNAME = createField("AccName", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffBank.BankName</code>.
     */
    public final TableField<AffbankRecord, String> BANKNAME = createField("BankName", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffBank.BankAddress</code>.
     */
    public final TableField<AffbankRecord, String> BANKADDRESS = createField("BankAddress", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffBank.BankSortCode</code>.
     */
    public final TableField<AffbankRecord, String> BANKSORTCODE = createField("BankSortCode", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffBank.BankAccNo</code>.
     */
    public final TableField<AffbankRecord, String> BANKACCNO = createField("BankAccNo", org.jooq.impl.SQLDataType.VARCHAR(70), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffBank.SwiftCode</code>.
     */
    public final TableField<AffbankRecord, String> SWIFTCODE = createField("SwiftCode", org.jooq.impl.SQLDataType.VARCHAR(70), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffBank.IBAN</code>.
     */
    public final TableField<AffbankRecord, String> IBAN = createField("IBAN", org.jooq.impl.SQLDataType.VARCHAR(70), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffBank.BankCountryID</code>.
     */
    public final TableField<AffbankRecord, String> BANKCOUNTRYID = createField("BankCountryID", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffBank.last_changed_date</code>.
     */
    public final TableField<AffbankRecord, Timestamp> LAST_CHANGED_DATE = createField("last_changed_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffBank.AccName_inter</code>.
     */
    public final TableField<AffbankRecord, String> ACCNAME_INTER = createField("AccName_inter", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffBank.BankName_inter</code>.
     */
    public final TableField<AffbankRecord, String> BANKNAME_INTER = createField("BankName_inter", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffBank.BankAddress_inter</code>.
     */
    public final TableField<AffbankRecord, String> BANKADDRESS_INTER = createField("BankAddress_inter", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffBank.BankSortCode_inter</code>.
     */
    public final TableField<AffbankRecord, String> BANKSORTCODE_INTER = createField("BankSortCode_inter", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffBank.SwiftCode_inter</code>.
     */
    public final TableField<AffbankRecord, String> SWIFTCODE_INTER = createField("SwiftCode_inter", org.jooq.impl.SQLDataType.VARCHAR(70), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffBank.IBAN_inter</code>.
     */
    public final TableField<AffbankRecord, String> IBAN_INTER = createField("IBAN_inter", org.jooq.impl.SQLDataType.VARCHAR(70), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffBank.BankCountryID_inter</code>.
     */
    public final TableField<AffbankRecord, String> BANKCOUNTRYID_INTER = createField("BankCountryID_inter", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.AffBank.BankAccNo_inter</code>.
     */
    public final TableField<AffbankRecord, String> BANKACCNO_INTER = createField("BankAccNo_inter", org.jooq.impl.SQLDataType.VARCHAR(70), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.AffBank</code> table reference
     */
    public Affbank() {
        this(DSL.name("AffBank"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.AffBank</code> table reference
     */
    public Affbank(String alias) {
        this(DSL.name(alias), AFFBANK);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.AffBank</code> table reference
     */
    public Affbank(Name alias) {
        this(alias, AFFBANK);
    }

    private Affbank(Name alias, Table<AffbankRecord> aliased) {
        this(alias, aliased, null);
    }

    private Affbank(Name alias, Table<AffbankRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Affbank(Table<O> child, ForeignKey<O, AffbankRecord> key) {
        super(child, key, AFFBANK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dbo.DBO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.AFFBANK_PK_AFFBANK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AffbankRecord, Integer> getIdentity() {
        return Keys.IDENTITY_AFFBANK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AffbankRecord> getPrimaryKey() {
        return Keys.PK_AFFBANK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AffbankRecord>> getKeys() {
        return Arrays.<UniqueKey<AffbankRecord>>asList(Keys.PK_AFFBANK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Affbank as(String alias) {
        return new Affbank(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Affbank as(Name alias) {
        return new Affbank(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Affbank rename(String name) {
        return new Affbank(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Affbank rename(Name name) {
        return new Affbank(name, null);
    }
}
