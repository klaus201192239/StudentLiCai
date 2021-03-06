package com.bn.assets;

import android.graphics.Color;

public class Constant {
	public static final int DATE_DIALOG=0;
	public static final int DEL_DIALOG=1;
	public static final int DETAIL_DIALOG=2;
	public static final int CALCULATOR_DIALOG=3;
	public static final int MENU_DIALOG=4;
	public static final int TIXING_DIALOG=5;
	public static final int TITLE_DIALOG=6;
	public static final int TIME_DIALOG=7;
	public static final int CYCLE_DIALOG=8;
	public static final int MUSIC_DIALOG=9;
	final static String[] BELLNAME={"爱的罗曼史","天空之城","雨的印记"};//显示的铃声名称
	
	//理财宝典
	final static int P_MAIN=0;//主界面标志
	
	//计算器
	final static int P_JISUAN=1;//计算分支的主界面
	final static int P_FD_GJJ=2;//房贷的公基金计算界面
	final static int P_FD_SYDK=3;//房贷的商业贷款计算界面
	final static int P_FD_ZHX=4;//房贷的组合型计算界面
	final static int P_TQHK_SYDK=5;//商业贷款的提前还款计算界面
	final static int P_TQHU_GJJ=6;//商业贷款的公基金计算界面
	final static int P_HQCX=7;//活期储蓄计算界面
	final static int P_LCZQ=8;//零存整取计算界面
	final static int P_ZCZQ=9;//活期储蓄计算界面
	final static int P_ZCLQ=10;//零存整取计算界面
	
	//背景
	public static int BG_X=0;
	public static int BG_Y=0;
	//图片大小
	public static int PIC_WIDTH=80;
	public static int PIC_HEIGHT=90;
	//标题
	public static int LC_X=100;
	public static int LC_Y=20;
	public static final int DATE_INPUT_DIALOG_ID=1;
	//记账
	public static int JZ_X=36;
	public static int JZ_Y=75;
	//收支情况
	public static int SZ_X=186;
	public static int SZ_Y=75;
	//报表
	public static int BB_X=336;
	public static int BB_Y=75;
	//语音
	public static int YY_X=36;
	public static int YY_Y=265;
	//预算
	public static int YS_X=186;
	public static int YS_Y=265;
	//足迹
	public static int ZJ_X=336;
	public static int ZJ_Y=265;
	//计算
	public static int JS_X=36;
	public static int JS_Y=455;
	//提醒
	public static int TX_X=186;
	public static int TX_Y=455;
	//设置
	public static int SET_X=336;
	public static int SET_Y=455;
	
	//建议反馈
	public static int JY_X=36;
	public static int JY_Y=645;
	//退出
	public static int EXIT_X=186;
	public static int EXIT_Y=645;
	
	static String[] shourutj={"今日收入情况","本月收入情况",
                              "上月收入情况","前三个月收入情况",
                              "今年收入总情况","去年收入总情况","全部收入情况"};
    static String[] zhichutj={"今日支出情况","本月支出情况",
                              "上月支出情况","前三个月支出情况",
                              "今年支出总情况","去年支出总情况","全部支出情况"};
    static String[] shourukm={"职业收入","资产卖出","借贷收入","其他收入"};
    static String[] zhichukm={"饮食","交通","日常用品","通讯","衣服","教育"};
    static String[] fangshi={"我的现金","我的活期","我的信用卡"};
    static String[] szIds={"日常收入","日常支出"}; 
   
    static int []color={Color.RED,Color.BLUE };
    static int []color2={Color.RED,Color.BLACK };
    static String[] delayTime={"无延迟","2分钟","5分钟","10分钟","15分钟"};
    static String[] titleContent={"新建标题","交房租","还房贷","还车贷","水电费"};
}

