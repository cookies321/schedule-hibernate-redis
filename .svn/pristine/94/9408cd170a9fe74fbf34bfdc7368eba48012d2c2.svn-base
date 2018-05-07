package admin.hnsd.commons.utils;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import admin.hnsd.model.HolyrobotUrl;

public class BeanAndMapUtils {

	public static final Logger logger = LoggerFactory.getLogger(BeanAndMapUtils.class);
	/**
	 * map to  object
	 * @param map
	 * @param beanClass
	 * @return
	 */
	public static Object mapToObject(Map<String,String> map,Class<?> beanClass){
		
		if(map==null) {
			return null;
		}
		try {
			Object obj = beanClass.newInstance();
			BeanUtils.populate(obj, map);
			return obj;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	public static Object mapToObject2(Map<String, String> map, Class<?> beanClass) {      
		if (map == null)     
			return null;      

		Object obj;
		try {
			obj = beanClass.newInstance();
			BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());      
			PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();      
			for (PropertyDescriptor property : propertyDescriptors) { 
				Method setter = property.getWriteMethod();      
				if (setter != null) {  
					setter.invoke(obj, map.get(property.getName()));     
				}    
			} 
			return obj;    
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IntrospectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
		return null;
	}      

	/**
	 * object to map(允许object中有null值)
	 * @param obj
	 * @return
	 */
	public static Map<?,?> objToMap(Object obj){
		if(obj==null) {
			return null;
		}
		try {
			return BeanUtils.describe(obj);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}


	/**
	 * object to map(Object 中的null值全部替换为"")
	 * @param obj
	 * @return
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public static Map<String,String> objToMap2(Object obj){
		if(obj == null){ 
			return null; 
		} 
		Map<String, String> map = new HashMap<String, String>(); 
		Field[] declaredFields = obj.getClass().getDeclaredFields(); 
		for (Field field : declaredFields) { 
			field.setAccessible(true); 
			try {
				if(Modifier.isStatic(field.getModifiers())){
					continue;
				}

				map.put(field.getName(), field.get(obj)==null?"":field.get(obj).toString());
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		} 
		return map; 
	}

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		/*Map<String,String> map = new HashMap<>();
		map.put("id", "123123123");
		map.put("url", "123");
		map.put("dataSource", "Lvmama");
		Object mapToObject2 = mapToObject(map, HolyrobotUrl.class);
		System.out.println(mapToObject2);*/
	}
}
