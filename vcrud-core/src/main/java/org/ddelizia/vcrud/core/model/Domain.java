package org.ddelizia.vcrud.core.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Created with IntelliJ IDEA.
 * User: danilo.delizia
 * Date: 24/06/13
 * Time: 18:14
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Domain extends VcrudModel{
}
