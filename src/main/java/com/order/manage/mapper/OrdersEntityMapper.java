package com.order.manage.mapper;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.order.manage.entity.OrderItemEntity;
import com.order.manage.entity.OrderStatusEntity;
import com.order.manage.entity.OrdersEntity;
import com.order.manage.entity.PaymentStatusEntity;
import com.order.manage.entity.ShipmentStatusEntity;
import com.order.manage.model.OrderItemModel;
import com.order.manage.model.OrderStatusModel;
import com.order.manage.model.OrdersModel;
import com.order.manage.model.PaymentStatusModel;
import com.order.manage.model.ShipmentStatusModel;

@Component
public class OrdersEntityMapper {

	public OrdersEntity modelToOrdersEntity(OrdersModel ordersModel) {
		ordersModel.setOrderId(getId(ordersModel.getOrderId()));
		OrdersEntity ordersEntity = new OrdersEntity();
		BeanUtils.copyProperties(ordersModel, ordersEntity);
		ordersEntity.setOrderItemList(modelToOrderItemEntites(ordersModel.getOrderItemModelList(), ordersEntity));
		ordersEntity.setOrderStatusEntity(modelToOrderStatusEntity(ordersModel.getOrderStatusModel()));
		ordersEntity.setPaymentStatusEntity(modelToPaymentStatusEntity(ordersModel.getPaymentStatusModel()));
		ordersEntity.setShipmentStatusEntity(modelToShipmentStatusEntity(ordersModel.getShipmentStatusModel()));
		return ordersEntity;
	}

	public OrderItemEntity modelToOrderItemEntity(OrderItemModel orderItemModel, OrdersEntity ordersEntity) {
		orderItemModel.setBookId(getId(orderItemModel.getBookId()));
		OrderItemEntity orderItemEntity = new OrderItemEntity();
		BeanUtils.copyProperties(orderItemModel, orderItemEntity);
		return orderItemEntity;
	}

	public List<OrderItemEntity> modelToOrderItemEntites(List<OrderItemModel> orderItemModels,
			OrdersEntity ordersEntities) {
		return orderItemModels.stream().map(orderItemModel -> modelToOrderItemEntity(orderItemModel, ordersEntities))
				.collect(Collectors.toList());
	}

	public OrderStatusEntity modelToOrderStatusEntity(OrderStatusModel orderStatusModel) {
		orderStatusModel.setOrderStatusId(getId(orderStatusModel.getOrderStatusId()));
		OrderStatusEntity orderStatusEntity = new OrderStatusEntity();
		BeanUtils.copyProperties(orderStatusModel, orderStatusEntity);
		return orderStatusEntity;
	}

	public PaymentStatusEntity modelToPaymentStatusEntity(PaymentStatusModel paymentStatusModel) {
		paymentStatusModel.setPaymentId(getId(paymentStatusModel.getPaymentId()));
		PaymentStatusEntity paymentStatusEntity = new PaymentStatusEntity();
		BeanUtils.copyProperties(paymentStatusModel, paymentStatusEntity);
		return paymentStatusEntity;
	}

	public ShipmentStatusEntity modelToShipmentStatusEntity(ShipmentStatusModel PaymentStatusModel) {
		PaymentStatusModel.setShipmentStatusId(PaymentStatusModel.getShipmentStatusId());
		ShipmentStatusEntity shipmentStatusEntity = new ShipmentStatusEntity();
		BeanUtils.copyProperties(PaymentStatusModel, shipmentStatusEntity);
		return shipmentStatusEntity;

	}

	public int getId(int id) {
		if (id <= 0) {
			id = UUID.randomUUID().hashCode();
		} else {
			throw new RuntimeException("id is not found" + id);
		}
		return id;
	}
}
