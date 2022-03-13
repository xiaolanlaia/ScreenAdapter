## DP适配方案使用
在Application的onCreate中注册使用

~~~java
      //411 入ui设计给的大小
      new ScreenAdaptation(this, 411).register();
~~~

## PT适配方案使用

1、在需要适配的Activity或在基类中重写getResources()方法

~~~java
    override fun getResources(): Resources {
        return PTAdaptUtils(this).adaptWidth(super.getResources(), 411)

    }
~~~

2、在布局中设置控件大小时使用pt作为单位

## SmallestWidth适配方案使用

1、使用SmallestWidth插件辅助生成资源文件 Tools ➡ SmallestWidth
2、在Design width(px)中填入的是设计图实际的大小作为基准大小