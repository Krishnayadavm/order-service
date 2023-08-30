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
public class OrdersModelMapper {

	public OrdersModel entityToOrdersModel(OrdersEntity ordersEntity) {
		ordersEntity.setOrderId(getId(ordersEntity.getOrderId()));
		OrdersModel ordersModel = new OrdersModel();
		BeanUtils.copyProperties(ordersModel, ordersModel);
	//	ordersModel.setOrderItemModelList(entityToOrderItemModels(ordersEntity.getOrderItemList()));
		ordersModel.setOrderItemModelList(entityToOrderItemModels(ordersEntity.getOrderItemList()));
		ordersModel.setOrderStatusModel(entityToOrderStatusModel(ordersEntity.getOrderStatusEntity()));
		ordersModel.setPaymentStatusModel(entityToPaymentStatusModel(ordersEntity.getPaymentStatusEntity()));
		ordersModel.setShipmentStatusModel(entityToShipmentStatusModel(ordersEntity.getShipmentStatusEntity()));
		return ordersModel;
	}

	public OrderItemModel entityToOrderItemModel(OrderItemEntity orderItemEntity) {
		orderItemEntity.setOrderItemId(orderItemEntity.getOrderItemId());
		OrderItemModel OrderItemModel = new OrderItemModel();
		BeanUtils.copyProperties(orderItemEntity, OrderItemModel);
		return OrderItemModel;
	}

	public List<OrderItemModel> entityToOrderItemModels(List<OrderItemEntity> orderEntities) {
		return orderEntities.stream().map(orderItemEntity -> entityToOrderItemModel(orderItemEntity))
				.collect(Collectors.toList());
	}

	public OrderStatusModel entityToOrderStatusModel(OrderStatusEntity orderStatusEntity) {
		orderStatusEntity.setOrderStatusId(getId(orderStatusEntity.getOrderStatusId()));
		OrderStatusModel orderStatusModel = new OrderStatusModel();
		BeanUtils.copyProperties(orderStatusEntity, orderStatusModel);
		return orderStatusModel;
	}

	public PaymentStatusModel entityToPaymentStatusModel(PaymentStatusEntity paymentStatusEntity) {
		paymentStatusEntity.setPaymentId(getId(paymentStatusEntity.getPaymentId()));
		PaymentStatusModel PaymentStatusModel = new PaymentStatusModel();
		BeanUtils.copyProperties(paymentStatusEntity, PaymentStatusModel);
		return PaymentStatusModel;
	}

	public ShipmentStatusModel entityToShipmentStatusModel(ShipmentStatusEntity ShipmentStatusEntity) {
		ShipmentStatusEntity.setShipmentStatusId(getId(ShipmentStatusEntity.getShipmentStatusId()));
		ShipmentStatusModel ShipmentStatusModel = new ShipmentStatusModel();
		BeanUtils.copyProperties(ShipmentStatusEntity, ShipmentStatusModel);
		return ShipmentStatusModel;
	}

	public int getId(int id) {
		if (id <= 0) {
			id = UUID.randomUUID().hashCode();
		} else {
			throw new RuntimeException("id is not found-->" + id);
		}
		return id;

	}
}
