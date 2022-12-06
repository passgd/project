package com.shipping.mall.repository;


import com.shipping.mall.dto.ItemSearchDto;
import com.shipping.mall.dto.MainItemDto;
import com.shipping.mall.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {

    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

}
