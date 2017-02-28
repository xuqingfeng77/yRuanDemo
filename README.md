yRuanDemo
======================
这个demo是用来解释一类sdk封装的弊端问题。<br>
通过设置app中的build.gradle的applicationId来提现，
例如设置成cn.eeepay.yruan.yr和cn.eeepay.yruan,AndroidManifest.xml中package是cn.eeepay.yruan，
测试结果是：当applicationId="cn.eeepay.yruan.yr"app会崩溃，applicationId="cn.eeepay.yruan"就是正常的

> **20170228更新:**
> - 经过和云软公司沟通后，他们听取了我们建议后，在webchat.jar添加SPUtil类，索引ID处添加判断，如果没有写入package到xml文件中，则取默认的.<br>
代码如下：<br>
 String mPackageName = SPUtil.getString(context, "package", packageName);
> - TestColor.java添加方法，进入聊天界面前先设置package=cn.eeepay.yruan，这样就可以找到资源ID