package com.zwz.ssm.service;

import com.zwz.ssm.po.ItemsCustom;
import com.zwz.ssm.po.ItemsQueryVo;

import java.util.List;

public interface ItemsService {

    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;

}
