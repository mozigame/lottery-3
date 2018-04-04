package com.github.chengbin.admin.mapper;

import com.github.chengbin.admin.entity.GateClient;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface GateClientMapper extends Mapper<GateClient> {
    public void insertClientServiceById(@Param("clientId") int clientId, @Param("serviceId") int serviceId);
    public void deleteClientServiceById(@Param("clientId") int clientId);
}