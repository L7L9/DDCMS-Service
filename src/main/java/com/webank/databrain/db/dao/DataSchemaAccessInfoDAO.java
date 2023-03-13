package com.webank.databrain.db.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import com.webank.databrain.dao.db.entity.DataSchemaAccessInfoEntity;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2023-03-08
 */
public interface DataSchemaAccessInfoDAO extends IService<DataSchemaAccessInfoEntity> {

    public void saveDataSchemaAccessInfo(DataSchemaAccessInfoEntity dataSchemaAccessInfoEntity);

}
