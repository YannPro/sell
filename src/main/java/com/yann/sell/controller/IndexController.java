package com.yann.sell.controller;

import com.yann.sell.VO.ProductInfoVO;
import com.yann.sell.VO.ProductVO;
import com.yann.sell.VO.ResultVO;
import com.yann.sell.dataobject.ProductCategory;
import com.yann.sell.dataobject.ProductInfo;
import com.yann.sell.service.CategoryService;
import com.yann.sell.service.ProductService;
import com.yann.sell.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 买家商品
 * Created by 廖师兄
 * 2017-05-12 14:08
 */
@RestController
@RequestMapping
public class IndexController {
    @RequestMapping("/")
    public String list() {
        return "home";
    }
}
