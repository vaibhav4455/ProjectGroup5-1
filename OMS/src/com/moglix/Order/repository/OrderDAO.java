package com.moglix.Order.repository;

import com.moglix.Order.dto.Orders;

public class OrderDAO {
	private static int counter=0;
Orders orders[]=new Orders[10];
public String addOrder(Orders order) {
	if(counter<orders.length) {
		orders[counter++]=order;
		return "success";
	}
	else {
		return "array is full";
	}
}
public Orders getOrderById(String id) {
	for (Orders orders2 : orders) {
		if(id.equals(orders2.getOrderId()));{
		
		return orders2;
	}}
     return null;
}
public Orders[] getOrders() {
	return orders;
	
}
private int getIndex(String id) {
	for (int i = 0; i < orders.length; i++) {
		if(orders[i].getOrderId().equals(id)) {
			return i;
		}
	}
	 return -1;
}
public String deleteOrderById(String id) {
 
	//Orders orders=this.getOrderById(id);
	int index=this.getIndex(id);
	if(index!=-1) {
		orders[index]=null;
		return "success";
	}
	else {
		return "not found";
	}
}
public void deleteAllOrders() {
	orders=null;
	System.out.println("deleted");
	
}
public String updateOrders(String id,Orders order) {
int index=this.getIndex(id);
if(index!=-1) {
	orders[index]=null;
	return "success";
}
else {
	return "not found";
}

}
}
