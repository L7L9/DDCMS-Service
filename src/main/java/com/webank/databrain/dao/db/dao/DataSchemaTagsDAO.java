package com.webank.databrain.dao.db.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import com.webank.databrain.dao.db.entity.DataSchemaTagsEntity;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2023-03-08
 */
public interface DataSchemaTagsDAO extends IService<DataSchemaTagsEntity> {

    public void saveDataSchemaTag(DataSchemaTagsEntity dataSchemaTagsEntity);

}