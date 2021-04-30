## java锁机制 
 #### 1.乐观锁 悲观锁
#####  乐观锁 ： 乐观的认为数据不会被修改 ，不会上锁，每次更新时会判断期间数据有没有被修改
     乐观锁实现方式 ：CAS 、版本号
     1.CAS :Compare and Swap 比较并更换 CAS(A,B):比较是A时就把A替换成B，这是CPU的原子性操作，JAVA调用的是C++代码操作的是Cpu指令
     AtomicInteger i= new AtomicInteger(0);// Unsafe类下提供CAS功能
     ABA问题 :一个线程先将A变成C，又将C变成A，这样其他线程会以为A没有变化过。
    
     2. version方式 设置一个版本号version字段，更新数据时version
     update table set x=x+1, version=version+1 where id=#{id} and version=#{version};
#####  悲观锁： 一个线程拿到锁后都会禁止其他线程拿到锁
    synchronized ,ReentrantLock都是悲观锁
 #### 2.公平锁 非公平锁
     公平锁：多个线程请求锁的时候是按照先后顺序获取锁的
     非公平锁:多个线程请求锁不是按照先后顺序获取的
     ReentrantLock 默认是非公平的 可以设置为公平锁  Sychorinized是非公平锁
 #### 3.可重入锁
    可重入锁：当一个线程获取一个方法的锁，能获取他内层方法的锁  synchronized与ReentrantLock都是可重入锁
 #### 4.读写锁
    ReentrantReadWriteLock,读锁是共享锁写锁是互斥锁，读可以被多个线程持有，写只能有一个
 #### 1.乐观锁 悲观锁
    

