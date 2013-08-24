package org.ddelizia.vcrud.core.service.model;

import org.ddelizia.vcrud.model.VcrudModel;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: danilo.delizia
 * Date: 6/05/13
 * Time: 11:21
 * To change this template use File | Settings | File Templates.
 */
public interface ModelService {

    public EntityManager getEntityManager();

    public <T extends VcrudModel> T create(Class<T> clazz);

    public <T extends VcrudModel> T getModel(String field, Object o, Class<T> clazz);

    public <T extends VcrudModel> List<T> getModels(String field, Object o, Class<T> clazz, Integer from, Integer count);

    public <T extends VcrudModel> T getModel(Map<String, Object> map, Class<T> clazz);

    public <T extends VcrudModel> List<T> getModels(Map<String, Object> map, Class<T> clazz, Integer from, Integer count);

    public <T extends VcrudModel> T getModelLike(String field, Object o, Class<T> clazz);

    public <T extends VcrudModel> List<T> getModelsLike(String field, Object o, Class<T> clazz, Integer from, Integer count);

    public <T extends VcrudModel> T getModelLike(Map<String, Object> map, Class<T> clazz);

    public <T extends VcrudModel> List<T> getModelsLike(Map<String, Object> map, Class<T> clazz, Integer from, Integer count);

    public <T extends VcrudModel> List<T> getModels(Class<T> clazz, Integer from, Integer to);

    public <T extends VcrudModel> List<T> executeQuery(Map<String,Object> params, String query, Class<T> clazz, Integer from, Integer count);

    public List executeQueryObject(Map<String,Object> params, String query, Class clazz, Integer from, Integer count);

    public <T extends VcrudModel> T max(Class<T> clazz, String field);

    public <T extends VcrudModel> T min(Class<T> clazz, String field);

    public int count(Class<? extends VcrudModel> clazz);

    public int removeAll (Class<? extends VcrudModel> clazz);

    public void remove (VcrudModel o);

    public void persist (VcrudModel o);

    public void rapidPersist (VcrudModel o);

    public VcrudModel merge (VcrudModel o);

    public VcrudModel rapidMerge (VcrudModel o);

    public Map<String,Class> getAllModelClasses();

    public List<Class<? extends VcrudModel>> getAllVcrudItems();

    public boolean isVcrudEntity(Class clazz);
}