package org.esnack24api.esnack24api.product.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.esnack24api.esnack24api.common.dto.PageResponseDTO;
import org.esnack24api.esnack24api.common.page.PageRequest;
import org.esnack24api.esnack24api.common.page.PageResponse;
import org.esnack24api.esnack24api.product.dto.ProductMainDTO;
import org.esnack24api.esnack24api.product.mapper.ProductMapper;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Log4j2
@Transactional
@RequiredArgsConstructor
public class ProductService {

    private final ProductMapper productMapper;

    public PageResponse<ProductMainDTO> getProductMainList(PageRequest pageRequest) {
        log.info("getProductMainList");

        PageResponse<ProductMainDTO> pageResponse =
                PageResponse.<ProductMainDTO>with()
                        .list(productMapper.getList(pageRequest))
                        .total(productMapper.count(pageRequest))
                        .pageRequest(pageRequest)
                        .build();

        return pageResponse;


    }

}