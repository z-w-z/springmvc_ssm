package com.zwz.ssm.mapper;

import com.zwz.ssm.po.ItemsCustom;

import java.util.List;

public interface ItemsMappperCustom {
    public List<ItemsCustom> findItemsList (ItemsQueryVO itemsQueryVO)throws Exception;
}