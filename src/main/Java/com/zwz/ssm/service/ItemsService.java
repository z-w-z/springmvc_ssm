package com.zwz.ssm.service;

import com.zwz.ssm.po.ItemsQueryVO;

import java.util.List;

public interface ItemsService {
    public List<com.zwz.ssm.po.ItemsCustom> findItemsList (ItemsQueryVO itemsQueryVO)throws Exception;

}
