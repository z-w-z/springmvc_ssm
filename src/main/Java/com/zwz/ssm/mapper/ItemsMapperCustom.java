package com.zwz.ssm.mapper;


import com.zwz.ssm.po.ItemsCustom;
import com.zwz.ssm.po.ItemsQueryVo;

import java.util.List;

public interface ItemsMapperCustom {
    //商品查询列表
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}
