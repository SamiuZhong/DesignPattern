package com.samiu.design.chains;

/**
 * @author Samiu 2020/7/16
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public abstract class Handler {

    //下一节点的处理者
    protected Handler successor;

    /**
     * 请求处理
     *
     * @param condition 请求条件
     */
    public abstract void handlerRequest(String condition);
}
