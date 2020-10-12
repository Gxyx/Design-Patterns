package com.san.com.单例模式.懒汉模式;

//线程不安全，不可用

/**
 * 有多个线程去调用getInstance方法来获取Singleton的实例，
 * 那么就有可能发生这样一种情况当第一个线程在执行if(instance==null)这个语句时，此时instance是为null的进入语句。
 * 在还没有执行instance=new Singleton()时(此时instance是为null的)第二个线程也进入if(instance==null)这个语句，因为之前进入这个语句的线程中还没有执行instance=new Singleton()，所以它会执行instance=new Singleton()来实例化Singleton对象，
 * 因为第二个线程也进入了if语句所以它也会实例化Singleton对象。这样就导致了实例化了两个Singleton对象
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton (){};

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    //线程安全,效率低

    /**
     * 效率太低了，每个线程在想获得类的实例时候，
     * 执行getInstance()方法都要进行同步。而其实这个方法只执行一次实例化代码就够了，
     * 后面的想获得该类实例，直接return就行了
     *
     */
    public static synchronized Singleton getInstance2(){

        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

    //懒汉式双重校验锁[推荐用]
    //保证了：延迟加载和线程安全
    public static Singleton getInstance3(){
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


}
