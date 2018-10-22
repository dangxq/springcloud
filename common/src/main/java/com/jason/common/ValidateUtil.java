package com.jason.springcloud.user.userservice.common;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Jason
 * @date 2018/10/17
 */
public class ValidateUtil {
    public static <T> String validate(T t, Class... c) throws IllegalAccessException, InstantiationException {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<T>> violations = validator.validate(t, c);
        StringBuffer errorBuf = new StringBuffer();
        if (violations.size() <= 0) {
            return null;
        } else {
            Iterator var6 = violations.iterator();

            while(var6.hasNext()) {
                ConstraintViolation<T> violation = (ConstraintViolation)var6.next();
                errorBuf.append(violation.getMessage() + "\n");
            }

            return errorBuf.toString().substring(0, errorBuf.length() - 1);
        }
    }
}
