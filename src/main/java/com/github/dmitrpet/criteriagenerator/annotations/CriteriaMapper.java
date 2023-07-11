package com.github.dmitrpet.criteriagenerator.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.SOURCE)
public @interface CriteriaMapper {
    boolean useCurrentPackage() default true;
    String packagePath() default "";
    String suffixMapperName() default "Impl";
    boolean springComponent() default true;
}
