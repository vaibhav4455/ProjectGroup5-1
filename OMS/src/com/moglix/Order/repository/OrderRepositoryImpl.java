package com.moglix.Order.repository;

import com.moglix.EMS.repository.EmployeeRepositoryImpl;
import com.moglix.Order.dto.Orders;

public class OrderRepositoryImpl implements OrderRepository {
	
	private static int counter=0;
	private static OrderRepository orderRepository;
	private OrderRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
	private static OrderRepository getInstance() {
		
		if(orderRepository==null) {
			orderRepository=new OrderRepositoryImpl();
			return orderRepository;}
		else {
			return orderRepository;
		}
		
	}
	
Orders orders[]=new Orders[10];

	@Override
	public String addOrder(Orders orders) {
		if(counter<orders.length) {
			orders[counter++]=orders;
			return "success";
		}
		else 
			return "array is full";
		
	}
	private int getIndex(String id) {
		for (int i = 0; i < orders.length; i++) {
			if(orders[i].getOrderId().equals(id)) {
				return i;
			}
		}
		 return -1;
	}

	@Override
	public String updateOrder(String id, Orders orders) {
		int index=this.getIndex(id);
		if(index!=-1) {
			orders[index]=null;
			return "success";
		}
		else {
			return "not found";
		}

		}
	

	@Override
	public Orders getOrderById(String id) {
		for (Orders orders2 : orders) {
			if(id.equals(orders2.getOrderId()));{
			
			return orders2;
		}}
	     return null;
	}


	@Override
	public Orders[] getOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteOrderById(String id) {
		int index=this.getIndex(id);
		if(index!=-1) {
			orders[index]=null;
			return "success";
		}
		else {
			return "not found";
		}
	}

	@Override
	public void deleteAllOrders() {
		orders=null;

	}

}
