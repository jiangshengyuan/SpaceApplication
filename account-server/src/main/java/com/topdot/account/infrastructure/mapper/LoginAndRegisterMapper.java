package com.topdot.account.infrastructure.mapper;

import com.topdot.account.infrastructure.entity.LoginAndRegisterEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginAndRegisterMapper {
    int insert(LoginAndRegisterEntity loginAndRegisterEntity);

}
