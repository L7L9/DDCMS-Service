package com.webank.databrain.db.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import com.webank.databrain.model.bo.CompanyInfoBO;
import com.webank.databrain.model.po.CompanyInfoPO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2023-03-08
 */
public interface CompanyInfoDAO extends IService<CompanyInfoPO> {
    List<CompanyInfoBO> listHotCompany(int topN);
    List<CompanyInfoBO> listCompany(int pageNo, int pageSize);

    CompanyInfoBO queryCompanyByUsername(String username);

    List<CompanyInfoBO> listCompanyWithStatus(int status, int pageNo, int pageSize);
}
