package com.witt.velocity;

/**
 * @author witt
 * @fileName Example
 * @date 2018/6/2 18:19
 * <p>
 * @description velocity example
 * </p>
 * @history <author>    <time>    <version>    <desc>
 */

public class Example {

    public static void main(String[] args) {

        ///* 设置测试 vm 模板路径 */
        //
        //Properties properties = new Properties();
        //String path = "/Users/witt/Practice/java/velocity-example/src/test/resources";
        //properties.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH, path);
        //
        ///* first, we init the runtime engine.  Defaults are fine. */
        //
        //Velocity.init(properties);
        //
        ///* lets make a Context and put data into it */
        //
        //VelocityContext context = new VelocityContext();
        //
        //context.put("name", "Velocity");
        //context.put("project", "Jakarta");
        //
        ///* lets render a template */
        //
        //StringWriter w = new StringWriter();
        //
        //Velocity.mergeTemplate("testtemplate.vm","utf-8", context, w);
        //System.out.println(" template : " + w);
        //
        ///* lets make our own string to render */
        //
        //String s = "We are using $project $name to render this.";
        //w = new StringWriter();
        //Velocity.evaluate(context, w, "mystring", s);
        //System.out.println(" string : " + w);
    }
}
