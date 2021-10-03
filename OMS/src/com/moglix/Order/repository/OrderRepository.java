package com.moglix.Order.repository;

import com.moglix.Order.dto.Orders;

public interface OrderRepository {
public String addOrder(Orders orders);
public String updateOrder(String id,Orders orders);
public Orders getOrderById(String id);
public Orders[] getOrder();
public String deleteOrderById(String id);
public void deleteAllOrders();


}
