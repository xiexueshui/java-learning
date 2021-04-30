import java.util.concurrent.atomic.AtomicInteger;

/**
 * @auther xxs
 * @date 2021-04-16
 */
public class OptimisticLock {
    // 乐观锁 ： 乐观的认为数据不会被修改 ，不会上锁，每次更新时会判断期间数据有没有被修改
    // 乐观锁实现方式 ：CAS 、版本号
    // 1.CAS :Compare and Swap 比较并更换 CAS(A,B):比较是A时就把A替换成B，这是CPU的原子性操作，JAVA调用的是C++代码操作的是Cpu指令
    AtomicInteger i= new AtomicInteger(0);// Unsafe类下提供CAS功能
    // ABA问题 :一个线程先将A变成C，又将C变成A，这样其他线程会以为A没有变化过。

    // 2. version方式 设置一个版本号version字段，更新数据时version
    // update table set x=x+1, version=version+1 where id=#{id} and version=#{version};


}
