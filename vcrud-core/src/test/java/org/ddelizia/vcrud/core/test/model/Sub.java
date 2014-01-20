package org.ddelizia.vcrud.core.test.model;

import org.ddelizia.vcrud.model.basic.VcrudTenantItem;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created with IntelliJ IDEA.
 * User: ddelizia
 * Date: 13/01/14
 * Time: 09:46
 * To change this template use File | Settings | File Templates.
 */
@Document(collection = "Sub")
public class Sub extends Super implements VcrudTenantItem {

    private String subCode;

    public Sub() {
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }
}
