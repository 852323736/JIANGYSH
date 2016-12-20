package com.spring01.sercive;

public class Human {
         private Axe axe;
         
         public void init(){
        	 System.out.println("張見。。。。。。");
         }
         
         public void cutTree(){
        	axe.cut();
         }
         
         public void destroy(){
        	 System.out.println("潤崩。。。。。。");
         }

		public void setAxe(Axe axe) {
			this.axe = axe;
		}
         
         
}
