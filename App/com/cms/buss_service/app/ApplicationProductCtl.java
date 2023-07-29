package com.cms.buss_service.app;

import com.cms.base_service.common.model.BaseCtl;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.model.TableDataInfo;
import com.cms.buss_service.product.domain.BussProductBrand;
import com.cms.buss_service.product.domain.BussProductBrandVo;
import com.cms.buss_service.product.domain.BussProductInfo;
import com.cms.buss_service.product.domain.BussProductInfoVo;
import com.cms.buss_service.product.service.BussProductBrandService;
import com.cms.buss_service.product.service.BussProductInfoService;
import com.cms.buss_service.product_type.domain.BussProductType;
import com.cms.buss_service.product_type.service.BussProductTypeService;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping({"/api"})
public class ApplicationProductCtl
        extends BaseCtl {
    @Autowired
    private BussProductInfoService bussProductInfoService;
    @Autowired
    private BussProductBrandService bussProductBrandService;
    @Autowired
    private BussProductTypeService bussProductTypeService;

    @GetMapping({"/product/info/list"})
    public TableDataInfo listProduct(BussProductInfoVo bussProductInfo) {
        /*  48 */
        bussProductInfo.setNo3("0");
        /*  49 */
        startPage();
        /*  50 */
        List<BussProductInfo> list = this.bussProductInfoService.selectBussProductInfoListForWx(bussProductInfo);
        /*  51 */
        return getDataTable(list);
    }


    @GetMapping({"/product/info/list2"})
    public RestResult listproduct_type(BussProductBrandVo brand) {
        /*  60 */
        List<BussProductBrandVo> list = this.bussProductBrandService.selectBrandChildProduct(brand);
        /*  61 */
        BussProductInfo info = new BussProductInfo();
        /*  62 */
        info.setStationId(brand.getStationId());
        /*  63 */
        info.setProductType(brand.getProductType());
        /*  64 */
        List<BussProductInfo> infos = this.bussProductInfoService.queryProductByStationBrand(info);



        /*  68 */
        Map<Long, List<BussProductInfo>> collect = (Map<Long, List<BussProductInfo>>) infos.stream().collect(Collectors.groupingBy(d -> d.getProductBrand(), java.util.LinkedHashMap::new, Collectors.toList()));
        /*  69 */
        collect.keySet().forEach(s -> list.forEach((s1 ->{})));







        /*  77 */
        return RestResult.ok(list);
    }

    @GetMapping({"/product/info/queryByIds/{ids}"})
    public TableDataInfo queryByIds(@PathVariable String ids) {
        /*  82 */
        startPage();
        /*  83 */
        List<BussProductInfo> list = this.bussProductInfoService.selectBussProductInfoByIds(ids);
        /*  84 */
        return getDataTable(list);
    }


    @GetMapping({"/product/info/{pk}"})
    public RestResult getInfoProduct(@PathVariable("pk") String pk) {
        /*  90 */
        return RestResult.ok(this.bussProductInfoService.selectBussProductInfoById(pk));
    }


    @GetMapping({"/product/brand/list"})
    public TableDataInfo listBrand(BussProductBrand bussProductBrand) {
        /*  98 */
        startPage();
        /*  99 */
        List<BussProductBrand> list = this.bussProductBrandService.selectBussProductBrandList(bussProductBrand);
        /* 100 */
        return getDataTable(list);
    }


    @GetMapping({"/buss/product_type/list"})
    public TableDataInfo listproduct_type(BussProductType bussProductType) {
        /* 108 */
        startPage();
        /* 109 */
        List<BussProductType> list = this.bussProductTypeService.selectBussProductTypeList(bussProductType);
        /* 110 */
        return getDataTable(list);
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\app\ApplicationProductCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */