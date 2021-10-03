package com.moglix.Order.servise;

import com.moglix.EMS.service.EmployeeServiceImpl;
import com.moglix.Order.dto.Orders;
import com.moglix.Order.repository.OrderRepository;

public class OrderserviceImpl implements OrderserviceI {
  
	private static OrderRepository orderRepository;
	
 private OrderserviceImpl() {
	// TODO Auto-generated constructor stub
	
}
 private static OrderserviceI getInstance() {
	 if(orderServiceI==null) {
			orderServiceI=new OrderServiceImpl();
			return orderServiceI;
			}
		else {
			return orderServiceI;
		}
 }
	@Override
	public String addOrder(Orders orders) {
		return orderDAO.addOrder(orders);
	}

	@Override
	public String updateOrder(String id, Orders orders) {
		return orderDAO.updateOrders(id, order);
	}

	@Override
	public Orders getOrderById(String id) {
		return orderDAO.getOrderById(id);
	}

	@Override
	public Orders[] getOrder() {
		return orderDAO.getOrders();
	}

	@Override
	public String deleteOrderById(String id) {
		return orderDAO.deleteOrderById(id);
	}

	@Override
	public void deleteAllOrders() {
		orderDAO.deleteAllOrders();

	}

}
