package com.github.chengbin.core.constant;


import java.util.HashMap;
import java.util.Map;

public class PlayTypeNames
{
	// --------------------------- 排列三开始 ---------------------------------//
	public static final String PL3_DIRECT="直选定位";
	public static final String PL3_DIRECT_SINGLE="直选单式";
	public static final String PL3_DIRECT_POLY="直选复式";
	public static final String PL3_DIRECT_DRAW="直选胆拖";
	public static final String PL3_GROUP3="组三复式";
	public static final String PL3_GROUP6="组六复式";
	public static final String PL3_GROUP_SINGLE="组选单式";
	public static final String PL3_DIRECT_SUM="直选和值";
	public static final String PL3_GROUP_SUM="组选和值";

    //20170411新增
    public static final String PL3_GROUP3_SINGLE="组三单式";
    public static final String PL3_GROUP3_POLY="组三复式";
    public static final String PL3_GROUP6_SINGLE="组六单式";
    public static final String PL3_GROUP6_POLY="组六复式";

	public static final String PL3_COMBINATION="组合投注";

	// --------------------------- 排列五 ---------------------------------//

	public static final String PL5_SINGLE="排列五单式";
	public static final String PL5_POLY="排列五复式";
	public static final String PL5_COMBINATION="组合投注";

	public static final int PL5_SINGLE_CODE=9;
	public static final int PL5_POLY_CODE=10;
	public static final int PL5_COMBINATION_CODE=708;
	// 新加玩法
	public static final String PL3_KD_DIRECT="直选跨度";
	public static final String PL3_KD_GROUP3="组三跨度";
	public static final String PL3_KD_GROUP6="组六跨度";
	// 新加玩法2008-05-09
	public static final String PL3_GROUP3_DRAW="组3胆拖";
	public static final String PL3_GROUP6_DRAW="组6胆拖";
	public static final String PL3_GROUP3_SUM="组3和值";
	public static final String PL3_GROUP6_SUM="组6和值";

	public static final int PL3_DIRECT_CODE=0;
	public static final int PL3_DIRECT_SINGLE_CODE=1;
	public static final int PL3_DIRECT_POLY_CODE=2;
	public static final int PL3_DIRECT_DRAW_CODE=3;
	public static final int PL3_DIRECT_SUM_CODE=4;
	public static final int PL3_GROUP_SINGLE_CODE=5;
	public static final int PL3_GROUP3_CODE=6;
	public static final int PL3_GROUP6_CODE=7;
	public static final int PL3_GROUP_SUM_CODE=8;
    public static final int PL3_GROUP3_SINGLE_CODE=738;
    public static final int PL3_GROUP3_POLY_CODE=739;
    public static final int PL3_GROUP6_SINGLE_CODE=740;
    public static final int PL3_GROUP6_POLY_CODE=741;
	public static final int PL3_COMBINATION_CODE=11;
	// 新加玩法
	public static final int PL3_KD_DIRECT_CODE=116;
	public static final int PL3_KD_GROUP3_CODE=117;
	public static final int PL3_KD_GROUP6_CODE=118;
	// 新加玩法2008-05-09
	public static final int PL3_GROUP3_DRAW_CODE=168;
	public static final int PL3_GROUP6_DRAW_CODE=169;
	public static final int PL3_GROUP3_SUM_CODE=170;
	public static final int PL3_GROUP6_SUM_CODE=171;

	// --------------------------- 福彩3D ---------------------------------//
	public static final String THREED_DIRECT="单选定位";
	public static final String THREED_DIRECT_POLY="直选复式";
	public static final String THREED_DIRECT_SINGLE="直选单式";
	public static final String THREED_DIRECT_DRAW="单选胆拖";
	public static final String THREED_DIRECT_SUM="单选和值";
	public static final String THREED_GROUP3="组三复式";
	public static final String THREED_GROUP6="组六复式";
	public static final String THREED_GROUP_SINGLE="组选单式";
	public static final String THREED_GROUP_SUM="组选和值";
	public static final String THREED_KD_DIRECT="直选跨度";
	public static final String THREED_KD_GROUP3="组三跨度";
	public static final String THREED_KD_GROUP6="组六跨度";
	public static final String THREED_GROUP3_DRAW="组3胆拖";
	public static final String THREED_GROUP6_DRAW="组6胆拖";
	public static final String THREED_GROUP3_SUM="组3和值";
	public static final String THREED_GROUP6_SUM="组6和值";
	public static final String THREED_COMBINATION="组合投注";

	//20170411新增
	public static final String THREED_GROUP3_SINGLE="组三单式";
	public static final String THREED_GROUP3_POLY="组三复式";
	public static final String THREED_GROUP6_SINGLE="组六单式";
	public static final String THREED_GROUP6_POLY="组六复式";

	public static final int THREED_DIRECT_CODE=12;
	public static final int THREED_DIRECT_POLY_CODE=332;
	public static final int THREED_DIRECT_SINGLE_CODE=13;
	public static final int THREED_DIRECT_DRAW_CODE=14;
	public static final int THREED_DIRECT_SUM_CODE=15;

	public static final int THREED_GROUP3_CODE=16;
	public static final int THREED_GROUP6_CODE=17;
	public static final int THREED_GROUP_SINGLE_CODE=18;
	public static final int THREED_GROUP_SUM_CODE=19;
	public static final int THREED_KD_DIRECT_CODE=119;
	public static final int THREED_KD_GROUP3_CODE=120;
	public static final int THREED_KD_GROUP6_CODE=121;
	// 新加玩法2008-05-11
	public static final int THREED_GROUP3_DRAW_CODE=172;
	public static final int THREED_GROUP6_DRAW_CODE=173;
	public static final int THREED_GROUP3_SUM_CODE=174;
	public static final int THREED_GROUP6_SUM_CODE=175;

	public static final int THREED_GROUP3_SINGLE_CODE=748;
	public static final int THREED_GROUP3_POLY_CODE=749;
	public static final int THREED_GROUP6_SINGLE_CODE=750;
	public static final int THREED_GROUP6_POLY_CODE=751;

	public static final int THREED_COMBINATION_CODE=20;


	// --------------------------- 体彩6+1 ---------------------------------//

	public static final String ZJ7_SINGLE="单式";
	public static final String ZJ7_POLY="复式";
	public static final String ZJ7_COMBINATION="组合投注";
	public static final int ZJ7_SINGLE_CODE=21;
	public static final int ZJ7_POLY_CODE=22;
	public static final int ZJ7_COMBINATION_CODE=23;

	// --------------------------- 体彩5+1 ---------------------------------//
	public static final String ZJ51_SINGLE="单式";
	public static final String ZJ51_POLY="复式";
	public static final String ZJ51_COMBINATION="组合投注";
	public static final int ZJ51_SINGLE_CODE=47;
	public static final int ZJ51_POLY_CODE=48;
	public static final int ZJ51_COMBINATION_CODE=49;

	// --------------------------- 七星彩 ---------------------------------//
	public static final String STAR7_SINGLE="单式";
	public static final String STAR7_POLY="复式";
	public static final String STAR7_COMBINATION="组合投注";
	public static final int STAR7_SINGLE_CODE=44;
	public static final int STAR7_POLY_CODE=45;
	public static final int STAR7_COMBINATION_CODE=46;

	// --------------------------- 体彩20选5---------------------------------//
	public static final String ZJ205_SINGLE="单式";
	public static final String ZJ205_POLY="复式";
	public static final String ZJ205_DRAW="胆拖";
	public static final String ZJ205_COMBINATION="组合投注";
	public static final int ZJ205_SINGLE_CODE=24;
	public static final int ZJ205_POLY_CODE=25;
	public static final int ZJ205_DRAW_CODE=26;
	public static final int ZJ205_COMBINATION_CODE=27;

	// --------------------------- 福彩15选5 ---------------------------------//
	public static final String ZJ155_SINGLE="单式";
	public static final String ZJ155_POLY="复式";
	public static final String ZJ155_DRAW="胆拖";
	public static final String ZJ155_COMBINATION="组合投注";
	public static final int ZJ155_SINGLE_CODE=28;
	public static final int ZJ155_POLY_CODE=29;
	public static final int ZJ155_DRAW_CODE=30;
	public static final int ZJ155_COMBINATION_CODE=31;

	// --------------------------- 全国22选5 ---------------------------------//
	public static final String NAT225_SINGLE="单式";
	public static final String NAT225_POLY="复式";
	public static final String NAT225_DRAW="胆拖";
	public static final String NAT225_COMBINATION="组合投注";
	public static final int NAT225_SINGLE_CODE=32;
	public static final int NAT225_POLY_CODE=33;
	public static final int NAT225_DRAW_CODE=34;
	public static final int NAT225_COMBINATION_CODE=35;

	// --------------------------- 全国29选7 ---------------------------------//
	public static final String NAT297_SINGLE="单式";
	public static final String NAT297_POLY="复式";
	public static final String NAT297_DRAW="胆拖";
	public static final String NAT297_COMBINATION="组合投注";
	public static final int NAT297_SINGLE_CODE=36;
	public static final int NAT297_POLY_CODE=37;
	public static final int NAT297_DRAW_CODE=38;
	public static final int NAT297_COMBINATION_CODE=39;

	// --------------------------- 七乐彩 ---------------------------------//
	public static final String HAPPY7_SINGLE="单式";
	public static final String HAPPY7_POLY="复式";
	public static final String HAPPY7_DRAW="胆拖";
	public static final String HAPPY7_COMBINATION="组合投注";
	public static final int HAPPY7_SINGLE_CODE=40;
	public static final int HAPPY7_POLY_CODE=41;
	public static final int HAPPY7_DRAW_CODE=42;
	public static final int HAPPY7_COMBINATION_CODE=43;

	// --------------------------- 超级大乐透 ---------------------------------//
	public static final String LOTTO_SINGLE="单式";
	public static final String LOTTO_POLY="复式";
	public static final String LOTTO_DRAW="胆拖";
	public static final String LOTTO_ANIMAL_SINGLE="生肖乐单式";
	public static final String LOTTO_ANIMAL_POLY="生肖乐复式";
	public static final String LOTTO_COMBINATION="组合投注";
	public static final int LOTTO_SINGLE_CODE=54;
	public static final int LOTTO_POLY_CODE=55;
	public static final int LOTTO_DRAW_CODE=56;
	public static final int LOTTO_ANIMAL_SINGLE_CODE=57;
	public static final int LOTTO_ANIMAL_POLY_CODE=58;
	public static final int LOTTO_COMBINATION_CODE=59;

	// --------------------------- 双色球 ---------------------------------//
	public static final String DCBALL_SINGLE="单式";
	public static final String DCBALL_POLY="复式";
	public static final String DCBALL_DRAW="胆拖";
	public static final String DCBALL_COMBINATION="组合投注";
	public static final int DCBALL_SINGLE_CODE=50;
	public static final int DCBALL_POLY_CODE=51;
	public static final int DCBALL_DRAW_CODE=52;
	public static final int DCBALL_COMBINATION_CODE=53;

	// --------------------------- 东方大热透 ---------------------------------//
	public static final String ORIENT_LOTTO_SINGLE="单式";
	public static final String ORIENT_LOTTO_POLY="复式";
	public static final String ORIENT_LOTTO_DRAW="胆拖";
	public static final String ORIENT_COMBINATION="组合投注";
	public static final int ORIENT_LOTTO_SINGLE_CODE=60;
	public static final int ORIENT_LOTTO_POLY_CODE=61;
	public static final int ORIENT_LOTTO_DRAW_CODE=62;
	public static final int ORIENT_COMBINATION_CODE=63;

	// --------------------------- 时时乐 ---------------------------------//
	public static final String SSL_DIRECT="直选定位";
	public static final String SSL_DIRECT_SINGLE="直选单式";
	public static final String SSL_DIRECT_POLY="直选复式";
	public static final String SSL_DIRECT_SUM="直选和值";
	public static final String SSL_DIRECT_DRAW="直选胆拖";
	public static final String SSL_DIRECT_ALL="直选包号";
	public static final String SSL_GROUP3="组三复式";
	public static final String SSL_GROUP6="组六复式";
	public static final String SSL_GROUP_SINGLE="组选单式";
	public static final String SSL_GROUP_SUM="组选和值";
	public static final String SSL_FRONT_ONE="前一复式";
	public static final String SSL_FRONT_TWO="前二复式";
	public static final String SSL_FRONT_TWO_ALL="前二包号";
	public static final String SSL_FRONT_TWO_SINGLE="前二单式";
	public static final String SSL_AFTER_ONE="后一复式";
	public static final String SSL_AFTER_TWO="后二复式";
	public static final String SSL_AFTER_TWO_ALL="后二包号";
	public static final String SSL_AFTER_TWO_SINGLE="后二单式";
	public static final String SSL_COMBINATION="组合投注";
	public static final int SSL_DIRECT_CODE=64;
	public static final int SSL_DIRECT_SINGLE_CODE=65;
	public static final int SSL_DIRECT_POLY_CODE=66;
	public static final int SSL_DIRECT_SUM_CODE=67;
	public static final int SSL_DIRECT_DRAW_CODE=68;
	public static final int SSL_DIRECT_ALL_CODE=69;
	public static final int SSL_GROUP3_CODE=70;
	public static final int SSL_GROUP6_CODE=71;
	public static final int SSL_GROUP_SINGLE_CODE=72;
	public static final int SSL_FRONT_ONE_CODE=73;
	public static final int SSL_FRONT_TWO_CODE=74;
	public static final int SSL_FRONT_TWO_ALL_CODE=75;
	public static final int SSL_FRONT_TWO_SINGLE_CODE=76;
	public static final int SSL_AFTER_ONE_CODE=77;
	public static final int SSL_AFTER_TWO_CODE=78;
	public static final int SSL_AFTER_TWO_ALL_CODE=79;
	public static final int SSL_AFTER_TWO_SINGLE_CODE=80;
	public static final int SSL_GROUP_SUM_CODE=81;
	public static final int SSL_COMBINATION_CODE=82;

	// --------------------------- 十四场 (胜负彩)---------------------------------//
	public static final String TOTO14_SINGLE="单式";
	public static final String TOTO14_POLY="复式";
	public static final int TOTO14_SINGLE_CODE=83;
	public static final int TOTO14_POLY_CODE=84;

	// --------------------------- 九场(任选九场) ---------------------------------//
	public static final String TOTO9_SINGLE="单式";
	public static final String TOTO9_POLY="复式";
	public static final String TOTO9_DRAW="胆拖";
	public static final int TOTO9_SINGLE_CODE=85;
	public static final int TOTO9_POLY_CODE=86;
	public static final int TOTO9_DRAW_CODE=236;

	// --------------------------- 六场 ---------------------------------//
	public static final String TOTO6_SINGLE="单式";
	public static final String TOTO6_POLY="复式";
	public static final int TOTO6_SINGLE_CODE=87;
	public static final int TOTO6_POLY_CODE=88;

	// --------------------------- 四场 ---------------------------------//
	public static final String GOAL4_SINGLE="单式";
	public static final String GOAL4_POLY="复式";
	public static final int GOAL4_SINGLE_CODE=89;
	public static final int GOAL4_POLY_CODE=90;

	public static final String SSC_FIVE_STAR_POLY="五星复式";
	public static final String SSC_FIVE_STAR_SINGLE="五星单式";
	public static final String SSC_THREE_STAR_POLY="三星复式";
	public static final String SSC_THREE_STAR_SINGLE="三星单式";
	public static final String SSC_THREE_STAR_SUM="三星和值";
	public static final String SSC_THREE_STAR_DRAW="三星胆拖";
	public static final String SSC_TWO_STAR_DIRECT_POLY="二星直选复式";
	public static final String SSC_TWO_STAR_DIRECT_SINGLE="二星直选单式";
	public static final String SSC_TWO_STAR_DIRECT_SUM="二星直选和值";
	public static final String SSC_TWO_STAR_GROUP_POLY="二星组选复式";
	public static final String SSC_TWO_STAR_GROUP_SINGLE="二星组选单式";
	public static final String SSC_TWO_STAR_GROUP_SUM="二星组选和值";
	public static final String SSC_TWO_STAR_GROUP_DRAW="二星组选胆拖";
	public static final String SSC_ONE_STAR_ONE="一星";
	public static final String SSC_DXDS="大小单双";
	public static final String SSC_FIVE_STAR_ALL_POLY="五星通选复式";
	public static final String SSC_FIVE_STAR_ALL_SINGLE="五星通选单式";
	// 新增玩法
	public static final String SSC_THREE_STAR_GROUP3_POLY="三星组三复式";
	public static final String SSC_THREE_STAR_GROUP6_POLY="三星组六复式";
	public static final String SSC_THREE_STAR_GROUP_SUM="三星组选和值";
	public static final String SSC_THREE_STAR_GROUP_SINGLE="三星组选单式";

	public static final String SSC_GROUP3_DRAW="三星组三胆拖";
	public static final String SSC_GROUP6_DRAW="三星组六胆拖";
	public static final String SSC_COMBINATION="组合投注";

	public static final int SSC_FIVE_STAR_POLY_CODE=91;
	public static final int SSC_FIVE_STAR_SINGLE_CODE=92;
	public static final int SSC_THREE_STAR_POLY_CODE=93;
	public static final int SSC_THREE_STAR_SINGLE_CODE=94;
	public static final int SSC_THREE_STAR_SUM_CODE=95;
	public static final int SSC_THREE_STAR_DRAW_CODE=96;
	public static final int SSC_TWO_STAR_DIRECT_POLY_CODE=97;
	public static final int SSC_TWO_STAR_DIRECT_SINGLE_CODE=98;
	public static final int SSC_TWO_STAR_DIRECT_SUM_CODE=99;
	public static final int SSC_TWO_STAR_GROUP_POLY_CODE=100;
	public static final int SSC_TWO_STAR_GROUP_SINGLE_CODE=101;
	public static final int SSC_TWO_STAR_GROUP_SUM_CODE=102;
	public static final int SSC_TWO_STAR_GROUP_DRAW_CODE=103;
	public static final int SSC_ONE_STAR_ONE_CODE=104;
	public static final int SSC_DXDS_CODE=105;
	public static final int SSC_FIVE_STAR_ALL_POLY_CODE=106;
	public static final int SSC_FIVE_STAR_ALL_SINGLE_CODE=107;
	// 新增玩法
	public static final int SSC_THREE_STAR_GROUP3_POLY_CODE=126;
	public static final int SSC_THREE_STAR_GROUP6_POLY_CODE=127;
	public static final int SSC_THREE_STAR_GROUP_SUM_CODE=128;
	public static final int SSC_THREE_STAR_GROUP_SINGLE_CODE=129;

	public static final int SSC_GROUP3_DRAW_CODE=522;
	public static final int SSC_GROUP6_DRAW_CODE=523;

	public static final int SSC_COMBINATION_CODE=108;


	// --------------------------- 东方6+1 ---------------------------------//
	public static final String FC61_POLY="复式";
	public static final String FC61_SINGLE="单式";
	public static final String FC61_COMBINATION="组合投注";
	public static final int FC61_POLY_CODE=109;
	public static final int FC61_SINGLE_CODE=110;
	public static final int FC61_COMBINATION_CODE=111;

	// --------------------------- 浙江29选7 ---------------------------------//
	public static final String ZJ297_SINGLE="单式";
	public static final String ZJ297_POLY="复式";
	public static final String ZJ297_DRAW="胆拖";
	public static final String ZJ297_COMBINATION="组合投注";
	public static final int ZJ297_SINGLE_CODE=112;
	public static final int ZJ297_POLY_CODE=113;
	public static final int ZJ297_DRAW_CODE=114;
	public static final int ZJ297_COMBINATION_CODE=115;

	// --------------------------- 奖牌连连猜 ---------------------------------//
	public static final String JPLLC_SINGLE="单式";
	public static final String JPLLC_POLY="复式";
	public static final String JPLLC_DRAW="胆拖";
	public static final String JPLLC_COMBINATION="组合投注";
	public static final int JPLLC_SINGLE_CODE=122;
	public static final int JPLLC_POLY_CODE=123;
	public static final int JPLLC_DRAW_CODE=124;
	public static final int JPLLC_COMBINATION_CODE=125;

	// --------------------------- 山东11选5（十一运夺金） ---------------------------------//
	public static final String SD115_ONE_SINGLE="任选一单式";
	public static final String SD115_ONE_POLY="任选一复式";
	public static final String SD115_TWO_SINGLE="任选二单式";
	public static final String SD115_TWO_POLY="任选二复式";
	public static final String SD115_THREE_SINGLE="任选三单式";
	public static final String SD115_THREE_POLY="任选三复式";
	public static final String SD115_FOUR_SINGLE="任选四单式";
	public static final String SD115_FOUR_POLY="任选四复式";
	public static final String SD115_FIVE_SINGLE="任选五单式";
	public static final String SD115_FIVE_POLY="任选五复式";
	public static final String SD115_SIX_SINGLE="任选六单式";
	public static final String SD115_SIX_POLY="任选六复式";
	public static final String SD115_SEVEN_SINGLE="任选七单式";
	public static final String SD115_SEVEN_POLY="任选七复式";
	public static final String SD115_EIGHT_SINGLE="任选八单式";
	public static final String SD115_EIGHT_POLY="任选八复式";
	public static final String SD115_ONE_DIRECT_SINGLE="前一直选单式";
	public static final String SD115_ONE_DIRECT_POLY="前一直选复式";
	public static final String SD115_TWO_DIRECT_SINGLE="前二直选单式";
	public static final String SD115_TWO_DIRECT_POLY="前二直选复式";
	public static final String SD115_TWO_GROUP_SINGLE="前二组选单式";
	public static final String SD115_TWO_GROUP_POLY="前二组选复式";
	public static final String SD115_THREE_DIRECT_SINGLE="前三直选单式";
	public static final String SD115_THREE_DIRECT_POLY="前三直选复式";
	public static final String SD115_THREE_GROUP_SINGLE="前三组选单式";
	public static final String SD115_THREE_GROUP_POLY="前三组选复式";

	public static final String SD115_TWO_DRAW="任选二胆拖";
	public static final String SD115_TWO_DIRECT="前二直选定位复式";
	public static final String SD115_THREE_DRAW="任选三胆拖";
	public static final String SD115_THREE_DIRECT="前三直选定位复式";
	public static final String SD115_THREE_DIRECT_SUM="前三直选和值";
	public static final String SD115_THREE_GROUP_SUM="前三组选和值";
	public static final String SD115_FOUR_DRAW="任选四胆拖";
	public static final String SD115_FIVE_DRAW="任选五胆拖";
	public static final String SD115_SIX_DRAW="任选六胆拖";
	public static final String SD115_SEVEN_DRAW="任选七胆拖";
	public static final String SD115_EIGHT_DRAW="任选八胆拖";
	// 2009-05-07添加的玩法
	public static final String SD115_TWO_DIRECT_DRAW="前二直选胆拖";
	public static final String SD115_TWO_GROUP_DRAW="前二组选胆拖";
	public static final String SD115_THREE_DIRECT_DRAW="前三直选胆拖";
	public static final String SD115_THREE_GROUP_DRAW="前三组选胆拖";
	public static final String SD115_COMBINATION="组合投注";

	public static final int SD115_ONE_SINGLE_CODE=130;
	public static final int SD115_ONE_POLY_CODE=131;
	public static final int SD115_TWO_SINGLE_CODE=132;
	public static final int SD115_TWO_POLY_CODE=133;
	public static final int SD115_TWO_DRAW_CODE=134;
	public static final int SD115_ONE_DIRECT_SINGLE_CODE=752;
	public static final int SD115_ONE_DIRECT_POLY_CODE=753;
	public static final int SD115_TWO_DIRECT_SINGLE_CODE=135;
	public static final int SD115_TWO_DIRECT_POLY_CODE=136;
	public static final int SD115_TWO_DIRECT_CODE=137;
	public static final int SD115_TWO_GROUP_SINGLE_CODE=138;
	public static final int SD115_TWO_GROUP_POLY_CODE=139;
	public static final int SD115_THREE_SINGLE_CODE=140;
	public static final int SD115_THREE_POLY_CODE=141;
	public static final int SD115_THREE_DRAW_CODE=142;
	public static final int SD115_THREE_DIRECT_SINGLE_CODE=143;
	public static final int SD115_THREE_DIRECT_POLY_CODE=144;
	public static final int SD115_THREE_DIRECT_CODE=145;
	public static final int SD115_THREE_DIRECT_SUM_CODE=176;
	public static final int SD115_THREE_GROUP_SINGLE_CODE=146;
	public static final int SD115_THREE_GROUP_POLY_CODE=147;
	public static final int SD115_THREE_GROUP_SUM_CODE=177;
	public static final int SD115_FOUR_SINGLE_CODE=148;
	public static final int SD115_FOUR_POLY_CODE=149;
	public static final int SD115_FOUR_DRAW_CODE=150;
	public static final int SD115_FIVE_SINGLE_CODE=151;
	public static final int SD115_FIVE_POLY_CODE=152;
	public static final int SD115_FIVE_DRAW_CODE=153;
	public static final int SD115_SIX_SINGLE_CODE=154;
	public static final int SD115_SIX_POLY_CODE=155;
	public static final int SD115_SIX_DRAW_CODE=156;
	public static final int SD115_SEVEN_SINGLE_CODE=157;
	public static final int SD115_SEVEN_POLY_CODE=158;
	public static final int SD115_SEVEN_DRAW_CODE=159;
	public static final int SD115_EIGHT_SINGLE_CODE=160;
	public static final int SD115_EIGHT_POLY_CODE=161;
	public static final int SD115_EIGHT_DRAW_CODE=162;
	public static final int SD115_TWO_DIRECT_DRAW_CODE=164;
	public static final int SD115_TWO_GROUP_DRAW_CODE=165;
	public static final int SD115_THREE_DIRECT_DRAW_CODE=166;
	public static final int SD115_THREE_GROUP_DRAW_CODE=167;

	public static final int SD115_COMBINATION_CODE=163;

	// --------------------------- 上海11选5 ---------------------------------//
	public static final String SH115_ONE_SINGLE = "任选一单式";
	public static final String SH115_ONE_POLY = "任选一复式";
	public static final String SH115_ONE_DIRECT_SINGLE = "前一直选单式";
	public static final String SH115_ONE_DIRECT_POLY = "前一直选复式";
	public static final String SH115_TWO_SINGLE = "任选二单式";
	public static final String SH115_TWO_POLY = "任选二复式";
	public static final String SH115_TWO_DRAW = "任选二胆拖";
	public static final String SH115_TWO_DIRECT_SINGLE = "前二直选单式";
	public static final String SH115_TWO_DIRECT_POLY = "前二直选复式";
	public static final String SH115_TWO_DIRECT = "前二直选定位复式";
	public static final String SH115_TWO_GROUP_SINGLE = "前二组选单式";
	public static final String SH115_TWO_GROUP_POLY = "前二组选复式";
	public static final String SH115_THREE_SINGLE = "任选三单式";
	public static final String SH115_THREE_POLY = "任选三复式";
	public static final String SH115_THREE_DRAW = "任选三胆拖";
	public static final String SH115_THREE_DIRECT_SINGLE = "前三直选单式";
	public static final String SH115_THREE_DIRECT_POLY = "前三直选复式";
	public static final String SH115_THREE_DIRECT = "前三直选定位复式";
	public static final String SH115_THREE_DIRECT_SUM = "前三直选和值";
	public static final String SH115_THREE_GROUP_SINGLE = "前三组选单式";
	public static final String SH115_THREE_GROUP_POLY = "前三组选复式";
	public static final String SH115_THREE_GROUP_SUM = "前三组选和值";
	public static final String SH115_FOUR_SINGLE = "任选四单式";
	public static final String SH115_FOUR_POLY = "任选四复式";
	public static final String SH115_FOUR_DRAW = "任选四胆拖";
	public static final String SH115_FIVE_SINGLE = "任选五单式";
	public static final String SH115_FIVE_POLY = "任选五复式";
	public static final String SH115_FIVE_DRAW = "任选五胆拖";
	public static final String SH115_SIX_SINGLE = "任选六单式";
	public static final String SH115_SIX_POLY = "任选六复式";
	public static final String SH115_SIX_DRAW = "任选六胆拖";
	public static final String SH115_SEVEN_SINGLE = "任选七单式";
	public static final String SH115_SEVEN_POLY = "任选七复式";
	public static final String SH115_SEVEN_DRAW = "任选七胆拖";
	public static final String SH115_EIGHT_SINGLE = "任选八单式";
	public static final String SH115_EIGHT_POLY = "任选八复式";
	public static final String SH115_EIGHT_DRAW = "任选八胆拖";
	public static final String SH115_TWO_DIRECT_DRAW = "前二直选胆拖";
	public static final String SH115_TWO_GROUP_DRAW = "前二组选胆拖";
	public static final String SH115_THREE_DIRECT_DRAW = "前三直选胆拖";
	public static final String SH115_THREE_GROUP_DRAW = "前三组选胆拖";
	public static final String SH115_COMBINATION = "组合投注";
	// --------------------------- 上海11选5 ---------------------------------//
	public static final int SH115_ONE_SINGLE_CODE = 630;
	public static final int SH115_ONE_POLY_CODE = 631;
	public static final int SH115_ONE_DIRECT_SINGLE_CODE = 668;
	public static final int SH115_ONE_DIRECT_POLY_CODE = 669;
	public static final int SH115_TWO_SINGLE_CODE = 632;
	public static final int SH115_TWO_POLY_CODE = 633;
	public static final int SH115_TWO_DRAW_CODE = 634;
	public static final int SH115_TWO_DIRECT_SINGLE_CODE = 635;
	public static final int SH115_TWO_DIRECT_POLY_CODE = 636;
	public static final int SH115_TWO_DIRECT_CODE = 637;
	public static final int SH115_TWO_GROUP_SINGLE_CODE = 638;
	public static final int SH115_TWO_GROUP_POLY_CODE = 639;
	public static final int SH115_THREE_SINGLE_CODE = 640;
	public static final int SH115_THREE_POLY_CODE = 641;
	public static final int SH115_THREE_DRAW_CODE = 642;
	public static final int SH115_THREE_DIRECT_SINGLE_CODE = 643;
	public static final int SH115_THREE_DIRECT_POLY_CODE = 644;
	public static final int SH115_THREE_DIRECT_CODE = 645;
	public static final int SH115_THREE_DIRECT_SUM_CODE = 676;
	public static final int SH115_THREE_GROUP_SINGLE_CODE = 646;
	public static final int SH115_THREE_GROUP_POLY_CODE = 647;
	public static final int SH115_THREE_GROUP_SUM_CODE = 677;
	public static final int SH115_FOUR_SINGLE_CODE = 648;
	public static final int SH115_FOUR_POLY_CODE = 649;
	public static final int SH115_FOUR_DRAW_CODE = 650;
	public static final int SH115_FIVE_SINGLE_CODE = 651;
	public static final int SH115_FIVE_POLY_CODE = 652;
	public static final int SH115_FIVE_DRAW_CODE = 653;
	public static final int SH115_SIX_SINGLE_CODE = 654;
	public static final int SH115_SIX_POLY_CODE = 655;
	public static final int SH115_SIX_DRAW_CODE = 656;
	public static final int SH115_SEVEN_SINGLE_CODE = 657;
	public static final int SH115_SEVEN_POLY_CODE = 658;
	public static final int SH115_SEVEN_DRAW_CODE = 659;
	public static final int SH115_EIGHT_SINGLE_CODE = 660;
	public static final int SH115_EIGHT_POLY_CODE = 661;
	public static final int SH115_EIGHT_DRAW_CODE = 662;
	public static final int SH115_TWO_DIRECT_DRAW_CODE = 664;
	public static final int SH115_TWO_GROUP_DRAW_CODE = 665;
	public static final int SH115_THREE_DIRECT_DRAW_CODE = 666;
	public static final int SH115_THREE_GROUP_DRAW_CODE = 667;
	public static final int SH115_COMBINATION_CODE = 663;

	// --------------------------- 重庆快乐十分 ---------------------------------//
	public static final String CQKL10_ONE_DIRECT_SINGLE = "前一数投";
	public static final String CQKL10_ONE_POLY = "前一数投复式";
	public static final String CQKL10_ONE_RED = "前一红投";
	public static final String CQKL10_TWO_GROUP = "连二组选单式";
	public static final String CQKL10_TWO_GROUP_POLY = "连二组选复式";
	public static final String CQKL10_TWO_GROUP_DRAW = "连二组选胆拖";
	public static final String CQKL10_TWO_DIRECT = "连二直选定位";
	public static final String CQKL10_TWO_DIRECT_SINGLE = "连二直选单式";
	public static final String CQKL10_TWO_DIRECT_DRAW = "连二直选胆拖";
	public static final String CQKL10_THREE_GROUP = "前三组选单式";
	public static final String CQKL10_THREE_GROUP_POLY = "前三组选复式";
	public static final String CQKL10_THREE_GROUP_DRAW = "前三组选胆拖";
	public static final String CQKL10_THREE_DIRECT = "前三直选定位";
	public static final String CQKL10_THREE_DIRECT_SINGLE = "前三直选单式";
	public static final String CQKL10_THREE_DIRECT_DRAW = "前三直选胆拖";
	public static final String CQKL10_TWO_SINGLE = "任选二单式";
	public static final String CQKL10_TWO_POLY = "任选二复式";
	public static final String CQKL10_TWO_DRAW = "任选二胆拖";
	public static final String CQKL10_THREE_SINGLE = "任选三单式";
	public static final String CQKL10_THREE_POLY = "任选三复式";
	public static final String CQKL10_THREE_DRAW = "任选三胆拖";
	public static final String CQKL10_FOUR_SINGLE = "任选四单式";
	public static final String CQKL10_FOUR_POLY = "任选四复式";
	public static final String CQKL10_FOUR_DRAW = "任选四胆拖";
	public static final String CQKL10_FIVE_SINGLE = "任选五单式";
	public static final String CQKL10_FIVE_POLY = "任选五复式";
	public static final String CQKL10_FIVE_DRAW = "任选五胆拖";
	public static final String CQKL10_COMBINATION = "组合投注";

	public static final int CQKL10_ONE_DIRECT_SINGLE_CODE = 451;
	public static final int CQKL10_ONE_POLY_CODE = 452;
	public static final int CQKL10_ONE_RED_CODE = 453;
	public static final int CQKL10_TWO_GROUP_CODE = 454;
	public static final int CQKL10_TWO_GROUP_POLY_CODE = 455;
	public static final int CQKL10_TWO_GROUP_DRAW_CODE = 456;
	public static final int CQKL10_TWO_DIRECT_CODE = 457;
	public static final int CQKL10_TWO_DIRECT_SINGLE_CODE = 458;
	public static final int CQKL10_TWO_DIRECT_DRAW_CODE = 459;
	public static final int CQKL10_THREE_GROUP_CODE = 460;
	public static final int CQKL10_THREE_GROUP_POLY_CODE = 461;
	public static final int CQKL10_THREE_GROUP_DRAW_CODE = 462;
	public static final int CQKL10_THREE_DIRECT_CODE = 463;
	public static final int CQKL10_THREE_DIRECT_SINGLE_CODE = 464;
	public static final int CQKL10_THREE_DIRECT_DRAW_CODE = 465;
	public static final int CQKL10_TWO_SINGLE_CODE = 466;
	public static final int CQKL10_TWO_POLY_CODE = 467;
	public static final int CQKL10_TWO_DRAW_CODE = 468;
	public static final int CQKL10_THREE_SINGLE_CODE = 469;
	public static final int CQKL10_THREE_POLY_CODE = 470;
	public static final int CQKL10_THREE_DRAW_CODE = 480;
	public static final int CQKL10_FOUR_SINGLE_CODE = 481;
	public static final int CQKL10_FOUR_POLY_CODE = 482;
	public static final int CQKL10_FOUR_DRAW_CODE = 483;
	public static final int CQKL10_FIVE_SINGLE_CODE = 484;
	public static final int CQKL10_FIVE_POLY_CODE = 485;
	public static final int CQKL10_FIVE_DRAW_CODE = 486;
	public static final int CQKL10_COMBINATION_CODE = 450;

	// --------------------------- 山东群英会 ---------------------------------//
	public static final String SD235_SHUN_THREE_POLY="顺三复式";
	public static final String SD235_SHUN_THREE_DIRECT_POLY="顺三定位复式";
	public static final String SD235_SHUN_THREE_SINGLE="顺三单式";
	public static final String SD235_SHUN_THREE_DRAW="顺三胆拖";
	public static final String SD235_SHUN_TWO_POLY="顺二复式";
	public static final String SD235_SHUN_TWO_DIRECT_POLY="顺二定位复式";
	public static final String SD235_SHUN_TWO_SINGLE="顺二单式";
	public static final String SD235_SHUN_TWO_DRAW="顺二胆拖";
	public static final String SD235_SHUN_ONE_POLY="顺一复式";
	public static final String SD235_SHUN_ONE_SINGLE="顺一单式";
	public static final String SD235_WEI_FOUR_POLY="围四复式";
	public static final String SD235_WEI_FOUR_SINGLE="围四单式";
	public static final String SD235_WEI_FOUR_DRAW="围四胆拖";
	public static final String SD235_WEI_THREE_POLY="围三复式";
	public static final String SD235_WEI_THREE_SINGLE="围三单式";
	public static final String SD235_WEI_THREE_DRAW="围三胆拖";
	public static final String SD235_WEI_TWO_POLY="围二复式";
	public static final String SD235_WEI_TWO_SINGLE="围二单式";
	public static final String SD235_WEI_TWO_DRAW="围二胆拖";
	public static final String SD235_REN_TEN_POLY="任选十复式";
	public static final String SD235_REN_TEN_SINGLE="任选十单式";
	public static final String SD235_REN_TEN_DRAW="任选十胆拖";
	public static final String SD235_REN_NINE_POLY="任选九复式";
	public static final String SD235_REN_NINE_SINGLE="任选九单式";
	public static final String SD235_REN_NINE_DRAW="任选九胆拖";
	public static final String SD235_REN_EIGHT_POLY="任选八复式";
	public static final String SD235_REN_EIGHT_SINGLE="任选八单式";
	public static final String SD235_REN_EIGHT_DRAW="任选八胆拖";
	public static final String SD235_REN_SEVEN_POLY="任选七复式";
	public static final String SD235_REN_SEVEN_SINGLE="任选七单式";
	public static final String SD235_REN_SEVEN_DRAW="任选七胆拖";
	public static final String SD235_REN_SIX_POLY="任选六复式";
	public static final String SD235_REN_SIX_SINGLE="任选六单式";
	public static final String SD235_REN_SIX_DRAW="任选六胆拖";
	public static final String SD235_REN_FIVE_POLY="任选五复式";
	public static final String SD235_REN_FIVE_SINGLE="任选五单式";
	public static final String SD235_REN_FIVE_DRAW="任选五胆拖";
	public static final String SD235_REN_FOUR_POLY="任选四复式";
	public static final String SD235_REN_FOUR_SINGLE="任选四单式";
	public static final String SD235_REN_FOUR_DRAW="任选四胆拖";
	public static final String SD235_REN_THREE_POLY="任选三复式";
	public static final String SD235_REN_THREE_SINGLE="任选三单式";
	public static final String SD235_REN_THREE_DRAW="任选三胆拖";
	public static final String SD235_REN_TWO_POLY="任选二复式";
	public static final String SD235_REN_TWO_SINGLE="任选二单式";
	public static final String SD235_REN_TWO_DRAW="任选二胆拖";
	public static final String SD235_REN_ONE_POLY="任选一复式";
	public static final String SD235_REN_ONE_SINGLE="任选一单式";
	public static final String SD235_COMBINATION="组合投注";

	public static final int SD235_SHUN_THREE_POLY_CODE=178;
	public static final int SD235_SHUN_THREE_DIRECT_POLY_CODE=229;
	public static final int SD235_SHUN_THREE_SINGLE_CODE=179;
	public static final int SD235_SHUN_THREE_DRAW_CODE=180;
	public static final int SD235_SHUN_TWO_POLY_CODE=181;
	public static final int SD235_SHUN_TWO_DIRECT_POLY_CODE=230;
	public static final int SD235_SHUN_TWO_SINGLE_CODE=182;
	public static final int SD235_SHUN_TWO_DRAW_CODE=183;
	public static final int SD235_SHUN_ONE_POLY_CODE=184;
	public static final int SD235_SHUN_ONE_SINGLE_CODE=185;
	public static final int SD235_WEI_FOUR_POLY_CODE=186;
	public static final int SD235_WEI_FOUR_SINGLE_CODE=187;
	public static final int SD235_WEI_FOUR_DRAW_CODE=188;
	public static final int SD235_WEI_THREE_POLY_CODE=189;
	public static final int SD235_WEI_THREE_SINGLE_CODE=190;
	public static final int SD235_WEI_THREE_DRAW_CODE=191;
	public static final int SD235_WEI_TWO_POLY_CODE=192;
	public static final int SD235_WEI_TWO_SINGLE_CODE=193;
	public static final int SD235_WEI_TWO_DRAW_CODE=194;
	//	public static final int SD235_WEI_ONE_POLY_CODE=195;
//	public static final int SD235_WEI_ONE_SINGLE_CODE=196;
//	public static final int SD235_WEI_ONE_DRAW_CODE=197;
	public static final int SD235_REN_TEN_POLY_CODE=198;
	public static final int SD235_REN_TEN_SINGLE_CODE=199;
	public static final int SD235_REN_TEN_DRAW_CODE=200;
	public static final int SD235_REN_NINE_POLY_CODE=201;
	public static final int SD235_REN_NINE_SINGLE_CODE=202;
	public static final int SD235_REN_NINE_DRAW_CODE=203;
	public static final int SD235_REN_EIGHT_POLY_CODE=204;
	public static final int SD235_REN_EIGHT_SINGLE_CODE=205;
	public static final int SD235_REN_EIGHT_DRAW_CODE=206;
	public static final int SD235_REN_SEVEN_POLY_CODE=207;
	public static final int SD235_REN_SEVEN_SINGLE_CODE=208;
	public static final int SD235_REN_SEVEN_DRAW_CODE=209;
	public static final int SD235_REN_SIX_POLY_CODE=210;
	public static final int SD235_REN_SIX_SINGLE_CODE=211;
	public static final int SD235_REN_SIX_DRAW_CODE=212;
	public static final int SD235_REN_FIVE_POLY_CODE=213;
	public static final int SD235_REN_FIVE_SINGLE_CODE=214;
	public static final int SD235_REN_FIVE_DRAW_CODE=215;
	public static final int SD235_REN_FOUR_POLY_CODE=216;
	public static final int SD235_REN_FOUR_SINGLE_CODE=217;
	public static final int SD235_REN_FOUR_DRAW_CODE=218;
	public static final int SD235_REN_THREE_POLY_CODE=219;
	public static final int SD235_REN_THREE_SINGLE_CODE=220;
	public static final int SD235_REN_THREE_DRAW_CODE=221;
	public static final int SD235_REN_TWO_POLY_CODE=222;
	public static final int SD235_REN_TWO_SINGLE_CODE=223;
	public static final int SD235_REN_TWO_DRAW_CODE=224;
	public static final int SD235_REN_ONE_POLY_CODE=225;
	public static final int SD235_REN_ONE_SINGLE_CODE=226;
	public static final int SD235_REN_ONE_DRAW_CODE=227;
	public static final int SD235_COMBINATION_CODE=228;

	// --------------------------- 好彩1 ---------------------------------//
	public static final String HC1_DIGITAL="数字";
	public static final String HC1_ANIMAL="生肖";
	public static final String HC1_LOCATION="方位";
	public static final String HC1_SEASON="四季";
	public static final String HC1_COMBINATION="组合投注";
	public static final int HC1_DIGITAL_CODE=231;
	public static final int HC1_ANIMAL_CODE=232;
	public static final int HC1_LOCATION_CODE=233;
	public static final int HC1_SEASON_CODE=234;
	public static final int HC1_COMBINATION_CODE=235;

	// --------------------------- 竞彩足球 ---------------------------------//
	public static final String JC_SPF_POLY="胜平负复式";
	public static final String JC_BF_POLY="比分复式";
	public static final String JC_ZJQ_POLY="总进球复式";
	public static final String JC_BQC_POLY="半全场胜平负复式";
	public static final int JC_SPF_POLY_CODE=237;
	public static final int JC_BF_POLY_CODE=238;
	public static final int JC_ZJQ_POLY_CODE=239;
	public static final int JC_BQC_POLY_CODE=240;

	public static final String JC_SPF_SINGLE="胜平负单式";
	public static final String JC_BF_SINGLE="比分单式";
	public static final String JC_ZJQ_SINGLE="总进球单式";
	public static final String JC_BQC_SINGLE="半全场胜平负单式";
	public static final int JC_SPF_SINGLE_CODE=241;
	public static final int JC_BF_SINGLE_CODE=242;
	public static final int JC_ZJQ_SINGLE_CODE=243;
	public static final int JC_BQC_SINGLE_CODE=244;

	// --------------------------- 快乐123 ---------------------------------//
	public static final String KL123_REN_ONE="任选一";
	public static final String KL123_REN_TWO_POLY="任选二复式";
	public static final String KL123_REN_TWO_SINGLE="任选二单式";
	public static final String KL123_REN_TWO_DRAW="任选二胆拖";
	public static final String KL123_REN_THREE_POLY="任选三复式";
	public static final String KL123_REN_THREE_SINGLE="任选三单式";
	public static final String KL123_REN_THREE_DRAW="任选三胆拖";
	public static final String KL123_REN_FOUR_POLY="任选四复式";
	public static final String KL123_REN_FOUR_SINGLE="任选四单式";
	public static final String KL123_REN_FOUR_DRAW="任选四胆拖";
	public static final String KL123_REN_FIVE_POLY="任选五复式";
	public static final String KL123_REN_FIVE_SINGLE="任选五单式";
	public static final String KL123_REN_FIVE_DRAW="任选五胆拖";
	public static final String KL123_REN_SIX_POLY="任选六复式";
	public static final String KL123_REN_SIX_SINGLE="任选六单式";
	public static final String KL123_REN_SIX_DRAW="任选六胆拖";
	public static final String KL123_REN_SEVEN_POLY="任选七复式";
	public static final String KL123_REN_SEVEN_SINGLE="任选七单式";
	public static final String KL123_REN_SEVEN_DRAW="任选七胆拖";
	public static final String KL123_REN_EIGHT_POLY="任选八复式";
	public static final String KL123_REN_EIGHT_SINGLE="任选八单式";
	public static final String KL123_REN_EIGHT_DRAW="任选八胆拖";
	public static final String KL123_REN_NINE_POLY="任选九复式";
	public static final String KL123_REN_NINE_SINGLE="任选九单式";
	public static final String KL123_REN_NINE_DRAW="任选九胆拖";
	public static final String KL123_REN_TEN_POLY="任选十复式";
	public static final String KL123_REN_TEN_SINGLE="任选十单式";
	public static final String KL123_REN_TEN_DRAW="任选十胆拖";
	public static final String KL123_COMBINATION="组合投注";
	public static final int KL123_REN_ONE_CODE=245;
	public static final int KL123_REN_TWO_POLY_CODE=246;
	public static final int KL123_REN_TWO_SINGLE_CODE=247;
	public static final int KL123_REN_TWO_DRAW_CODE=248;
	public static final int KL123_REN_THREE_POLY_CODE=249;
	public static final int KL123_REN_THREE_SINGLE_CODE=250;
	public static final int KL123_REN_THREE_DRAW_CODE=251;
	public static final int KL123_REN_FOUR_POLY_CODE=252;
	public static final int KL123_REN_FOUR_SINGLE_CODE=253;
	public static final int KL123_REN_FOUR_DRAW_CODE=254;
	public static final int KL123_REN_FIVE_POLY_CODE=255;
	public static final int KL123_REN_FIVE_SINGLE_CODE=256;
	public static final int KL123_REN_FIVE_DRAW_CODE=257;
	public static final int KL123_REN_SIX_POLY_CODE=258;
	public static final int KL123_REN_SIX_SINGLE_CODE=259;
	public static final int KL123_REN_SIX_DRAW_CODE=260;
	public static final int KL123_REN_SEVEN_POLY_CODE=261;
	public static final int KL123_REN_SEVEN_SINGLE_CODE=262;
	public static final int KL123_REN_SEVEN_DRAW_CODE=263;
	public static final int KL123_REN_EIGHT_POLY_CODE=264;
	public static final int KL123_REN_EIGHT_SINGLE_CODE=265;
	public static final int KL123_REN_EIGHT_DRAW_CODE=266;
	public static final int KL123_REN_NINE_POLY_CODE=267;
	public static final int KL123_REN_NINE_SINGLE_CODE=268;
	public static final int KL123_REN_NINE_DRAW_CODE=269;
	public static final int KL123_REN_TEN_POLY_CODE=270;
	public static final int KL123_REN_TEN_SINGLE_CODE=271;
	public static final int KL123_REN_TEN_DRAW_CODE=272;
	public static final int KL123_COMBINATION_CODE=273;
	// --------------------------- 足球单场---------------------------------//
	public static final String BJDC_SPF_POLY="让球胜平负复式";// 让球胜平负复式
	public static final String BJDC_SPF_SINGLE="让球胜平负单式";// 让球胜平负单式
	public static final String BJDC_ZJQS_POLY="总进球数复式";// 总进球数复式
	public static final String BJDC_ZJQS_SINGLE="总进球数单式";// 总进球数单式
	public static final String BJDC_SXDS_POLY="上下单双复式";// 上下单双复式
	public static final String BJDC_SXDS_SINGLE="上下单双单式";// 上下单双单式
	public static final String BJDC_BF_POLY="比分复式";// 比分复式
	public static final String BJDC_BF_SINGLE="比分单式";// 比分单式
	public static final String BJDC_BQC_POLY="半全场复式";// 半全场复式
	public static final String BJDC_BQC_SINGLE="半全场单式";// 半全场单式
	public static final int BJDC_SPF_POLY_CODE=274;// 让球胜平负复式
	public static final int BJDC_SPF_SINGLE_CODE=275;// 让球胜平负单式
	public static final int BJDC_ZJQS_POLY_CODE=276;// 总进球数复式
	public static final int BJDC_ZJQS_SINGLE_CODE=277;// 总进球数单式
	public static final int BJDC_SXDS_POLY_CODE=278;// 上下单双复式
	public static final int BJDC_SXDS_SINGLE_CODE=279;// 上下单双单式
	public static final int BJDC_BF_POLY_CODE=280;// 比分复式
	public static final int BJDC_BF_SINGLE_CODE=281;// 比分单式
	public static final int BJDC_BQC_POLY_CODE=282;// 半全场复式
	public static final int BJDC_BQC_SINGLE_CODE=283;// 半全场单式

	// --------------------------- 竞彩篮球 ---------------------------------//
	public static final String BASKETBALL_SF_POLY="胜负复式";
	public static final String BASKETBALL_RFSF_POLY="让分胜负复式";
	public static final String BASKETBALL_FSC_POLY="胜分差复式";
	public static final String BASKETBALL_DXF_POLY="大小分复式";
	public static final int BASKETBALL_SF_POLY_CODE=284;
	public static final int BASKETBALL_RFSF_POLY_CODE=285;
	public static final int BASKETBALL_FSC_POLY_CODE=286;
	public static final int BASKETBALL_DXF_POLY_CODE=287;

	// --------------------------- 竞彩足球 ---------------------------------//
	public static final String FOOTBALL_SPF_POLY="胜平负复式";
	public static final String FOOTBALL_RQSPF_POLY="让球胜平负复式";
	public static final String FOOTBALL_SPF_SINGLE="胜平负单式";
	public static final String FOOTBALL_RQSPF_SINGLE="让球胜平负单式";
	public static final String FOOTBALL_ZJQS_POLY="总进球复式";
	public static final String FOOTBALL_BF_POLY="比分复式";
	public static final String FOOTBALL_BQC_POLY="半全场复式";
	public static final String FOOTBALL_GJ_POLY="欧冠杯冠军";
	public static final String FOOTBALL_SJB_GJ_POLY="世界杯冠军";
	public static final String FOOTBALL_GYJ_POLY="世界杯冠亚军";
	public static final int FOOTBALL_SPF_POLY_CODE=288;
	public static final int FOOTBALL_RQSPF_POLY_CODE=426;
	public static final int FOOTBALL_SPF_SINGLE_CODE=428;
	public static final int FOOTBALL_RQSPF_SINGLE_CODE=429;
	public static final int FOOTBALL_ZJQS_POLY_CODE=289;
	public static final int FOOTBALL_BF_POLY_CODE=290;
	public static final int FOOTBALL_BQC_POLY_CODE=291;
	public static final int FOOTBALL_GJ_POLY_CODE=422;
	public static final int FOOTBALL_SJB_GJ_POLY_CODE=427;
	public static final int FOOTBALL_GYJ_POLY_CODE=423;

	// --------------------------- 竞彩混合投注 ---------------------------------//
	public static final String JC_FOOTBALL_HUNHE_POLY="混合投注";
	public static final String JC_FOOTBALL_HUNHE_2X1_POLY="混投2选1";
	public static final String JC_BASKETBALL_HUNHE_POLY="混合投注";

	public static final int JC_FOOTBALL_HUNHE_POLY_CODE=424;
	public static final int JC_FOOTBALL_HUNHE_2X1_POLY_CODE=430;
	public static final int JC_BASKETBALL_HUNHE_POLY_CODE=425;

	// --------------------------- 胜负过关 ---------------------------------//
	public static final String SFGG_DC_POLY = "胜负过关";
	public static final int SFGG_DC_POLY_CODE = 431;

	// --------------------------- 江西11选5 ---------------------------------//
	public static final String JX115_ONE_SINGLE="任选一单式";
	public static final String JX115_ONE_POLY="任选一复式";
	public static final String JX115_TWO_SINGLE="任选二单式";
	public static final String JX115_TWO_POLY="任选二复式";
	public static final String JX115_TWO_DRAW="任选二胆拖";
	public static final String JX115_TWO_DIRECT_SINGLE="前二直选单式";
	public static final String JX115_TWO_DIRECT_POLY="前二直选复式";
	public static final String JX115_TWO_DIRECT="前二直选定位复式";
	public static final String JX115_TWO_GROUP_SINGLE="前二组选单式";
	public static final String JX115_TWO_GROUP_POLY="前二组选复式";
	public static final String JX115_THREE_SINGLE="任选三单式";
	public static final String JX115_THREE_POLY="任选三复式";
	public static final String JX115_THREE_DRAW="任选三胆拖";
	public static final String JX115_THREE_DIRECT_SINGLE="前三直选单式";
	public static final String JX115_THREE_DIRECT_POLY="前三直选复式";
	public static final String JX115_THREE_DIRECT="前三直选定位复式";
	public static final String JX115_THREE_DIRECT_SUM="前三直选和值";
	public static final String JX115_THREE_GROUP_SINGLE="前三组选单式";
	public static final String JX115_THREE_GROUP_POLY="前三组选复式";
	public static final String JX115_THREE_GROUP_SUM="前三组选和值";
	public static final String JX115_FOUR_SINGLE="任选四单式";
	public static final String JX115_FOUR_POLY="任选四复式";
	public static final String JX115_FOUR_DRAW="任选四胆拖";
	public static final String JX115_FIVE_SINGLE="任选五单式";
	public static final String JX115_FIVE_POLY="任选五复式";
	public static final String JX115_FIVE_DRAW="任选五胆拖";
	public static final String JX115_SIX_SINGLE="任选六单式";
	public static final String JX115_SIX_POLY="任选六复式";
	public static final String JX115_SIX_DRAW="任选六胆拖";
	public static final String JX115_SEVEN_SINGLE="任选七单式";
	public static final String JX115_SEVEN_POLY="任选七复式";
	public static final String JX115_SEVEN_DRAW="任选七胆拖";
	public static final String JX115_EIGHT_SINGLE="任选八单式";
	public static final String JX115_EIGHT_POLY="任选八复式";
	public static final String JX115_EIGHT_DRAW="任选八胆拖";
	public static final String JX115_TWO_DIRECT_DRAW="前二直选胆拖";
	public static final String JX115_TWO_GROUP_DRAW="前二组选胆拖";
	public static final String JX115_THREE_DIRECT_DRAW="前三直选胆拖";
	public static final String JX115_THREE_GROUP_DRAW="前三组选胆拖";
	public static final String JX115_COMBINATION="组合投注";

	public static final int JX115_ONE_SINGLE_CODE=292;
	public static final int JX115_ONE_POLY_CODE=293;
	public static final int JX115_TWO_SINGLE_CODE=294;
	public static final int JX115_TWO_POLY_CODE=295;
	public static final int JX115_TWO_DRAW_CODE=296;
	public static final int JX115_TWO_DIRECT_SINGLE_CODE=297;
	public static final int JX115_TWO_DIRECT_POLY_CODE=298;
	public static final int JX115_TWO_DIRECT_CODE=299;
	public static final int JX115_TWO_GROUP_SINGLE_CODE=300;
	public static final int JX115_TWO_GROUP_POLY_CODE=301;
	public static final int JX115_THREE_SINGLE_CODE=302;
	public static final int JX115_THREE_POLY_CODE=303;
	public static final int JX115_THREE_DRAW_CODE=304;
	public static final int JX115_THREE_DIRECT_SINGLE_CODE=305;
	public static final int JX115_THREE_DIRECT_POLY_CODE=306;
	public static final int JX115_THREE_DIRECT_CODE=307;
	public static final int JX115_THREE_DIRECT_SUM_CODE=308;
	public static final int JX115_THREE_GROUP_SINGLE_CODE=309;
	public static final int JX115_THREE_GROUP_POLY_CODE=310;
	public static final int JX115_THREE_GROUP_SUM_CODE=311;
	public static final int JX115_FOUR_SINGLE_CODE=312;
	public static final int JX115_FOUR_POLY_CODE=313;
	public static final int JX115_FOUR_DRAW_CODE=314;
	public static final int JX115_FIVE_SINGLE_CODE=315;
	public static final int JX115_FIVE_POLY_CODE=316;
	public static final int JX115_FIVE_DRAW_CODE=317;
	public static final int JX115_SIX_SINGLE_CODE=318;
	public static final int JX115_SIX_POLY_CODE=319;
	public static final int JX115_SIX_DRAW_CODE=320;
	public static final int JX115_SEVEN_SINGLE_CODE=321;
	public static final int JX115_SEVEN_POLY_CODE=322;
	public static final int JX115_SEVEN_DRAW_CODE=323;
	public static final int JX115_EIGHT_SINGLE_CODE=324;
	public static final int JX115_EIGHT_POLY_CODE=325;
	public static final int JX115_EIGHT_DRAW_CODE=326;
	public static final int JX115_TWO_DIRECT_DRAW_CODE=328;
	public static final int JX115_TWO_GROUP_DRAW_CODE=329;
	public static final int JX115_THREE_DIRECT_DRAW_CODE=330;
	public static final int JX115_THREE_GROUP_DRAW_CODE=331;
	public static final int JX115_COMBINATION_CODE=327;


	// --------------------------- 新时时彩 ---------------------------------//
	public static final String JXSSC_ONE_STAR="一星";
	public static final String JXSSC_TWO_STAR_DIRECT_POLY="二星直选复式";
	public static final String JXSSC_TWO_STAR_DIRECT_SINGLE="二星直选单式";
	public static final String JXSSC_TWO_STAR_DIRECT_SUM="二星直选和值";
	public static final String JXSSC_TWO_STAR_GROUP_POLY="二星组选复式";
	public static final String JXSSC_TWO_STAR_GROUP_SINGLE="二星组选单式";
	public static final String JXSSC_TWO_STAR_GROUP_SUM="二星组选和值";
	public static final String JXSSC_TWO_STAR_GROUP_DRAW="二星组选胆拖";
	public static final String JXSSC_THREE_STAR_DIRECT_POLY="三星直选复式";
	public static final String JXSSC_THREE_STAR_DIRECT_SINGLE="三星直选单式";
	public static final String JXSSC_THREE_STAR_DIRECT_SUM="三星直选和值";
	public static final String JXSSC_THREE_STAR_DIRECT_DRAW="三星直选胆拖";
	public static final String JXSSC_THREE_STAR_GROUP3_POLY="三星组三复式";
	public static final String JXSSC_THREE_STAR_GROUP6_POLY="三星组六复式";
	public static final String JXSSC_THREE_STAR_GROUP_SINGLE="三星组选单式";
	public static final String JXSSC_THREE_STAR_GROUP_SUM="三星组选和值";
	public static final String JXSSC_FOUR_STAR_POLY="四星复式";
	public static final String JXSSC_FOUR_STAR_SINGLE="四星单式";
	public static final String JXSSC_FIVE_STAR_POLY="五星复式";
	public static final String JXSSC_FIVE_STAR_SINGLE="五星单式";
	public static final String JXSSC_FIVE_STAR_ALL_POLY="五星通选复式";
	public static final String JXSSC_FIVE_STAR_ALL_SINGLE="五星通选单式";
	public static final String JXSSC_REN_ONE_STAR_POLY="任选一";
	public static final String JXSSC_REN_TWO_STAR_POLY="任选二";
	public static final String JXSSC_DXDS="大小单双";
	public static final String JXSSC_GROUP3_DRAW="三星组三胆拖";
	public static final String JXSSC_GROUP6_DRAW="三星组六胆拖";
	public static final String JXSSC_COMBINATION="组合投注";

	public static final int JXSSC_ONE_STAR_CODE=333;
	public static final int JXSSC_TWO_STAR_DIRECT_POLY_CODE=334;
	public static final int JXSSC_TWO_STAR_DIRECT_SINGLE_CODE=335;
	public static final int JXSSC_TWO_STAR_DIRECT_SUM_CODE=336;
	public static final int JXSSC_TWO_STAR_GROUP_POLY_CODE=337;
	public static final int JXSSC_TWO_STAR_GROUP_SINGLE_CODE=338;
	public static final int JXSSC_TWO_STAR_GROUP_SUM_CODE=339;
	public static final int JXSSC_TWO_STAR_GROUP_DRAW_CODE=340;
	public static final int JXSSC_THREE_STAR_DIRECT_POLY_CODE=341;
	public static final int JXSSC_THREE_STAR_DIRECT_SINGLE_CODE=342;
	public static final int JXSSC_THREE_STAR_DIRECT_SUM_CODE=343;
	public static final int JXSSC_THREE_STAR_DIRECT_DRAW_CODE=344;
	public static final int JXSSC_THREE_STAR_GROUP3_POLY_CODE=345;
	public static final int JXSSC_THREE_STAR_GROUP6_POLY_CODE=346;
	public static final int JXSSC_THREE_STAR_GROUP_SINGLE_CODE=347;
	public static final int JXSSC_THREE_STAR_GROUP_SUM_CODE=348;
	//public static final int JXSSC_THREE_STAR_GROUP_DRAW_CODE=349;
	public static final int JXSSC_FOUR_STAR_POLY_CODE=350;
	public static final int JXSSC_FOUR_STAR_SINGLE_CODE=351;
	public static final int JXSSC_FIVE_STAR_POLY_CODE=352;
	public static final int JXSSC_FIVE_STAR_SINGLE_CODE=353;
	public static final int JXSSC_FIVE_STAR_ALL_POLY_CODE=354;
	public static final int JXSSC_FIVE_STAR_ALL_SINGLE_CODE=355;
	public static final int JXSSC_REN_ONE_STAR_POLY_CODE=356;
	public static final int JXSSC_REN_TWO_STAR_POLY_CODE=357;
	public static final int JXSSC_DXDS_CODE=358;
	public static final int JXSSC_GROUP3_DRAW_CODE=520;
	public static final int JXSSC_GROUP6_DRAW_CODE=521;
	public static final int JXSSC_COMBINATION_CODE=359;


	// --------------------------- 内蒙快三  快3 ---------------------------------//
	public static final String NMK3_SUM_SINGLE = "和值单式";
	public static final String NMK3_SUM_POLY = "和值复式";
	public static final String NMK3_THREE_SAME_ALL = "三同号通选";
	public static final String NMK3_THREE_SAME_ALONE = "三同号单选";
	public static final String NMK3_THREE_DIFFERENT_POLY = "三不同号复式";
	public static final String NMK3_THREE_DIFFERENT_DRAW = "三不同号胆拖";
	public static final String NMK3_THREE_DIFFERENT_KD = "三不同号跨度";
	public static final String NMK3_THREE_DIFFERENT_SINGLE = "三不同号单式";
	public static final String NMK3_THREE_LINK_ALL = "三连号通选";
	public static final String NMK3_TWO_SAME = "二同号复选";
	public static final String NMK3_TWO_SAME_ALONE = "二同号单选";
	public static final String NMK3_TWO_SAME_ALONE_KD = "二同号单选跨度";
	public static final String NMK3_TWO_SAME_ALONE_POLY = "二同号单选复式";
	public static final String NMK3_TWO_DIFFERENT = "二不同号";
	public static final String NMK3_TWO_DIFFERENT_DRAW = "二不同号胆拖";
	public static final String NMK3_TWO_DIFFERENT_POLY = "二不同号复式";
	public static final String NMK3_COMBINATION="组合投注";


	public static final int  NMK3_SUM_SINGLE_CODE = 487;
	public static final int  NMK3_SUM_POLY_CODE = 488;
	public static final int  NMK3_THREE_SAME_ALL_CODE = 489;
	public static final int  NMK3_THREE_SAME_ALONE_CODE = 490;
	public static final int  NMK3_THREE_DIFFERENT_POLY_CODE = 491;
	public static final int  NMK3_THREE_DIFFERENT_DRAW_CODE = 492;
	public static final int  NMK3_THREE_DIFFERENT_KD_CODE = 493;
	public static final int  NMK3_THREE_DIFFERENT_SINGLE_CODE = 494;
	public static final int  NMK3_THREE_LINK_ALL_CODE = 495;
	public static final int  NMK3_TWO_SAME_CODE = 496;
	public static final int	 NMK3_TWO_SAME_ALONE_CODE =700;
	public static final int  NMK3_TWO_SAME_ALONE_KD_CODE = 497;
	public static final int  NMK3_TWO_SAME_ALONE_POLY_CODE = 498;
	public static final int  NMK3_TWO_DIFFERENT_CODE = 701;
	public static final int  NMK3_TWO_DIFFERENT_DRAW_CODE = 499;
	public static final int  NMK3_TWO_DIFFERENT_POLY_CODE = 500;
	public static final int  NMK3_COMBINATION_CODE  =501;


	// --------------------------------安徽快三  ----------------------------------
	public static final String AHK3_SUM_SINGLE = "和值单式";
	public static final String AHK3_SUM_POLY = "和值复式";
	public static final String AHK3_THREE_SAME_ALL = "三同号通选";
	public static final String AHK3_THREE_SAME_ALONE = "三同号单选";
	public static final String AHK3_THREE_DIFFERENT_POLY = "三不同号复式";
	public static final String AHK3_THREE_DIFFERENT_DRAW = "三不同号胆拖";
	public static final String AHK3_THREE_DIFFERENT_KD = "三不同号跨度";
	public static final String AHK3_THREE_DIFFERENT_SINGLE = "三不同号单式";
	public static final String AHK3_THREE_LINK_ALL = "三连号通选";
	public static final String AHK3_TWO_SAME = "二同号复选";
	public static final String AHK3_TWO_SAME_ALONE = "二同号单选";
	public static final String AHK3_TWO_SAME_ALONE_KD = "二同号单选跨度";
	public static final String AHK3_TWO_SAME_ALONE_POLY = "二同号单选复式";
	public static final String AHK3_TWO_DIFFERENT = "二不同号";
	public static final String AHK3_TWO_DIFFERENT_DRAW = "二不同号胆拖";
	public static final String AHK3_TWO_DIFFERENT_POLY = "二不同号复式";
	public static final String  AHK3_COMBINATION  ="组合投注";

	public static final int  AHK3_SUM_SINGLE_CODE = 487;
	public static final int  AHK3_SUM_POLY_CODE = 488;
	public static final int  AHK3_THREE_SAME_ALL_CODE = 489;
	public static final int  AHK3_THREE_SAME_ALONE_CODE = 490;
	public static final int  AHK3_THREE_DIFFERENT_POLY_CODE = 491;
	public static final int  AHK3_THREE_DIFFERENT_DRAW_CODE = 492;
	public static final int  AHK3_THREE_DIFFERENT_KD_CODE = 493;
	public static final int  AHK3_THREE_DIFFERENT_SINGLE_CODE = 494;
	public static final int  AHK3_THREE_LINK_ALL_CODE = 495;
	public static final int  AHK3_TWO_SAME_CODE = 496;
	public static final int  AHK3_TWO_SAME_ALONE_CODE = 702;
	public static final int  AHK3_TWO_SAME_ALONE_KD_CODE = 497;
	public static final int  AHK3_TWO_SAME_ALONE_POLY_CODE = 498;
	public static final int  AHK3_TWO_DIFFERENT_CODE = 703;
	public static final int  AHK3_TWO_DIFFERENT_DRAW_CODE = 499;
	public static final int  AHK3_TWO_DIFFERENT_POLY_CODE = 500;
	public static final int  AHK3_COMBINATION_CODE  =501;

	// --------------------------------广西快三  ----------------------------------
	public static final String GXK3_SUM_SINGLE = "和值单式";
	public static final String GXK3_SUM_POLY = "和值复式";
	public static final String GXK3_THREE_SAME_ALL = "三同号通选";
	public static final String GXK3_THREE_SAME_ALONE = "三同号单选";
	public static final String GXK3_THREE_DIFFERENT_POLY = "三不同号复式";
	public static final String GXK3_THREE_DIFFERENT_DRAW = "三不同号胆拖";
	public static final String GXK3_THREE_DIFFERENT_KD = "三不同号跨度";
	public static final String GXK3_THREE_DIFFERENT_SINGLE = "三不同号单式";
	public static final String GXK3_THREE_LINK_ALL = "三连号通选";
	public static final String GXK3_TWO_SAME = "二同号复选";
	public static final String GXK3_TWO_SAME_ALONE = "二同号单选";
	public static final String GXK3_TWO_SAME_ALONE_KD = "二同号单选跨度";
	public static final String GXK3_TWO_SAME_ALONE_POLY = "二同号单选复式";
	public static final String GXK3_TWO_DIFFERENT = "二不同号";
	public static final String GXK3_TWO_DIFFERENT_DRAW = "二不同号胆拖";
	public static final String GXK3_TWO_DIFFERENT_POLY = "二不同号复式";
	public static final String GXK3_COMBINATION  ="组合投注";

	public static final int  GXK3_SUM_SINGLE_CODE = 524;
	public static final int  GXK3_SUM_POLY_CODE = 525;
	public static final int  GXK3_THREE_SAME_ALL_CODE = 526;
	public static final int  GXK3_THREE_SAME_ALONE_CODE = 527;
	public static final int  GXK3_THREE_DIFFERENT_POLY_CODE = 528;
	public static final int  GXK3_THREE_DIFFERENT_DRAW_CODE = 529;
	public static final int  GXK3_THREE_DIFFERENT_KD_CODE = 530;
	public static final int  GXK3_THREE_DIFFERENT_SINGLE_CODE = 531;
	public static final int  GXK3_THREE_LINK_ALL_CODE = 532;
	public static final int  GXK3_TWO_SAME_CODE = 533;
	public static final int  GXK3_TWO_SAME_ALONE_CODE = 704;
	public static final int  GXK3_TWO_SAME_ALONE_KD_CODE = 534;
	public static final int  GXK3_TWO_SAME_ALONE_POLY_CODE = 535;
	public static final int  GXK3_TWO_DIFFERENT_CODE = 705;
	public static final int  GXK3_TWO_DIFFERENT_DRAW_CODE = 536;
	public static final int  GXK3_TWO_DIFFERENT_POLY_CODE = 537;
	public static final int  GXK3_COMBINATION_CODE  =538;

	// --------------------------- 上海快3 ---------------------------------//
	public static final String SHK3_SUM_SINGLE = "和值单式";
	public static final String SHK3_SUM_POLY = "和值复式";
	public static final String SHK3_THREE_SAME_ALL = "三同号通选";
	public static final String SHK3_THREE_SAME_ALONE = "三同号单选";
	public static final String SHK3_THREE_SAME_POLY = "三同号复式";
	public static final String SHK3_THREE_DIFFERENT_POLY = "三不同号复式";
	public static final String SHK3_THREE_DIFFERENT_DRAW = "三不同号胆拖";
	public static final String SHK3_THREE_DIFFERENT_KD = "三不同号跨度";
	public static final String SHK3_THREE_DIFFERENT_SINGLE = "三不同号单式";
	public static final String SHK3_THREE_LINK_ALL = "三连号通选";
	//public static final String SHK3_TWO_SAME = "二同号复选";
	public static final String SHK3_TWO_SAME_ALONE = "二同号单选";
	public static final String SHK3_TWO_SAME_ALONE_KD = "二同号单选跨度";
	public static final String SHK3_TWO_SAME_ALONE_POLY = "二同号单选复式";
	public static final String SHK3_TWO_SAME_ALONE_SINGLE = "二同号单选单式";
	public static final String SHK3_TWO_SAME_POLY_SINGLE = "二同号复式单选";
	public static final String SHK3_TWO_SAME_POLY= "二同号复式";
	public static final String SHK3_TWO_DIFFERENT = "二不同号";
	public static final String SHK3_TWO_DIFFERENT_DRAW = "二不同号胆拖";
	public static final String SHK3_TWO_DIFFERENT_POLY = "二不同号复式";
	public static final String SHK3_TWO_DIFFERENT_SINGLE = "二不同号单式";
	public static final String SHK3_COMBINATION  ="组合投注";

	public static final int  SHK3_SUM_SINGLE_CODE = 801;
	public static final int  SHK3_SUM_POLY_CODE = 802;
	public static final int  SHK3_THREE_SAME_ALL_CODE = 803;
	public static final int  SHK3_THREE_SAME_ALONE_CODE = 804;
	public static final int  SHK3_THREE_SAME_POLY_CODE = 805;
	public static final int  SHK3_THREE_DIFFERENT_POLY_CODE = 806;
	public static final int  SHK3_THREE_DIFFERENT_DRAW_CODE = 807;
	public static final int  SHK3_THREE_DIFFERENT_KD_CODE = 808;
	public static final int  SHK3_THREE_DIFFERENT_SINGLE_CODE = 809;
	public static final int  SHK3_THREE_LINK_ALL_CODE = 810;
	public static final int  SHK3_TWO_SAME_CODE = 811;
	public static final int  SHK3_TWO_SAME_ALONE_CODE = 812;
	public static final int  SHK3_TWO_SAME_ALONE_KD_CODE = 813;
	public static final int  SHK3_TWO_SAME_ALONE_POLY_CODE = 814;
	public static final int  SHK3_TWO_SAME_ALONE_SINGLE_CODE = 815;
	public static final int  SHK3_TWO_SAME_POLY_SINGLE_CODE = 816;
	public static final int  SHK3_TWO_DIFFERENT_DRAW_CODE = 818;
	public static final int  SHK3_TWO_DIFFERENT_POLY_CODE = 819;
	public static final int  SHK3_TWO_DIFFERENT_SINGLE_CODE = 817;
	public static final int  SHK3_COMBINATION_CODE  = 840;

	// --------------------------- 11选5 ---------------------------------//
	public static final String GD115_ONE_SINGLE="任选一单式";
	public static final String GD115_ONE_POLY="任选一复式";
	public static final String GD115_TWO_SINGLE="任选二单式";
	public static final String GD115_TWO_POLY="任选二复式";
	public static final String GD115_TWO_DRAW="任选二胆拖";
	public static final String GD115_TWO_DIRECT_SINGLE="前二直选单式";
	public static final String GD115_TWO_DIRECT_POLY="前二直选复式";
	public static final String GD115_TWO_DIRECT="前二直选定位复式";
	public static final String GD115_TWO_GROUP_SINGLE="前二组选单式";
	public static final String GD115_TWO_GROUP_POLY="前二组选复式";
	public static final String GD115_THREE_SINGLE="任选三单式";
	public static final String GD115_THREE_POLY="任选三复式";
	public static final String GD115_THREE_DRAW="任选三胆拖";
	public static final String GD115_THREE_DIRECT_SINGLE="前三直选单式";
	public static final String GD115_THREE_DIRECT_POLY="前三直选复式";
	public static final String GD115_THREE_DIRECT="前三直选定位复式";
	public static final String GD115_THREE_DIRECT_SUM="前三直选和值";
	public static final String GD115_THREE_GROUP_SINGLE="前三组选单式";
	public static final String GD115_THREE_GROUP_POLY="前三组选复式";
	public static final String GD115_THREE_GROUP_SUM="前三组选和值";
	public static final String GD115_FOUR_SINGLE="任选四单式";
	public static final String GD115_FOUR_POLY="任选四复式";
	public static final String GD115_FOUR_DRAW="任选四胆拖";
	public static final String GD115_FIVE_SINGLE="任选五单式";
	public static final String GD115_FIVE_POLY="任选五复式";
	public static final String GD115_FIVE_DRAW="任选五胆拖";
	public static final String GD115_SIX_SINGLE="任选六单式";
	public static final String GD115_SIX_POLY="任选六复式";
	public static final String GD115_SIX_DRAW="任选六胆拖";
	public static final String GD115_SEVEN_SINGLE="任选七单式";
	public static final String GD115_SEVEN_POLY="任选七复式";
	public static final String GD115_SEVEN_DRAW="任选七胆拖";
	public static final String GD115_EIGHT_SINGLE="任选八单式";
	public static final String GD115_EIGHT_POLY="任选八复式";
	public static final String GD115_EIGHT_DRAW="任选八胆拖";
	public static final String GD115_TWO_DIRECT_DRAW="前二直选胆拖";
	public static final String GD115_TWO_GROUP_DRAW="前二组选胆拖";
	public static final String GD115_THREE_DIRECT_DRAW="前三直选胆拖";
	public static final String GD115_THREE_GROUP_DRAW="前三组选胆拖";
	public static final String GD115_COMBINATION="组合投注";
	public static final int GD115_ONE_SINGLE_CODE=360;
	public static final int GD115_ONE_POLY_CODE=361;
	public static final int GD115_TWO_SINGLE_CODE=362;
	public static final int GD115_TWO_POLY_CODE=363;
	public static final int GD115_TWO_DRAW_CODE=364;
	public static final int GD115_TWO_DIRECT_SINGLE_CODE=365;
	public static final int GD115_TWO_DIRECT_POLY_CODE=366;
	public static final int GD115_TWO_DIRECT_CODE=367;
	public static final int GD115_TWO_GROUP_SINGLE_CODE=368;
	public static final int GD115_TWO_GROUP_POLY_CODE=369;
	public static final int GD115_THREE_SINGLE_CODE=370;
	public static final int GD115_THREE_POLY_CODE=371;
	public static final int GD115_THREE_DRAW_CODE=372;
	public static final int GD115_THREE_DIRECT_SINGLE_CODE=373;
	public static final int GD115_THREE_DIRECT_POLY_CODE=374;
	public static final int GD115_THREE_DIRECT_CODE=375;
	public static final int GD115_THREE_DIRECT_SUM_CODE=376;
	public static final int GD115_THREE_GROUP_SINGLE_CODE=377;
	public static final int GD115_THREE_GROUP_POLY_CODE=378;
	public static final int GD115_THREE_GROUP_SUM_CODE=379;
	public static final int GD115_FOUR_SINGLE_CODE=380;
	public static final int GD115_FOUR_POLY_CODE=381;
	public static final int GD115_FOUR_DRAW_CODE=382;
	public static final int GD115_FIVE_SINGLE_CODE=383;
	public static final int GD115_FIVE_POLY_CODE=384;
	public static final int GD115_FIVE_DRAW_CODE=385;
	public static final int GD115_SIX_SINGLE_CODE=386;
	public static final int GD115_SIX_POLY_CODE=387;
	public static final int GD115_SIX_DRAW_CODE=388;
	public static final int GD115_SEVEN_SINGLE_CODE=389;
	public static final int GD115_SEVEN_POLY_CODE=390;
	public static final int GD115_SEVEN_DRAW_CODE=391;
	public static final int GD115_EIGHT_SINGLE_CODE=392;
	public static final int GD115_EIGHT_POLY_CODE=393;
	public static final int GD115_EIGHT_DRAW_CODE=394;
	public static final int GD115_TWO_DIRECT_DRAW_CODE=396;
	public static final int GD115_TWO_GROUP_DRAW_CODE=397;
	public static final int GD115_THREE_DIRECT_DRAW_CODE=398;
	public static final int GD115_THREE_GROUP_DRAW_CODE=399;
	public static final int GD115_COMBINATION_CODE=395;


	// --------------------------- 3D ---------------------------------//
	public static final String BJ3D_DIRECT="直选定位";
	public static final String BJ3D_DIRECT_POLY="直选复式";
	public static final String BJ3D_DIRECT_SINGLE="直选单式";
	public static final String BJ3D_DIRECT_DRAW="直选胆拖";
	public static final String BJ3D_DIRECT_SUM="直选和值";
	public static final String BJ3D_GROUP3="组三复式";
	public static final String BJ3D_GROUP3_SUM="组三和值";
	public static final String BJ3D_GROUP3_DRAW="组三胆拖";
	public static final String BJ3D_GROUP6="组六复式";
	public static final String BJ3D_GROUP6_SUM="组六和值";
	public static final String BJ3D_GROUP6_DRAW="组六胆拖";
	public static final String BJ3D_GROUP_SINGLE="组选单式";
	public static final String BJ3D_GROUP3_KD="组三跨度";
	public static final String BJ3D_GROUP6_KD="组六跨度";
	public static final String BJ3D_DIRECT_KD="直选跨度";
	public static final String BJ3D_ONE_POLY="1D";
	public static final String BJ3D_TWO_POLY="2D";
	public static final String BJ3D_ALL_POLY="通选复式";
	public static final String BJ3D_ALL_SINGLE="通选单式";
    //20170411新增
    public static final String BJ3D_GROUP3_SINGLE="组三单式";
    public static final String BJ3D_GROUP3_POLY="组三复式";
    public static final String BJ3D_GROUP6_SINGLE="组六单式";
    public static final String BJ3D_GROUP6_POLY="组六复式";
	public static final String BJ3D_COMBINATION="组合投注";



	public static final int BJ3D_DIRECT_CODE=400;
	public static final int BJ3D_DIRECT_POLY_CODE=401;
	public static final int BJ3D_DIRECT_SINGLE_CODE=402;
	public static final int BJ3D_DIRECT_DRAW_CODE=403;
	public static final int BJ3D_DIRECT_SUM_CODE=404;
	public static final int BJ3D_GROUP3_CODE=405;
	public static final int BJ3D_GROUP3_SUM_CODE=406;
	public static final int BJ3D_GROUP3_DRAW_CODE=407;
	public static final int BJ3D_GROUP6_CODE=408;
	public static final int BJ3D_GROUP6_SUM_CODE=409;
	public static final int BJ3D_GROUP6_DRAW_CODE=410;
	public static final int BJ3D_GROUP_SINGLE_CODE=411;
	public static final int BJ3D_GROUP3_KD_CODE=412;
	public static final int BJ3D_GROUP6_KD_CODE=413;
	public static final int BJ3D_DIRECT_KD_CODE=414;
	public static final int BJ3D_ONE_POLY_CODE=415;
	//public static final int BJ3D_ONE_SINGLE_CODE=416;
	public static final int BJ3D_TWO_POLY_CODE=417;
	//public static final int BJ3D_TWO_SINGLE_CODE=418;
	public static final int BJ3D_ALL_POLY_CODE=419;
	public static final int BJ3D_ALL_SINGLE_CODE=420;
	public static final int BJ3D_COMBINATION_CODE=421;
    public static final int BJ3D_GROUP3_SINGLE_CODE=742;
    public static final int BJ3D_GROUP3_POLY_CODE=743;
    public static final int BJ3D_GROUP6_SINGLE_CODE=744;
    public static final int BJ3D_GROUP6_POLY_CODE=745;

	// --------------------------- 幸运赛车 ---------------------------------//
	public static final String XYSC_ONE_DIRECT_SINGLE="前一单式";
	public static final String XYSC_ONE_DIRECT_POLY="前一复式";
	public static final String XYSC_TWO_DIRECT_SINGLE="前二单式";
	public static final String XYSC_TWO_DIRECT_DRAW="前二胆拖";
	public static final String XYSC_TWO_DIRECT="前二定位";
	public static final String XYSC_THREE_DIRECT_SINGLE="前三单式";
	public static final String XYSC_THREE_DIRECT_DRAW="前三胆拖";
	public static final String XYSC_THREE_DIRECT="前三定位";
	public static final String XYSC_WZ_SINGLE="位置单式";
	public static final String XYSC_WZ_POLY="位置复式";
	public static final String XYSC_TWO_GROUP_SINGLE="组二单式";
	public static final String XYSC_TWO_GROUP_POLY="组二复式";
	public static final String XYSC_TWO_GROUP_DRAW="组二胆拖";
	public static final String XYSC_THREE_GROUP_SINGLE="组三单式";
	public static final String XYSC_THREE_GROUP_POLY="组三复式";
	public static final String XYSC_THREE_GROUP_DRAW="组三胆拖";
	public static final String XYSC_DXJO="大小奇偶";
	public static final String XYSC_COMBINATION="组合投注";

	public static final int XYSC_ONE_DIRECT_SINGLE_CODE=502;
	public static final int XYSC_ONE_DIRECT_POLY_CODE=503;
	public static final int XYSC_TWO_DIRECT_SINGLE_CODE=504;
	public static final int XYSC_TWO_DIRECT_CODE=505;
	public static final int XYSC_TWO_DIRECT_DRAW_CODE=506;
	public static final int XYSC_THREE_DIRECT_SINGLE_CODE=507;
	public static final int XYSC_THREE_DIRECT_CODE=508;
	public static final int XYSC_THREE_DIRECT_DRAW_CODE=509;
	public static final int XYSC_WZ_SINGLE_CODE=510;
	public static final int XYSC_WZ_POLY_CODE=511;
	public static final int XYSC_TWO_GROUP_SINGLE_CODE=512;
	public static final int XYSC_TWO_GROUP_POLY_CODE=513;
	public static final int XYSC_TWO_GROUP_DRAW_CODE=514;
	public static final int XYSC_THREE_GROUP_SINGLE_CODE=515;
	public static final int XYSC_THREE_GROUP_POLY_CODE=516;
	public static final int XYSC_THREE_GROUP_DRAW_CODE=517;
	public static final int XYSC_DXJO_CODE=518;
	public static final int XYSC_COMBINATION_CODE=519;


	// --------------------------- 竞彩单关 ---------------------------------//
	public static final String JC_PASS_TYPE_SINGLE = "单关";


	// --------------------------- 竞彩单关 ---------------------------------//


	public static boolean isBjdcSingle(int betType)
	{
		return betType==BJDC_SPF_SINGLE_CODE||betType==BJDC_ZJQS_SINGLE_CODE||betType==BJDC_SXDS_SINGLE_CODE||betType==BJDC_BF_SINGLE_CODE||betType==BJDC_BQC_SINGLE_CODE;
	}


	public static String getText(int betType)
	{
		switch(betType)
		{
			case SSL_COMBINATION_CODE:
			case SSC_COMBINATION_CODE:
			case ORIENT_COMBINATION_CODE:
			case DCBALL_COMBINATION_CODE:
			case STAR7_COMBINATION_CODE:
			case NAT297_COMBINATION_CODE:
			case HAPPY7_COMBINATION_CODE:
			case THREED_COMBINATION_CODE:
			case LOTTO_COMBINATION_CODE:
			case PL3_COMBINATION_CODE:
			case ZJ7_COMBINATION_CODE:
			case ZJ297_COMBINATION_CODE:
			case ZJ51_COMBINATION_CODE:
			case ZJ205_COMBINATION_CODE:
			case ZJ155_COMBINATION_CODE:
			case NAT225_COMBINATION_CODE:
			case FC61_COMBINATION_CODE:
			case JPLLC_COMBINATION_CODE:
			case SD115_COMBINATION_CODE:
			case SD235_COMBINATION_CODE:
			case HC1_COMBINATION_CODE:
			case KL123_COMBINATION_CODE:
			case JX115_COMBINATION_CODE:
			case GD115_COMBINATION_CODE:
			case JXSSC_COMBINATION_CODE:
			case BJ3D_COMBINATION_CODE:
			case CQKL10_COMBINATION_CODE:
			case NMK3_COMBINATION_CODE:
			case GXK3_COMBINATION_CODE:
			case SH115_COMBINATION_CODE:
			case XYSC_COMBINATION_CODE:return "组合投注";
			case BJDC_SPF_POLY_CODE:return BJDC_SPF_POLY;
			case BJDC_SPF_SINGLE_CODE:return BJDC_SPF_SINGLE;
			case BJDC_ZJQS_POLY_CODE:return BJDC_ZJQS_POLY;
			case BJDC_ZJQS_SINGLE_CODE:
				return BJDC_ZJQS_SINGLE;
			case BJDC_SXDS_POLY_CODE:
				return BJDC_SXDS_POLY;
			case BJDC_SXDS_SINGLE_CODE:
				return BJDC_SXDS_SINGLE;
			case BJDC_BF_POLY_CODE:
				return BJDC_BF_POLY;
			case BJDC_BF_SINGLE_CODE:
				return BJDC_BF_SINGLE;
			case BJDC_BQC_POLY_CODE:
				return BJDC_BQC_POLY;
			case BJDC_BQC_SINGLE_CODE:
				return BJDC_BQC_SINGLE;
			case KL123_REN_ONE_CODE:
				return KL123_REN_ONE;
			case KL123_REN_TWO_POLY_CODE:
				return KL123_REN_TWO_POLY;
			case KL123_REN_TWO_SINGLE_CODE:
				return KL123_REN_TWO_SINGLE;
			case KL123_REN_TWO_DRAW_CODE:
				return KL123_REN_TWO_DRAW;
			case KL123_REN_THREE_POLY_CODE:
				return KL123_REN_THREE_POLY;
			case KL123_REN_THREE_SINGLE_CODE:
				return KL123_REN_THREE_SINGLE;
			case KL123_REN_THREE_DRAW_CODE:
				return KL123_REN_THREE_DRAW;
			case KL123_REN_FOUR_POLY_CODE:
				return KL123_REN_FOUR_POLY;
			case KL123_REN_FOUR_SINGLE_CODE:
				return KL123_REN_FOUR_SINGLE;
			case KL123_REN_FOUR_DRAW_CODE:
				return KL123_REN_FOUR_DRAW;
			case KL123_REN_FIVE_POLY_CODE:
				return KL123_REN_FIVE_POLY;
			case KL123_REN_FIVE_SINGLE_CODE:
				return KL123_REN_FIVE_SINGLE;
			case KL123_REN_FIVE_DRAW_CODE:
				return KL123_REN_FIVE_DRAW;
			case KL123_REN_SIX_POLY_CODE:
				return KL123_REN_SIX_POLY;
			case KL123_REN_SIX_SINGLE_CODE:
				return KL123_REN_SIX_SINGLE;
			case KL123_REN_SIX_DRAW_CODE:
				return KL123_REN_SIX_DRAW;
			case KL123_REN_SEVEN_POLY_CODE:
				return KL123_REN_SEVEN_POLY;
			case KL123_REN_SEVEN_SINGLE_CODE:
				return KL123_REN_SEVEN_SINGLE;
			case KL123_REN_SEVEN_DRAW_CODE:
				return KL123_REN_SEVEN_DRAW;
			case KL123_REN_EIGHT_POLY_CODE:
				return KL123_REN_EIGHT_POLY;
			case KL123_REN_EIGHT_SINGLE_CODE:
				return KL123_REN_EIGHT_SINGLE;
			case KL123_REN_EIGHT_DRAW_CODE:
				return KL123_REN_EIGHT_DRAW;
			case KL123_REN_NINE_POLY_CODE:
				return KL123_REN_NINE_POLY;
			case KL123_REN_NINE_SINGLE_CODE:
				return KL123_REN_NINE_SINGLE;
			case KL123_REN_NINE_DRAW_CODE:
				return KL123_REN_NINE_DRAW;
			case KL123_REN_TEN_POLY_CODE:
				return KL123_REN_TEN_POLY;
			case KL123_REN_TEN_SINGLE_CODE:
				return KL123_REN_TEN_SINGLE;
			case KL123_REN_TEN_DRAW_CODE:
				return KL123_REN_TEN_DRAW;
			case JC_SPF_POLY_CODE:
				return JC_SPF_POLY;
			case JC_BF_POLY_CODE:
				return JC_BF_POLY;
			case JC_ZJQ_POLY_CODE:
				return JC_ZJQ_POLY;
			case JC_BQC_POLY_CODE:
				return JC_BQC_POLY;
			case JC_SPF_SINGLE_CODE:
				return JC_SPF_SINGLE;
			case JC_BF_SINGLE_CODE:
				return JC_BF_SINGLE;
			case JC_ZJQ_SINGLE_CODE:
				return JC_ZJQ_SINGLE;
			case JC_BQC_SINGLE_CODE:
				return JC_BQC_SINGLE;
			case HC1_DIGITAL_CODE:
				return HC1_DIGITAL;
			case HC1_ANIMAL_CODE:
				return HC1_ANIMAL;
			case HC1_LOCATION_CODE:
				return HC1_LOCATION;
			case HC1_SEASON_CODE:
				return HC1_SEASON;
			case SD235_SHUN_THREE_POLY_CODE:
				return SD235_SHUN_THREE_POLY;
			case SD235_SHUN_THREE_DIRECT_POLY_CODE:
				return SD235_SHUN_THREE_DIRECT_POLY;
			case SD235_SHUN_THREE_SINGLE_CODE:
				return SD235_SHUN_THREE_SINGLE;
			case SD235_SHUN_THREE_DRAW_CODE:
				return SD235_SHUN_THREE_DRAW;
			case SD235_SHUN_TWO_POLY_CODE:
				return SD235_SHUN_TWO_POLY;
			case SD235_SHUN_TWO_DIRECT_POLY_CODE:
				return SD235_SHUN_TWO_DIRECT_POLY;
			case SD235_SHUN_TWO_SINGLE_CODE:
				return SD235_SHUN_TWO_SINGLE;
			case SD235_SHUN_TWO_DRAW_CODE:
				return SD235_SHUN_TWO_DRAW;
			case SD235_SHUN_ONE_POLY_CODE:
				return SD235_SHUN_ONE_POLY;
			case SD235_SHUN_ONE_SINGLE_CODE:
				return SD235_SHUN_ONE_SINGLE;
			case SD235_WEI_FOUR_POLY_CODE:
				return SD235_WEI_FOUR_POLY;
			case SD235_WEI_FOUR_SINGLE_CODE:
				return SD235_WEI_FOUR_SINGLE;
			case SD235_WEI_FOUR_DRAW_CODE:
				return SD235_WEI_FOUR_DRAW;
			case SD235_WEI_THREE_POLY_CODE:
				return SD235_WEI_THREE_POLY;
			case SD235_WEI_THREE_SINGLE_CODE:
				return SD235_WEI_THREE_SINGLE;
			case SD235_WEI_THREE_DRAW_CODE:
				return SD235_WEI_THREE_DRAW;
			case SD235_WEI_TWO_POLY_CODE:
				return SD235_WEI_TWO_POLY;
			case SD235_WEI_TWO_SINGLE_CODE:
				return SD235_WEI_TWO_SINGLE;
			case SD235_WEI_TWO_DRAW_CODE:
				return SD235_WEI_TWO_DRAW;
			case SD235_REN_TEN_POLY_CODE:
				return SD235_REN_TEN_POLY;
			case SD235_REN_TEN_SINGLE_CODE:
				return SD235_REN_TEN_SINGLE;
			case SD235_REN_TEN_DRAW_CODE:
				return SD235_REN_TEN_DRAW;
			case SD235_REN_NINE_POLY_CODE:
				return SD235_REN_NINE_POLY;
			case SD235_REN_NINE_SINGLE_CODE:
				return SD235_REN_NINE_SINGLE;
			case SD235_REN_NINE_DRAW_CODE:
				return SD235_REN_NINE_DRAW;
			case SD235_REN_EIGHT_POLY_CODE:
				return SD235_REN_EIGHT_POLY;
			case SD235_REN_EIGHT_SINGLE_CODE:
				return SD235_REN_EIGHT_SINGLE;
			case SD235_REN_EIGHT_DRAW_CODE:
				return SD235_REN_EIGHT_DRAW;
			case SD235_REN_SEVEN_POLY_CODE:
				return SD235_REN_SEVEN_POLY;
			case SD235_REN_SEVEN_SINGLE_CODE:
				return SD235_REN_SEVEN_SINGLE;
			case SD235_REN_SEVEN_DRAW_CODE:
				return SD235_REN_SEVEN_DRAW;
			case SD235_REN_SIX_POLY_CODE:
				return SD235_REN_SIX_POLY;
			case SD235_REN_SIX_SINGLE_CODE:
				return SD235_REN_SIX_SINGLE;
			case SD235_REN_SIX_DRAW_CODE:
				return SD235_REN_SIX_DRAW;
			case SD235_REN_FIVE_POLY_CODE:
				return SD235_REN_FIVE_POLY;
			case SD235_REN_FIVE_SINGLE_CODE:
				return SD235_REN_FIVE_SINGLE;
			case SD235_REN_FIVE_DRAW_CODE:
				return SD235_REN_FIVE_DRAW;
			case SD235_REN_FOUR_POLY_CODE:
				return SD235_REN_FOUR_POLY;
			case SD235_REN_FOUR_SINGLE_CODE:
				return SD235_REN_FOUR_SINGLE;
			case SD235_REN_FOUR_DRAW_CODE:
				return SD235_REN_FOUR_DRAW;
			case SD235_REN_THREE_POLY_CODE:
				return SD235_REN_THREE_POLY;
			case SD235_REN_THREE_SINGLE_CODE:
				return SD235_REN_THREE_SINGLE;
			case SD235_REN_THREE_DRAW_CODE:
				return SD235_REN_THREE_DRAW;
			case SD235_REN_TWO_POLY_CODE:
				return SD235_REN_TWO_POLY;
			case SD235_REN_TWO_SINGLE_CODE:
				return SD235_REN_TWO_SINGLE;
			case SD235_REN_TWO_DRAW_CODE:
				return SD235_REN_TWO_DRAW;
			case SD235_REN_ONE_POLY_CODE:
				return SD235_REN_ONE_POLY;
			case SD235_REN_ONE_SINGLE_CODE:
				return SD235_REN_ONE_SINGLE;
			case SD115_ONE_DIRECT_SINGLE_CODE:
				return SD115_ONE_DIRECT_SINGLE;
			case SD115_ONE_DIRECT_POLY_CODE:
				return SD115_ONE_DIRECT_POLY;
			case SD115_ONE_SINGLE_CODE:
				return SD115_ONE_SINGLE;
			case SD115_ONE_POLY_CODE:
				return SD115_ONE_POLY;
			case SD115_TWO_SINGLE_CODE:
				return SD115_TWO_SINGLE;
			case SD115_TWO_POLY_CODE:
				return SD115_TWO_POLY;
			case SD115_TWO_DRAW_CODE:
				return SD115_TWO_DRAW;
			case SD115_TWO_DIRECT_SINGLE_CODE:
				return SD115_TWO_DIRECT_SINGLE;
			case SD115_TWO_DIRECT_POLY_CODE:
				return SD115_TWO_DIRECT_POLY;
			case SD115_TWO_DIRECT_CODE:
				return SD115_TWO_DIRECT;
			case SD115_TWO_GROUP_SINGLE_CODE:
				return SD115_TWO_GROUP_SINGLE;
			case SD115_TWO_GROUP_POLY_CODE:
				return SD115_TWO_GROUP_POLY;
			case SD115_THREE_SINGLE_CODE:
				return SD115_THREE_SINGLE;
			case SD115_THREE_POLY_CODE:
				return SD115_THREE_POLY;
			case SD115_THREE_DRAW_CODE:
				return SD115_THREE_DRAW;
			case SD115_THREE_DIRECT_SINGLE_CODE:
				return SD115_THREE_DIRECT_SINGLE;
			case SD115_THREE_DIRECT_POLY_CODE:
				return SD115_THREE_DIRECT_POLY;
			case SD115_THREE_DIRECT_CODE:
				return SD115_THREE_DIRECT;
			case SD115_THREE_DIRECT_SUM_CODE:
				return SD115_THREE_DIRECT_SUM;
			case SD115_THREE_GROUP_SINGLE_CODE:
				return SD115_THREE_GROUP_SINGLE;
			case SD115_THREE_GROUP_POLY_CODE:
				return SD115_THREE_GROUP_POLY;
			case SD115_THREE_GROUP_SUM_CODE:
				return SD115_THREE_GROUP_SUM;
			case SD115_FOUR_SINGLE_CODE:
				return SD115_FOUR_SINGLE;
			case SD115_FOUR_POLY_CODE:
				return SD115_FOUR_POLY;
			case SD115_FOUR_DRAW_CODE:
				return SD115_FOUR_DRAW;
			case SD115_FIVE_SINGLE_CODE:
				return SD115_FIVE_SINGLE;
			case SD115_FIVE_POLY_CODE:
				return SD115_FIVE_POLY;
			case SD115_FIVE_DRAW_CODE:
				return SD115_FIVE_DRAW;
			case SD115_SIX_SINGLE_CODE:
				return SD115_SIX_SINGLE;
			case SD115_SIX_POLY_CODE:
				return SD115_SIX_POLY;
			case SD115_SIX_DRAW_CODE:
				return SD115_SIX_DRAW;
			case SD115_SEVEN_SINGLE_CODE:
				return SD115_SEVEN_SINGLE;
			case SD115_SEVEN_POLY_CODE:
				return SD115_SEVEN_POLY;
			case SD115_SEVEN_DRAW_CODE:
				return SD115_SEVEN_DRAW;
			case SD115_EIGHT_SINGLE_CODE:
				return SD115_EIGHT_SINGLE;
			case SD115_EIGHT_POLY_CODE:
				return SD115_EIGHT_POLY;
			case SD115_EIGHT_DRAW_CODE:
				return SD115_EIGHT_DRAW;
			case SD115_TWO_DIRECT_DRAW_CODE:
				return SD115_TWO_DIRECT_DRAW;
			case SD115_TWO_GROUP_DRAW_CODE:
				return SD115_TWO_GROUP_DRAW;
			case SD115_THREE_DIRECT_DRAW_CODE:
				return SD115_THREE_DIRECT_DRAW;
			case SD115_THREE_GROUP_DRAW_CODE:
				return SD115_THREE_GROUP_DRAW;
			case SH115_ONE_SINGLE_CODE:
				//return SH115_ONE_SINGLE;
				return SH115_ONE_DIRECT_SINGLE;
			case SH115_ONE_POLY_CODE:
				//return SH115_ONE_POLY;
				return SH115_ONE_DIRECT_POLY;
			case SH115_TWO_SINGLE_CODE:
				return SH115_TWO_SINGLE;
			case SH115_TWO_POLY_CODE:
				return SH115_TWO_POLY;
			case SH115_TWO_DRAW_CODE:
				return SH115_TWO_DRAW;
			case SH115_TWO_DIRECT_SINGLE_CODE:
				return SH115_TWO_DIRECT_SINGLE;
			case SH115_TWO_DIRECT_POLY_CODE:
				return SH115_TWO_DIRECT_POLY;
			case SH115_TWO_DIRECT_CODE:
				return SH115_TWO_DIRECT;
			case SH115_TWO_GROUP_SINGLE_CODE:
				return SH115_TWO_GROUP_SINGLE;
			case SH115_TWO_GROUP_POLY_CODE:
				return SH115_TWO_GROUP_POLY;
			case SH115_THREE_SINGLE_CODE:
				return SH115_THREE_SINGLE;
			case SH115_THREE_POLY_CODE:
				return SH115_THREE_POLY;
			case SH115_THREE_DRAW_CODE:
				return SH115_THREE_DRAW;
			case SH115_THREE_DIRECT_SINGLE_CODE:
				return SH115_THREE_DIRECT_SINGLE;
			case SH115_THREE_DIRECT_POLY_CODE:
				return SH115_THREE_DIRECT_POLY;
			case SH115_THREE_DIRECT_CODE:
				return SH115_THREE_DIRECT;
			case SH115_THREE_DIRECT_SUM_CODE:
				return SH115_THREE_DIRECT_SUM;
			case SH115_THREE_GROUP_SINGLE_CODE:
				return SH115_THREE_GROUP_SINGLE;
			case SH115_THREE_GROUP_POLY_CODE:
				return SH115_THREE_GROUP_POLY;
			case SH115_THREE_GROUP_SUM_CODE:
				return SH115_THREE_GROUP_SUM;
			case SH115_FOUR_SINGLE_CODE:
				return SH115_FOUR_SINGLE;
			case SH115_FOUR_POLY_CODE:
				return SH115_FOUR_POLY;
			case SH115_FOUR_DRAW_CODE:
				return SH115_FOUR_DRAW;
			case SH115_FIVE_SINGLE_CODE:
				return SH115_FIVE_SINGLE;
			case SH115_FIVE_POLY_CODE:
				return SH115_FIVE_POLY;
			case SH115_FIVE_DRAW_CODE:
				return SH115_FIVE_DRAW;
			case SH115_SIX_SINGLE_CODE:
				return SH115_SIX_SINGLE;
			case SH115_SIX_POLY_CODE:
				return SH115_SIX_POLY;
			case SH115_SIX_DRAW_CODE:
				return SH115_SIX_DRAW;
			case SH115_SEVEN_SINGLE_CODE:
				return SH115_SEVEN_SINGLE;
			case SH115_SEVEN_POLY_CODE:
				return SH115_SEVEN_POLY;
			case SH115_SEVEN_DRAW_CODE:
				return SH115_SEVEN_DRAW;
			case SH115_EIGHT_SINGLE_CODE:
				return SH115_EIGHT_SINGLE;
			case SH115_EIGHT_POLY_CODE:
				return SH115_EIGHT_POLY;
			case SH115_EIGHT_DRAW_CODE:
				return SH115_EIGHT_DRAW;
			case SH115_TWO_DIRECT_DRAW_CODE:
				return SH115_TWO_DIRECT_DRAW;
			case SH115_TWO_GROUP_DRAW_CODE:
				return SH115_TWO_GROUP_DRAW;
			case SH115_THREE_DIRECT_DRAW_CODE:
				return SH115_THREE_DIRECT_DRAW;
			case SH115_THREE_GROUP_DRAW_CODE:
				return SH115_THREE_GROUP_DRAW;
			case SSC_FIVE_STAR_POLY_CODE:
				return SSC_FIVE_STAR_POLY;
			case SSC_FIVE_STAR_SINGLE_CODE:
				return SSC_FIVE_STAR_SINGLE;
			case SSC_THREE_STAR_POLY_CODE:
				return SSC_THREE_STAR_POLY;
			case SSC_THREE_STAR_SINGLE_CODE:
				return SSC_THREE_STAR_SINGLE;
			case SSC_THREE_STAR_SUM_CODE:
				return SSC_THREE_STAR_SUM;
			case SSC_THREE_STAR_DRAW_CODE:
				return SSC_THREE_STAR_DRAW;
			case SSC_TWO_STAR_DIRECT_POLY_CODE:
				return SSC_TWO_STAR_DIRECT_POLY;
			case SSC_TWO_STAR_DIRECT_SINGLE_CODE:
				return SSC_TWO_STAR_DIRECT_SINGLE;
			case SSC_TWO_STAR_DIRECT_SUM_CODE:
				return SSC_TWO_STAR_DIRECT_SUM;
			case SSC_TWO_STAR_GROUP_POLY_CODE:
				return SSC_TWO_STAR_GROUP_POLY;
			case SSC_TWO_STAR_GROUP_SINGLE_CODE:
				return SSC_TWO_STAR_GROUP_SINGLE;
			case SSC_TWO_STAR_GROUP_SUM_CODE:
				return SSC_TWO_STAR_GROUP_SUM;
			case SSC_TWO_STAR_GROUP_DRAW_CODE:
				return SSC_TWO_STAR_GROUP_DRAW;
			case SSC_ONE_STAR_ONE_CODE:
				return SSC_ONE_STAR_ONE;
			case SSC_DXDS_CODE:
				return SSC_DXDS;
			case SSC_FIVE_STAR_ALL_POLY_CODE:
				return SSC_FIVE_STAR_ALL_POLY;
			case SSC_FIVE_STAR_ALL_SINGLE_CODE:
				return SSC_FIVE_STAR_ALL_SINGLE;
			case SSC_THREE_STAR_GROUP6_POLY_CODE:
				return SSC_THREE_STAR_GROUP6_POLY;
			case SSC_THREE_STAR_GROUP3_POLY_CODE:
				return SSC_THREE_STAR_GROUP3_POLY;
			case SSC_THREE_STAR_GROUP_SINGLE_CODE:
				return SSC_THREE_STAR_GROUP_SINGLE;
			case SSC_THREE_STAR_GROUP_SUM_CODE:
				return SSC_THREE_STAR_GROUP_SUM;

			case SSC_GROUP3_DRAW_CODE:return SSC_GROUP3_DRAW;
			case SSC_GROUP6_DRAW_CODE:return SSC_GROUP6_DRAW;

			case SSL_DIRECT_CODE:
				return SSL_DIRECT;
			case SSL_DIRECT_SINGLE_CODE:
				return SSL_DIRECT_SINGLE;
			case SSL_DIRECT_POLY_CODE:
				return SSL_DIRECT_POLY;
			case SSL_DIRECT_SUM_CODE:
				return SSL_DIRECT_SUM;
			case SSL_DIRECT_DRAW_CODE:
				return SSL_DIRECT_DRAW;
			case SSL_DIRECT_ALL_CODE:
				return SSL_DIRECT_ALL;
			case SSL_GROUP3_CODE:
				return SSL_GROUP3;
			case SSL_GROUP6_CODE:
				return SSL_GROUP6;
			case SSL_GROUP_SUM_CODE:
				return SSL_GROUP_SUM;
			case SSL_GROUP_SINGLE_CODE:
				return SSL_GROUP_SINGLE;
			case SSL_FRONT_ONE_CODE:
				return SSL_FRONT_ONE;
			case SSL_FRONT_TWO_CODE:
				return SSL_FRONT_TWO;
			case SSL_FRONT_TWO_SINGLE_CODE:
				return SSL_FRONT_TWO_SINGLE;
			case SSL_FRONT_TWO_ALL_CODE:
				return SSL_FRONT_TWO_ALL;
			case SSL_AFTER_ONE_CODE:
				return SSL_AFTER_ONE;
			case SSL_AFTER_TWO_CODE:
				return SSL_AFTER_TWO;
			case SSL_AFTER_TWO_ALL_CODE:
				return SSL_AFTER_TWO_ALL;
			case SSL_AFTER_TWO_SINGLE_CODE:
				return SSL_AFTER_TWO_SINGLE;
			case ORIENT_LOTTO_SINGLE_CODE:
				return ORIENT_LOTTO_SINGLE;
			case ORIENT_LOTTO_POLY_CODE:
				return ORIENT_LOTTO_POLY;
			case ORIENT_LOTTO_DRAW_CODE:
				return ORIENT_LOTTO_DRAW;
			case LOTTO_SINGLE_CODE:
				return LOTTO_SINGLE;
			case LOTTO_POLY_CODE:
				return LOTTO_POLY;
			case LOTTO_DRAW_CODE:
				return LOTTO_DRAW;
			case LOTTO_ANIMAL_SINGLE_CODE:
				return LOTTO_ANIMAL_SINGLE;
			case LOTTO_ANIMAL_POLY_CODE:
				return LOTTO_ANIMAL_POLY;
			case PL3_DIRECT_CODE:
				return PL3_DIRECT;
			case PL3_DIRECT_SINGLE_CODE:
				return PL3_DIRECT_SINGLE;
			case PL3_DIRECT_POLY_CODE:
				return PL3_DIRECT_POLY;
			case PL3_DIRECT_DRAW_CODE:
				return PL3_DIRECT_DRAW;
			case PL3_DIRECT_SUM_CODE:
				return PL3_DIRECT_SUM;
			case PL3_GROUP_SINGLE_CODE:
				return PL3_GROUP_SINGLE;
			case PL3_GROUP3_CODE:
				return PL3_GROUP3;
			case PL3_GROUP6_CODE:
				return PL3_GROUP6;
			case PL3_GROUP6_POLY_CODE:
				return PL3_GROUP6_POLY;
			case PL3_GROUP6_SINGLE_CODE:
				return PL3_GROUP6_SINGLE;
			case PL3_GROUP_SUM_CODE:
				return PL3_GROUP_SUM;
			case PL3_KD_DIRECT_CODE:
				return PL3_KD_DIRECT;
			case PL3_KD_GROUP3_CODE:
				return PL3_KD_GROUP3;
			case PL3_KD_GROUP6_CODE:
				return PL3_KD_GROUP6;
			case PL5_SINGLE_CODE:
				return PL5_SINGLE;
			case PL5_POLY_CODE:
				return PL5_POLY;
			case PL3_GROUP3_DRAW_CODE:
				return PL3_GROUP3_DRAW;
			case PL3_GROUP6_DRAW_CODE:
				return PL3_GROUP6_DRAW;
			case PL3_GROUP3_SUM_CODE:
				return PL3_GROUP3_SUM;
			case PL3_GROUP6_SUM_CODE:
				return PL3_GROUP6_SUM;
			case THREED_DIRECT_CODE:
				return THREED_DIRECT;
			case THREED_DIRECT_SINGLE_CODE:
				return THREED_DIRECT_SINGLE;
			case THREED_DIRECT_POLY_CODE:
				return THREED_DIRECT_POLY;
			case THREED_DIRECT_DRAW_CODE:
				return THREED_DIRECT_DRAW;
			case THREED_DIRECT_SUM_CODE:
				return THREED_DIRECT_SUM;
			case THREED_GROUP3_CODE:
				return THREED_GROUP3;
			case THREED_GROUP6_CODE:
				return THREED_GROUP6;
			case THREED_GROUP6_SINGLE_CODE:
				return THREED_GROUP6_SINGLE;
			case THREED_GROUP6_POLY_CODE:
				return THREED_GROUP6_POLY;
			case THREED_GROUP_SINGLE_CODE:
				return THREED_GROUP_SINGLE;
			case THREED_GROUP_SUM_CODE:
				return THREED_GROUP_SUM;
			case THREED_KD_DIRECT_CODE:
				return THREED_KD_DIRECT;
			case THREED_KD_GROUP3_CODE:
				return THREED_KD_GROUP3;
			case THREED_KD_GROUP6_CODE:
				return THREED_KD_GROUP6;
			case THREED_GROUP3_DRAW_CODE:
				return THREED_GROUP3_DRAW;
			case THREED_GROUP6_DRAW_CODE:
				return THREED_GROUP6_DRAW;
			case THREED_GROUP3_SUM_CODE:
				return THREED_GROUP3_SUM;
			case THREED_GROUP6_SUM_CODE:
				return THREED_GROUP6_SUM;
			case ZJ7_SINGLE_CODE:
				return ZJ7_SINGLE;
			case ZJ7_POLY_CODE:
				return ZJ7_POLY;
			case ZJ51_SINGLE_CODE:
				return ZJ51_SINGLE;
			case ZJ51_POLY_CODE:
				return ZJ51_POLY;
			case ZJ205_SINGLE_CODE:
				return ZJ205_SINGLE;
			case ZJ205_POLY_CODE:
				return ZJ205_POLY;
			case ZJ205_DRAW_CODE:
				return ZJ205_DRAW;
			case ZJ155_SINGLE_CODE:
				return ZJ155_SINGLE;
			case ZJ155_POLY_CODE:
				return ZJ155_POLY;
			case ZJ155_DRAW_CODE:
				return ZJ155_DRAW;
			case DCBALL_SINGLE_CODE:
				return DCBALL_SINGLE;
			case DCBALL_POLY_CODE:
				return DCBALL_POLY;
			case DCBALL_DRAW_CODE:
				return DCBALL_DRAW;
			case NAT225_SINGLE_CODE:
				return NAT225_SINGLE;
			case NAT225_POLY_CODE:
				return NAT225_POLY;
			case NAT225_DRAW_CODE:
				return NAT225_DRAW;
			case NAT297_SINGLE_CODE:
				return NAT297_SINGLE;
			case NAT297_POLY_CODE:
				return NAT297_POLY;
			case NAT297_DRAW_CODE:
				return NAT297_DRAW;
			case ZJ297_SINGLE_CODE:
				return ZJ297_SINGLE;
			case ZJ297_POLY_CODE:
				return ZJ297_POLY;
			case ZJ297_DRAW_CODE:
				return ZJ297_DRAW;
			case HAPPY7_SINGLE_CODE:
				return HAPPY7_SINGLE;
			case HAPPY7_POLY_CODE:
				return HAPPY7_POLY;
			case HAPPY7_DRAW_CODE:
				return HAPPY7_DRAW;
			case STAR7_SINGLE_CODE:
				return STAR7_SINGLE;
			case STAR7_POLY_CODE:
				return STAR7_POLY;
			case TOTO14_SINGLE_CODE:
				return TOTO14_SINGLE;
			case TOTO14_POLY_CODE:
				return TOTO14_POLY;
			case TOTO9_SINGLE_CODE:
				return TOTO9_SINGLE;
			case TOTO9_POLY_CODE:
				return TOTO9_POLY;
			case TOTO9_DRAW_CODE:
				return TOTO9_DRAW;
			case TOTO6_SINGLE_CODE:
				return TOTO6_SINGLE;
			case TOTO6_POLY_CODE:
				return TOTO6_POLY;
			case GOAL4_SINGLE_CODE:
				return GOAL4_SINGLE;
			case GOAL4_POLY_CODE:
				return GOAL4_POLY;
			case FC61_POLY_CODE:
				return FC61_POLY;
			case FC61_SINGLE_CODE:
				return FC61_SINGLE;
			case JPLLC_SINGLE_CODE:
				return JPLLC_SINGLE;
			case JPLLC_POLY_CODE:
				return JPLLC_POLY;
			case JPLLC_DRAW_CODE:
				return JPLLC_DRAW;
			case BASKETBALL_SF_POLY_CODE:
				return BASKETBALL_SF_POLY;
			case BASKETBALL_RFSF_POLY_CODE:
				return BASKETBALL_RFSF_POLY;
			case BASKETBALL_FSC_POLY_CODE:
				return BASKETBALL_FSC_POLY;
			case BASKETBALL_DXF_POLY_CODE:
				return BASKETBALL_DXF_POLY;
			case FOOTBALL_SPF_POLY_CODE:
				return FOOTBALL_SPF_POLY;
			case FOOTBALL_SPF_SINGLE_CODE:
				return FOOTBALL_SPF_SINGLE;
			case FOOTBALL_RQSPF_POLY_CODE:
				return FOOTBALL_RQSPF_POLY;
			case FOOTBALL_RQSPF_SINGLE_CODE:
				return FOOTBALL_RQSPF_SINGLE;
			case FOOTBALL_BF_POLY_CODE:
				return FOOTBALL_BF_POLY;
			case FOOTBALL_BQC_POLY_CODE:
				return FOOTBALL_BQC_POLY;
			case FOOTBALL_ZJQS_POLY_CODE:
				return FOOTBALL_ZJQS_POLY;
			case FOOTBALL_GJ_POLY_CODE : return FOOTBALL_GJ_POLY;
			case FOOTBALL_SJB_GJ_POLY_CODE : return FOOTBALL_SJB_GJ_POLY;
			case FOOTBALL_GYJ_POLY_CODE : return FOOTBALL_GYJ_POLY;
			case JC_FOOTBALL_HUNHE_POLY_CODE:
				return JC_FOOTBALL_HUNHE_POLY;
			case JC_FOOTBALL_HUNHE_2X1_POLY_CODE:
				return JC_FOOTBALL_HUNHE_2X1_POLY;
			case JC_BASKETBALL_HUNHE_POLY_CODE:
				return JC_BASKETBALL_HUNHE_POLY;
			case  SFGG_DC_POLY_CODE:
				return SFGG_DC_POLY;
			case JX115_ONE_SINGLE_CODE:
				return JX115_ONE_SINGLE;
			case JX115_ONE_POLY_CODE:
				return JX115_ONE_POLY;
			case JX115_TWO_SINGLE_CODE:
				return JX115_TWO_SINGLE;
			case JX115_TWO_POLY_CODE:
				return JX115_TWO_POLY;
			case JX115_TWO_DRAW_CODE:
				return JX115_TWO_DRAW;
			case JX115_TWO_DIRECT_SINGLE_CODE:
				return JX115_TWO_DIRECT_SINGLE;
			case JX115_TWO_DIRECT_POLY_CODE:
				return JX115_TWO_DIRECT_POLY;
			case JX115_TWO_DIRECT_CODE:
				return JX115_TWO_DIRECT;
			case JX115_TWO_GROUP_SINGLE_CODE:return JX115_TWO_GROUP_SINGLE;
			case JX115_TWO_GROUP_POLY_CODE:return JX115_TWO_GROUP_POLY;
			case JX115_THREE_SINGLE_CODE:return JX115_THREE_SINGLE;
			case JX115_THREE_POLY_CODE:return JX115_THREE_POLY;
			case JX115_THREE_DRAW_CODE:return JX115_THREE_DRAW;
			case JX115_THREE_DIRECT_SINGLE_CODE:return JX115_THREE_DIRECT_SINGLE;
			case JX115_THREE_DIRECT_POLY_CODE:return JX115_THREE_DIRECT_POLY;
			case JX115_THREE_DIRECT_CODE:return JX115_THREE_DIRECT;
			case JX115_THREE_DIRECT_SUM_CODE:return JX115_THREE_DIRECT_SUM;
			case JX115_THREE_GROUP_SINGLE_CODE:return JX115_THREE_GROUP_SINGLE;
			case JX115_THREE_GROUP_POLY_CODE:return JX115_THREE_GROUP_POLY;
			case JX115_THREE_GROUP_SUM_CODE:return JX115_THREE_GROUP_SUM;
			case JX115_FOUR_SINGLE_CODE:return JX115_FOUR_SINGLE;
			case JX115_FOUR_POLY_CODE:return JX115_FOUR_POLY;
			case JX115_FOUR_DRAW_CODE:return JX115_FOUR_DRAW;
			case JX115_FIVE_SINGLE_CODE:return JX115_FIVE_SINGLE;
			case JX115_FIVE_POLY_CODE:return JX115_FIVE_POLY;
			case JX115_FIVE_DRAW_CODE:return JX115_FIVE_DRAW;
			case JX115_SIX_SINGLE_CODE:return JX115_SIX_SINGLE;
			case JX115_SIX_POLY_CODE:return JX115_SIX_POLY;
			case JX115_SIX_DRAW_CODE:return JX115_SIX_DRAW;
			case JX115_SEVEN_SINGLE_CODE:return JX115_SEVEN_SINGLE;
			case JX115_SEVEN_POLY_CODE:return JX115_SEVEN_POLY;
			case JX115_SEVEN_DRAW_CODE:return JX115_SEVEN_DRAW;
			case JX115_EIGHT_SINGLE_CODE:return JX115_EIGHT_SINGLE;
			case JX115_EIGHT_POLY_CODE:return JX115_EIGHT_POLY;
			case JX115_EIGHT_DRAW_CODE:return JX115_EIGHT_DRAW;
			case JX115_TWO_DIRECT_DRAW_CODE:return JX115_TWO_DIRECT_DRAW;
			case JX115_TWO_GROUP_DRAW_CODE:return JX115_TWO_GROUP_DRAW;
			case JX115_THREE_DIRECT_DRAW_CODE:return JX115_THREE_DIRECT_DRAW;
			case JX115_THREE_GROUP_DRAW_CODE:return JX115_THREE_GROUP_DRAW;
			case JXSSC_ONE_STAR_CODE:return JXSSC_ONE_STAR;
			case JXSSC_TWO_STAR_DIRECT_POLY_CODE:return JXSSC_TWO_STAR_DIRECT_POLY;
			case JXSSC_TWO_STAR_DIRECT_SINGLE_CODE:return JXSSC_TWO_STAR_DIRECT_SINGLE;
			case JXSSC_TWO_STAR_DIRECT_SUM_CODE:return JXSSC_TWO_STAR_DIRECT_SUM;
			case JXSSC_TWO_STAR_GROUP_POLY_CODE:return JXSSC_TWO_STAR_GROUP_POLY;
			case JXSSC_TWO_STAR_GROUP_SINGLE_CODE:return JXSSC_TWO_STAR_GROUP_SINGLE;
			case JXSSC_TWO_STAR_GROUP_SUM_CODE:return JXSSC_TWO_STAR_GROUP_SUM;
			case JXSSC_TWO_STAR_GROUP_DRAW_CODE:return JXSSC_TWO_STAR_GROUP_DRAW;
			case JXSSC_THREE_STAR_DIRECT_POLY_CODE:return JXSSC_THREE_STAR_DIRECT_POLY;
			case JXSSC_THREE_STAR_DIRECT_SINGLE_CODE:return JXSSC_THREE_STAR_DIRECT_SINGLE;
			case JXSSC_THREE_STAR_DIRECT_SUM_CODE:return JXSSC_THREE_STAR_DIRECT_SUM;
			case JXSSC_THREE_STAR_DIRECT_DRAW_CODE:return JXSSC_THREE_STAR_DIRECT_DRAW;
			case JXSSC_THREE_STAR_GROUP3_POLY_CODE:return JXSSC_THREE_STAR_GROUP3_POLY;
			case JXSSC_THREE_STAR_GROUP6_POLY_CODE:return JXSSC_THREE_STAR_GROUP6_POLY;
			case JXSSC_THREE_STAR_GROUP_SINGLE_CODE:return JXSSC_THREE_STAR_GROUP_SINGLE;
			case JXSSC_THREE_STAR_GROUP_SUM_CODE:return JXSSC_THREE_STAR_GROUP_SUM;
			case JXSSC_FOUR_STAR_POLY_CODE:return JXSSC_FOUR_STAR_POLY;
			case JXSSC_FOUR_STAR_SINGLE_CODE:return JXSSC_FOUR_STAR_SINGLE;
			case JXSSC_FIVE_STAR_POLY_CODE:return JXSSC_FIVE_STAR_POLY;
			case JXSSC_FIVE_STAR_SINGLE_CODE:return JXSSC_FIVE_STAR_SINGLE;
			case JXSSC_FIVE_STAR_ALL_POLY_CODE:return JXSSC_FIVE_STAR_ALL_POLY;
			case JXSSC_FIVE_STAR_ALL_SINGLE_CODE:return JXSSC_FIVE_STAR_ALL_SINGLE;
			case JXSSC_REN_ONE_STAR_POLY_CODE:return JXSSC_REN_ONE_STAR_POLY;
			case JXSSC_REN_TWO_STAR_POLY_CODE:return JXSSC_REN_TWO_STAR_POLY;
			case JXSSC_DXDS_CODE:return JXSSC_DXDS;
			case JXSSC_GROUP3_DRAW_CODE:return JXSSC_GROUP3_DRAW;
			case JXSSC_GROUP6_DRAW_CODE:return JXSSC_GROUP6_DRAW;


			case GD115_ONE_SINGLE_CODE:return GD115_ONE_SINGLE;
			case GD115_ONE_POLY_CODE:return GD115_ONE_POLY;
			case GD115_TWO_SINGLE_CODE:return GD115_TWO_SINGLE;
			case GD115_TWO_POLY_CODE:return GD115_TWO_POLY;
			case GD115_TWO_DRAW_CODE:return GD115_TWO_DRAW;
			case GD115_TWO_DIRECT_SINGLE_CODE:return GD115_TWO_DIRECT_SINGLE;
			case GD115_TWO_DIRECT_POLY_CODE:return GD115_TWO_DIRECT_POLY;
			case GD115_TWO_DIRECT_CODE:return GD115_TWO_DIRECT;
			case GD115_TWO_GROUP_SINGLE_CODE:return GD115_TWO_GROUP_SINGLE;
			case GD115_TWO_GROUP_POLY_CODE:return GD115_TWO_GROUP_POLY;
			case GD115_THREE_SINGLE_CODE:return GD115_THREE_SINGLE;
			case GD115_THREE_POLY_CODE:return GD115_THREE_POLY;
			case GD115_THREE_DRAW_CODE:return GD115_THREE_DRAW;
			case GD115_THREE_DIRECT_SINGLE_CODE:return GD115_THREE_DIRECT_SINGLE;
			case GD115_THREE_DIRECT_POLY_CODE:return GD115_THREE_DIRECT_POLY;
			case GD115_THREE_DIRECT_CODE:return GD115_THREE_DIRECT;
			case GD115_THREE_DIRECT_SUM_CODE:return GD115_THREE_DIRECT_SUM;
			case GD115_THREE_GROUP_SINGLE_CODE:return GD115_THREE_GROUP_SINGLE;
			case GD115_THREE_GROUP_POLY_CODE:return GD115_THREE_GROUP_POLY;
			case GD115_THREE_GROUP_SUM_CODE:return GD115_THREE_GROUP_SUM;
			case GD115_FOUR_SINGLE_CODE:return GD115_FOUR_SINGLE;
			case GD115_FOUR_POLY_CODE:return GD115_FOUR_POLY;
			case GD115_FOUR_DRAW_CODE:return GD115_FOUR_DRAW;
			case GD115_FIVE_SINGLE_CODE:return GD115_FIVE_SINGLE;
			case GD115_FIVE_POLY_CODE:return GD115_FIVE_POLY;
			case GD115_FIVE_DRAW_CODE:return GD115_FIVE_DRAW;
			case GD115_SIX_SINGLE_CODE:return GD115_SIX_SINGLE;
			case GD115_SIX_POLY_CODE:return GD115_SIX_POLY;
			case GD115_SIX_DRAW_CODE:return GD115_SIX_DRAW;
			case GD115_SEVEN_SINGLE_CODE:return GD115_SEVEN_SINGLE;
			case GD115_SEVEN_POLY_CODE:return GD115_SEVEN_POLY;
			case GD115_SEVEN_DRAW_CODE:return GD115_SEVEN_DRAW;
			case GD115_EIGHT_SINGLE_CODE:return GD115_EIGHT_SINGLE;
			case GD115_EIGHT_POLY_CODE:return GD115_EIGHT_POLY;
			case GD115_EIGHT_DRAW_CODE:return GD115_EIGHT_DRAW;
			case GD115_TWO_DIRECT_DRAW_CODE:return GD115_TWO_DIRECT_DRAW;
			case GD115_TWO_GROUP_DRAW_CODE:return GD115_TWO_GROUP_DRAW;
			case GD115_THREE_DIRECT_DRAW_CODE:return GD115_THREE_DIRECT_DRAW;
			case GD115_THREE_GROUP_DRAW_CODE:return GD115_THREE_GROUP_DRAW;
			case BJ3D_DIRECT_CODE:return BJ3D_DIRECT;
			case BJ3D_DIRECT_POLY_CODE:return BJ3D_DIRECT_POLY;
			case BJ3D_DIRECT_SINGLE_CODE:return BJ3D_DIRECT_SINGLE;
			case BJ3D_DIRECT_DRAW_CODE:return BJ3D_DIRECT_DRAW;
			case BJ3D_DIRECT_SUM_CODE:return BJ3D_DIRECT_SUM;
			case BJ3D_GROUP3_CODE:return BJ3D_GROUP3;
			case BJ3D_GROUP3_SUM_CODE:return BJ3D_GROUP3_SUM;
			case BJ3D_GROUP3_DRAW_CODE:return BJ3D_GROUP3_DRAW;
			case BJ3D_GROUP6_CODE:return BJ3D_GROUP6;
			case BJ3D_GROUP6_SUM_CODE:return BJ3D_GROUP6_SUM;
			case BJ3D_GROUP6_DRAW_CODE:return BJ3D_GROUP6_DRAW;
			case BJ3D_GROUP_SINGLE_CODE:return BJ3D_GROUP_SINGLE;
			case BJ3D_GROUP3_KD_CODE:return BJ3D_GROUP3_KD;
			case BJ3D_GROUP6_KD_CODE:return BJ3D_GROUP6_KD;
			case BJ3D_DIRECT_KD_CODE:return BJ3D_DIRECT_KD;
			case BJ3D_ONE_POLY_CODE:return BJ3D_ONE_POLY;
			case BJ3D_TWO_POLY_CODE:return BJ3D_TWO_POLY;
			case BJ3D_ALL_POLY_CODE:return BJ3D_ALL_POLY;
			case BJ3D_ALL_SINGLE_CODE:return BJ3D_ALL_SINGLE;
			//重庆快乐十分
			case CQKL10_ONE_DIRECT_SINGLE_CODE:return CQKL10_ONE_DIRECT_SINGLE;
			case CQKL10_ONE_POLY_CODE:return CQKL10_ONE_POLY;
			case CQKL10_ONE_RED_CODE:return CQKL10_ONE_RED;
			case CQKL10_TWO_GROUP_CODE:return CQKL10_TWO_GROUP;
			case CQKL10_TWO_GROUP_POLY_CODE:return CQKL10_TWO_GROUP_POLY;
			case CQKL10_TWO_GROUP_DRAW_CODE:return CQKL10_TWO_GROUP_DRAW;
			case CQKL10_TWO_DIRECT_CODE:return CQKL10_TWO_DIRECT;
			case CQKL10_TWO_DIRECT_SINGLE_CODE:return CQKL10_TWO_DIRECT_SINGLE;
			case CQKL10_TWO_DIRECT_DRAW_CODE:return CQKL10_TWO_DIRECT_DRAW;
			case CQKL10_THREE_GROUP_CODE:return CQKL10_THREE_GROUP;
			case CQKL10_THREE_GROUP_POLY_CODE:return CQKL10_THREE_GROUP_POLY;
			case CQKL10_THREE_GROUP_DRAW_CODE:return CQKL10_THREE_GROUP_DRAW;
			case CQKL10_THREE_DIRECT_CODE:return CQKL10_THREE_DIRECT;
			case CQKL10_THREE_DIRECT_SINGLE_CODE:return CQKL10_THREE_DIRECT_SINGLE;
			case CQKL10_THREE_DIRECT_DRAW_CODE:return CQKL10_THREE_DIRECT_DRAW;
			case CQKL10_TWO_SINGLE_CODE:return CQKL10_TWO_SINGLE;
			case CQKL10_TWO_POLY_CODE:return CQKL10_TWO_POLY;
			case CQKL10_TWO_DRAW_CODE:return CQKL10_TWO_DRAW;
			case CQKL10_THREE_SINGLE_CODE:return CQKL10_THREE_SINGLE;
			case CQKL10_THREE_POLY_CODE:return CQKL10_THREE_POLY;
			case CQKL10_THREE_DRAW_CODE:return CQKL10_THREE_DRAW;
			case CQKL10_FOUR_SINGLE_CODE:return CQKL10_FOUR_SINGLE;
			case CQKL10_FOUR_POLY_CODE:return CQKL10_FOUR_POLY;
			case CQKL10_FOUR_DRAW_CODE:return CQKL10_FOUR_DRAW;
			case CQKL10_FIVE_SINGLE_CODE:return CQKL10_FIVE_SINGLE;
			case CQKL10_FIVE_POLY_CODE:return CQKL10_FIVE_POLY;
			case CQKL10_FIVE_DRAW_CODE:return CQKL10_FIVE_DRAW;
			//内蒙快三
			case NMK3_SUM_SINGLE_CODE: return NMK3_SUM_SINGLE;
			case NMK3_SUM_POLY_CODE: return NMK3_SUM_POLY;
			case NMK3_THREE_SAME_ALL_CODE: return NMK3_THREE_SAME_ALL;
			case NMK3_THREE_SAME_ALONE_CODE: return NMK3_THREE_SAME_ALONE;
			case NMK3_THREE_DIFFERENT_POLY_CODE:  return NMK3_THREE_DIFFERENT_POLY;
			case NMK3_THREE_DIFFERENT_DRAW_CODE:  return NMK3_THREE_DIFFERENT_DRAW;
			case NMK3_THREE_DIFFERENT_KD_CODE: return NMK3_THREE_DIFFERENT_KD;
			case NMK3_THREE_DIFFERENT_SINGLE_CODE: return NMK3_THREE_DIFFERENT_SINGLE;
			case NMK3_THREE_LINK_ALL_CODE: return NMK3_THREE_LINK_ALL ;
			case NMK3_TWO_SAME_CODE: return NMK3_TWO_SAME;
			case NMK3_TWO_SAME_ALONE_KD_CODE: return NMK3_TWO_SAME_ALONE_KD;
			case NMK3_TWO_SAME_ALONE_POLY_CODE: return NMK3_TWO_SAME_ALONE_POLY;
			case NMK3_TWO_DIFFERENT_DRAW_CODE: return NMK3_TWO_DIFFERENT_DRAW;
			case NMK3_TWO_DIFFERENT_POLY_CODE: return NMK3_TWO_DIFFERENT_POLY;
			//幸运赛车
			case XYSC_ONE_DIRECT_SINGLE_CODE:return XYSC_ONE_DIRECT_SINGLE;
			case XYSC_ONE_DIRECT_POLY_CODE:return XYSC_ONE_DIRECT_POLY;
			case XYSC_TWO_DIRECT_SINGLE_CODE:return XYSC_TWO_DIRECT_SINGLE;
			case XYSC_TWO_DIRECT_CODE:return XYSC_TWO_DIRECT;
			case XYSC_TWO_DIRECT_DRAW_CODE:return XYSC_TWO_DIRECT_DRAW;
			case XYSC_THREE_DIRECT_SINGLE_CODE:return XYSC_THREE_DIRECT_SINGLE;
			case XYSC_THREE_DIRECT_CODE:return XYSC_THREE_DIRECT;
			case XYSC_THREE_DIRECT_DRAW_CODE:return XYSC_THREE_DIRECT_DRAW;
			case XYSC_WZ_SINGLE_CODE:return XYSC_WZ_SINGLE;
			case XYSC_WZ_POLY_CODE:return XYSC_WZ_POLY;
			case XYSC_TWO_GROUP_SINGLE_CODE:return XYSC_TWO_GROUP_SINGLE;
			case XYSC_TWO_GROUP_POLY_CODE:return XYSC_TWO_GROUP_POLY;
			case XYSC_TWO_GROUP_DRAW_CODE:return XYSC_TWO_GROUP_DRAW;
			case XYSC_THREE_GROUP_SINGLE_CODE:return XYSC_THREE_GROUP_SINGLE;
			case XYSC_THREE_GROUP_POLY_CODE:return XYSC_THREE_GROUP_POLY;
			case XYSC_THREE_GROUP_DRAW_CODE:return XYSC_THREE_GROUP_DRAW;
			case XYSC_DXJO_CODE:return XYSC_DXJO;

			//广西快3
			case GXK3_SUM_SINGLE_CODE: return GXK3_SUM_SINGLE;
			case GXK3_SUM_POLY_CODE: return GXK3_SUM_POLY;
			case GXK3_THREE_SAME_ALL_CODE: return GXK3_THREE_SAME_ALL;
			case GXK3_THREE_SAME_ALONE_CODE: return GXK3_THREE_SAME_ALONE;
			case GXK3_THREE_DIFFERENT_POLY_CODE:  return GXK3_THREE_DIFFERENT_POLY;
			case GXK3_THREE_DIFFERENT_DRAW_CODE:  return GXK3_THREE_DIFFERENT_DRAW;
			case GXK3_THREE_DIFFERENT_KD_CODE: return GXK3_THREE_DIFFERENT_KD;
			case GXK3_THREE_DIFFERENT_SINGLE_CODE: return GXK3_THREE_DIFFERENT_SINGLE;
			case GXK3_THREE_LINK_ALL_CODE: return GXK3_THREE_LINK_ALL ;
			case GXK3_TWO_SAME_CODE: return GXK3_TWO_SAME;
			case GXK3_TWO_SAME_ALONE_KD_CODE: return GXK3_TWO_SAME_ALONE_KD;
			case GXK3_TWO_SAME_ALONE_POLY_CODE: return GXK3_TWO_SAME_ALONE_POLY;
			case GXK3_TWO_DIFFERENT_DRAW_CODE: return GXK3_TWO_DIFFERENT_DRAW;
			case GXK3_TWO_DIFFERENT_POLY_CODE: return GXK3_TWO_DIFFERENT_POLY;

			//上海快3
			case SHK3_SUM_SINGLE_CODE: return SHK3_SUM_SINGLE;
			case SHK3_SUM_POLY_CODE: return SHK3_SUM_POLY;
			case SHK3_THREE_SAME_ALL_CODE: return SHK3_THREE_SAME_ALL;
			case SHK3_THREE_SAME_ALONE_CODE: return SHK3_THREE_SAME_ALONE;
			case SHK3_THREE_DIFFERENT_POLY_CODE:  return SHK3_THREE_DIFFERENT_POLY;
			case SHK3_THREE_DIFFERENT_DRAW_CODE:  return SHK3_THREE_DIFFERENT_DRAW;
			case SHK3_THREE_DIFFERENT_KD_CODE: return SHK3_THREE_DIFFERENT_KD;
			case SHK3_THREE_DIFFERENT_SINGLE_CODE: return SHK3_THREE_DIFFERENT_SINGLE;
			case SHK3_THREE_LINK_ALL_CODE: return SHK3_THREE_LINK_ALL ;
			case SHK3_TWO_SAME_CODE: return SHK3_TWO_SAME_POLY;
			case SHK3_TWO_SAME_ALONE_KD_CODE: return SHK3_TWO_SAME_ALONE_KD;
			case SHK3_TWO_SAME_ALONE_POLY_CODE: return SHK3_TWO_SAME_ALONE_POLY;
			case SHK3_TWO_DIFFERENT_DRAW_CODE: return SHK3_TWO_DIFFERENT_DRAW;
			case SHK3_TWO_DIFFERENT_POLY_CODE: return SHK3_TWO_DIFFERENT_POLY;

		}
		return null;
	}

	public  static int getNameCode(String lotteryId,String name){
		if(nameToCodeMap.containsKey(lotteryId)){
			Map<String,Integer> m= nameToCodeMap.get(lotteryId);
			if(m.isEmpty()){
				return 9999;//代表没查询到
			}else{
				//处理旧版本部分汉字显示问题
				if(lotteryId.equals("10023")){//排列3
					if("直选定位".equals(name)){
						return 2;
					}
				}else if(lotteryId.equals("10024")){//排列5
					if("排列五单式".equals(name)){
						return 9;
					}else if("排列五复式".equals(name)){
						return 10;
					}
				}else if(lotteryId.equals("10025")){//福彩3D
					if("单选定位".equals(name)){
						return 332;
					}else if("单选复式".equals(name)){
						return 332;
					}else if("单选单式".equals(name)){
						return 13;
					}
				}

				if(m.containsKey(name)){
					return m.get(name);
				}else{
					return 9999;//代表没查询到
				}
			}
		}else{
			return 9999;//代表没查询到
		}
	}

	public  static String  getCodeName(String lotteryId,int code){
		if(codeToNameMap.containsKey(lotteryId)){
			Map<Integer,String> m= codeToNameMap.get(lotteryId);
			if(m.isEmpty()){
				return getText(code);
				//return "";//代表没查询到
			}else{
				if(m.containsKey(code)){
					return m.get(code);
				}else{
					return getText(code);
					//return "";//代表没查询到
				}
			}
		}else{
			return getText(code);
		}
	}

//	public static void main(String[] args)
//	{
//	//	int s=getNameCode("10033","试试");
//	//	System.out.println( s);
//		for (String key : codeToNameMap.keySet()) {
//			Map<Integer,String> m= codeToNameMap.get(key);
//			if(!m.isEmpty()){
//				System.out.println(key );
//				for (int key1 : m.keySet()) {
//					System.out.println( key1 + " " + m.get(key1));
//				}
//			}
//		}
//	}


	private static Map<String,Map<Integer,String>> codeToNameMap=new HashMap<String,Map<Integer,String>>(){{
		put( "10023" , new HashMap<Integer, String>() {{
			//put( "53" , "排列3" );
            put(	PL3_DIRECT_SINGLE_CODE	,	PL3_DIRECT_SINGLE	);
            put(	PL3_DIRECT_POLY_CODE	,	PL3_DIRECT_POLY	);
            put(	PL3_GROUP3_SINGLE_CODE	,	PL3_GROUP3_SINGLE	);
            put(	PL3_GROUP3_POLY_CODE	,	PL3_GROUP3_POLY	);
            put(	PL3_GROUP6_SINGLE_CODE	,	PL3_GROUP6_SINGLE	);
            put(	PL3_GROUP6_POLY_CODE	,	PL3_GROUP6_POLY	);
            put(	PL3_COMBINATION_CODE	,	PL3_COMBINATION	);
		}});
		put( "10024" , new HashMap<Integer, String>() {{
			//put( "52" , "排列5" );
			put(	PL5_SINGLE_CODE	,	PL5_SINGLE	);
			put(	PL5_POLY_CODE	,	PL5_POLY	);
			put(	PL5_COMBINATION_CODE	,	PL5_COMBINATION	);
		}});
		put( "10025" , new HashMap<Integer, String>() {{
			// put( "" , "福彩3D" );
			put(	THREED_DIRECT_SINGLE_CODE	,	THREED_DIRECT_SINGLE	);
			put(	THREED_DIRECT_POLY_CODE	,	THREED_DIRECT_POLY	);
			put(	THREED_GROUP3_SINGLE_CODE	,	THREED_GROUP3_SINGLE	);
			put(	THREED_GROUP3_POLY_CODE	,	THREED_GROUP3_POLY	);
			put(	THREED_GROUP6_SINGLE_CODE	,	THREED_GROUP6_SINGLE	);
			put(	THREED_GROUP6_POLY_CODE	,	THREED_GROUP6_POLY	);
			put(	THREED_COMBINATION_CODE	,	THREED_COMBINATION	);
		}});
		put( "10026" , new HashMap<Integer, String>() {{
			//put( "50" , "超级大乐透" );
			put(	LOTTO_SINGLE_CODE	,	LOTTO_SINGLE	);
			put(	LOTTO_POLY_CODE	,	LOTTO_POLY	);
			put(	LOTTO_DRAW_CODE	,	LOTTO_DRAW	);
			put(	LOTTO_COMBINATION_CODE	,	LOTTO_COMBINATION	);
		}});
		put( "10030" , new HashMap<Integer, String>() {{
			//put( "51" , "七星彩" );
			put(	STAR7_SINGLE_CODE	,	STAR7_SINGLE	);
			put(	STAR7_POLY_CODE	,	STAR7_POLY	);
			put(	STAR7_COMBINATION_CODE	,	STAR7_COMBINATION	);
		}});
		put( "10032" , new HashMap<Integer, String>() {{
			//put( "01" , "双色球" );
			put(	DCBALL_SINGLE_CODE	,	DCBALL_SINGLE	);
			put(	DCBALL_POLY_CODE	,	DCBALL_POLY	);
			put(	DCBALL_DRAW_CODE	,	DCBALL_DRAW	);
			put(	DCBALL_COMBINATION_CODE	,	DCBALL_COMBINATION	);
		}});
		put( "10033" , new HashMap<Integer, String>() {{
			//put( "07" , "七乐彩" );
			put(	HAPPY7_SINGLE_CODE	,	HAPPY7_SINGLE	);
			put(	HAPPY7_POLY_CODE	,	HAPPY7_POLY	);
			put(	HAPPY7_COMBINATION_CODE	,	HAPPY7_COMBINATION	);
		}});
		put( "10038" , new HashMap<Integer, String>() {{
			//put( "07" , "时时彩" );

		}});
		put( "10039" , new HashMap<Integer, String>() {{
			//put( "80" , "胜负彩" );
            put(	TOTO14_SINGLE_CODE	,	TOTO14_SINGLE	);
            put(	TOTO14_POLY_CODE	,	TOTO14_POLY	);
		}});
		put( "10040" , new HashMap<Integer, String>() {{
			//put( "81" , "任选九场" );
            put(	TOTO9_SINGLE_CODE	,	TOTO9_SINGLE	);
            put(	TOTO9_POLY_CODE	,	TOTO9_POLY	);
		}});
		put( "10041" , new HashMap<Integer, String>() {{
			//put( "83" , "6场半全场" );
		}});
		put( "10042" , new HashMap<Integer, String>() {{
			//put( "83" , "四场进球彩" );
		}});
		put( "10046" , new HashMap<Integer, String>() {{
			//put( "56" , "十一运夺金" );
			put(	SD115_ONE_SINGLE_CODE	,	SD115_ONE_SINGLE	);
			put(	SD115_ONE_POLY_CODE	,	SD115_ONE_POLY	);
			put(	SD115_TWO_SINGLE_CODE	,	SD115_TWO_SINGLE	);
			put(	SD115_TWO_POLY_CODE	,	SD115_TWO_POLY	);
			put(	SD115_THREE_SINGLE_CODE	,	SD115_THREE_SINGLE	);
			put(	SD115_THREE_POLY_CODE	,	SD115_THREE_POLY	);
			put(	SD115_FOUR_SINGLE_CODE	,	SD115_FOUR_SINGLE	);
			put(	SD115_FOUR_POLY_CODE	,	SD115_FOUR_POLY	);
			put(	SD115_FIVE_SINGLE_CODE	,	SD115_FIVE_SINGLE	);
			put(	SD115_FIVE_POLY_CODE	,	SD115_FIVE_POLY	);
			put(	SD115_SIX_SINGLE_CODE	,	SD115_SIX_SINGLE	);
			put(	SD115_SIX_POLY_CODE	,	SD115_SIX_POLY	);
			put(	SD115_SEVEN_SINGLE_CODE	,	SD115_SEVEN_SINGLE	);
			put(	SD115_SEVEN_POLY_CODE	,	SD115_SEVEN_POLY	);
			put(	SD115_EIGHT_SINGLE_CODE	,	SD115_EIGHT_SINGLE	);
			put(	SD115_EIGHT_POLY_CODE	,	SD115_EIGHT_POLY	);
			put(	SD115_ONE_DIRECT_SINGLE_CODE	,	SD115_ONE_DIRECT_SINGLE	);
			put(	SD115_ONE_DIRECT_POLY_CODE	,	SD115_ONE_DIRECT_POLY	);
			put(	SD115_TWO_DIRECT_SINGLE_CODE	,	SD115_TWO_DIRECT_SINGLE	);
			put(	SD115_TWO_DIRECT_POLY_CODE	,	SD115_TWO_DIRECT_POLY	);
			put(	SD115_THREE_DIRECT_SINGLE_CODE	,	SD115_THREE_DIRECT_SINGLE	);
			put(	SD115_THREE_DIRECT_POLY_CODE	,	SD115_THREE_DIRECT_POLY	);
			put(	SD115_TWO_GROUP_SINGLE_CODE	,	SD115_TWO_GROUP_SINGLE	);
			put(	SD115_TWO_GROUP_POLY_CODE	,	SD115_TWO_GROUP_POLY	);
			put(	SD115_THREE_GROUP_SINGLE_CODE	,	SD115_THREE_GROUP_SINGLE	);
			put(	SD115_THREE_GROUP_POLY_CODE	,	SD115_THREE_GROUP_POLY	);
			put(	SD115_COMBINATION_CODE	,	SD115_COMBINATION	);
		}});
		put( "10042" , new HashMap<Integer, String>() {{
			//put( "82" , "4场进球彩" );
		}});
		put( "10057" , new HashMap<Integer, String>() {{
			//put( "" , "北京单场" );
		}});
		put( "10058" , new HashMap<Integer, String>() {{
			//put( "" , "竞彩篮球" );
			put(	BASKETBALL_SF_POLY_CODE	,	BASKETBALL_SF_POLY	);
			put(	BASKETBALL_RFSF_POLY_CODE	,	BASKETBALL_RFSF_POLY	);
			put(	BASKETBALL_FSC_POLY_CODE	,	BASKETBALL_FSC_POLY	);
			put(	BASKETBALL_DXF_POLY_CODE	,	BASKETBALL_DXF_POLY	);
		}});
		put( "10059" , new HashMap<Integer, String>() {{
			//put( "" , "竞彩足球" );
			put(	FOOTBALL_SPF_POLY_CODE	,	FOOTBALL_SPF_POLY	);
			put(	FOOTBALL_RQSPF_POLY_CODE	,	FOOTBALL_RQSPF_POLY	);
			put(	FOOTBALL_SPF_SINGLE_CODE	,	FOOTBALL_SPF_SINGLE	);
			put(	FOOTBALL_RQSPF_SINGLE_CODE	,	FOOTBALL_RQSPF_SINGLE	);
			put(	FOOTBALL_ZJQS_POLY_CODE	,	FOOTBALL_ZJQS_POLY	);
			put(	FOOTBALL_BF_POLY_CODE	,	FOOTBALL_BF_POLY	);
			put(	FOOTBALL_BQC_POLY_CODE	,	FOOTBALL_BQC_POLY	);
			put(	FOOTBALL_GJ_POLY_CODE	,	FOOTBALL_GJ_POLY	);
			put(	FOOTBALL_SJB_GJ_POLY_CODE	,	FOOTBALL_SJB_GJ_POLY	);
			put(	FOOTBALL_GYJ_POLY_CODE	,	FOOTBALL_GYJ_POLY	);
		}});
		put( "10060" , new HashMap<Integer, String>() {{
			//put( "" , "江西11选5" );
			put(	JX115_ONE_SINGLE_CODE	,	JX115_ONE_SINGLE	);
			put(	JX115_ONE_POLY_CODE	,	JX115_ONE_POLY	);
			put(	JX115_TWO_SINGLE_CODE	,	JX115_TWO_SINGLE	);
			put(	JX115_TWO_POLY_CODE	,	JX115_TWO_POLY	);
			put(	JX115_TWO_DRAW_CODE	,	JX115_TWO_DRAW	);
			put(	JX115_TWO_DIRECT_SINGLE_CODE	,	JX115_TWO_DIRECT_SINGLE	);
			put(	JX115_TWO_DIRECT_POLY_CODE	,	JX115_TWO_DIRECT_POLY	);
			put(	JX115_TWO_DIRECT_CODE	,	JX115_TWO_DIRECT	);
			put(	JX115_TWO_GROUP_SINGLE_CODE	,	JX115_TWO_GROUP_SINGLE	);
			put(	JX115_TWO_GROUP_POLY_CODE	,	JX115_TWO_GROUP_POLY	);
			put(	JX115_THREE_SINGLE_CODE	,	JX115_THREE_SINGLE	);
			put(	JX115_THREE_POLY_CODE	,	JX115_THREE_POLY	);
			put(	JX115_THREE_DRAW_CODE	,	JX115_THREE_DRAW	);
			put(	JX115_THREE_DIRECT_SINGLE_CODE	,	JX115_THREE_DIRECT_SINGLE	);
			put(	JX115_THREE_DIRECT_POLY_CODE	,	JX115_THREE_DIRECT_POLY	);
			put(	JX115_THREE_DIRECT_CODE	,	JX115_THREE_DIRECT	);
			put(	JX115_THREE_DIRECT_SUM_CODE	,	JX115_THREE_DIRECT_SUM	);
			put(	JX115_THREE_GROUP_SINGLE_CODE	,	JX115_THREE_GROUP_SINGLE	);
			put(	JX115_THREE_GROUP_POLY_CODE	,	JX115_THREE_GROUP_POLY	);
			put(	JX115_THREE_GROUP_SUM_CODE	,	JX115_THREE_GROUP_SUM	);
			put(	JX115_FOUR_SINGLE_CODE	,	JX115_FOUR_SINGLE	);
			put(	JX115_FOUR_POLY_CODE	,	JX115_FOUR_POLY	);
			put(	JX115_FOUR_DRAW_CODE	,	JX115_FOUR_DRAW	);
			put(	JX115_FIVE_SINGLE_CODE	,	JX115_FIVE_SINGLE	);
			put(	JX115_FIVE_POLY_CODE	,	JX115_FIVE_POLY	);
			put(	JX115_FIVE_DRAW_CODE	,	JX115_FIVE_DRAW	);
			put(	JX115_SIX_SINGLE_CODE	,	JX115_SIX_SINGLE	);
			put(	JX115_SIX_POLY_CODE	,	JX115_SIX_POLY	);
			put(	JX115_SIX_DRAW_CODE	,	JX115_SIX_DRAW	);
			put(	JX115_SEVEN_SINGLE_CODE	,	JX115_SEVEN_SINGLE	);
			put(	JX115_SEVEN_POLY_CODE	,	JX115_SEVEN_POLY	);
			put(	JX115_SEVEN_DRAW_CODE	,	JX115_SEVEN_DRAW	);
			put(	JX115_EIGHT_SINGLE_CODE	,	JX115_EIGHT_SINGLE	);
			put(	JX115_EIGHT_POLY_CODE	,	JX115_EIGHT_POLY	);
			put(	JX115_EIGHT_DRAW_CODE	,	JX115_EIGHT_DRAW	);
			put(	JX115_TWO_DIRECT_DRAW_CODE	,	JX115_TWO_DIRECT_DRAW	);
			put(	JX115_TWO_GROUP_DRAW_CODE	,	JX115_TWO_GROUP_DRAW	);
			put(	JX115_THREE_DIRECT_DRAW_CODE	,	JX115_THREE_DIRECT_DRAW	);
			put(	JX115_THREE_GROUP_DRAW_CODE	,	JX115_THREE_GROUP_DRAW	);
			put(	JX115_COMBINATION_CODE	,	JX115_COMBINATION	);
		}});
		put( "10061" , new HashMap<Integer, String>() {{
			//put( "" , "江西时时彩" );
			put(	JXSSC_ONE_STAR_CODE	,	JXSSC_ONE_STAR	);
			put(	JXSSC_TWO_STAR_DIRECT_POLY_CODE	,	JXSSC_TWO_STAR_DIRECT_POLY	);
			put(	JXSSC_TWO_STAR_DIRECT_SINGLE_CODE	,	JXSSC_TWO_STAR_DIRECT_SINGLE	);
			put(	JXSSC_TWO_STAR_DIRECT_SUM_CODE	,	JXSSC_TWO_STAR_DIRECT_SUM	);
			put(	JXSSC_TWO_STAR_GROUP_POLY_CODE	,	JXSSC_TWO_STAR_GROUP_POLY	);
			put(	JXSSC_TWO_STAR_GROUP_SINGLE_CODE	,	JXSSC_TWO_STAR_GROUP_SINGLE	);
			put(	JXSSC_TWO_STAR_GROUP_SUM_CODE	,	JXSSC_TWO_STAR_GROUP_SUM	);
			put(	JXSSC_TWO_STAR_GROUP_DRAW_CODE	,	JXSSC_TWO_STAR_GROUP_DRAW	);
			put(	JXSSC_THREE_STAR_DIRECT_POLY_CODE	,	JXSSC_THREE_STAR_DIRECT_POLY	);
			put(	JXSSC_THREE_STAR_DIRECT_SINGLE_CODE	,	JXSSC_THREE_STAR_DIRECT_SINGLE	);
			put(	JXSSC_THREE_STAR_DIRECT_SUM_CODE	,	JXSSC_THREE_STAR_DIRECT_SUM	);
			put(	JXSSC_THREE_STAR_DIRECT_DRAW_CODE	,	JXSSC_THREE_STAR_DIRECT_DRAW	);
			put(	JXSSC_THREE_STAR_GROUP3_POLY_CODE	,	JXSSC_THREE_STAR_GROUP3_POLY	);
			put(	JXSSC_THREE_STAR_GROUP6_POLY_CODE	,	JXSSC_THREE_STAR_GROUP6_POLY	);
			put(	JXSSC_THREE_STAR_GROUP_SINGLE_CODE	,	JXSSC_THREE_STAR_GROUP_SINGLE	);
			put(	JXSSC_THREE_STAR_GROUP_SUM_CODE	,	JXSSC_THREE_STAR_GROUP_SUM	);
			put(	JXSSC_FOUR_STAR_POLY_CODE	,	JXSSC_FOUR_STAR_POLY	);
			put(	JXSSC_FOUR_STAR_SINGLE_CODE	,	JXSSC_FOUR_STAR_SINGLE	);
			put(	JXSSC_FIVE_STAR_POLY_CODE	,	JXSSC_FIVE_STAR_POLY	);
			put(	JXSSC_FIVE_STAR_SINGLE_CODE	,	JXSSC_FIVE_STAR_SINGLE	);
			put(	JXSSC_FIVE_STAR_ALL_POLY_CODE	,	JXSSC_FIVE_STAR_ALL_POLY	);
			put(	JXSSC_FIVE_STAR_ALL_SINGLE_CODE	,	JXSSC_FIVE_STAR_ALL_SINGLE	);
			put(	JXSSC_REN_ONE_STAR_POLY_CODE	,	JXSSC_REN_ONE_STAR_POLY	);
			put(	JXSSC_REN_TWO_STAR_POLY_CODE	,	JXSSC_REN_TWO_STAR_POLY	);
			put(	JXSSC_DXDS_CODE	,	JXSSC_DXDS	);
			put(	JXSSC_GROUP3_DRAW_CODE	,	JXSSC_GROUP3_DRAW	);
			put(	JXSSC_GROUP6_DRAW_CODE	,	JXSSC_GROUP6_DRAW	);
			put(	JXSSC_COMBINATION_CODE	,	JXSSC_COMBINATION	);
		}});
		put( "10062" , new HashMap<Integer, String>() {{
			//put( "" , "广东11选5" );
			put(	GD115_ONE_SINGLE_CODE	,	GD115_ONE_SINGLE	);
			put(	GD115_ONE_POLY_CODE	,	GD115_ONE_POLY	);
			put(	GD115_TWO_SINGLE_CODE	,	GD115_TWO_SINGLE	);
			put(	GD115_TWO_POLY_CODE	,	GD115_TWO_POLY	);
			put(	GD115_TWO_DRAW_CODE	,	GD115_TWO_DRAW	);
			put(	GD115_TWO_DIRECT_SINGLE_CODE	,	GD115_TWO_DIRECT_SINGLE	);
			put(	GD115_TWO_DIRECT_POLY_CODE	,	GD115_TWO_DIRECT_POLY	);
			put(	GD115_TWO_DIRECT_CODE	,	GD115_TWO_DIRECT	);
			put(	GD115_TWO_GROUP_SINGLE_CODE	,	GD115_TWO_GROUP_SINGLE	);
			put(	GD115_TWO_GROUP_POLY_CODE	,	GD115_TWO_GROUP_POLY	);
			put(	GD115_THREE_SINGLE_CODE	,	GD115_THREE_SINGLE	);
			put(	GD115_THREE_POLY_CODE	,	GD115_THREE_POLY	);
			put(	GD115_THREE_DRAW_CODE	,	GD115_THREE_DRAW	);
			put(	GD115_THREE_DIRECT_SINGLE_CODE	,	GD115_THREE_DIRECT_SINGLE	);
			put(	GD115_THREE_DIRECT_POLY_CODE	,	GD115_THREE_DIRECT_POLY	);
			put(	GD115_THREE_DIRECT_CODE	,	GD115_THREE_DIRECT	);
			put(	GD115_THREE_DIRECT_SUM_CODE	,	GD115_THREE_DIRECT_SUM	);
			put(	GD115_THREE_GROUP_SINGLE_CODE	,	GD115_THREE_GROUP_SINGLE	);
			put(	GD115_THREE_GROUP_POLY_CODE	,	GD115_THREE_GROUP_POLY	);
			put(	GD115_THREE_GROUP_SUM_CODE	,	GD115_THREE_GROUP_SUM	);
			put(	GD115_FOUR_SINGLE_CODE	,	GD115_FOUR_SINGLE	);
			put(	GD115_FOUR_POLY_CODE	,	GD115_FOUR_POLY	);
			put(	GD115_FOUR_DRAW_CODE	,	GD115_FOUR_DRAW	);
			put(	GD115_FIVE_SINGLE_CODE	,	GD115_FIVE_SINGLE	);
			put(	GD115_FIVE_POLY_CODE	,	GD115_FIVE_POLY	);
			put(	GD115_FIVE_DRAW_CODE	,	GD115_FIVE_DRAW	);
			put(	GD115_SIX_SINGLE_CODE	,	GD115_SIX_SINGLE	);
			put(	GD115_SIX_POLY_CODE	,	GD115_SIX_POLY	);
			put(	GD115_SIX_DRAW_CODE	,	GD115_SIX_DRAW	);
			put(	GD115_SEVEN_SINGLE_CODE	,	GD115_SEVEN_SINGLE	);
			put(	GD115_SEVEN_POLY_CODE	,	GD115_SEVEN_POLY	);
			put(	GD115_SEVEN_DRAW_CODE	,	GD115_SEVEN_DRAW	);
			put(	GD115_EIGHT_SINGLE_CODE	,	GD115_EIGHT_SINGLE	);
			put(	GD115_EIGHT_POLY_CODE	,	GD115_EIGHT_POLY	);
			put(	GD115_EIGHT_DRAW_CODE	,	GD115_EIGHT_DRAW	);
			put(	GD115_TWO_DIRECT_DRAW_CODE	,	GD115_TWO_DIRECT_DRAW	);
			put(	GD115_TWO_GROUP_DRAW_CODE	,	GD115_TWO_GROUP_DRAW	);
			put(	GD115_THREE_DIRECT_DRAW_CODE	,	GD115_THREE_DIRECT_DRAW	);
			put(	GD115_THREE_GROUP_DRAW_CODE	,	GD115_THREE_GROUP_DRAW	);
			put(	GD115_COMBINATION_CODE	,	GD115_COMBINATION	);
		}});
		put( "10064" , new HashMap<Integer, String>() {{
			//put( "" , "快乐十分" );
			put(	CQKL10_ONE_DIRECT_SINGLE_CODE	,	CQKL10_ONE_DIRECT_SINGLE 	);
			put(	CQKL10_ONE_POLY_CODE	,	CQKL10_ONE_POLY 	);
			put(	CQKL10_ONE_RED_CODE	,	CQKL10_ONE_RED 	);
			put(	CQKL10_TWO_GROUP_CODE	,	CQKL10_TWO_GROUP 	);
			put(	CQKL10_TWO_GROUP_POLY_CODE	,	CQKL10_TWO_GROUP_POLY 	);
			put(	CQKL10_TWO_GROUP_DRAW_CODE	,	CQKL10_TWO_GROUP_DRAW 	);
			put(	CQKL10_TWO_DIRECT_CODE	,	CQKL10_TWO_DIRECT 	);
			put(	CQKL10_TWO_DIRECT_SINGLE_CODE	,	CQKL10_TWO_DIRECT_SINGLE 	);
			put(	CQKL10_TWO_DIRECT_DRAW_CODE	,	CQKL10_TWO_DIRECT_DRAW 	);
			put(	CQKL10_THREE_GROUP_CODE	,	CQKL10_THREE_GROUP 	);
			put(	CQKL10_THREE_GROUP_POLY_CODE	,	CQKL10_THREE_GROUP_POLY 	);
			put(	CQKL10_THREE_GROUP_DRAW_CODE	,	CQKL10_THREE_GROUP_DRAW 	);
			put(	CQKL10_THREE_DIRECT_CODE	,	CQKL10_THREE_DIRECT 	);
			put(	CQKL10_THREE_DIRECT_SINGLE_CODE	,	CQKL10_THREE_DIRECT_SINGLE 	);
			put(	CQKL10_THREE_DIRECT_DRAW_CODE	,	CQKL10_THREE_DIRECT_DRAW 	);
			put(	CQKL10_TWO_SINGLE_CODE	,	CQKL10_TWO_SINGLE 	);
			put(	CQKL10_TWO_POLY_CODE	,	CQKL10_TWO_POLY 	);
			put(	CQKL10_TWO_DRAW_CODE	,	CQKL10_TWO_DRAW 	);
			put(	CQKL10_THREE_SINGLE_CODE	,	CQKL10_THREE_SINGLE 	);
			put(	CQKL10_THREE_POLY_CODE	,	CQKL10_THREE_POLY 	);
			put(	CQKL10_THREE_DRAW_CODE	,	CQKL10_THREE_DRAW 	);
			put(	CQKL10_FOUR_SINGLE_CODE	,	CQKL10_FOUR_SINGLE 	);
			put(	CQKL10_FOUR_POLY_CODE	,	CQKL10_FOUR_POLY 	);
			put(	CQKL10_FOUR_DRAW_CODE	,	CQKL10_FOUR_DRAW 	);
			put(	CQKL10_FIVE_SINGLE_CODE	,	CQKL10_FIVE_SINGLE 	);
			put(	CQKL10_FIVE_POLY_CODE	,	CQKL10_FIVE_POLY 	);
			put(	CQKL10_FIVE_DRAW_CODE	,	CQKL10_FIVE_DRAW 	);
			put(	CQKL10_COMBINATION_CODE	,	CQKL10_COMBINATION 	);
		}});
		put( "10065" , new HashMap<Integer, String>() {{
			//put( "" , "快3	" );
		}});
		put( "10066" , new HashMap<Integer, String>() {{
			//put( "" , "11选5" );
			put(	SH115_ONE_SINGLE_CODE	,	SH115_ONE_SINGLE 	);
			put(	SH115_ONE_POLY_CODE	,	SH115_ONE_POLY 	);
			put(	SH115_ONE_DIRECT_SINGLE_CODE	,	SH115_ONE_DIRECT_SINGLE 	);
			put(	SH115_ONE_DIRECT_POLY_CODE	,	SH115_ONE_DIRECT_POLY 	);
			put(	SH115_TWO_SINGLE_CODE	,	SH115_TWO_SINGLE 	);
			put(	SH115_TWO_POLY_CODE	,	SH115_TWO_POLY 	);
			put(	SH115_TWO_DRAW_CODE	,	SH115_TWO_DRAW 	);
			put(	SH115_TWO_DIRECT_SINGLE_CODE	,	SH115_TWO_DIRECT_SINGLE 	);
			put(	SH115_TWO_DIRECT_POLY_CODE	,	SH115_TWO_DIRECT_POLY 	);
			put(	SH115_TWO_DIRECT_CODE	,	SH115_TWO_DIRECT 	);
			put(	SH115_TWO_GROUP_SINGLE_CODE	,	SH115_TWO_GROUP_SINGLE 	);
			put(	SH115_TWO_GROUP_POLY_CODE	,	SH115_TWO_GROUP_POLY 	);
			put(	SH115_THREE_SINGLE_CODE	,	SH115_THREE_SINGLE 	);
			put(	SH115_THREE_POLY_CODE	,	SH115_THREE_POLY 	);
			put(	SH115_THREE_DRAW_CODE	,	SH115_THREE_DRAW 	);
			put(	SH115_THREE_DIRECT_SINGLE_CODE	,	SH115_THREE_DIRECT_SINGLE 	);
			put(	SH115_THREE_DIRECT_POLY_CODE	,	SH115_THREE_DIRECT_POLY 	);
			put(	SH115_THREE_DIRECT_CODE	,	SH115_THREE_DIRECT 	);
			put(	SH115_THREE_DIRECT_SUM_CODE	,	SH115_THREE_DIRECT_SUM 	);
			put(	SH115_THREE_GROUP_SINGLE_CODE	,	SH115_THREE_GROUP_SINGLE 	);
			put(	SH115_THREE_GROUP_POLY_CODE	,	SH115_THREE_GROUP_POLY 	);
			put(	SH115_THREE_GROUP_SUM_CODE	,	SH115_THREE_GROUP_SUM 	);
			put(	SH115_FOUR_SINGLE_CODE	,	SH115_FOUR_SINGLE 	);
			put(	SH115_FOUR_POLY_CODE	,	SH115_FOUR_POLY 	);
			put(	SH115_FOUR_DRAW_CODE	,	SH115_FOUR_DRAW 	);
			put(	SH115_FIVE_SINGLE_CODE	,	SH115_FIVE_SINGLE 	);
			put(	SH115_FIVE_POLY_CODE	,	SH115_FIVE_POLY 	);
			put(	SH115_FIVE_DRAW_CODE	,	SH115_FIVE_DRAW 	);
			put(	SH115_SIX_SINGLE_CODE	,	SH115_SIX_SINGLE 	);
			put(	SH115_SIX_POLY_CODE	,	SH115_SIX_POLY 	);
			put(	SH115_SIX_DRAW_CODE	,	SH115_SIX_DRAW 	);
			put(	SH115_SEVEN_SINGLE_CODE	,	SH115_SEVEN_SINGLE 	);
			put(	SH115_SEVEN_POLY_CODE	,	SH115_SEVEN_POLY 	);
			put(	SH115_SEVEN_DRAW_CODE	,	SH115_SEVEN_DRAW 	);
			put(	SH115_EIGHT_SINGLE_CODE	,	SH115_EIGHT_SINGLE 	);
			put(	SH115_EIGHT_POLY_CODE	,	SH115_EIGHT_POLY 	);
			put(	SH115_EIGHT_DRAW_CODE	,	SH115_EIGHT_DRAW 	);
			put(	SH115_TWO_DIRECT_DRAW_CODE	,	SH115_TWO_DIRECT_DRAW 	);
			put(	SH115_TWO_GROUP_DRAW_CODE	,	SH115_TWO_GROUP_DRAW 	);
			put(	SH115_THREE_DIRECT_DRAW_CODE	,	SH115_THREE_DIRECT_DRAW 	);
			put(	SH115_THREE_GROUP_DRAW_CODE	,	SH115_THREE_GROUP_DRAW 	);
			put(	SH115_COMBINATION_CODE	,	SH115_COMBINATION 	);
		}});
		put( "10068" , new HashMap<Integer, String>() {{
			//put( "" , "胜负过关" );
			put(	SFGG_DC_POLY_CODE	,	SFGG_DC_POLY 	);
		}});
		put( "10073" , new HashMap<Integer, String>() {{
			//put( "" , "安徽快3	" );
		}});
		put( "10074" , new HashMap<Integer, String>() {{
			//put( "" , "广西快3	" );
			put(	GXK3_SUM_SINGLE_CODE	,	GXK3_SUM_SINGLE 	);
			put(	GXK3_SUM_POLY_CODE	,	GXK3_SUM_POLY 	);
			put(	GXK3_THREE_SAME_ALL_CODE	,	GXK3_THREE_SAME_ALL 	);
			put(	GXK3_THREE_SAME_ALONE_CODE	,	GXK3_THREE_SAME_ALONE 	);
			put(	GXK3_THREE_DIFFERENT_POLY_CODE	,	GXK3_THREE_DIFFERENT_POLY 	);
			put(	GXK3_THREE_DIFFERENT_DRAW_CODE	,	GXK3_THREE_DIFFERENT_DRAW 	);
			put(	GXK3_THREE_DIFFERENT_KD_CODE	,	GXK3_THREE_DIFFERENT_KD 	);
			put(	GXK3_THREE_DIFFERENT_SINGLE_CODE	,	GXK3_THREE_DIFFERENT_SINGLE 	);
			put(	GXK3_THREE_LINK_ALL_CODE	,	GXK3_THREE_LINK_ALL 	);
			put(	GXK3_TWO_SAME_CODE	,	GXK3_TWO_SAME 	);
			put(	GXK3_TWO_SAME_ALONE_CODE	,	GXK3_TWO_SAME_ALONE 	);
			put(	GXK3_TWO_SAME_ALONE_KD_CODE	,	GXK3_TWO_SAME_ALONE_KD 	);
			put(	GXK3_TWO_SAME_ALONE_POLY_CODE	,	GXK3_TWO_SAME_ALONE_POLY 	);
			put(	GXK3_TWO_DIFFERENT_CODE	,	GXK3_TWO_DIFFERENT 	);
			put(	GXK3_TWO_DIFFERENT_DRAW_CODE	,	GXK3_TWO_DIFFERENT_DRAW 	);
			put(	GXK3_TWO_DIFFERENT_POLY_CODE	,	GXK3_TWO_DIFFERENT_POLY 	);
			put(	GXK3_COMBINATION_CODE	,	GXK3_COMBINATION  	);
		}});
		put( "10082" , new HashMap<Integer, String>() {{
			//put( "" , "快乐扑克" );
		}});
		put(""+LotteryConstants.SHK3, new HashMap<Integer,String>() {{
			put(SHK3_SUM_SINGLE_CODE,SHK3_SUM_SINGLE );
			put(SHK3_SUM_POLY_CODE,SHK3_SUM_POLY);
			put(SHK3_THREE_SAME_ALL_CODE,SHK3_THREE_SAME_ALL );
			put(SHK3_THREE_SAME_ALONE_CODE,SHK3_THREE_SAME_ALONE );
			put(SHK3_THREE_DIFFERENT_POLY_CODE,SHK3_THREE_DIFFERENT_POLY );
			put(SHK3_THREE_DIFFERENT_DRAW_CODE,SHK3_THREE_DIFFERENT_DRAW );
			put(SHK3_THREE_DIFFERENT_KD_CODE,SHK3_THREE_DIFFERENT_KD );
			put(SHK3_THREE_DIFFERENT_SINGLE_CODE,SHK3_THREE_DIFFERENT_SINGLE );
			put(SHK3_THREE_LINK_ALL_CODE,SHK3_THREE_LINK_ALL );
			put(SHK3_TWO_SAME_CODE,SHK3_TWO_SAME_POLY );
			put(SHK3_TWO_SAME_ALONE_CODE,SHK3_TWO_SAME_ALONE );
			put(SHK3_TWO_SAME_ALONE_KD_CODE,SHK3_TWO_SAME_ALONE_KD	);
			put(SHK3_TWO_SAME_ALONE_POLY_CODE,SHK3_TWO_SAME_ALONE_POLY );
			put(SHK3_TWO_DIFFERENT_SINGLE_CODE,SHK3_TWO_DIFFERENT_SINGLE);
			put(SHK3_TWO_DIFFERENT_DRAW_CODE,SHK3_TWO_DIFFERENT_DRAW );
			put(SHK3_TWO_DIFFERENT_POLY_CODE,SHK3_TWO_DIFFERENT_POLY );
			put(SHK3_THREE_SAME_ALONE_CODE,SHK3_THREE_SAME_ALONE );
			put(SHK3_THREE_SAME_POLY_CODE,SHK3_THREE_SAME_POLY );
			put(SHK3_TWO_SAME_ALONE_POLY_CODE,SHK3_TWO_SAME_ALONE_POLY );
			put(SHK3_TWO_SAME_ALONE_SINGLE_CODE,SHK3_TWO_SAME_ALONE_SINGLE );
			put(SHK3_TWO_SAME_POLY_SINGLE_CODE,SHK3_TWO_SAME_POLY_SINGLE );
			put(SHK3_COMBINATION_CODE,SHK3_COMBINATION );

		}});

	}};

	private static Map<String,Map<String,Integer>> nameToCodeMap=new HashMap<String,Map<String,Integer>>(){{
		put( "10023" , new HashMap<String, Integer>() {{
			//put( "53" , "排列3" );
            put(	PL3_DIRECT_SINGLE	,	PL3_DIRECT_SINGLE_CODE	);
            put(	PL3_DIRECT_POLY	,	PL3_DIRECT_POLY_CODE	);
            put(	PL3_GROUP3_SINGLE	,	PL3_GROUP3_SINGLE_CODE	);
            put(	PL3_GROUP3_POLY	,	PL3_GROUP3_POLY_CODE	);
            put(	PL3_GROUP6_SINGLE	,	PL3_GROUP6_SINGLE_CODE	);
            put(	PL3_GROUP6_POLY	,	PL3_GROUP6_POLY_CODE	);
            put(	PL3_COMBINATION	,	PL3_COMBINATION_CODE	);
		}});
		put( "10024" , new HashMap<String, Integer>() {{
			//put( "52" , "排列5" );
			put(	PL5_SINGLE	,	PL5_SINGLE_CODE	);
			put(	PL5_POLY	,	PL5_POLY_CODE	);
			put(	PL5_COMBINATION	,	PL5_COMBINATION_CODE	);
		}});
		put( "10025" , new HashMap<String, Integer>() {{
			// put( "" , "福彩3D" );
			put(	THREED_DIRECT_SINGLE	,	THREED_DIRECT_SINGLE_CODE	);
			put(	THREED_DIRECT_POLY	,	THREED_DIRECT_POLY_CODE	);
            put(	THREED_GROUP3_SINGLE	,	THREED_GROUP3_SINGLE_CODE	);
            put(	THREED_GROUP3_POLY	,	THREED_GROUP3_POLY_CODE	);
            put(	THREED_GROUP6_SINGLE	,	THREED_GROUP6_SINGLE_CODE	);
            put(	THREED_GROUP6_POLY	,	THREED_GROUP6_POLY_CODE	);
			put(	THREED_COMBINATION	,	THREED_COMBINATION_CODE	);
		}});
		put( "10026" , new HashMap<String, Integer>() {{
			//put( "50" , "超级大乐透" );
			put(	LOTTO_SINGLE	,	LOTTO_SINGLE_CODE	);
			put(	LOTTO_POLY	,	LOTTO_POLY_CODE	);
			put(	LOTTO_DRAW	,	LOTTO_DRAW_CODE	);
			put(	LOTTO_COMBINATION	,	LOTTO_COMBINATION_CODE	);
		}});
		put( "10030" , new HashMap<String, Integer>() {{
			//put( "51" , "七星彩" );
			put(	STAR7_SINGLE	,	STAR7_SINGLE_CODE	);
			put(	STAR7_POLY	,	STAR7_POLY_CODE	);
			put(	STAR7_COMBINATION	,	STAR7_COMBINATION_CODE	);
		}});
		put( "10032" , new HashMap<String, Integer>() {{
			//put( "01" , "双色球" );
			put(	DCBALL_SINGLE	,	DCBALL_SINGLE_CODE	);
			put(	DCBALL_POLY	,	DCBALL_POLY_CODE	);
			put(	DCBALL_DRAW	,	DCBALL_DRAW_CODE	);
			put(	DCBALL_COMBINATION	,	DCBALL_COMBINATION_CODE	);
		}});
		put( "10033" , new HashMap<String, Integer>() {{
			//put( "07" , "七乐彩" );
			put(	HAPPY7_SINGLE	,	HAPPY7_SINGLE_CODE	);
			put(	HAPPY7_POLY	,	HAPPY7_POLY_CODE	);
			put(	HAPPY7_COMBINATION	,	HAPPY7_COMBINATION_CODE	);
		}});
		put( "10038" , new HashMap<String, Integer>() {{
			//put( "07" , "时时彩" );

		}});
		put( "10039" , new HashMap<String, Integer>() {{
			//put( "80" , "胜负彩" );
			put(	TOTO14_SINGLE	,	TOTO14_SINGLE_CODE	);
			put(	TOTO14_POLY	,	TOTO14_POLY_CODE	);
		}});
		put( "10040" , new HashMap<String, Integer>() {{
			//put( "81" , "任选九场" );
			put(	TOTO9_SINGLE	,	TOTO9_SINGLE_CODE	);
			put(	TOTO9_POLY	,	TOTO9_POLY_CODE	);
		}});
		put( "10041" , new HashMap<String, Integer>() {{
			//put( "83" , "6场半全场" );
			put(	TOTO6_SINGLE	,	TOTO6_SINGLE_CODE	);
			put(	TOTO6_POLY	,	TOTO6_POLY_CODE	);
		}});
		put( "10042" , new HashMap<String, Integer>() {{
			//put( "83" , "四场进球彩" );
			put(	GOAL4_SINGLE	,	GOAL4_SINGLE_CODE	);
			put(	GOAL4_POLY	,	GOAL4_POLY_CODE	);
		}});
		put( "10046" , new HashMap<String, Integer>() {{
			//put( "56" , "十一运夺金" );
			put(	SD115_ONE_SINGLE	,	SD115_ONE_SINGLE_CODE	);
			put(	SD115_ONE_POLY	,	SD115_ONE_POLY_CODE	);
			put(	SD115_TWO_SINGLE	,	SD115_TWO_SINGLE_CODE	);
			put(	SD115_TWO_POLY	,	SD115_TWO_POLY_CODE	);
			put(	SD115_THREE_SINGLE	,	SD115_THREE_SINGLE_CODE	);
			put(	SD115_THREE_POLY	,	SD115_THREE_POLY_CODE	);
			put(	SD115_FOUR_SINGLE	,	SD115_FOUR_SINGLE_CODE	);
			put(	SD115_FOUR_POLY	,	SD115_FOUR_POLY_CODE	);
			put(	SD115_FIVE_SINGLE	,	SD115_FIVE_SINGLE_CODE	);
			put(	SD115_FIVE_POLY	,	SD115_FIVE_POLY_CODE	);
			put(	SD115_SIX_SINGLE	,	SD115_SIX_SINGLE_CODE	);
			put(	SD115_SIX_POLY	,	SD115_SIX_POLY_CODE	);
			put(	SD115_SEVEN_SINGLE	,	SD115_SEVEN_SINGLE_CODE	);
			put(	SD115_SEVEN_POLY	,	SD115_SEVEN_POLY_CODE	);
			put(	SD115_EIGHT_SINGLE	,	SD115_EIGHT_SINGLE_CODE	);
			put(	SD115_EIGHT_POLY	,	SD115_EIGHT_POLY_CODE	);
			put(	SD115_ONE_DIRECT_SINGLE	,	SD115_ONE_DIRECT_SINGLE_CODE	);
			put(	SD115_ONE_DIRECT_POLY	,	SD115_ONE_DIRECT_POLY_CODE	);
			put(	SD115_TWO_DIRECT_SINGLE	,	SD115_TWO_DIRECT_SINGLE_CODE	);
			put(	SD115_TWO_DIRECT_POLY	,	SD115_TWO_DIRECT_POLY_CODE	);
			put(	SD115_THREE_DIRECT_SINGLE	,	SD115_THREE_DIRECT_SINGLE_CODE	);
			put(	SD115_THREE_DIRECT_POLY	,	SD115_THREE_DIRECT_POLY_CODE	);
			put(	SD115_TWO_GROUP_SINGLE	,	SD115_TWO_GROUP_SINGLE_CODE	);
			put(	SD115_TWO_GROUP_POLY	,	SD115_TWO_GROUP_POLY_CODE	);
			put(	SD115_THREE_GROUP_SINGLE	,	SD115_THREE_GROUP_SINGLE_CODE	);
			put(	SD115_THREE_GROUP_POLY	,	SD115_THREE_GROUP_POLY_CODE	);
			put(	SD115_COMBINATION	,	SD115_COMBINATION_CODE	);
		}});
		put( "10057" , new HashMap<String, Integer>() {{
			//put( "" , "北京单场" );
		}});
		put( "10058" , new HashMap<String, Integer>() {{
			//put( "" , "竞彩篮球" );
			put(	BASKETBALL_SF_POLY	,	BASKETBALL_SF_POLY_CODE	);
			put(	BASKETBALL_RFSF_POLY	,	BASKETBALL_RFSF_POLY_CODE	);
			put(	BASKETBALL_FSC_POLY	,	BASKETBALL_FSC_POLY_CODE	);
			put(	BASKETBALL_DXF_POLY	,	BASKETBALL_DXF_POLY_CODE	);
		}});
		put( "10059" , new HashMap<String, Integer>() {{
			//put( "" , "竞彩足球" );
			put(	FOOTBALL_SPF_POLY	,	FOOTBALL_SPF_POLY_CODE	);
			put(	FOOTBALL_RQSPF_POLY	,	FOOTBALL_RQSPF_POLY_CODE	);
			put(	FOOTBALL_SPF_SINGLE	,	FOOTBALL_SPF_SINGLE_CODE	);
			put(	FOOTBALL_RQSPF_SINGLE	,	FOOTBALL_RQSPF_SINGLE_CODE	);
			put(	FOOTBALL_ZJQS_POLY	,	FOOTBALL_ZJQS_POLY_CODE	);
			put(	FOOTBALL_BF_POLY	,	FOOTBALL_BF_POLY_CODE	);
			put(	FOOTBALL_BQC_POLY	,	FOOTBALL_BQC_POLY_CODE	);
			put(	FOOTBALL_GJ_POLY	,	FOOTBALL_GJ_POLY_CODE	);
			put(	FOOTBALL_SJB_GJ_POLY	,	FOOTBALL_SJB_GJ_POLY_CODE	);
			put(	FOOTBALL_GYJ_POLY	,	FOOTBALL_GYJ_POLY_CODE	);
		}});
		put( "10060" , new HashMap<String, Integer>() {{
			//put( "" , "江西11选5" );
			put(	JX115_ONE_SINGLE	,	JX115_ONE_SINGLE_CODE	);
			put(	JX115_ONE_POLY	,	JX115_ONE_POLY_CODE	);
			put(	JX115_TWO_SINGLE	,	JX115_TWO_SINGLE_CODE	);
			put(	JX115_TWO_POLY	,	JX115_TWO_POLY_CODE	);
			put(	JX115_TWO_DRAW	,	JX115_TWO_DRAW_CODE	);
			put(	JX115_TWO_DIRECT_SINGLE	,	JX115_TWO_DIRECT_SINGLE_CODE	);
			put(	JX115_TWO_DIRECT_POLY	,	JX115_TWO_DIRECT_POLY_CODE	);
			put(	JX115_TWO_DIRECT	,	JX115_TWO_DIRECT_CODE	);
			put(	JX115_TWO_GROUP_SINGLE	,	JX115_TWO_GROUP_SINGLE_CODE	);
			put(	JX115_TWO_GROUP_POLY	,	JX115_TWO_GROUP_POLY_CODE	);
			put(	JX115_THREE_SINGLE	,	JX115_THREE_SINGLE_CODE	);
			put(	JX115_THREE_POLY	,	JX115_THREE_POLY_CODE	);
			put(	JX115_THREE_DRAW	,	JX115_THREE_DRAW_CODE	);
			put(	JX115_THREE_DIRECT_SINGLE	,	JX115_THREE_DIRECT_SINGLE_CODE	);
			put(	JX115_THREE_DIRECT_POLY	,	JX115_THREE_DIRECT_POLY_CODE	);
			put(	JX115_THREE_DIRECT	,	JX115_THREE_DIRECT_CODE	);
			put(	JX115_THREE_DIRECT_SUM	,	JX115_THREE_DIRECT_SUM_CODE	);
			put(	JX115_THREE_GROUP_SINGLE	,	JX115_THREE_GROUP_SINGLE_CODE	);
			put(	JX115_THREE_GROUP_POLY	,	JX115_THREE_GROUP_POLY_CODE	);
			put(	JX115_THREE_GROUP_SUM	,	JX115_THREE_GROUP_SUM_CODE	);
			put(	JX115_FOUR_SINGLE	,	JX115_FOUR_SINGLE_CODE	);
			put(	JX115_FOUR_POLY	,	JX115_FOUR_POLY_CODE	);
			put(	JX115_FOUR_DRAW	,	JX115_FOUR_DRAW_CODE	);
			put(	JX115_FIVE_SINGLE	,	JX115_FIVE_SINGLE_CODE	);
			put(	JX115_FIVE_POLY	,	JX115_FIVE_POLY_CODE	);
			put(	JX115_FIVE_DRAW	,	JX115_FIVE_DRAW_CODE	);
			put(	JX115_SIX_SINGLE	,	JX115_SIX_SINGLE_CODE	);
			put(	JX115_SIX_POLY	,	JX115_SIX_POLY_CODE	);
			put(	JX115_SIX_DRAW	,	JX115_SIX_DRAW_CODE	);
			put(	JX115_SEVEN_SINGLE	,	JX115_SEVEN_SINGLE_CODE	);
			put(	JX115_SEVEN_POLY	,	JX115_SEVEN_POLY_CODE	);
			put(	JX115_SEVEN_DRAW	,	JX115_SEVEN_DRAW_CODE	);
			put(	JX115_EIGHT_SINGLE	,	JX115_EIGHT_SINGLE_CODE	);
			put(	JX115_EIGHT_POLY	,	JX115_EIGHT_POLY_CODE	);
			put(	JX115_EIGHT_DRAW	,	JX115_EIGHT_DRAW_CODE	);
			put(	JX115_TWO_DIRECT_DRAW	,	JX115_TWO_DIRECT_DRAW_CODE	);
			put(	JX115_TWO_GROUP_DRAW	,	JX115_TWO_GROUP_DRAW_CODE	);
			put(	JX115_THREE_DIRECT_DRAW	,	JX115_THREE_DIRECT_DRAW_CODE	);
			put(	JX115_THREE_GROUP_DRAW	,	JX115_THREE_GROUP_DRAW_CODE	);
			put(	JX115_COMBINATION	,	JX115_COMBINATION_CODE	);
		}});
		put( "10061" , new HashMap<String, Integer>() {{
			//put( "" , "江西时时彩" );
			put(	JXSSC_ONE_STAR	,	JXSSC_ONE_STAR_CODE	);
			put(	JXSSC_TWO_STAR_DIRECT_POLY	,	JXSSC_TWO_STAR_DIRECT_POLY_CODE	);
			put(	JXSSC_TWO_STAR_DIRECT_SINGLE	,	JXSSC_TWO_STAR_DIRECT_SINGLE_CODE	);
			put(	JXSSC_TWO_STAR_DIRECT_SUM	,	JXSSC_TWO_STAR_DIRECT_SUM_CODE	);
			put(	JXSSC_TWO_STAR_GROUP_POLY	,	JXSSC_TWO_STAR_GROUP_POLY_CODE	);
			put(	JXSSC_TWO_STAR_GROUP_SINGLE	,	JXSSC_TWO_STAR_GROUP_SINGLE_CODE	);
			put(	JXSSC_TWO_STAR_GROUP_SUM	,	JXSSC_TWO_STAR_GROUP_SUM_CODE	);
			put(	JXSSC_TWO_STAR_GROUP_DRAW	,	JXSSC_TWO_STAR_GROUP_DRAW_CODE	);
			put(	JXSSC_THREE_STAR_DIRECT_POLY	,	JXSSC_THREE_STAR_DIRECT_POLY_CODE	);
			put(	JXSSC_THREE_STAR_DIRECT_SINGLE	,	JXSSC_THREE_STAR_DIRECT_SINGLE_CODE	);
			put(	JXSSC_THREE_STAR_DIRECT_SUM	,	JXSSC_THREE_STAR_DIRECT_SUM_CODE	);
			put(	JXSSC_THREE_STAR_DIRECT_DRAW	,	JXSSC_THREE_STAR_DIRECT_DRAW_CODE	);
			put(	JXSSC_THREE_STAR_GROUP3_POLY	,	JXSSC_THREE_STAR_GROUP3_POLY_CODE	);
			put(	JXSSC_THREE_STAR_GROUP6_POLY	,	JXSSC_THREE_STAR_GROUP6_POLY_CODE	);
			put(	JXSSC_THREE_STAR_GROUP_SINGLE	,	JXSSC_THREE_STAR_GROUP_SINGLE_CODE	);
			put(	JXSSC_THREE_STAR_GROUP_SUM	,	JXSSC_THREE_STAR_GROUP_SUM_CODE	);
			put(	JXSSC_FOUR_STAR_POLY	,	JXSSC_FOUR_STAR_POLY_CODE	);
			put(	JXSSC_FOUR_STAR_SINGLE	,	JXSSC_FOUR_STAR_SINGLE_CODE	);
			put(	JXSSC_FIVE_STAR_POLY	,	JXSSC_FIVE_STAR_POLY_CODE	);
			put(	JXSSC_FIVE_STAR_SINGLE	,	JXSSC_FIVE_STAR_SINGLE_CODE	);
			put(	JXSSC_FIVE_STAR_ALL_POLY	,	JXSSC_FIVE_STAR_ALL_POLY_CODE	);
			put(	JXSSC_FIVE_STAR_ALL_SINGLE	,	JXSSC_FIVE_STAR_ALL_SINGLE_CODE	);
			put(	JXSSC_REN_ONE_STAR_POLY	,	JXSSC_REN_ONE_STAR_POLY_CODE	);
			put(	JXSSC_REN_TWO_STAR_POLY	,	JXSSC_REN_TWO_STAR_POLY_CODE	);
			put(	JXSSC_DXDS	,	JXSSC_DXDS_CODE	);
			put(	JXSSC_GROUP3_DRAW	,	JXSSC_GROUP3_DRAW_CODE	);
			put(	JXSSC_GROUP6_DRAW	,	JXSSC_GROUP6_DRAW_CODE	);
			put(	JXSSC_COMBINATION	,	JXSSC_COMBINATION_CODE	);
		}});
		put( "10062" , new HashMap<String, Integer>() {{
			//put( "" , "广东11选5" );
			put(	GD115_ONE_SINGLE	,	GD115_ONE_SINGLE_CODE	);
			put(	GD115_ONE_POLY	,	GD115_ONE_POLY_CODE	);
			put(	GD115_TWO_SINGLE	,	GD115_TWO_SINGLE_CODE	);
			put(	GD115_TWO_POLY	,	GD115_TWO_POLY_CODE	);
			put(	GD115_TWO_DRAW	,	GD115_TWO_DRAW_CODE	);
			put(	GD115_TWO_DIRECT_SINGLE	,	GD115_TWO_DIRECT_SINGLE_CODE	);
			put(	GD115_TWO_DIRECT_POLY	,	GD115_TWO_DIRECT_POLY_CODE	);
			put(	GD115_TWO_DIRECT	,	GD115_TWO_DIRECT_CODE	);
			put(	GD115_TWO_GROUP_SINGLE	,	GD115_TWO_GROUP_SINGLE_CODE	);
			put(	GD115_TWO_GROUP_POLY	,	GD115_TWO_GROUP_POLY_CODE	);
			put(	GD115_THREE_SINGLE	,	GD115_THREE_SINGLE_CODE	);
			put(	GD115_THREE_POLY	,	GD115_THREE_POLY_CODE	);
			put(	GD115_THREE_DRAW	,	GD115_THREE_DRAW_CODE	);
			put(	GD115_THREE_DIRECT_SINGLE	,	GD115_THREE_DIRECT_SINGLE_CODE	);
			put(	GD115_THREE_DIRECT_POLY	,	GD115_THREE_DIRECT_POLY_CODE	);
			put(	GD115_THREE_DIRECT	,	GD115_THREE_DIRECT_CODE	);
			put(	GD115_THREE_DIRECT_SUM	,	GD115_THREE_DIRECT_SUM_CODE	);
			put(	GD115_THREE_GROUP_SINGLE	,	GD115_THREE_GROUP_SINGLE_CODE	);
			put(	GD115_THREE_GROUP_POLY	,	GD115_THREE_GROUP_POLY_CODE	);
			put(	GD115_THREE_GROUP_SUM	,	GD115_THREE_GROUP_SUM_CODE	);
			put(	GD115_FOUR_SINGLE	,	GD115_FOUR_SINGLE_CODE	);
			put(	GD115_FOUR_POLY	,	GD115_FOUR_POLY_CODE	);
			put(	GD115_FOUR_DRAW	,	GD115_FOUR_DRAW_CODE	);
			put(	GD115_FIVE_SINGLE	,	GD115_FIVE_SINGLE_CODE	);
			put(	GD115_FIVE_POLY	,	GD115_FIVE_POLY_CODE	);
			put(	GD115_FIVE_DRAW	,	GD115_FIVE_DRAW_CODE	);
			put(	GD115_SIX_SINGLE	,	GD115_SIX_SINGLE_CODE	);
			put(	GD115_SIX_POLY	,	GD115_SIX_POLY_CODE	);
			put(	GD115_SIX_DRAW	,	GD115_SIX_DRAW_CODE	);
			put(	GD115_SEVEN_SINGLE	,	GD115_SEVEN_SINGLE_CODE	);
			put(	GD115_SEVEN_POLY	,	GD115_SEVEN_POLY_CODE	);
			put(	GD115_SEVEN_DRAW	,	GD115_SEVEN_DRAW_CODE	);
			put(	GD115_EIGHT_SINGLE	,	GD115_EIGHT_SINGLE_CODE	);
			put(	GD115_EIGHT_POLY	,	GD115_EIGHT_POLY_CODE	);
			put(	GD115_EIGHT_DRAW	,	GD115_EIGHT_DRAW_CODE	);
			put(	GD115_TWO_DIRECT_DRAW	,	GD115_TWO_DIRECT_DRAW_CODE	);
			put(	GD115_TWO_GROUP_DRAW	,	GD115_TWO_GROUP_DRAW_CODE	);
			put(	GD115_THREE_DIRECT_DRAW	,	GD115_THREE_DIRECT_DRAW_CODE	);
			put(	GD115_THREE_GROUP_DRAW	,	GD115_THREE_GROUP_DRAW_CODE	);
			put(	GD115_COMBINATION	,	GD115_COMBINATION_CODE	);
		}});
		put( "10064" , new HashMap<String, Integer>() {{
			//put( "" , "快乐十分" );
			put(	CQKL10_ONE_DIRECT_SINGLE 	,	CQKL10_ONE_DIRECT_SINGLE_CODE	);
			put(	CQKL10_ONE_POLY 	,	CQKL10_ONE_POLY_CODE	);
			put(	CQKL10_ONE_RED 	,	CQKL10_ONE_RED_CODE	);
			put(	CQKL10_TWO_GROUP 	,	CQKL10_TWO_GROUP_CODE	);
			put(	CQKL10_TWO_GROUP_POLY 	,	CQKL10_TWO_GROUP_POLY_CODE	);
			put(	CQKL10_TWO_GROUP_DRAW 	,	CQKL10_TWO_GROUP_DRAW_CODE	);
			put(	CQKL10_TWO_DIRECT 	,	CQKL10_TWO_DIRECT_CODE	);
			put(	CQKL10_TWO_DIRECT_SINGLE 	,	CQKL10_TWO_DIRECT_SINGLE_CODE	);
			put(	CQKL10_TWO_DIRECT_DRAW 	,	CQKL10_TWO_DIRECT_DRAW_CODE	);
			put(	CQKL10_THREE_GROUP 	,	CQKL10_THREE_GROUP_CODE	);
			put(	CQKL10_THREE_GROUP_POLY 	,	CQKL10_THREE_GROUP_POLY_CODE	);
			put(	CQKL10_THREE_GROUP_DRAW 	,	CQKL10_THREE_GROUP_DRAW_CODE	);
			put(	CQKL10_THREE_DIRECT 	,	CQKL10_THREE_DIRECT_CODE	);
			put(	CQKL10_THREE_DIRECT_SINGLE 	,	CQKL10_THREE_DIRECT_SINGLE_CODE	);
			put(	CQKL10_THREE_DIRECT_DRAW 	,	CQKL10_THREE_DIRECT_DRAW_CODE	);
			put(	CQKL10_TWO_SINGLE 	,	CQKL10_TWO_SINGLE_CODE	);
			put(	CQKL10_TWO_POLY 	,	CQKL10_TWO_POLY_CODE	);
			put(	CQKL10_TWO_DRAW 	,	CQKL10_TWO_DRAW_CODE	);
			put(	CQKL10_THREE_SINGLE 	,	CQKL10_THREE_SINGLE_CODE	);
			put(	CQKL10_THREE_POLY 	,	CQKL10_THREE_POLY_CODE	);
			put(	CQKL10_THREE_DRAW 	,	CQKL10_THREE_DRAW_CODE	);
			put(	CQKL10_FOUR_SINGLE 	,	CQKL10_FOUR_SINGLE_CODE	);
			put(	CQKL10_FOUR_POLY 	,	CQKL10_FOUR_POLY_CODE	);
			put(	CQKL10_FOUR_DRAW 	,	CQKL10_FOUR_DRAW_CODE	);
			put(	CQKL10_FIVE_SINGLE 	,	CQKL10_FIVE_SINGLE_CODE	);
			put(	CQKL10_FIVE_POLY 	,	CQKL10_FIVE_POLY_CODE	);
			put(	CQKL10_FIVE_DRAW 	,	CQKL10_FIVE_DRAW_CODE	);
			put(	CQKL10_COMBINATION 	,	CQKL10_COMBINATION_CODE	);
		}});
		put( "10065" , new HashMap<String, Integer>() {{
			//put( "" , "快3	" );
		}});
		put( "10066" , new HashMap<String, Integer>() {{
			//put( "" , "11选5" );
			put(	SH115_ONE_SINGLE 	,	SH115_ONE_SINGLE_CODE	);
			put(	SH115_ONE_POLY 	,	SH115_ONE_POLY_CODE	);
			put(	SH115_ONE_DIRECT_SINGLE 	,	SH115_ONE_DIRECT_SINGLE_CODE	);
			put(	SH115_ONE_DIRECT_POLY 	,	SH115_ONE_DIRECT_POLY_CODE	);
			put(	SH115_TWO_SINGLE 	,	SH115_TWO_SINGLE_CODE	);
			put(	SH115_TWO_POLY 	,	SH115_TWO_POLY_CODE	);
			put(	SH115_TWO_DRAW 	,	SH115_TWO_DRAW_CODE	);
			put(	SH115_TWO_DIRECT_SINGLE 	,	SH115_TWO_DIRECT_SINGLE_CODE	);
			put(	SH115_TWO_DIRECT_POLY 	,	SH115_TWO_DIRECT_POLY_CODE	);
			put(	SH115_TWO_DIRECT 	,	SH115_TWO_DIRECT_CODE	);
			put(	SH115_TWO_GROUP_SINGLE 	,	SH115_TWO_GROUP_SINGLE_CODE	);
			put(	SH115_TWO_GROUP_POLY 	,	SH115_TWO_GROUP_POLY_CODE	);
			put(	SH115_THREE_SINGLE 	,	SH115_THREE_SINGLE_CODE	);
			put(	SH115_THREE_POLY 	,	SH115_THREE_POLY_CODE	);
			put(	SH115_THREE_DRAW 	,	SH115_THREE_DRAW_CODE	);
			put(	SH115_THREE_DIRECT_SINGLE 	,	SH115_THREE_DIRECT_SINGLE_CODE	);
			put(	SH115_THREE_DIRECT_POLY 	,	SH115_THREE_DIRECT_POLY_CODE	);
			put(	SH115_THREE_DIRECT 	,	SH115_THREE_DIRECT_CODE	);
			put(	SH115_THREE_DIRECT_SUM 	,	SH115_THREE_DIRECT_SUM_CODE	);
			put(	SH115_THREE_GROUP_SINGLE 	,	SH115_THREE_GROUP_SINGLE_CODE	);
			put(	SH115_THREE_GROUP_POLY 	,	SH115_THREE_GROUP_POLY_CODE	);
			put(	SH115_THREE_GROUP_SUM 	,	SH115_THREE_GROUP_SUM_CODE	);
			put(	SH115_FOUR_SINGLE 	,	SH115_FOUR_SINGLE_CODE	);
			put(	SH115_FOUR_POLY 	,	SH115_FOUR_POLY_CODE	);
			put(	SH115_FOUR_DRAW 	,	SH115_FOUR_DRAW_CODE	);
			put(	SH115_FIVE_SINGLE 	,	SH115_FIVE_SINGLE_CODE	);
			put(	SH115_FIVE_POLY 	,	SH115_FIVE_POLY_CODE	);
			put(	SH115_FIVE_DRAW 	,	SH115_FIVE_DRAW_CODE	);
			put(	SH115_SIX_SINGLE 	,	SH115_SIX_SINGLE_CODE	);
			put(	SH115_SIX_POLY 	,	SH115_SIX_POLY_CODE	);
			put(	SH115_SIX_DRAW 	,	SH115_SIX_DRAW_CODE	);
			put(	SH115_SEVEN_SINGLE 	,	SH115_SEVEN_SINGLE_CODE	);
			put(	SH115_SEVEN_POLY 	,	SH115_SEVEN_POLY_CODE	);
			put(	SH115_SEVEN_DRAW 	,	SH115_SEVEN_DRAW_CODE	);
			put(	SH115_EIGHT_SINGLE 	,	SH115_EIGHT_SINGLE_CODE	);
			put(	SH115_EIGHT_POLY 	,	SH115_EIGHT_POLY_CODE	);
			put(	SH115_EIGHT_DRAW 	,	SH115_EIGHT_DRAW_CODE	);
			put(	SH115_TWO_DIRECT_DRAW 	,	SH115_TWO_DIRECT_DRAW_CODE	);
			put(	SH115_TWO_GROUP_DRAW 	,	SH115_TWO_GROUP_DRAW_CODE	);
			put(	SH115_THREE_DIRECT_DRAW 	,	SH115_THREE_DIRECT_DRAW_CODE	);
			put(	SH115_THREE_GROUP_DRAW 	,	SH115_THREE_GROUP_DRAW_CODE	);
			put(	SH115_COMBINATION 	,	SH115_COMBINATION_CODE	);
		}});
		put( "10068" , new HashMap<String, Integer>() {{
			//put( "" , "胜负过关" );
			put(	SFGG_DC_POLY 	,	SFGG_DC_POLY_CODE	);
		}});
		put( "10073" , new HashMap<String, Integer>() {{
			//put( "" , "安徽快3	" );
		}});
		put( "10074" , new HashMap<String, Integer>() {{
			//put( "" , "广西快3	" );
			put(	GXK3_SUM_SINGLE 	,	GXK3_SUM_SINGLE_CODE	);
			put(	GXK3_SUM_POLY 	,	GXK3_SUM_POLY_CODE	);
			put(	GXK3_THREE_SAME_ALL 	,	GXK3_THREE_SAME_ALL_CODE	);
			put(	GXK3_THREE_SAME_ALONE 	,	GXK3_THREE_SAME_ALONE_CODE	);
			put(	GXK3_THREE_DIFFERENT_POLY 	,	GXK3_THREE_DIFFERENT_POLY_CODE	);
			put(	GXK3_THREE_DIFFERENT_DRAW 	,	GXK3_THREE_DIFFERENT_DRAW_CODE	);
			put(	GXK3_THREE_DIFFERENT_KD 	,	GXK3_THREE_DIFFERENT_KD_CODE	);
			put(	GXK3_THREE_DIFFERENT_SINGLE 	,	GXK3_THREE_DIFFERENT_SINGLE_CODE	);
			put(	GXK3_THREE_LINK_ALL 	,	GXK3_THREE_LINK_ALL_CODE	);
			put(	GXK3_TWO_SAME 	,	GXK3_TWO_SAME_CODE	);
			put(	GXK3_TWO_SAME_ALONE 	,	GXK3_TWO_SAME_ALONE_CODE	);
			put(	GXK3_TWO_SAME_ALONE_KD 	,	GXK3_TWO_SAME_ALONE_KD_CODE	);
			put(	GXK3_TWO_SAME_ALONE_POLY 	,	GXK3_TWO_SAME_ALONE_POLY_CODE	);
			put(	GXK3_TWO_DIFFERENT 	,	GXK3_TWO_DIFFERENT_CODE	);
			put(	GXK3_TWO_DIFFERENT_DRAW 	,	GXK3_TWO_DIFFERENT_DRAW_CODE	);
			put(	GXK3_TWO_DIFFERENT_POLY 	,	GXK3_TWO_DIFFERENT_POLY_CODE	);
			put(	GXK3_COMBINATION  	,	GXK3_COMBINATION_CODE	);
		}});
		put( "10082" , new HashMap<String, Integer>() {{
			//put( "" , "快乐扑克" );
		}});
		put(""+LotteryConstants.SHK3, new HashMap<String, Integer>() {{
			put(SHK3_SUM_SINGLE ,SHK3_SUM_SINGLE_CODE);
			put(SHK3_SUM_POLY ,	SHK3_SUM_POLY_CODE);
			put(SHK3_THREE_SAME_ALL ,SHK3_THREE_SAME_ALL_CODE);
			put(SHK3_THREE_SAME_ALONE ,SHK3_THREE_SAME_ALONE_CODE);
			put(SHK3_THREE_DIFFERENT_POLY ,SHK3_THREE_DIFFERENT_POLY_CODE);
			put(SHK3_THREE_DIFFERENT_DRAW ,SHK3_THREE_DIFFERENT_DRAW_CODE);
			put(SHK3_THREE_DIFFERENT_KD ,SHK3_THREE_DIFFERENT_KD_CODE);
			put(SHK3_THREE_DIFFERENT_SINGLE ,SHK3_THREE_DIFFERENT_SINGLE_CODE);
			put(SHK3_THREE_LINK_ALL ,SHK3_THREE_LINK_ALL_CODE);
			put(SHK3_TWO_SAME_POLY,SHK3_TWO_SAME_CODE);
			put(SHK3_TWO_SAME_ALONE ,SHK3_TWO_SAME_ALONE_CODE);
			put(SHK3_TWO_SAME_ALONE_KD	,SHK3_TWO_SAME_ALONE_KD_CODE);
			put(SHK3_TWO_SAME_ALONE_POLY ,SHK3_TWO_SAME_ALONE_POLY_CODE);
			put(SHK3_TWO_DIFFERENT_SINGLE,SHK3_TWO_DIFFERENT_SINGLE_CODE);
			put(SHK3_TWO_DIFFERENT_DRAW ,SHK3_TWO_DIFFERENT_DRAW_CODE);
			put(SHK3_TWO_DIFFERENT_POLY ,SHK3_TWO_DIFFERENT_POLY_CODE);
			put(SHK3_THREE_SAME_ALONE ,SHK3_THREE_SAME_ALONE_CODE);
			put(SHK3_THREE_SAME_POLY ,SHK3_THREE_SAME_POLY_CODE);
			put(SHK3_TWO_SAME_ALONE_POLY ,SHK3_TWO_SAME_ALONE_POLY_CODE);
			put(SHK3_TWO_SAME_ALONE_SINGLE ,SHK3_TWO_SAME_ALONE_SINGLE_CODE);
			put(SHK3_TWO_SAME_POLY_SINGLE ,SHK3_TWO_SAME_POLY_SINGLE_CODE);
			put(SHK3_COMBINATION ,SHK3_COMBINATION_CODE);

		}});
	}};

}