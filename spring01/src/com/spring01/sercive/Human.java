package com.spring01.sercive;

public class Human {
         private Axe axe;
         
         public void init(){
        	 System.out.println("ĥ��������������");
         }
         
         public void cutTree(){
        	axe.cut();
         }
         
         public void destroy(){
        	 System.out.println("����������������");
         }

		public void setAxe(Axe axe) {
			this.axe = axe;
		}
         
         
}
