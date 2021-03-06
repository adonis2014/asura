/**
 * @FileName: MyIndicesAnalysisModule.java
 * @Package: top.swimmer.elasticsearch.HanLP.plugin
 * @author youshipeng
 * @created 2017/2/6 11:01
 * <p>
 * Copyright 2016 ziroom
 */
package com.asura.framework.tokenizer.plugin;

import org.elasticsearch.common.inject.AbstractModule;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author youshipeng
 * @version 1.0
 * @since 1.0
 */
public class MyIndicesAnalysisModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(MyIndicesAnalysis.class).asEagerSingleton();
    }
}