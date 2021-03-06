/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.WhitelistIpsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class WhitelistIps extends TableImpl<WhitelistIpsRecord> {

    private static final long serialVersionUID = 1207668410;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.whitelist_ips</code>
     */
    public static final WhitelistIps WHITELIST_IPS = new WhitelistIps();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WhitelistIpsRecord> getRecordType() {
        return WhitelistIpsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.whitelist_ips.guid</code>.
     */
    public final TableField<WhitelistIpsRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.whitelist_ips.uuid</code>.
     */
    public final TableField<WhitelistIpsRecord, String> UUID = createField("uuid", org.jooq.impl.SQLDataType.CHAR(36).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.whitelist_ips.dateTime</code>.
     */
    public final TableField<WhitelistIpsRecord, Timestamp> DATETIME = createField("dateTime", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.whitelist_ips.dateTimeDisabled</code>.
     */
    public final TableField<WhitelistIpsRecord, Timestamp> DATETIMEDISABLED = createField("dateTimeDisabled", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.whitelist_ips.userId</code>.
     */
    public final TableField<WhitelistIpsRecord, Integer> USERID = createField("userId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.whitelist_ips.clientInterfaces</code>.
     */
    public final TableField<WhitelistIpsRecord, String> CLIENTINTERFACES = createField("clientInterfaces", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.whitelist_ips.parentIds</code>.
     */
    public final TableField<WhitelistIpsRecord, String> PARENTIDS = createField("parentIds", org.jooq.impl.SQLDataType.VARCHAR(4000).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.whitelist_ips.ips</code>.
     */
    public final TableField<WhitelistIpsRecord, byte[]> IPS = createField("ips", org.jooq.impl.SQLDataType.VARBINARY.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.whitelist_ips</code> table reference
     */
    public WhitelistIps() {
        this(DSL.name("whitelist_ips"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.whitelist_ips</code> table reference
     */
    public WhitelistIps(String alias) {
        this(DSL.name(alias), WHITELIST_IPS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.whitelist_ips</code> table reference
     */
    public WhitelistIps(Name alias) {
        this(alias, WHITELIST_IPS);
    }

    private WhitelistIps(Name alias, Table<WhitelistIpsRecord> aliased) {
        this(alias, aliased, null);
    }

    private WhitelistIps(Name alias, Table<WhitelistIpsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> WhitelistIps(Table<O> child, ForeignKey<O, WhitelistIpsRecord> key) {
        super(child, key, WHITELIST_IPS);
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
        return Arrays.<Index>asList(Indexes.WHITELIST_IPS_INDEX_WHITELIST_IPS, Indexes.WHITELIST_IPS_PK__WHITELIS__497F6CB44F619886);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WhitelistIpsRecord> getPrimaryKey() {
        return Keys.PK__WHITELIS__497F6CB44F619886;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WhitelistIpsRecord>> getKeys() {
        return Arrays.<UniqueKey<WhitelistIpsRecord>>asList(Keys.PK__WHITELIS__497F6CB44F619886, Keys.INDEX_WHITELIST_IPS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WhitelistIps as(String alias) {
        return new WhitelistIps(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WhitelistIps as(Name alias) {
        return new WhitelistIps(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WhitelistIps rename(String name) {
        return new WhitelistIps(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WhitelistIps rename(Name name) {
        return new WhitelistIps(name, null);
    }
}
