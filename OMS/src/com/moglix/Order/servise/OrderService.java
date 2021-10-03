package com.moglix.Order.servise;

import com.moglix.Order.dto.Orders;
import com.moglix.Order.repository.OrderDAO;

public class OrderService {

	OrderDAO orderDAO=new OrderDAO();
	public String addOrder(Orders orders) {
		return orderDAO.addOrder(orders);
		
	}
	public Orders getOrderById(String id) {
		return orderDAO.getOrderById(id);
	}
	public Orders[] getOrders() {
		return orderDAO.getOrders();
		
	}
	public String deleteOrderById(String id) {
		return orderDAO.deleteOrderById(id);
		
	}
	public void deleteAllOrders() {
		orderDAO.deleteAllOrders();
		
	}
	public String updateOrder(String id,Orders order) {
		return orderDAO.updateOrders(id, order);
		
	}
}
