package com.qf.mapper;

import com.qf.entity.TUserAddr;

public interface TUserAddrMapper {
    int deleteByPrimaryKey(Long tuaId);

    int insert(TUserAddr record);

    int insertSelective(TUserAddr record);

    TUserAddr selectByPrimaryKey(Long tuaId);

    int updateByPrimaryKeySelective(TUserAddr record);

    int updateByPrimaryKey(TUserAddr record);
}