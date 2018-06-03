package com.witt.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import java.util.Arrays;
import java.util.Map;

/**
 * @author witt
 * @fileName MyRequestListener
 * @date 2018/6/4 01:13
 * <p>
 * @description </p>
 * @history <author>    <time>    <version>    <desc>
 */

public class MyRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        Map<String, String[]> map = sre.getServletRequest().getParameterMap();
        map.forEach((s, strings) -> System.out.println(s + ":" + Arrays.toString(strings)));
    }
}
