package demo;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.render.ViewType;

public class DemoConfig extends JFinalConfig{

	@Override
	public void configConstant(Constants me) {
		me.setDevMode(true);
		me.setViewType(ViewType.JSP);
		
		
	}

	@Override
	public void configRoute(Routes me) {
		me.add("/",MainController.class);
		me.add("/hello",HelloController.class);
	}

	@Override
	public void configPlugin(Plugins me) {
		
	}

	@Override
	public void configInterceptor(Interceptors me) {
		
	}

	@Override
	public void configHandler(Handlers me) {
		
	}
	
	//public class AppConfig extends JFinalConfig { public void configConstant(Constants me) { 
	// ��һ��ʹ��use���ص����ý���Ϊ�����ã�����ͨ��PropKit.get(...)ֱ��ȡֵ PropKit.use("a_little_config.txt"); me.setDevMode(PropKit.getBoolean("devMode")); }  
	//	public void configPlugin(Plugins me) { 
	// �ǵ�һ��ʹ��use���ص����ã���Ҫͨ��ÿ��ʹ��use��ָ�������ļ�������ȡֵ String redisHost = PropKit.use("redis_config.txt").get("host"); 
	//int redisPort = PropKit.use("redis_config.txt").getInt("port"); RedisPlugin rp = new RedisPlugin("myRedis", redisHost, redisPort); me.add(rp);  
		// �ǵ�һ��ʹ�� use���ص����ã�Ҳ�����ȵõ�һ��Prop������ͨ���ö�������ȡֵ Prop p = PropKit.use("db_config.txt"); 
	//DruidPlugin dp = new DruidPlugin(p.get("jdbcUrl"), p.get("user")��); me.add(dp); } }

}


