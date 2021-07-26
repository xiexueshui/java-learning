package mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @auther xxs
 * @date 2021-07-07
 */
public class XFactoryBean implements FactoryBean {
    private Class object;
    private SqlSession sqlSession;

    public XFactoryBean(Class object) {
        this.object = object;
    }

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSession = sqlSessionFactory.openSession();
    }

    @Override
    public Object getObject() throws Exception {
        final Object o = Proxy.newProxyInstance(XFactoryBean.class.getClassLoader(), new Class[]{object}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return sqlSession.getMapper(object);
            }
        });
        return o;
    }

    @Override
    public Class<?> getObjectType() {
        return object;
    }
}
