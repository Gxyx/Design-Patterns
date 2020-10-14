package com.san.DesignPattern.工厂模式.简单工厂模式;

/**
 * 现在你随便添加什么种类的馍，删除什么种类的馍就和Store无关了，
 * 人家只负责卖馍 这就是简单工厂模式
 */
public class RoujiaMoStore {


    private SimpleRouJiaMoFactroy simpleRouJiaMoFactroy;

    public RoujiaMoStore (SimpleRouJiaMoFactroy simpleRouJiaMoFactroy){
        this.simpleRouJiaMoFactroy = simpleRouJiaMoFactroy;
    }
    /**
     * 根据传入类型卖不同的肉夹馍
     * @param type
     * @return
     */
//    public RouJiaMo sellRouJiaMo(String type){
//        RouJiaMo rouJiaMo = null;
//        if (type.equals("Suan")){
//            rouJiaMo = new SuanRouJiaMo();
//        }else if (type.equals("Tian")){
//            rouJiaMo = new TianRouJiaMo();
//        }else if (type.equals("Suan")){
//            rouJiaMo = new SuanRouJiaMo();
//        }
//       rouJiaMo.prepare();
//       rouJiaMo.fire();
//       rouJiaMo.pack();
//       return rouJiaMo;
//
//    }
    public RouJiaMo sellRouJiaMo(String type)
    {
        RouJiaMo rouJiaMo = simpleRouJiaMoFactroy.createRouJiaMo(type);
        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }

}
