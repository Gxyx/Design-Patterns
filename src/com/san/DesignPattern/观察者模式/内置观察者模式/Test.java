package com.san.DesignPattern.观察者模式.内置观察者模式;


/**
 * 可以看出，使用Java内置的类实现观察者模式，代码非常简洁，
 * 对addObserver,removeObserver,notifyObservers都已经为我们实现了，
 * 所有可以看出Observable（主题）是一个类，而不是一个接口，基本上书上都对于Java的如此设计抱有反面的态度，觉得Java内置的观察者模式，违法了面向接口编程这个原则，
 * 但是如果转念想一想，的确你拿一个主题在这写观察者模式（我们自己的实现），接口的思想很好，
 * 但是如果现在继续添加很多个主题，每个主题的ddObserver,removeObserver,notifyObservers代码基本都是相同的吧，
 * 接口是无法实现代码复用的，而且也没有办法使用组合的模式实现这三个方法的复用，所以我觉得这里把这三个方法在类中实现是合理的。
 */
public class Test {

    public static void main(String[] args) {
        SubjectFor3d subjectFor3d = new SubjectFor3d();
        SubjectForSSQ subjectForSSQ = new SubjectForSSQ();

        Observer1 observer1 = new Observer1();
        observer1.registerSubject(subjectFor3d);
        observer1.registerSubject(subjectForSSQ);

        subjectFor3d.setMsg("hello 3d'nums : 110 ");
        subjectForSSQ.setMsg("ssq'nums : 12,13,31,5,4,3 15");

    }
}
