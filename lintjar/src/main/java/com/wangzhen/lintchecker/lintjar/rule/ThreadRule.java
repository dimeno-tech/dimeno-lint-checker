package com.wangzhen.lintchecker.lintjar.rule;

import com.wangzhen.lintchecker.lintjar.inter.Rule;

/**
 * Thread提示信息
 * Created by wangzhen on 2018/4/15.
 */

public class ThreadRule implements Rule {
    @Override
    public String getId() {
        return "ThreadUsage";
    }

    @Override
    public String getBriefDescription() {
        return "避免自己创建Thread";
    }

    @Override
    public String getExplanation() {
        return "请勿直接调用new Thread()，建议使用AsyncTask或统一的线程管理工具类";
    }

    @Override
    public String getFullPath() {
        return "java.lang.Thread";
    }
}