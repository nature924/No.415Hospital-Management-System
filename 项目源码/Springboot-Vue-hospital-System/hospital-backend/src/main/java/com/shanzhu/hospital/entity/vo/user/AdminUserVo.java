package com.shanzhu.hospital.entity.vo.user;

import lombok.Data;

/**
 * 管理员登录 返回对象
 *
 * @author: ShanZhu
 * @date: 2023-11-15
 */
@Data
public class AdminUserVo {

    /**
     * 管理员id (账号)
     */
    private Integer aId;

    /**
     * 管理员名称
     */
    private String aName;

    /**
     * 生成的账号token（验签）
     */
    private String token;

}

  