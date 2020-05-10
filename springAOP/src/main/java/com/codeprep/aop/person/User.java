package com.codeprep.aop.person;

import com.codeprep.aop.io.ResultDTO;

public interface User {

    public void beforeAspect();
    public void afterAspect();
    public ResultDTO afterReturningAspect(Boolean value);
}
