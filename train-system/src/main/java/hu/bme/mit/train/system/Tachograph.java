package hu.bme.mit.train.system;

import java.util.Date;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Tachograph {
	
	Table<Date, Integer, Integer> data = HashBasedTable.create();
	
	
	public void addData(Date time, int joyStick, Integer speed) {
		data.put(time, joyStick, speed);
	}
}
