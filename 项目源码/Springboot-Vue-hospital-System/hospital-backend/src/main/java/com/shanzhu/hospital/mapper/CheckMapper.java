package com.shanzhu.hospital.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shanzhu.hospital.entity.po.Checks;
import org.apache.ibatis.annotations.Mapper;

/**
 * 检查项目 持久层（mapper）
 *
 
 * @date: 2023-11-17
 */
@Mapper
public interface CheckMapper extends BaseMapper<Checks> {

}
