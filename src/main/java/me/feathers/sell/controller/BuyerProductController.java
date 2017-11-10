package me.feathers.sell.controller;

import me.feathers.sell.domain.ProductCategory;
import me.feathers.sell.domain.ProductInfo;
import me.feathers.sell.enums.ResultEnum;
import me.feathers.sell.service.CategoryService;
import me.feathers.sell.service.ProductService;
import me.feathers.sell.vo.ProductInfoVo;
import me.feathers.sell.vo.ProductVo;
import me.feathers.sell.vo.ResultVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 买家商品
 * <p>
 *
 * @author Feathers
 * @date 2017-11-09 11:46
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    private final ProductService productService;

    private final CategoryService categoryService;

    @Autowired
    public BuyerProductController(ProductService productService, CategoryService categoryService) {
        this.productService = productService;
        this.categoryService = categoryService;
    }

    @RequestMapping("/list")
    public ResultVo list() {
        // 查询上架的商品
        List<ProductInfo> productInfoList = productService.findUpAll();

        // 查询类目
        List<Integer> categoryIds = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());
        List<ProductCategory> categoryList = categoryService.findByCategoryTypeIn(categoryIds);

        // 数据拼装
        List<ProductVo> productVoList = new ArrayList<>();
        for (ProductCategory productCategory : categoryList) {
            ProductVo productVo = new ProductVo();
            productVo.setCategoryName(productCategory.getCategoryName());
            productVo.setCategoryType(productCategory.getCategoryType());
            List<ProductInfoVo> productInfoVoList = new ArrayList<>();
            for (ProductInfo info : productInfoList) {
                if (info.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVo productInfoVo = new ProductInfoVo();
                    BeanUtils.copyProperties(info, productInfoVo);
                    productInfoVoList.add(productInfoVo);
                }
            }
            productVo.setProductInfoList(productInfoVoList);
            productVoList.add(productVo);
        }
        return ResultVo.create(List.class)
                .setCode(ResultEnum.SUCCESS.getCode())
                .setMsg(ResultEnum.SUCCESS.getMsg())
                .setData(productVoList);
    }
}
