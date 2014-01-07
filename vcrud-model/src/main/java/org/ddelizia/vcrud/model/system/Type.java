package org.ddelizia.vcrud.model.system;

import org.ddelizia.vcrud.model.basic.VcrudItem;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Created with IntelliJ IDEA.
 * User: danilo.delizia
 * Date: 6/05/13
 * Time: 11:12
 * To change this template use File | Settings | File Templates.
 */

@Document
public class Type extends VcrudItem {

    /**
     * Composed by classname
     */
    @Indexed(unique = true)
    private String code;

    private String name;

    private Class aClass;

    private String simpleName;

}
