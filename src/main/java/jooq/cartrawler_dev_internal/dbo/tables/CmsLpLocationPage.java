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
import jooq.cartrawler_dev_internal.dbo.tables.records.CmsLpLocationPageRecord;

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
public class CmsLpLocationPage extends TableImpl<CmsLpLocationPageRecord> {

    private static final long serialVersionUID = -1690924706;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.cms_lp_location_page</code>
     */
    public static final CmsLpLocationPage CMS_LP_LOCATION_PAGE = new CmsLpLocationPage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CmsLpLocationPageRecord> getRecordType() {
        return CmsLpLocationPageRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.cms_lp_location_page.lp_idlocationPage</code>.
     */
    public final TableField<CmsLpLocationPageRecord, Integer> LP_IDLOCATIONPAGE = createField("lp_idlocationPage", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.cms_lp_location_page.lp_live</code>.
     */
    public final TableField<CmsLpLocationPageRecord, Boolean> LP_LIVE = createField("lp_live", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.cms_lp_location_page.lp_seo_url</code>.
     */
    public final TableField<CmsLpLocationPageRecord, String> LP_SEO_URL = createField("lp_seo_url", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.cms_lp_location_page.lp_title_page</code>.
     */
    public final TableField<CmsLpLocationPageRecord, String> LP_TITLE_PAGE = createField("lp_title_page", org.jooq.impl.SQLDataType.VARCHAR(250).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.cms_lp_location_page.lp_meta_description</code>.
     */
    public final TableField<CmsLpLocationPageRecord, String> LP_META_DESCRIPTION = createField("lp_meta_description", org.jooq.impl.SQLDataType.VARCHAR(400).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.cms_lp_location_page.lp_html_code</code>.
     */
    public final TableField<CmsLpLocationPageRecord, String> LP_HTML_CODE = createField("lp_html_code", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.cms_lp_location_page.lp_updated</code>.
     */
    public final TableField<CmsLpLocationPageRecord, Timestamp> LP_UPDATED = createField("lp_updated", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("(getdate())", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.cms_lp_location_page.fk_users</code>.
     */
    public final TableField<CmsLpLocationPageRecord, Integer> FK_USERS = createField("fk_users", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.cms_lp_location_page.fk_location</code>.
     */
    public final TableField<CmsLpLocationPageRecord, Integer> FK_LOCATION = createField("fk_location", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.cms_lp_location_page.fk_country</code>.
     */
    public final TableField<CmsLpLocationPageRecord, String> FK_COUNTRY = createField("fk_country", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.cms_lp_location_page.fk_virtual_country</code>.
     */
    public final TableField<CmsLpLocationPageRecord, String> FK_VIRTUAL_COUNTRY = createField("fk_virtual_country", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.cms_lp_location_page</code> table reference
     */
    public CmsLpLocationPage() {
        this(DSL.name("cms_lp_location_page"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.cms_lp_location_page</code> table reference
     */
    public CmsLpLocationPage(String alias) {
        this(DSL.name(alias), CMS_LP_LOCATION_PAGE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.cms_lp_location_page</code> table reference
     */
    public CmsLpLocationPage(Name alias) {
        this(alias, CMS_LP_LOCATION_PAGE);
    }

    private CmsLpLocationPage(Name alias, Table<CmsLpLocationPageRecord> aliased) {
        this(alias, aliased, null);
    }

    private CmsLpLocationPage(Name alias, Table<CmsLpLocationPageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CmsLpLocationPage(Table<O> child, ForeignKey<O, CmsLpLocationPageRecord> key) {
        super(child, key, CMS_LP_LOCATION_PAGE);
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
        return Arrays.<Index>asList(Indexes.CMS_LP_LOCATION_PAGE_PK__CMS_LP_LOCATION___1D87E3CB);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CmsLpLocationPageRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CMS_LP_LOCATION_PAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CmsLpLocationPageRecord> getPrimaryKey() {
        return Keys.PK__CMS_LP_LOCATION___1D87E3CB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CmsLpLocationPageRecord>> getKeys() {
        return Arrays.<UniqueKey<CmsLpLocationPageRecord>>asList(Keys.PK__CMS_LP_LOCATION___1D87E3CB);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CmsLpLocationPageRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CmsLpLocationPageRecord, ?>>asList(Keys.FK__CMS_LP_LO__FK_US__1F702C3D);
    }

    public Users users() {
        return new Users(this, Keys.FK__CMS_LP_LO__FK_US__1F702C3D);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmsLpLocationPage as(String alias) {
        return new CmsLpLocationPage(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmsLpLocationPage as(Name alias) {
        return new CmsLpLocationPage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CmsLpLocationPage rename(String name) {
        return new CmsLpLocationPage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CmsLpLocationPage rename(Name name) {
        return new CmsLpLocationPage(name, null);
    }
}
