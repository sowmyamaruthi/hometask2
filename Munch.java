package com.epamwork.hometask;
import java.util.Map;
public class Munch implements Giftbox {
	public int calculateweight(int weight,int quantity) {
		return weight*quantity;
		}
		public void print(Map<String, Integer> map)
		    {
		        if (map.isEmpty()) {
		            System.out.println("map is empty");
		        }
		 
		        else {
		            System.out.println(map);
		        }
		    }
		}
