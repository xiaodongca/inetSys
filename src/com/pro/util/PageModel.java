package com.pro.util;
import java.util.ArrayList;

public class PageModel<T> {

	// 放数据的集合
	ArrayList<T> arrayList = new ArrayList<T>();

	private static int jl;//当前位置
	
	// 当前页数
	private static int currentpage;
	// 总记录数
	private static int totalRecord;
	// 每页显示记录数
	private static int pagesize;

	public static int upPage() {//上一页
		if (currentpage <= 1) {
			return currentpage = 1;
		}
		return currentpage - 1;
	}

	public static int downPage() {//下一页
		if (currentpage >= totalPage()) {
			return currentpage = totalPage();
		}
		return currentpage + 1;
	}

	public static int homePage() {//首页
		return 1;
	}

	public static int pagecount() {// 总页数

		return (totalRecord + pagesize - 1) / pagesize;

	}

	public static int trailerPage() {//尾页
		return pagecount();
	}

	public static int skipPage(int tt) {//跳转
		return tt;
	}

	public static int totalPage() {

		return (totalRecord + pagesize - 1) / pagesize;

	}

	public ArrayList<T> getArrayList() {
		return arrayList;
	}

	public void setArrayList(ArrayList<T> arrayList) {
		this.arrayList = arrayList;
	}

	public static int getCurrentpage() {
		return currentpage;
	}

	public static void setCurrentpage(int currentpage) {
		PageModel.currentpage = currentpage;
	}

	public static int getTotalRecord() {
		return totalRecord;
	}

	public static void setTotalRecord(int totalRecord) {
		PageModel.totalRecord = totalRecord;
	}

	public static int getPagesize() {
		return pagesize;
	}

	public static void setPagesize(int pagesize) {
		PageModel.pagesize = pagesize;
	}

	public static int getJl() {
		return jl;
	}

	public static void setJl(int jl) {
		PageModel.jl = jl;
	}
	
}
