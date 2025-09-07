package com.shanzhu.hospital.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shanzhu.hospital.entity.po.Bed;
import org.apache.ibatis.annotations.Mapper;

/**
 * 病床 持久层（mapper）
 *
 
 * @date: 2023-11-17
 */
@Mapper
public interface BedMapper extends BaseMapper<Bed> {

}
