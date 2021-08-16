package org.cxy.demo;


import org.cxy.demo.matter.EGM;
import org.cxy.demo.matter.IIR;
import org.cxy.demo.matter.RedisUtils;
import java.util.concurrent.TimeUnit;

/**
 * Description:
 *
 * 同时适配 RedisUtils ,EGM,IIR 三种redis数据源，根据redisType加以区分   </br>
 * Date: 2021/8/16 16:22
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class CacheServiceImpl implements CacheWithTypeService {

    private RedisUtils redisUtils = new RedisUtils();
    private EGM egm = new EGM();
    private IIR iir = new IIR();


    @Override
    public String get(String key, int redisType) {

        if (1 == redisType) {
            return egm.gain(key);
        }

        if (2 == redisType) {
            return iir.get(key);
        }

        return redisUtils.get(key);
    }

    public void set(String key, String value, int redisType) {

        if (1 == redisType) {
            egm.set(key, value);
            return;
        }

        if (2 == redisType) {
            iir.set(key, value);
            return;
        }

        redisUtils.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType) {

        if (1 == redisType) {
            egm.setEx(key, value, timeout, timeUnit);
            return;
        }

        if (2 == redisType) {
            iir.setExpire(key, value, timeout, timeUnit);
            return;
        }

        redisUtils.set(key, value, timeout, timeUnit);
    }

    public void del(String key, int redisType) {

        if (1 == redisType) {
            egm.delete(key);
            return;
        }

        if (2 == redisType) {
            iir.del(key);
            return;
        }

        redisUtils.del(key);
    }
}
