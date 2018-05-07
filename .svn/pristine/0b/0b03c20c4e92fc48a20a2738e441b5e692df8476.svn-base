package admin.hnsd.commons.redis;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * redis简单操作工具类
 * @author yangwenkui
 * @version v2.0
 * @time 2016年8月24日 下午9:44:06
 */
public class JedisServiceImpl{
	
	
	private int database; 

	private final Logger logger = LoggerFactory.getLogger(getClass());

    private JedisPool jedisPool;

    @Autowired
    public void setJedisPool(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }

	public void setDatabase(int database) {
		this.database = database;
	}

	public void add(String key,int seconds, String value) {
		Jedis jedis = null;
		try {
			jedis = getJedis();
			jedis.setex(key, seconds, value);
		} catch (Exception e) {
			 logger.error("Jedis Error:" + e.getMessage(), e);
		} finally {
			if (jedis != null) {
                jedisPool.returnResourceObject(jedis);
            }
		}
	}
	

	public String get(String key) {
		Jedis jedis = null;
		try {
			jedis = getJedis();
			String value = jedis.get(key);
			return value;
		} catch (Exception e) {
			 logger.error("Jedis Error:" + e.getMessage(), e);
		} finally {
			if (jedis != null) {
                jedisPool.returnResourceObject(jedis);
            }
		}
		return null;
	}

	public void del(String key) {
		Jedis jedis = null;
		try {
			jedis = getJedis();
			jedis.del(key);
		} catch (Exception e) {
			 logger.error("Jedis Error:" + e.getMessage(), e);
		} finally {
			if (jedis != null) {
                jedisPool.returnResourceObject(jedis);
            }
		}
	}

	public void rpush(String key,String value) {
		Jedis jedis = null;
		try {
			jedis = getJedis();
			jedis.rpush(key, value);
		} catch (Exception e) {
			 logger.error("Jedis Error:" + e.getMessage(), e);
		} finally {
			if (jedis != null) {
                jedisPool.returnResourceObject(jedis);
            }
		}
	}
	
	public String blpop(String key) {
		Jedis jedis = null;
		try {
			jedis = getJedis();
			List<String> list = jedis.blpop(1000,key);
			if(CollectionUtils.isNotEmpty(list)){
				return list.get(1);
			}
			return null;
		} catch (Exception e) {
			 logger.error("Jedis Error:" + e.getMessage(), e);
		} finally {
			if (jedis != null) {
                jedisPool.returnResourceObject(jedis);
            }
		}
		return null;
	}
	
	public Set<String> getKeys(String key) {
		
		Jedis jedis = null;
		try {
			jedis = getJedis();
			Set<String> set = jedis.keys(key);
			
			return set;
		} catch (Exception e) {
			 logger.error("Jedis Error:" + e.getMessage(), e);
		} finally {
			if (jedis != null) {
                jedisPool.returnResourceObject(jedis);
            }
		}
		return null;
	}
	
	public String hmset(String key,Map<String,String> map) {
		
		Jedis jedis = null;
		try {
			jedis = getJedis();
			String str = jedis.hmset(key, map);
			
			return str;
		} catch (Exception e) {
			 logger.error("Jedis Error:" + e.getMessage(), e);
		} finally {
			if (jedis != null) {
                jedisPool.returnResourceObject(jedis);
            }
		}
		return null;
	}
    
	
	public Map<String, String> hgetAll(String key) {
		Jedis jedis = null;
		try {
			jedis = getJedis();
			Map<String, String> str = jedis.hgetAll(key);
			
			return str;
		} catch (Exception e) {
			 logger.error("Jedis Error:" + e.getMessage(), e);
		} finally {
			if (jedis != null) {
                jedisPool.returnResourceObject(jedis);
            }
		}
		return null;
	}
	
	
	public Jedis getJedis(){
		Jedis jedis = null;
		try {
			jedis = jedisPool.getResource();
			jedis.select(database);//选择jedis数据库
			return jedis;
		} catch (Exception e) {
			 logger.error("Jedis Error:" + e.getMessage(), e);
		} 
		return null;
	}
	
	
	
	
}
