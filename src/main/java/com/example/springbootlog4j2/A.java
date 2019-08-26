/*
package com.example.springbootlog4j2;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.Banner;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringBootExceptionReporter;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.util.StopWatch;

import java.util.ArrayList;
import java.util.Collection;

*/
/**
 * @author 633805 LYH
 * @version V1.0
 * @description 对类的描述
 * @create 2019-08-19 8:25
 * @since 1.7
 *//*

public class A {

    public ConfigurableApplicationContext run(String... args) {
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
        ConfigurableApplicationContext context = null;
        Collection<SpringBootExceptionReporter> exceptionReporters = new ArrayList<>();
//设置系统属性『java.awt.headless』，为true则启用headless模式支持
//        configureHeadlessProperty();
////通过*SpringFactoriesLoader*检索*META-INF/spring.factories*，
////找到声明的所有SpringApplicationRunListener的实现类并将其实例化，
////之后逐个调用其started()方法，广播SpringBoot要开始执行了
//        SpringApplicationRunListeners listeners = getRunListeners(args);
//发布应用开始启动事件
        listeners.starting();
        try {
//初始化参数
            ApplicationArguments applicationArguments = new DefaultApplicationArguments(args);
//创建并配置当前SpringBoot应用将要使用的Environment（包括配置要使用的PropertySource以及Profile）,
//并遍历调用所有的SpringApplicationRunListener的environmentPrepared()方法，广播Environment准备完毕。
            ConfigurableEnvironment environment = prepareEnvironment(listeners, applicationArguments);
            configureIgnoreBeanInfo(environment);
//打印banner
            Banner printedBanner = printBanner(environment);
//创建应用上下文
            context = createApplicationContext();
//通过*SpringFactoriesLoader*检索*META-INF/spring.factories*，获取并实例化异常分析器
            exceptionReporters = getSpringFactoriesInstances(SpringBootExceptionReporter.class,
                    new Class[] { ConfigurableApplicationContext.class }, context);
//为ApplicationContext加载environment，之后逐个执行ApplicationContextInitializer的initialize()方法来进一步封装ApplicationContext，
//并调用所有的SpringApplicationRunListener的contextPrepared()方法，【EventPublishingRunListener只提供了一个空的contextPrepared()方法】，
//之后初始化IoC容器，并调用SpringApplicationRunListener的contextLoaded()方法，广播ApplicationContext的IoC加载完成，
//这里就包括通过**@EnableAutoConfiguration**导入的各种自动配置类。
            prepareContext(context, environment, listeners, applicationArguments, printedBanner);
//刷新上下文
            refreshContext(context);
//再一次刷新上下文,其实是空方法，可能是为了后续扩展。
            afterRefresh(context, applicationArguments);
            stopWatch.stop();
            if (this.logStartupInfo) {
                new StartupInfoLogger(this.mainApplicationClass).logStarted(getApplicationLog(), stopWatch);
            }
//发布应用已经启动的事件
            listeners.started(context);
//遍历所有注册的ApplicationRunner和CommandLineRunner，并执行其run()方法。
//我们可以实现自己的ApplicationRunner或者CommandLineRunner，来对SpringBoot的启动过程进行扩展。
            callRunners(context, applicationArguments);
        }
        catch (Throwable ex) {
            handleRunFailure(context, ex, exceptionReporters, listeners);
            throw new IllegalStateException(ex);
        }

        try {
//应用已经启动完成的监听事件
            listeners.running(context);
        }
        catch (Throwable ex) {
            handleRunFailure(context, ex, exceptionReporters, null);
            throw new IllegalStateException(ex);
        }
        return context;
    }
}
*/
