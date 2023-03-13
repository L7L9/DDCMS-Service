package com.webank.databrain.dao.db.dao.impl;

import com.webank.databrain.dao.db.dao.PersonInfoDAO;
import com.webank.databrain.model.bo.PersonInfoBO;
import com.webank.databrain.dao.db.entity.PersonInfoEntity;
import com.webank.databrain.dao.db.mapper.PersonInfoMapper;
import com.webank.databrain.utils.PagingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2023-03-08
 */
@Service
public class PersonInfoDAOImpl implements PersonInfoDAO {
    @Autowired
    private PersonInfoMapper mapper;

    @Override
    public PersonInfoBO queryPersonByUsername(String username) {
        return mapper.queryPersonByUsername(username);
    }


    @Override
    public List<PersonInfoBO> listPersonWithStatus(int accountStatus, int pageNo, int pageSize) {
        long start = PagingUtils.getStartOffset(pageNo, pageSize);
        return mapper.listPersonWithStatus(accountStatus, start, pageSize);
    }

    @Override
    public void saveItem(PersonInfoEntity personInfoPo) {
        mapper.insertItem(personInfoPo);
    }

    @Override
    public int totalCountWithStatus(int status) {
        return mapper.totalCountWithStatus(status);
    }
}