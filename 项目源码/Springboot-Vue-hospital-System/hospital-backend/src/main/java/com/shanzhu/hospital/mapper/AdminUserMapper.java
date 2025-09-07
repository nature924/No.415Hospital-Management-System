package com.shanzhu.hospital.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shanzhu.hospital.entity.po.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * 管理员 持久层（mapper）
 *
 
 * @date: 2023-11-17
 */
@Mapper
public interface AdminUserMapper extends BaseMapper<Admin> {

}
