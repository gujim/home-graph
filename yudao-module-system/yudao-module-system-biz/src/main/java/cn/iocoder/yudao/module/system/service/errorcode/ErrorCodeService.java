package cn.iocoder.yudao.module.system.service.errorcode;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.system.api.errorcode.dto.ErrorCodeAutoGenerateReqDTO;
import cn.iocoder.yudao.module.system.api.errorcode.dto.ErrorCodeRespDTO;
import cn.iocoder.yudao.module.system.controller.admin.errorcode.vo.ErrorCodeCreateReqVO;
import cn.iocoder.yudao.module.system.controller.admin.errorcode.vo.ErrorCodeExportReqVO;
import cn.iocoder.yudao.module.system.controller.admin.errorcode.vo.ErrorCodePageReqVO;
import cn.iocoder.yudao.module.system.controller.admin.errorcode.vo.ErrorCodeUpdateReqVO;
import cn.iocoder.yudao.module.system.dal.dataobject.errorcode.ErrorCodeDO;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * 错误码 Service 接口
 *
 * @author 芋道源码
 */
public interface ErrorCodeService {

    /**
     * 自动创建错误码
     *
     * @param autoGenerateDTOs 错误码信息
     */
    void autoGenerateErrorCodes(@Valid List<ErrorCodeAutoGenerateReqDTO> autoGenerateDTOs);

    /**
     * 增量获得错误码数组
     *
     * 如果 minUpdateTime 为空时，则获取所有错误码
     *
     * @param applicationName 应用名
     * @param minUpdateTime 最小更新时间
     * @return 错误码数组
     */
    List<ErrorCodeRespDTO> getErrorCodeList(String applicationName, Date minUpdateTime);

    /**
     * 创建错误码
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createErrorCode(@Valid ErrorCodeCreateReqVO createReqVO);

    /**
     * 更新错误码
     *
     * @param updateReqVO 更新信息
     */
    void updateErrorCode(@Valid ErrorCodeUpdateReqVO updateReqVO);

    /**
     * 删除错误码
     *
     * @param id 编号
     */
    void deleteErrorCode(Long id);

    /**
     * 获得错误码
     *
     * @param id 编号
     * @return 错误码
     */
    ErrorCodeDO getErrorCode(Long id);

    /**
     * 获得错误码分页
     *
     * @param pageReqVO 分页查询
     * @return 错误码分页
     */
    PageResult<ErrorCodeDO> getErrorCodePage(ErrorCodePageReqVO pageReqVO);

    /**
     * 获得错误码列表, 用于 Excel 导出
     *
     * @param exportReqVO 查询条件
     * @return 错误码列表
     */
    List<ErrorCodeDO> getErrorCodeList(ErrorCodeExportReqVO exportReqVO);

}
