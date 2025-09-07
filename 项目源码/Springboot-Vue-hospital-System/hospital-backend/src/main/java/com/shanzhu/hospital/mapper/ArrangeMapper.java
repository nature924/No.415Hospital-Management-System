package com.shanzhu.hospital.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shanzhu.hospital.entity.po.Arrange;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 排班 持久层（mapper）
 *
 
 * @date: 2023-11-15
 */
@Mapper
public interface ArrangeMapper extends BaseMapper<Arrange> {

    /**
     * 根据日期还有科室查询
     *
     * @param arTime   时间
     * @param dSection 科室
     * @return 排班信息
     */
    List<Arrange> findByTime(@Param("ar_time") String arTime, @Param("d_section") String dSection);

}
