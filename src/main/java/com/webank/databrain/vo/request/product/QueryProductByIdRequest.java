package com.webank.databrain.vo.request.product;

import com.webank.databrain.vo.common.CommonRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

@Data
@EqualsAndHashCode(callSuper = true)
public class QueryProductByIdRequest extends CommonRequest {
    private Long productId;

}
