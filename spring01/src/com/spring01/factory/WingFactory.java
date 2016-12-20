package com.spring01.factory;

import com.spring01.sercive.KfcWing;
import com.spring01.sercive.McdonldWing;
import com.spring01.sercive.Wing;

public class WingFactory {
              public static Wing getWing(String type){
            	  if("kfc".equals(type)){
            		  return new KfcWing();
            	  }else if("mcdonld".equals(type)){
            		  return new McdonldWing();
            	  }else{
            		  return null;
            	  }
              }
}
