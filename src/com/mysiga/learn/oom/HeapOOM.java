package com.mysiga.learn.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * <li>-server
 * -Xms128m
 * -Xmx512m
 * -XX:ReservedCodeCacheSize=240m
 * -XX:+UseConcMarkSweepGC
 * -XX:SoftRefLRUPolicyMSPerMB=50
 * -ea
 * -Dsun.io.useCanonCaches=false
 * -Djava.net.preferIPv4Stack=true
 * -XX:+HeapDumpOnOutOfMemoryError
 * -XX:-OmitStackTraceInFastThrow
 * -XX:MaxJavaStackTraceDepth=-1
 * </li>
 * test java heap oom,Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 */
public class HeapOOM {
    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
