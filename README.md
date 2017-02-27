"# yRuanDemo" 
这个demo是用来解释一类sdk封装的弊端问题。<br>
通过设置app中的build.gradle的applicationId来提现，
例如设置成cn.eeepay.yruan.yr和cn.eeepay.yruan,AndroidManifest.xml中package是cn.eeepay.yruan，
测试结果是：当applicationId="cn.eeepay.yruan.yr"app会崩溃，applicationId="cn.eeepay.yruan"就是正常的