package com.moglix.Order.servise;

import com.moglix.Order.dto.Orders;

public interface OrderserviceI {

	public String addOrder(Orders orders);
	public String updateOrder(String id,Orders orders);
	public Orders getOrderById(String id);
	public Orders[] getOrder();
	public String deleteOrderById(String id);
	public void deleteAllOrders();
}
