/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.routines;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


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
public class Enabledctuser extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = -1550720836;

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.enabledCTUser.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.enabledCTUser.iun</code>.
     */
    public static final Parameter<String> IUN = createParameter("iun", org.jooq.impl.SQLDataType.VARCHAR(40), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.enabledCTUser.iemail</code>.
     */
    public static final Parameter<String> IEMAIL = createParameter("iemail", org.jooq.impl.SQLDataType.VARCHAR(60), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.enabledCTUser.iuserid</code>.
     */
    public static final Parameter<Integer> IUSERID = createParameter("iuserid", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public Enabledctuser() {
        super("enabledCTUser", Dbo.DBO, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(IUN);
        addInParameter(IEMAIL);
        addInParameter(IUSERID);
    }

    /**
     * Set the <code>iun</code> parameter IN value to the routine
     */
    public void setIun(String value) {
        setValue(IUN, value);
    }

    /**
     * Set the <code>iemail</code> parameter IN value to the routine
     */
    public void setIemail(String value) {
        setValue(IEMAIL, value);
    }

    /**
     * Set the <code>iuserid</code> parameter IN value to the routine
     */
    public void setIuserid(Integer value) {
        setValue(IUSERID, value);
    }
}