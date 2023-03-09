package com.webank.databrain.db.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.webank.databrain.db.dao.TagInfoDAO;
import com.webank.databrain.model.po.TagInfoPO;
import com.webank.databrain.db.mapper.TagInfoMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2023-03-08
 */
@Service
public class TagInfoDAOImpl extends ServiceImpl<TagInfoMapper, TagInfoPO> implements TagInfoDAO {

}