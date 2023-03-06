package com.webank.databrain.model.response.tags;

import com.webank.databrain.model.dto.common.IdName;
import com.webank.databrain.model.response.common.BaseHotResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotTagsResponse extends BaseHotResponse<IdName> {
    public HotTagsResponse(List<IdName> idNames) {
        super(idNames);
    }
}