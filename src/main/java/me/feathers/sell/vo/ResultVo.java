package me.feathers.sell.vo;

import lombok.Data;
import lombok.Getter;
import me.feathers.sell.enums.ResultEnum;

/**
 * Http请求返回的最外层对象
 * <p>
 *
 * @author Feathers
 * @date 2017-11-09 11:49
 */
@Getter
public class ResultVo<T> {

    private ResultVo() {
    }

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 信息
     */
    private String msg;

    /**
     * 数据
     */
    private T data;

    public ResultVo<T> setCode(Integer code) {
        this.code = code;
        return this;
    }

    public ResultVo<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public ResultVo<T> setData(T data) {
        this.data = data;
        return this;
    }

    /**
     * 创建一条返回码,返回码可以通过<code>setCode</code>,<code>setMsg</code>,<code>setData</code>方法指定所需的状态码状态信息以及数据
     *
     * @param clazz   数据泛型指定
     * @param <C> 数据泛型
     * @return json
     */
    public static <C> ResultVo<C> create(Class<C> clazz) {
        return new ResultVo<>();
    }

    /**
     * 创建一条成功的返回码,无data数据
     *
     * @return json
     */
    public static ResultVo success() {
        return new ResultVo()
                .setCode(ResultEnum.SUCCESS.getCode())
                .setMsg(ResultEnum.SUCCESS.getMsg());
    }

    /**
     * 创建一条系统错误的返回码,无data数据
     *
     * @return json
     */
    public static ResultVo sysError() {
        return new ResultVo()
                .setCode(ResultEnum.UNKNOW_ERROR.getCode())
                .setMsg(ResultEnum.UNKNOW_ERROR.getMsg());
    }

}
