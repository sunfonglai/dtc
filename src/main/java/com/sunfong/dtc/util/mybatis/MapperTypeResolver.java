package com.sunfong.dtc.util.mybatis;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

/**
 * @author wfr14
 */
public class MapperTypeResolver extends JavaTypeResolverDefaultImpl {
    @Override
    protected FullyQualifiedJavaType calculateBigDecimalReplacement(IntrospectedColumn column, FullyQualifiedJavaType defaultType) {
        FullyQualifiedJavaType answer;
         Integer typeResolverMax = 18;
        Integer typeResolverMin = 18;


        if (column.getScale() > 0 || column.getLength() > typeResolverMax || forceBigDecimals) {
            answer = defaultType;
        } else if (column.getLength() > typeResolverMin) {
            answer = new FullyQualifiedJavaType(Long.class.getName());
        } else {
            answer = new FullyQualifiedJavaType(Integer.class.getName());
        }
        return answer;
    }
}
