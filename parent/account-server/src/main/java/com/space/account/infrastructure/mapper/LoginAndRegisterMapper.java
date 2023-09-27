package com.space.account.infrastructure.mapper;

import com.space.account.infrastructure.entity.LoginAndRegisterEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginAndRegisterMapper {
    int insert(LoginAndRegisterEntity loginAndRegisterEntity);

}
