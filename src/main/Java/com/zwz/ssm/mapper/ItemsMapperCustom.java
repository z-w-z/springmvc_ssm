package com.zwz.ssm.mapper;

import com.zwz.ssm.po.ItemsCustom;
import com.zwz.ssm.po.ItemsQueryVo;

import java.util.List;

/**
 * @author ZWZ
 */
public interface ItemsMapperCustom {
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}
