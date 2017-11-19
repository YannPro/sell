package com.yann.sell.dataobject;

import com.yann.sell.enums.OrderStatusEnum;
import com.yann.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by YannYao on 2017/11/19.
 */
@Entity
@DynamicUpdate
@Data
public class OrderMaster {
    @Id
    /*订单ID*/
    private String orderId;
    /*买家名字*/
    private String buyerName;
    /*买家手机号*/
    private String buyerPhone;
    /*买家地址*/
    private String buyerAddress;
    /*买家微信openId*/
    private String buyerOpenId;
    /*订单总金额*/
    private BigDecimal orderAmount;
    /*订单状态,默认为0新下单*/
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    /*支付状态,默认为0未支付*/
    private Integer payStatus = PayStatusEnum.WAIT.getCode();
    /*创建时间*/
    private Date createTime;
    /*更新时间*/
    private Date updateTime;
}
