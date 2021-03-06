/*package com.team.cos.calendar.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Service;

import com.team.cos.calendar.Vo.calendarVo;

@Service
public class calendarViewService {

	public calendarVo viewCalendar(calendarVo vo) {
		List<Integer> arrayDay = new ArrayList<Integer>();
		Calendar cal = Calendar.getInstance();
		Calendar todayCal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		vo.setYear(cal.get(Calendar.YEAR));
		vo.setMonth(cal.get(Calendar.MONTH));
		vo.setDate(cal.get(Calendar.DATE));
		cal.set(vo.getYear(), vo.getMonth(), 1);
		vo.setStartDay(cal.getMinimum(Calendar.DATE));
		vo.setEndDay(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		vo.setStart(cal.get(Calendar.DAY_OF_WEEK)); // 요일 찾기 1부터 일요일 , 7 토요일
		
		vo.setToday(Integer.parseInt(sdf.format(todayCal.getTime())));
		
		for (int i = vo.getStartDay(); i <= vo.getEndDay(); i++) {
			arrayDay.add(i);
		}
		
		vo.setArrayDay(arrayDay);
		System.out.println(vo);
		return vo;
	}

	public calendarVo changePostCalendar(calendarVo vo) {
		List<Integer> arrayDay = new ArrayList<Integer>();
		Calendar cal = Calendar.getInstance();
		Calendar todayCal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		if (vo.getMonth() == 12) {
			vo.setYear(vo.getYear() + 1);
			vo.setMonth(0);
		}
		vo.setDate(cal.get(Calendar.DATE));
		
		cal.set(vo.getYear(), vo.getMonth(),1);
		
		vo.setStartDay(cal.getMinimum(Calendar.DATE));
		vo.setEndDay(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		vo.setStart(cal.get(Calendar.DAY_OF_WEEK));
		
		for (int i = vo.getStartDay(); i <= vo.getEndDay(); i++) {
			arrayDay.add(i);
		}
		
		vo.setArrayDay(arrayDay);
		vo.setToday(Integer.parseInt(sdf.format(todayCal.getTime())));
		return vo;
	}

	public calendarVo changePreCalendar(calendarVo vo) {
		List<Integer> arrayDay = new ArrayList<Integer>();
		Calendar cal = Calendar.getInstance();
		Calendar todayCal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		if (vo.getMonth() == -1) {
			vo.setYear(vo.getYear() - 1);
			vo.setMonth(11);
		}
		vo.setDate(cal.get(Calendar.DATE));
		
		cal.set(vo.getYear(), vo.getMonth(), 1);
		
		vo.setStartDay(cal.getMinimum(Calendar.DATE));
		vo.setEndDay(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		vo.setStart(cal.get(Calendar.DAY_OF_WEEK));
		
		for (int i = vo.getStartDay(); i <= vo.getEndDay(); i++) {
			arrayDay.add(i);
		}
		
		vo.setArrayDay(arrayDay);
		vo.setToday(Integer.parseInt(sdf.format(todayCal.getTime())));
		return vo;
	}
}
*/