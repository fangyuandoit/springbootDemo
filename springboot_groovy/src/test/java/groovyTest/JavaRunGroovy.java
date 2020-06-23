package groovyTest;

import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;
import groovy.lang.GroovyShell;
import groovy.lang.Script;
import org.codehaus.groovy.jsr223.GroovyScriptEngineFactory;
import org.codehaus.groovy.runtime.InvokerHelper;

import javax.script.Invocable;
import javax.script.ScriptEngine;

/**
 * @Author: fang
 * @Date: 2020/6/23 21:54
 * @Description:   java运行groovy脚本
 */
public class JavaRunGroovy {

    public  static final GroovyScriptEngineFactory scriptEngineFactory = new GroovyScriptEngineFactory();
    public static GroovyShell groovyShell = new GroovyShell();
    public static void main(String[] args) throws Exception {

        GroovyClassLoaderTest();
        Object o = GroovyScriptEngineFactoryTest("", "", 1, 2);
        GroovyShellTest("","",2,3);

    }

    private static <T> T GroovyShellTest(String scriptText, String function, Object... objects) throws Exception {

        scriptText = "def cal(int a, int b){\n" +
                "    return a+b\n" +
                "}";

        function = "cal";

        Script script= groovyShell.parse(scriptText);
        T t = (T) InvokerHelper.invokeMethod(script, function, objects);
        System.out.println(t);
        groovyShell.getClassLoader().clearCache();
        return t;
    }

    /**
     * 使用ScriptEngine
     * @param script
     * @param function
     * @param objects
     * @param <T>
     * @return
     * @throws Exception
     */
    private static <T> T GroovyScriptEngineFactoryTest(String script, String function, Object... objects) throws Exception {
        script = "def cal(int a, int b){\n" +
                "    return a+b\n" +
                "}";

        function = "cal";

        ScriptEngine scriptEngine = scriptEngineFactory.getScriptEngine();
        scriptEngine.eval(script);
        T t = (T) ((Invocable) scriptEngine).invokeFunction(function, objects);
        System.out.println(t);
        return t;
    }


    /**
     * 使用GroovyClassLoader
     */
    private static void GroovyClassLoaderTest() {
        GroovyClassLoader classLoader = new GroovyClassLoader();
        Class groovyClass = classLoader.parseClass("def cal(int a, int b){\n" +
                "    return a+b\n" +
                "}");
        try {
            Object[] param = { 8,7 };
            GroovyObject groovyObject = (GroovyObject) groovyClass.newInstance();
            int result = (int)groovyObject.invokeMethod("cal",param);
            System.out.println(result);
            classLoader.clearCache();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }


}
