package com.webank.databrain.model.resp.account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryPersonByUsernameResponse {

    private PersonInfoVO item;

}