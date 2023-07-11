package com.github.dmitrpet.criteriagenerator.annotations.operators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
public @interface NeOperator {
    String targetFieldName() default "";
    String group() default "";
}
