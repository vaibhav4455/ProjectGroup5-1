package com.moglix.OrderProject;

import com.moglix.Order.dto.Orders;
import com.moglix.Order.servise.OrderService;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderService orderService=new OrderService();
  Orders orders=new Orders();
  
  orders.setOrderId("001");
  orders.setInvId("002");
  orders.setProductId("pro001");
  orders.setProductQty("3");
  orders.setUserId("1001");
  orders.setGrandTotalPrice(1250);
  orders.setTotalPrice(1150);
  
  System.out.println(orders.getOrderId());
  System.out.println(orders.getInvId());
  System.out.println(orders.getProductId());
  System.out.println(orders.getProductQty());
  System.out.println(orders.getUserId());
  System.out.println(orders.getTotalPrice());
  System.out.println(orders.getGrandTotalPrice());
  
   String result=orderService.addOrder(orders);
  //s System.out.println(result);
   if(result.equals("success")) {
	   System.out.println("order added successfully");
   }
   else {
	   System.out.println("order not added");
   }
 
  Orders orders2=orderService.getOrderById("00001");
  if(orders2==null) {
	  System.out.println("order not exist");
  }
  else {
	  System.out.println("order found");
  }
  
  Orders order[]=orderService.getOrders();
  for (Orders orders3 : order) {
	if(orders3!=null) {
		System.out.println(orders3);
		System.out.println(orders3.toString());
	}
}
 
  //orderService.deleteAllOrders();
  String d=orderService.deleteOrderById("001");
  System.out.println(d);
 //s orderService.updateOrder("001", order);
  
	}

}
